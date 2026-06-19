-- Scenario 1
UPDATE Loans l
JOIN Customers c
ON l.CustomerID = c.CustomerID
SET l.InterestRate = l.InterestRate - 1
WHERE TIMESTAMPDIFF(YEAR,c.DOB,CURDATE()) > 60;

SELECT * FROM Loans;

-- Scenario 2
ALTER TABLE Customers
ADD COLUMN IsVIP BOOLEAN DEFAULT FALSE;

UPDATE Customers
SET IsVIP = TRUE
WHERE Balance > 10000;

SELECT * FROM Customers;

-- Scenario 3
SELECT CustomerID,
       LoanID,
       EndDate,
       'Reminder: Loan Due Soon' AS Message
FROM Loans
WHERE EndDate BETWEEN CURDATE()
AND DATE_ADD(CURDATE(),INTERVAL 30 DAY);