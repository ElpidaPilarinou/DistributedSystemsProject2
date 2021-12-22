DROP TABLE IF EXISTS `user_information`;

CREATE TABLE user_information (
 `id` int(11) NOT NULL AUTO_INCREMENT,
 `username` varchar(45) DEFAULT NULL,
 `first_name` varchar(45) DEFAULT NULL,
 `last_name` varchar(45) DEFAULT NULL,
 `email` varchar(45) DEFAULT NULL,
 PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

INSERT INTO user_information (username , first_name , last_name , email)
VALUES ('Cardinal', 'Tom', 'Erichsen', 'love@hotmail.com');

CREATE TABLE IF NOT EXISTS `user` (
 `username` varchar(50) NOT NULL,
 `password` varchar(100) NOT NULL,
 `enabled` tinyint(1) NOT NULL,
 PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE IF NOT EXISTS `authorities` (
 `username` varchar(50) NOT NULL,
 `authority` varchar(50) NOT NULL,
 UNIQUE KEY `ix_auth_username` (`username`,`authority`),
 CONSTRAINT `fk_authorities_users` FOREIGN KEY (`username`) REFERENCES `user` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



INSERT INTO `user` (`username`, `password`, `enabled`) VALUES
   ('elpida', '$2a$04$DR/f..s1siWJc8Xg3eJgpeB28a4V6kYpnkMPeOuq4rLQ42mJUYFGC', 1),
   ('root', '$2a$04$DR/f..s1siWJc8Xg3eJgpeB28a4V6kYpnkMPeOuq4rLQ42mJUYFGC', 1);

INSERT INTO `authorities` (`username`, `authority`) VALUES
   ('root', 'ROLE_ADMIN'),
   ('elpida', 'ROLE_USER');
   
 CREATE TABLE IF NOT EXISTS `application` (
 `id_ap` int(11) NOT NULL AUTO_INCREMENT,
 `id` int(11) NOT NULL,
 `undergraduate_studies` varchar(100) NOT NULL,
 `grade` int(2) NOT NULL,
 `professor1` varchar(100) NOT NULL,
 `professor2` varchar(100) NOT NULL,
 `approval` varchar(10) NOT NULL,
 `order_number` int(11) NOT NULL,
 PRIMARY KEY (`id_ap`),
 CONSTRAINT `fk_application_id` FOREIGN KEY (`id`) REFERENCES `user_information` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `application`;

INSERT INTO application (id, undergraduate_studies, grade , professor1, professor2, approval, order_number)
VALUES ('1', 'Informatics and Telematics', '7', 'Tom Smith', 'George Walker', 'yes', '1');

