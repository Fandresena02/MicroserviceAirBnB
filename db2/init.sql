CREATE TABLE bookings (
                          id INT AUTO_INCREMENT PRIMARY KEY,
                          listing_id INT,
                          user_id INT,
                          start_date DATE,
                          end_date DATE,
                          status ENUM('PENDING', 'CONFIRMED', 'CANCELLED') DEFAULT 'PENDING',
                          FOREIGN KEY (listing_id) REFERENCES listing_management_db.listings(id),
                          FOREIGN KEY (user_id) REFERENCES auth_db.users(id)
);

INSERT INTO bookings (listing_id, user_id, start_date, end_date, status) VALUES
                                                                             (1, 2, '2024-06-01', '2024-06-10', 'CONFIRMED'),
                                                                             (2, 2, '2024-07-01', '2024-07-15', 'PENDING');