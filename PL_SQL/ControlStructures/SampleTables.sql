CREATE TABLE Customers (
    CustomerID NUMBER PRIMARY KEY,
    Age NUMBER,
    Balance NUMBER,
    LoanInterestRate NUMBER,
    IsVIP VARCHAR2(10)
);

CREATE TABLE Loans (
    LoanID NUMBER PRIMARY KEY,
    CustomerID NUMBER,
    DueDate DATE
);