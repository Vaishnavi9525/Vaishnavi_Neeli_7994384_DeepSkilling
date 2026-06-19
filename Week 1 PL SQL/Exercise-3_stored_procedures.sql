USE bankdb;

-- Scenario 1: Process Monthly Interest

DELIMITER //

CREATE PROCEDURE ProcessMonthlyInterest()
BEGIN
UPDATE Accounts
SET Balance = Balance + (Balance * 0.01)
WHERE AccountType = 'Savings';
END //

DELIMITER ;

-- Test
CALL ProcessMonthlyInterest();

SELECT * FROM Accounts;

-- Scenario 2: Update Employee Bonus

DELIMITER //

CREATE PROCEDURE UpdateEmployeeBonus(
IN dept VARCHAR(50),
IN bonus_percent DECIMAL(5,2)
)
BEGIN
UPDATE Employees
SET Salary = Salary + (Salary * bonus_percent / 100)
WHERE Department = dept;
END //

DELIMITER ;

-- Test
CALL UpdateEmployeeBonus('IT',10);

SELECT * FROM Employees;

-- Scenario 3: Transfer Funds

DELIMITER //

CREATE PROCEDURE TransferFunds(
IN from_acc INT,
IN to_acc INT,
IN amt DECIMAL(10,2)
)
BEGIN
DECLARE bal DECIMAL(10,2);

```
SELECT Balance
INTO bal
FROM Accounts
WHERE AccountID = from_acc;

IF bal >= amt THEN

    UPDATE Accounts
    SET Balance = Balance - amt
    WHERE AccountID = from_acc;

    UPDATE Accounts
    SET Balance = Balance + amt
    WHERE AccountID = to_acc;

END IF;
```

END //

DELIMITER ;

-- Test
CALL TransferFunds(1,2,100);

SELECT * FROM Accounts;
