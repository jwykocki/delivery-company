INSERT INTO Customers (id, name, email, address)
VALUES (1, 'Jan Kowalski', 'jan.kowalski@gmail.com', 'ul. Wiejska 1, Warszawa');

INSERT INTO Customers (id, name, email, address)
VALUES (2, 'Anna Nowak', 'anna.nowak@wp.pl', 'ul. Piękna 2, Kraków');

INSERT INTO Couriers (id, name, email, phone)
VALUES (1, 'DPD Polska', 'kontakt@dpd.com.pl', '+48 42 6 345 345');

INSERT INTO Couriers (id, name, email, phone)
VALUES (2, 'UPS Polska', 'info@ups.com', '+48 22 211 42 00');

INSERT INTO Delivery (id, destination_address, delivery_date)
VALUES (1, 'ul. Świerkowa 3, Gdańsk', '2023-05-05 12:00:00');

INSERT INTO Delivery (id, destination_address, delivery_date)
VALUES (2, 'ul. Krótka 5, Wrocław', '2023-05-07 15:00:00');

INSERT INTO Orders (id, customer_id, courier_id, delivery_id, date_created, status)
VALUES (1, 1, 1, 1, '2023-04-28 10:00:00', 'In progress');

INSERT INTO Orders (id, customer_id, courier_id, delivery_id, date_created, status)
VALUES (2, 2, 2, 2, '2023-04-29 14:30:00', 'Pending');

INSERT INTO Tracking (id, order_id, status, date_updated)
VALUES (1, 1, 'In progress', '2023-04-30 09:00:00');

INSERT INTO Tracking (id, order_id, status, date_updated)
VALUES (2, 2, 'Pending', '2023-04-30 09:30:00');
