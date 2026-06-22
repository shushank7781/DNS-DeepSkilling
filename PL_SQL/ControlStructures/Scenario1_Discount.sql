DECLARE
BEGIN
   FOR cust IN (
      SELECT CustomerID, Age, LoanInterestRate
      FROM Customers
   ) LOOP

      IF cust.Age > 60 THEN

         UPDATE Customers
         SET LoanInterestRate = LoanInterestRate - 1
         WHERE CustomerID = cust.CustomerID;

         DBMS_OUTPUT.PUT_LINE(
            'Discount applied to Customer ID: '
            || cust.CustomerID
         );

      END IF;

   END LOOP;
END;
/