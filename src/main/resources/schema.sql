DROP TABLE IF EXISTS loan_provider;

CREATE TABLE loan_provider (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  min_credit_score INT NOT NULL
);