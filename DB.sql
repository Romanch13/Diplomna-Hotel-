CREATE DATABASE  IF NOT EXISTS `websystique` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `websystique`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: websystique
-- ------------------------------------------------------
-- Server version	5.7.21-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `additional_services`
--

DROP TABLE IF EXISTS `additional_services`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `additional_services` (
  `services_id` int(11) NOT NULL AUTO_INCREMENT,
  `additional_Services` varchar(50) NOT NULL,
  PRIMARY KEY (`services_id`),
  KEY `service_fk_idx` (`additional_Services`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `additional_services`
--

LOCK TABLES `additional_services` WRITE;
/*!40000 ALTER TABLE `additional_services` DISABLE KEYS */;
INSERT INTO `additional_services` VALUES (3,'Доставка сніданку в номер'),(2,'Мінібар'),(1,'Спутникове телебачення');
/*!40000 ALTER TABLE `additional_services` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `joining_date` date NOT NULL,
  `salary` double NOT NULL,
  `ssn` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `guests`
--

DROP TABLE IF EXISTS `guests`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `guests` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `surname` varchar(30) NOT NULL,
  `name` varchar(30) NOT NULL,
  `type_rooms` varchar(50) NOT NULL,
  `number_room` char(20) NOT NULL,
  `additional_Service` varchar(50) NOT NULL,
  `spending_Types` varchar(50) NOT NULL,
  `number_phone` varchar(50) NOT NULL,
  `payment` varchar(25) NOT NULL,
  `type_cards` varchar(30) NOT NULL,
  `number_cards` varchar(20) NOT NULL,
  `amount_payment` decimal(10,0) NOT NULL,
  `date` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `guests`
--

LOCK TABLES `guests` WRITE;
/*!40000 ALTER TABLE `guests` DISABLE KEYS */;
INSERT INTO `guests` VALUES (1,'Гончар','Роман','Президенський','1','Доставка сніданку в номер','Аренда велосипеду','+380993529561','Готівкою','Немає','0',2100,'2018-02-09'),(2,'Андрушко','Роман','Президенський','2','Доставка сніданку в номер','Уроки гольфу','+380932229561','Карткою','VISA','1234-5678-9632-1478',3050,'2018-02-09'),(3,'Грекул','Максим','Люкс','3','Міні бар','Сауна','+380993235961','Готівкою','немає','0',1700,'2018-02-13'),(4,'Бардан','Андрій','Стандартний','4','Немає','Сауна','+380507858575','Карткою','VISA','4545-4545-4545-4545',700,'2018-04-09'),(5,'Цопа ','Сергій','Стандартний','5','Гольф, 18 лунок','Немає','+380678438514','Готівкою','немає','0',900,'2018-02-09'),(6,'Гуцул','Іван','Напів-люкс','6','немає','Гольф, 9 лунок','+380978426395','Готівкою','немає','0',1350,'2018-02-09'),(7,'Лисак','Сергій','Duplex-двоповерховий','7','Міні бар','Тенісний корт','+380661582573','Готівкою','немає','0',2700,'2018-02-09'),(8,'Повержук','Іван','Стандартний','8','Міні бар','Уроки тенісу','+380985589565','Карткою','MasterCard','5555-9999-6666-7777',1150,'2018-02-09'),(9,'Продан','Людмила','Преміум клас','9','Доставка сніданку в номер','Спортивний комплекс','+380994526781','Готівкою','MasterCard','1245-6598-7832-9988',2200,'2018-02-09'),(10,'Панкевич','Олександр','Стандартний','10','Міні бар','Масаж','+380978031025','Готівкою','немає','0',1050,'2018-02-09'),(11,'Олійник','Юрій','Преміум клас','11','Доставка сніданку в номер','Аренда велосипеду','+380998417522','Готівкою','немає','0',2100,'2018-02-09'),(12,'Данилюк','Юрій','Стандартний','12','Міні бар','Аренда велосипеду','+380987854124','Готівкою','немає','0',1000,'2018-02-09');
/*!40000 ALTER TABLE `guests` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `spending_types`
--

DROP TABLE IF EXISTS `spending_types`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `spending_types` (
  `spending_id` int(11) NOT NULL AUTO_INCREMENT,
  `spending_Types` varchar(30) NOT NULL,
  PRIMARY KEY (`spending_id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `spending_types`
--

LOCK TABLES `spending_types` WRITE;
/*!40000 ALTER TABLE `spending_types` DISABLE KEYS */;
INSERT INTO `spending_types` VALUES (1,'Пляжна парасолька'),(2,'Аренда велосипеду'),(3,'Уроки гольфу'),(4,'Гольф, 18 лунок'),(5,'Гольф, 9 лунок'),(6,'Рушник для басейну'),(7,'Тенісний корт'),(8,'Уроки тенісу'),(9,'Спортивний комплекс'),(10,'Масаж'),(11,'Сауна');
/*!40000 ALTER TABLE `spending_types` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `type_of_cards`
--

DROP TABLE IF EXISTS `type_of_cards`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `type_of_cards` (
  `cards_id` int(11) NOT NULL AUTO_INCREMENT,
  `type_cards` varchar(30) NOT NULL,
  PRIMARY KEY (`cards_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `type_of_cards`
--

LOCK TABLES `type_of_cards` WRITE;
/*!40000 ALTER TABLE `type_of_cards` DISABLE KEYS */;
INSERT INTO `type_of_cards` VALUES (1,'Visa'),(2,'MasterCard'),(3,'Ukrainian Express');
/*!40000 ALTER TABLE `type_of_cards` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `type_of_payment`
--

DROP TABLE IF EXISTS `type_of_payment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `type_of_payment` (
  `payment_id` int(11) NOT NULL AUTO_INCREMENT,
  `payment` varchar(25) NOT NULL,
  PRIMARY KEY (`payment_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `type_of_payment`
--

LOCK TABLES `type_of_payment` WRITE;
/*!40000 ALTER TABLE `type_of_payment` DISABLE KEYS */;
INSERT INTO `type_of_payment` VALUES (1,'Готівкою'),(2,'Карткою');
/*!40000 ALTER TABLE `type_of_payment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `types_of_rooms`
--

DROP TABLE IF EXISTS `types_of_rooms`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `types_of_rooms` (
  `rooms_id` bigint(11) NOT NULL AUTO_INCREMENT,
  `type_rooms` varchar(50) NOT NULL,
  PRIMARY KEY (`rooms_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `types_of_rooms`
--

LOCK TABLES `types_of_rooms` WRITE;
/*!40000 ALTER TABLE `types_of_rooms` DISABLE KEYS */;
INSERT INTO `types_of_rooms` VALUES (1,'Президенський'),(2,'Сімейний'),(3,'Стандартний'),(4,'Люкс'),(5,'Напів-люкс'),(6,'Економ'),(7,'Duplex-двоповерховий'),(8,'Преміум клас');
/*!40000 ALTER TABLE `types_of_rooms` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `idUser` int(11) NOT NULL AUTO_INCREMENT,
  `UserName` varchar(45) NOT NULL,
  `LastName` varchar(45) NOT NULL,
  PRIMARY KEY (`idUser`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-07-03 15:19:27
