BEGIN
    FOR vip_rec IN (SELECT CustomerID, Balance FROM Customers) LOOP
        IF vip_rec.Balance > 10000 THEN
            UPDATE Customers
            SET IsVIP = 'TRUE'
            WHERE CustomerID = vip_rec.CustomerID;

            DBMS_OUTPUT.PUT_LINE('Customer ID ' || vip_rec.CustomerID || ' promoted to VIP.');
        END IF;
    END LOOP;
END;
/
