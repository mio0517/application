DROP TABLE IF EXISTS `sample_db`.`list`;

CREATE TABLE `sample_db`.`list` (
  `id` INTEGER NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255),
  `genre` VARCHAR(255),
  `address` VARCHAR(255),
  `seats` INTEGER,
  `opening` VARCHAR(255),
  `tel` VARCHAR(255),
  PRIMARY KEY (`id`));