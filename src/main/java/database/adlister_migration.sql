USE adlister_db;



DROP TABLE IF EXISTS ads;
DROP TABLE IF EXISTS users;



CREATE TABLE users
(
    id       INT UNSIGNED NOT NULL AUTO_INCREMENT,
    userName VARCHAR(100)  NOT NUll,
    email    VARCHAR(100)  NOT NULL,
    password VARCHAR(100) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE ads
(
    id          INT UNSIGNED NOT NULL AUTO_INCREMENT,
    user_id     INT UNSIGNED NOT NULL,
    title       VARCHAR(255),
    description VARCHAR(750),
    PRIMARY KEY (id),
    CONSTRAINT fk_id FOREIGN KEY (user_id) REFERENCES users (id)
);