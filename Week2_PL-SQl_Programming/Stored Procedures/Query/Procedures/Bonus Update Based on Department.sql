CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
    p_DepartmentID IN NUMBER,
    p_BonusPercent IN NUMBER -- e.g., pass 10 for 10%
) IS
BEGIN
    FOR emp IN (SELECT EmployeeID, Salary FROM Employees WHERE DepartmentID = p_DepartmentID) LOOP
        UPDATE Employees
        SET Salary = Salary + (Salary * p_BonusPercent / 100)
        WHERE EmployeeID = emp.EmployeeID;
    END LOOP;

    DBMS_OUTPUT.PUT_LINE('Bonus applied to department ID: ' || p_DepartmentID);
END;
/
