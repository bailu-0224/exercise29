CREATE DATABASE exercise29
USE exercise29

DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer`
(
    `account` VARCHAR(20) NOT NULL, /* 13位ISBN + 4位序列号 */
    `password` VARCHAR(20) NOT NULL,
    `type` VARCHAR(2) NOT NULL,
    `name` VARCHAR(10) NOT NULL,
    `auth` TINYINT NOT NULL,
    PRIMARY KEY ( `account` )
) DEFAULT CHARSET=UTF8MB4;