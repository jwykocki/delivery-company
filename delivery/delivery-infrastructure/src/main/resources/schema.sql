CREATE TABLE Customers (
                           id INT PRIMARY KEY,
                           name VARCHAR(255) NOT NULL,
                           email VARCHAR(255) NOT NULL,
                           address VARCHAR(255) NOT NULL
);


CREATE TABLE Orders (
                        id INT PRIMARY KEY,
                        customer_id INT NOT NULL,
                        courier_id INT NOT NULL,
                        delivery_id INT NOT NULL,
                        date_created TIMESTAMP NOT NULL,
                        status VARCHAR(255) NOT NULL,
                        FOREIGN KEY (customer_id) REFERENCES Customers(id),
                        FOREIGN KEY (courier_id) REFERENCES Couriers(id),
                        FOREIGN KEY (delivery_id) REFERENCES Delivery(id)
);

CREATE TABLE Couriers (
                          id INT PRIMARY KEY,
                          name VARCHAR(255) NOT NULL,
                          email VARCHAR(255) NOT NULL,
                          phone VARCHAR(255) NOT NULL
);

CREATE TABLE Delivery (
                          id INT PRIMARY KEY,
                          destination_address VARCHAR(255) NOT NULL,
                          delivery_date TIMESTAMP NOT NULL
);

CREATE TABLE Tracking (
                          id INT PRIMARY KEY,
                          order_id INT NOT NULL,
                          status VARCHAR(255) NOT NULL,
                          date_updated TIMESTAMP NOT NULL,
                          FOREIGN KEY (order_id) REFERENCES Orders(id)
);
