USE adlister_db;

drop table users;

CREATE TABLE users(
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    userName VARCHAR(25) NOT NUll,
    email VARCHAR(30) NOT NULL,
    password VARCHAR(25),
    PRIMARY KEY (id)
);