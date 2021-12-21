# DistributedSystemsProject2

docker run --name mysqldb -v mysqldbvol:/var/lib/mysql -p 3306:3306 -e MYSQL_USER=project2 -e MYSQL_PASSWORD=2000 -e MYSQL_DATABASE=user -e MYSQL_ROOT_PASSWORD=pass123 --rm -d mysql/mysql-server:latest
2d9c0ce200c60ca12845597dd1851401e5dcc5ab064cf6c4a7636ed7661eb81d

docker stop

DROP TABLE IF EXISTS `user_information`;

CREATE TABLE user_information (
 `id` int(11) NOT NULL AUTO_INCREMENT,
 `username` varchar(45) DEFAULT NULL,
 `first_name` varchar(45) DEFAULT NULL,
 `last_name` varchar(45) DEFAULT NULL,
 `email` varchar(45) DEFAULT NULL,
 PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

INSERT INTO UserInformation (username , first_name , last_name , email)
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
