-- Insert into SavingsAccounts
INSERT INTO SavingsAccounts (AccountID, CustomerID, Balance) VALUES (101, 1, 5000.00);
INSERT INTO SavingsAccounts (AccountID, CustomerID, Balance) VALUES (102, 2, 15000.00);
INSERT INTO SavingsAccounts (AccountID, CustomerID, Balance) VALUES (103, 3, 8000.00);

-- Insert into Employees
INSERT INTO Employees (EmployeeID, Name, DepartmentID, Salary) VALUES (1, 'Alice', 10, 50000.00);
INSERT INTO Employees (EmployeeID, Name, DepartmentID, Salary) VALUES (2, 'Bob', 10, 55000.00);
INSERT INTO Employees (EmployeeID, Name, DepartmentID, Salary) VALUES (3, 'Charlie', 20, 60000.00);
INSERT INTO Employees (EmployeeID, Name, DepartmentID, Salary) VALUES (4, 'David', 30, 65000.00);

-- Insert into BankAccounts
INSERT INTO BankAccounts (AccountID, CustomerID, Balance) VALUES (201, 1, 20000.00);
INSERT INTO BankAccounts (AccountID, CustomerID, Balance) VALUES (202, 2, 10000.00);
INSERT INTO BankAccounts (AccountID, CustomerID, Balance) VALUES (203, 3, 500.00);

-- Commit all changes
COMMIT;
