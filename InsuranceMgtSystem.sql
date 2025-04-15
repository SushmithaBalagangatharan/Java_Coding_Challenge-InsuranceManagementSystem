create database InsuranceMgtSystem;

use InsuranceMgtSystem;

drop table Users;
drop table Clients;
drop table Claim;
drop table Payment;

create table Users(
	userId INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(100) NOT NULL,
    userPassword VARCHAR(250) NOT NULL,
    userRole VARCHAR(50) 
);

create table Clients(
	clientId INT PRIMARY KEY AUTO_INCREMENT,
    clientName VARCHAR(100) NOT NULL,
    contactInfo VARCHAR(220) NOT NULL,
    policy VARCHAR(100) UNIQUE
);

create table Claim(
	claimId INT PRIMARY KEY AUTO_INCREMENT,
    claimNumber INT NOT NULL,
    dateFiled  TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    claimAmount DOUBLE,
    claimStatus VARCHAR(50),
    policy VARCHAR(100),
    clientId INT,
    FOREIGN KEY (policy) REFERENCES Clients(policy),
    FOREIGN KEY (clientId) REFERENCES Clients(clientId)
);

create table Payment(
	paymentId INT PRIMARY KEY AUTO_INCREMENT,
    paymentDate TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    paymentAmount DOUBLE,
    clientId INT,
    FOREIGN KEY (clientId) REFERENCES Clients(clientId)
);