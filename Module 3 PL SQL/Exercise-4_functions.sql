USE bankdb;

-- =====================================
-- Scenario 1: Calculate Customer Age
-- =====================================

DELIMITER //

CREATE FUNCTION CalculateAge(
dob DATE
)
RETURNS INT
DETERMINISTIC
BEGIN
RETURN TIMESTAMPDIFF(YEAR, dob, CURDATE());
END //

DELIMITER ;

-- Test
SELECT Name,
CalculateAge(DOB) AS Age
FROM Customers;

-- =====================================
-- Scenario 2: Calculate Monthly Installment
-- =====================================

DELIMITER //

CREATE FUNCTION CalculateMonthlyInstallment(
loan_amount DECIMAL(10,2),
interest_rate DECIMAL(5,2),
years INT
)
RETURNS DECIMAL(10,2)
DETERMINISTIC
BEGIN
DECLARE monthly_installment DECIMAL(10,2);

```
SET monthly_installment =
loan_amount / (years * 12);

RETURN monthly_installment;
```

END //

DELIMITER ;

-- Test
SELECT CalculateMonthlyInstallment(
5000,
5,
5
) AS MonthlyInstallment;

-- =====================================
-- Scenario 3: Check Sufficient Balance
-- =====================================

DELIMITER //

CREATE FUNCTION HasSufficientBalance(
acc_id INT,
amt DECIMAL(10,2)
)
RETURNS BOOLEAN
DETERMINISTIC
BEGIN
DECLARE bal DECIMAL(10,2);

```
SELECT Balance
INTO bal
FROM Accounts
WHERE AccountID = acc_id;

RETURN bal >= amt;
```

END //

DELIMITER ;

-- Test
SELECT HasSufficientBalance(
1,
500
) AS Result;
