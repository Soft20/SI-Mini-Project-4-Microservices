DROP TABLE IF EXISTS Car;
CREATE TABLE Car (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  brand VARCHAR(50) NOT NULL,
  year INT NOT NULL,
  km INT NOT NULL
);

