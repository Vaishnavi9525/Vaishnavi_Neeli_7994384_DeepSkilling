USE bankdb;

-- =====================================
-- Exercise 6 : Cursors
-- =====================================

-- =====================================
-- Scenario 1
-- Generate Monthly Statements
-- =====================================

DROP PROCEDURE IF EXISTS GenerateMonthlyStatements;

DELIMITER //

CREATE PROCEDURE GenerateMonthlyStatements()
BEGIN

```
DECLARE done INT DEFAULT FALSE;
DECLARE acc_id INT;
DECLARE trans_id INT;
DECLARE amt DECIMAL(10,2);

DECLARE trans_cursor CURSOR FOR
SELECT AccountID, TransactionID, Amount
FROM Transactions
WHERE MONTH(TransactionDate)=MONTH(CURDATE())
  AND YEAR(TransactionDate)=YEAR(CURDATE());

DECLARE CONTINUE HANDLER FOR NOT FOUND
SET done = TRUE;

OPEN trans_cursor;

read_loop: LOOP

    FETCH trans_cursor
    INTO acc_id, trans_id, amt;

    IF done THEN
        LEAVE read_loop;
    END IF;

    SELECT
    acc_id AS AccountID,
    trans_id AS TransactionID,
    amt AS Amount;

END LOOP;

CLOSE trans_cursor;
```

END //

DELIMITER ;

-- =====================================
-- Scenario 2
-- Apply Annual Fee
-- =====================================

DROP PROCEDURE IF EXISTS ApplyAnnualFee;

DELIMITER //

CREATE PROCEDURE ApplyAnnualFee()
BEGIN

```
DECLARE done INT DEFAULT FALSE;
DECLARE acc_id INT;

DECLARE acc_cursor CURSOR FOR
SELECT AccountID
FROM Accounts;

DECLARE CONTINUE HANDLER FOR NOT FOUND
SET done = TRUE;

OPEN acc_cursor;

read_loop: LOOP

    FETCH acc_cursor INTO acc_id;

    IF done THEN
        LEAVE read_loop;
    END IF;

    UPDATE Accounts
    SET Balance = Balance - 100
    WHERE AccountID = acc_id;

END LOOP;

CLOSE acc_cursor;
```

END //

DELIMITER ;

-- =====================================
-- Scenario 3
-- Update Loan Interest Rates
-- =====================================

DROP PROCEDURE IF EXISTS UpdateLoanInterestRates;

DELIMITER //

CREATE PROCEDURE UpdateLoanInterestRates()
BEGIN

```
DECLARE done INT DEFAULT FALSE;
DECLARE loan_id INT;

DECLARE loan_cursor CURSOR FOR
SELECT LoanID
FROM Loans;

DECLARE CONTINUE HANDLER FOR NOT FOUND
SET done = TRUE;

OPEN loan_cursor;

read_loop: LOOP

    FETCH loan_cursor INTO loan_id;

    IF done THEN
        LEAVE read_loop;
    END IF;

    UPDATE Loans
    SET InterestRate = InterestRate + 0.5
    WHERE LoanID = loan_id;

END LOOP;

CLOSE loan_cursor;
```

END //

DELIMITER ;

-- =====================================
-- Execute Procedures
-- =====================================

CALL GenerateMonthlyStatements();

CALL ApplyAnnualFee();

CALL UpdateLoanInterestRates();

-- =====================================
-- Verify Results
-- =====================================

SELECT * FROM Accounts;

SELECT * FROM Loans;

SHOW PROCEDURE STATUS
WHERE Db='bankdb';
