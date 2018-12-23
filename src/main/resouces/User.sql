DROP TABLE IF EXISTS `User`;
CREATE TABLE `mlgb`.`userinfo`  (
  `name` varchar(50) NOT NULL,
  `id` int(50) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
);