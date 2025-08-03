CREATE DATABASE bankSystem;
USE bankSystem;

-- Table 1: signup
CREATE TABLE signup (
    form_no VARCHAR(30),
    name VARCHAR(30),
    father_name VARCHAR(30),
    DOB VARCHAR(30),
    gender VARCHAR(30),
    email VARCHAR(60),
    marital_status VARCHAR(30),
    address VARCHAR(60),
    city VARCHAR(30),
    pincode VARCHAR(30),
    state VARCHAR(50)
);
SELECT * FROM signup;

-- Table 2: signuptwo
CREATE TABLE signuptwo (
    form_no VARCHAR(30),
    religion VARCHAR(30),
    category VARCHAR(30),
    income VARCHAR(30),
    education VARCHAR(30),
    occupation VARCHAR(30),
    pan VARCHAR(30),
    aadhar VARCHAR(30),
    senior_citizen VARCHAR(30),
    existing_account VARCHAR(30)
);
SELECT * FROM signuptwo;

-- Table 3: signupthree
CREATE TABLE signupthree (
    form_no VARCHAR(30),
    account_type VARCHAR(30),
    card_number VARCHAR(30),
    pin VARCHAR(30),
    services VARCHAR(100)
);
SELECT * FROM signupthree;

-- Table 4: login
CREATE TABLE login (
    card_number VARCHAR(30),
    pin VARCHAR(30)
);
SELECT * FROM login;

-- Table 5: login

CREATE TABLE bank (
    pin VARCHAR(30),
    date VARCHAR(30),
    type VARCHAR(30),
    amount VARCHAR(30)
);
SELECT * FROM bank;
