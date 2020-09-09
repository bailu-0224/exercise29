CREATE DATABASE exercise29;
USE exercise29;

/*用户*/
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


/*鉴定*/
DROP TABLE IF EXISTS `authentication`;
CREATE TABLE `authentication`
(
    `id` INT AUTO_INCREMENT NOT NULL,
    `type` VARCHAR(2) NOT NULL,
    `name` VARCHAR(10) NOT NULL,
    `description` VARCHAR(50) NOT NULL,
    `status` TINYINT NOT NULL,
    `customer_id` VARCHAR(20) NOT NULL,
    `case_id` INT NOT NULL,
    `cost` INT NOT NULL,
    `item` VARCHAR(200) NOT NULL,
    `report` VARCHAR(200) NOT NULL,
    `express_num` VARCHAR(30) NOT NULL,
    PRIMARY KEY ( `id` )
) DEFAULT CHARSET=UTF8MB4;


/*案件*/
DROP TABLE IF EXISTS `fire_case`;
CREATE TABLE `fire_case`
(
    `id` INT AUTO_INCREMENT NOT NULL,
    `name` VARCHAR(50) NOT NULL,
    `time` BIGINT NOT NULL,
    PRIMARY KEY ( `id` )
) DEFAULT CHARSET=UTF8MB4;


/*仪器设备*/
DROP TABLE IF EXISTS `equipment`;
CREATE TABLE `equipment`
(
    `id` INT AUTO_INCREMENT NOT NULL,
    `name` VARCHAR(20) NOT NULL,
    `comment` VARCHAR(50) NOT NULL,
    `serve` VARCHAR(20) NOT NULL,
    PRIMARY KEY ( `id` )
) DEFAULT CHARSET=UTF8MB4;


/*部门*/
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department`
(
    `id` INT AUTO_INCREMENT NOT NULL,
    `name` VARCHAR(10) NOT NULL,
    `comment` VARCHAR(50) NOT NULL,
    `leader` VARCHAR(20) NOT NULL,
    `phone` VARCHAR(20) NOT NULL,
    `time` BIGINT  NOT NULL,
    PRIMARY KEY ( `id` )
) DEFAULT CHARSET=UTF8MB4;


/*员工*/
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee`
(
    `id` VARCHAR(20) NOT NULL,
    `name` VARCHAR(10) NOT NULL,
    `dept_id` INT NOT NULL,
    `dept_name` VARCHAR(10) NOT NULL,
    `duty` VARCHAR(20) NOT NULL,
    `time` VARCHAR(20) NOT NULL,
    PRIMARY KEY ( `id` )
) DEFAULT CHARSET=UTF8MB4;