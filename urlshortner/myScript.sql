CREATE TABLE `url` (
  `short_url` varchar(255) NOT NULL,
  `long_url` longtext NOT NULL,
  PRIMARY KEY (`short_url`),
  UNIQUE KEY `short_url_UNIQUE` (`short_url`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;