CREATE OR REPLACE PROCEDURE TransferFunds (
    p_FromAccountID IN NUMBER,
    p_ToAccountID IN NUMBER,
    p_Amount IN NUMBER
) IS
    v_FromBalance NUMBER;
BEGIN
    -- Get current balance of the source account
    SELECT Balance INTO v_FromBalance
    FROM BankAccounts
    WHERE AccountID = p_FromAccountID
    FOR UPDATE;

    -- Check for sufficient balance
    IF v_FromBalance < p_Amount THEN
        RAISE_APPLICATION_ERROR(-20001, 'Insufficient balance in source account.');
    END IF;

    -- Deduct from source
    UPDATE BankAccounts
    SET Balance = Balance - p_Amount
    WHERE AccountID = p_FromAccountID;

    -- Add to destination
    UPDATE BankAccounts
    SET Balance = Balance + p_Amount
    WHERE AccountID = p_ToAccountID;

    DBMS_OUTPUT.PUT_LINE('Transferred ' || p_Amount || ' from Account ' || p_FromAccountID || ' to Account ' || p_ToAccountID);
END;
/
