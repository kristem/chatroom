DROP TABLE IF EXISTS `user_info`;

CREATE TABLE `user_info` (
  `user_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `user_name` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `nick_name` varchar(20) NOT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `user_name` (`user_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `user_friend_ref`;

CREATE TABLE `user_friend_ref` (
  `id` int (10) unsigned NOT NULL  AUTO_INCREMENT,
  `user_id` int(10) unsigned NOT NULL ,
  `friend_id` int(10) NOT NULL,
  `del_flag` tinyint(4) DEFAULT '0',
  PRIMARY KEY (`user_id`,`friend_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;