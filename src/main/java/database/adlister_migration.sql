USE adlister_db;
drop table if exists ads;
CREATE TABLE ads(
id INT UNSIGNED NOT NULL AUTO_INCREMENT,
user_id INT UNSIGNED NOT NULL,
title VARCHAR(255),
description VARCHAR(750),
PRIMARY KEY (id),
CONSTRAINT fk_id FOREIGN KEY (user_id) REFERENCES users (id)
);