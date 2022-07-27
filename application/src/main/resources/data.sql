DROP TABLE IF EXISTS `sample_db`.`info`;

CREATE TABLE `sample_db`.`info` (
  `id` INTEGER NOT NULL AUTO_INCREMENT,
  `name1` VARCHAR(255),
  `store` INTEGER,
  `date` VARCHAR(255),
  `time` VARCHAR(255),
  `people` INTEGER,
  `tel1` VARCHAR(255),
  `favorite` INTEGER,
  PRIMARY KEY (`id`));

  INSERT INTO `sample_db`.`info` (`id`, `name1`, `store`, `date`, `time`, `people`, `tel1`, `favorite`) VALUES ('1', 'あああ',  '1', '7/19', '18:00~', '5', '111-222-3333', '1');
  INSERT INTO `sample_db`.`info` (`id`, `name1`, `store`, `date`, `time`, `people`, `tel1`, `favorite`) VALUES ('2', 'いいいい',  '2', '7/19', '18:00~', '5', '111-222-3333', '1');