DROP TABLE IF EXISTS CITY;
CREATE TABLE CITY
(
    city_code    INT AUTO_INCREMENT PRIMARY KEY,
    city_name    VARCHAR NOT NULL,
    city_pincode INT     NOT NULL
);  