CREATE TABLE users (
                       id INT AUTO_INCREMENT PRIMARY KEY,
                       username VARCHAR(255) NOT NULL UNIQUE,
                       password VARCHAR(255) NOT NULL,
                       role ENUM('LOCATAIRE', 'PROPRIETAIRE', 'INVITE') DEFAULT 'LOCATAIRE'
);

INSERT INTO users (username, password, role) VALUES
                                                 ('john_doe', 'password123', 'LOCATAIRE'),
                                                 ('jane_smith', 'password123', 'INVITE');