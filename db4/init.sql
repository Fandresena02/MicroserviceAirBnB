CREATE TABLE tracking (
                          id INT AUTO_INCREMENT PRIMARY KEY,
                          booking_id INT,
                          status VARCHAR(255),
                          timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                          FOREIGN KEY (booking_id) REFERENCES booking_db.bookings(id)
);

INSERT INTO tracking (booking_id, status) VALUES
                                              (1, 'CONFIRMED'),
                                              (2, 'PENDING');