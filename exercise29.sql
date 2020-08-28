CREATE DATABASE exercise29
USE exercise29

DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer`
(
    `account` VARCHAR(20) NOT NULL,
    `password` VARCHAR(20) NOT NULL,
    `type` VARCHAR(2) NOT NULL,
    `name` VARCHAR(10) NOT NULL,
    `auth` TINYINT NOT NULL,
    PRIMARY KEY ( `account` )
) DEFAULT CHARSET=UTF8MB4;


DROP TABLE IF EXISTS `fire_case`;
CREATE TABLE `fire_case`
(
    `id` INT AUTO_INCREMENT NOT NULL,
    `time` BIGINT NOT NULL,
    `name` VARCHAR(50) NOT NULL,
    PRIMARY KEY ( `id` )
) DEFAULT CHARSET=UTF8MB4;


DROP TABLE IF EXISTS `authentication`;
CREATE TABLE `authentication`
(
    `id` INT AUTO_INCREMENT NOT NULL,
    `type` VARCHAR(2) NOT NULL,
    `status` TINYINT NOT NULL,
    `customer_id` VARCHAR(20) NOT NULL,
    `case_id` TINYINT NOT NULL,
    `cost` INT NOT NULL,
    `item` VARCHAR(200) NOT NULL,
    `report` VARCHAR(200) NOT NULL,
    `express_num` VARCHAR(30) NOT NULL,
    PRIMARY KEY ( `id` )
) DEFAULT CHARSET=UTF8MB4;

