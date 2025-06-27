BEGIN
    FOR cust_rec IN (SELECT CustomerID, Age FROM Customers) LOOP
        IF cust_rec.Age > 60 THEN
            UPDATE Customers
            SET LoanInterestRate = LoanInterestRate - 1
            WHERE CustomerID = cust_rec.CustomerID;

            DBMS_OUTPUT.PUT_LINE('1% discount applied to Customer ID: ' || cust_rec.CustomerID);
        END IF;
    END LOOP;
END;
/
