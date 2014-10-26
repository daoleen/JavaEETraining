CREATE TABLE IF NOT EXISTS Book (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(32) NOT NULL,
  `description` VARCHAR(255) NOT NULL,
  `year` INT NOT NULL DEFAULT '2014',

  PRIMARY KEY (`id`)
);