CREATE SCHEMA dao;

INSERT INTO dao.customers
(name, surname, age, phone_number)
VALUES ('Olga', 'Andreeva', 23, '+7936450422'),
       ('Alexey', 'Petrov', 32, '7-988-000-7635'),
       ('Ivan', 'Ivanov', 33, '8-999-235-3657'),
       ('Anna', 'Smirnova', 19, '8-916-500-3656');

INSERT INTO dao.orders
(date, customer_id, product_name, amount)
VALUES ('Friday, September 10, 2022', 1, 'Comcast', 1493392993),
       ('Saturday, December 12, 2023', 2, 'UPC', 2036582258),
       ('Monday, February 10, 2020', 3, 'Coca-Cola Company', 321541164),
       ('Thursday, July 23, 2021', 4, 'PC Consulting', 1397732507);