CREATE TABLE user_details (
                              id INT PRIMARY KEY,
                              email VARCHAR(255),
                              phone VARCHAR(20),
                              address VARCHAR(255)
--                               FOREIGN KEY (id) REFERENCES auth_db.users(id)
);

INSERT INTO user_details (id, email, phone, address) VALUES
                                                         (1, 'john_doe@example.com', '123-456-7890', '123 Main St, City, Country'),
                                                         (2, 'jane_smith@example.com', '098-765-4321', '456 Elm St, City, Country');