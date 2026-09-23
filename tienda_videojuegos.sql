-- MySQL dump 10.13  Distrib 8.0.46, for Win64 (x86_64)
--
-- Host: localhost    Database: tienda_videojuegos
-- ------------------------------------------------------
-- Server version	8.0.46

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `videojuegos`
--

DROP TABLE IF EXISTS `videojuegos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `videojuegos` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(300) DEFAULT NULL,
  `genero` varchar(60) DEFAULT NULL,
  `imagen` varchar(500) DEFAULT NULL,
  `nombre` varchar(120) NOT NULL,
  `plataforma` varchar(60) DEFAULT NULL,
  `precio` decimal(10,2) NOT NULL,
  `stock` int NOT NULL,
  `clave` varchar(60) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `videojuegos`
--

LOCK TABLES `videojuegos` WRITE;
/*!40000 ALTER TABLE `videojuegos` DISABLE KEYS */;
INSERT INTO `videojuegos` VALUES (13,'Lucha 3D de tres contra tres que adapta el final del manga. Mas de 80 personajes, transformaciones y escenarios destruibles.','Lucha','/img/naruto.jpg','Naruto','PC, PS4, Xbox One, Switch',39.99,14,'naruto'),(14,'Capcom anade el sistema Drive para parar golpes y atacar mas fuerte, el Modo Mundo Abierto y el Battle Hub en linea.','Lucha','/img/street-fighter.jpg','Street Fighter','PC, PS4, PS5, Xbox Series X/S',59.99,9,'street-fighter'),(15,'Las versiones pasadas y presentes de los luchadores se enfrentan a Kronika, la titan del tiempo. Estrena los Fatal Blows.','Lucha','/img/mortal-kombat.jpg','Mortal Kombat','PC, PS4, PS5, Xbox One, Series X/S, Switch',49.99,11,'mortal-kombat'),(16,'Los Sombrero de Paja arrasan oleadas enteras de enemigos. Arcos de Dressrosa, Whole Cake y Wano con 40 personajes.','Accion','/img/one-piece.jpg','One Piece','PC, PS4, Xbox One, Switch',44.99,16,'one-piece'),(17,'El final de la saga Mishima enfrenta a Heihachi y Kazuya. Sistema Rage Art y mas de 50 luchadores.','Lucha','/img/tekken.jpg','Tekken','PC, PS4, Xbox One',39.99,13,'tekken'),(18,'Combates 2D de tres contra tres dibujados a mano, tan fluidos como el anime. Modo Dramatic incluido.','Lucha','/img/dragon-ball.jpg','Dragon Ball','PC, PS4, Xbox One, Switch',54.99,7,'dragon-ball');
/*!40000 ALTER TABLE `videojuegos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2026-09-23 16:29:21
