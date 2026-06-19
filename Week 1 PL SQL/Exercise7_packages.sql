USE bankdb;

DROP FUNCTION IF EXISTS TotalCustomerBalance;

DELIMITER //

CREATE FUNCTION TotalCustomerBalance(
    c_id INT
)
RETURNS DECIMAL(10,2)
DETERMINISTIC
BEGIN

    DECLARE total_bal DECIMAL(10,2);

    SELECT IFNULL(SUM(Balance),0)
    INTO total_bal
    FROM Accounts
    WHERE CustomerID = c_id;

    RETURN total_bal;

END //

DELIMITER ;


SHOW FUNCTION STATUS
WHERE Db='bankdb';

SELECT TotalCustomerBalance(1) AS TotalBalance;

CALL TransferFunds(1,2,100);

SELECT * FROM Accounts;

SELECT HasSufficientBalance(1,500) AS Result;