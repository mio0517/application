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

INSERT INTO `sample_db`.`list` (`id`, `name`, `genre`, `address`, `seats`, `opening`, `tel`) VALUES ('1', '太郎', '中華', '東京都品川区1-1', '30', '9:00~21:00', '000-1111-2222');
