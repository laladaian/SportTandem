--drop table USER_PREFERENCES if EXISTS;

create TABLE USER_PREFERENCES (
             username VARCHAR(255) PRIMARY KEY,
             password VARCHAR(255),
             realname VARCHAR(255),
             email VARCHAR(255),
             city     VARCHAR(255),
             sex VARCHAR(255),
             sport VARCHAR(255),
             sportLevel INT,
             profession VARCHAR(255),
             phone VARCHAR(255),
             age INT,
             frequency VARCHAR(255),
             comments VARCHAR(255)
);