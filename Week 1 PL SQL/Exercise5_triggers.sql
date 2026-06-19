USE bankdb;

-- =====================================
-- Create AuditLog Table
-- =====================================

CREATE TABLE IF NOT EXISTS AuditLog (
    LogID INT AUTO_INCREMENT PRIMARY KEY,
    TransactionID INT,
    Message VARCHAR(255),
    LogDate DATE
);

-- =====================================
-- Trigger 1
-- UpdateCustomerLastModified
-- =====================================

DROP TRIGGER IF EXISTS UpdateCustomerLastModified;

DELIMITER //

CREATE TRIGGER UpdateCustomerLastModified
BEFORE UPDATE ON Customers
FOR EACH ROW
BEGIN
    SET NEW.LastModified = CURDATE();
END//

DELIMITER ;

-- =====================================
-- Trigger 2
-- LogTransaction
-- =====================================

DROP TRIGGER IF EXISTS LogTransaction;

DELIMITER //

CREATE TRIGGER LogTransaction
AFTER INSERT ON Transactions
FOR EACH ROW
BEGIN
    INSERT INTO AuditLog(
        TransactionID,
        Message,
        LogDate
    )
    VALUES(
        NEW.TransactionID,
        'Transaction Added',
        CURDATE()
    );
END//

DELIMITER ;

-- =====================================
-- Trigger 3
-- CheckTransactionRules
-- =====================================

DROP TRIGGER IF EXISTS CheckTransactionRules;

DELIMITER //

CREATE TRIGGER CheckTransactionRules
BEFORE INSERT ON Transactions
FOR EACH ROW
BEGIN

    DECLARE bal DECIMAL(10,2);

    SELECT Balance
    INTO bal
    FROM Accounts
    WHERE AccountID = NEW.AccountID;

    IF NEW.TransactionType = 'Deposit'
       AND NEW.Amount <= 0 THEN

       SIGNAL SQLSTATE '45000'
       SET MESSAGE_TEXT = 'Deposit must be positive';

    END IF;

    IF NEW.TransactionType = 'Withdrawal'
       AND NEW.Amount > bal THEN

       SIGNAL SQLSTATE '45000'
       SET MESSAGE_TEXT = 'Insufficient Balance';

    END IF;

END//

DELIMITER ;

-- =====================================
-- Testing
-- =====================================

SHOW TRIGGERS;

INSERT INTO Transactions
VALUES(
11,
1,
CURDATE(),
100,
'Deposit'
);

SELECT * FROM AuditLog;