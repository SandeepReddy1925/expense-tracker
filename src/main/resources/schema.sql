CREATE TABLE users (
    id number PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(150) NOT NULL,
    password VARCHAR(255) NOT NULL,
    created_at TIMESTAMP NOT NULL,
    created_by VARCHAR(100) NOT NULL,
    modified_at TIMESTAMP NULL,
    modified_by VARCHAR(100) NULL
);
