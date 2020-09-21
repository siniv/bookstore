/*DROP TABLE book;
DROP TABLE category;

CREATE TABLE category (
id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(50) NOT NULL
);

CREATE TABLE book (
id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
title VARCHAR(50) NOT NULL,
author VARCHAR(50) NOT NULL,
year INT,
isbn VARCHAR(25),
price INT,
categoryid BIGINT
);

INSERT INTO category (name) VALUES ('Dekkari'), ('Novelli'), ('Dokumentti');

INSERT INTO book (title, author, year, isbn, price, categoryid)
VALUES ('Joku kirja', 'Joku kirjoittaja', 2019, 'ISBN123', 20, 1),
('Toinen kirja', 'Toinen kirjoittaja', 2020, 'ISBN456', 50, 2);

SELECT * FROM book;
SELECT * FROM category;*/
