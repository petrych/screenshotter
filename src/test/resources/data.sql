CREATE TABLE IF NOT EXISTS screenshot (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  date_time_created VARCHAR(250) NOT NULL,
  file_name VARCHAR(250) NOT NULL,
  user_id INT
);

INSERT IGNORE INTO screenshot (name, date_time_created, file_name, user_id) VALUES ('screenshot-1-com', '1999-05-01', '1.png', 1);
INSERT IGNORE INTO screenshot (name, date_time_created, file_name, user_id) VALUES ('screenshot-2-com', '1999-05-02', '2.png', 1);
INSERT IGNORE INTO screenshot (name, date_time_created, file_name, user_id) VALUES ('drive-google-com', '1999-05-14', '3.png', 1);
