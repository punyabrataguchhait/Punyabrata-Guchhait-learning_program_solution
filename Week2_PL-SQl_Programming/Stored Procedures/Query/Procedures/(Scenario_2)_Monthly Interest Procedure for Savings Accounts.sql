CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
    FOR acc IN (SELECT AccountID, Balance FROM SavingsAccounts) LOOP
        UPDATE SavingsAccounts
        SET Balance = Balance + (Balance * 0.01)
        WHERE AccountID = acc.AccountID;
    END LOOP;

    DBMS_OUTPUT.PUT_LINE('Monthly interest applied to all savings accounts.');
END;
/
