DELIMITER //

CREATE PROCEDURE SafeTransferFunds(
IN p_from INT,
IN p_to INT,
IN p_amount DECIMAL(10,2)
)
BEGIN

DECLARE bal DECIMAL(10,2);

SELECT Balance
INTO bal
FROM Accounts
WHERE AccountID = p_from;

IF bal < p_amount THEN
    SIGNAL SQLSTATE '45000'
    SET MESSAGE_TEXT='Insufficient Funds';
ELSE
    UPDATE Accounts
    SET Balance = Balance - p_amount
    WHERE AccountID = p_from;

    UPDATE Accounts
    SET Balance = Balance + p_amount
    WHERE AccountID = p_to;
END IF;

END //

DELIMITER ;

CALL SafeTransferFunds(1,2,100);
SELECT * FROM Accounts;