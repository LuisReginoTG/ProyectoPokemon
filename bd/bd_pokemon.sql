-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 15-04-2024 a las 09:02:25
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `pokemon`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `entrenador`
--

CREATE TABLE `entrenador` (
  `ID_ENTRENADOR` int(11) NOT NULL,
  `NOM_ENTRENADOR` varchar(20) NOT NULL,
  `PASSWORD` varchar(20) NOT NULL,
  `POKEDOLARES` decimal(17,0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `entrenador`
--

INSERT INTO `entrenador` (`ID_ENTRENADOR`, `NOM_ENTRENADOR`, `PASSWORD`, `POKEDOLARES`) VALUES
(1, 'LUIS', '123456', 20000);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pokedex`
--

CREATE TABLE `pokedex` (
  `NUM_POKEDEX` int(11) NOT NULL,
  `NOM_POKEMON` varchar(30) NOT NULL,
  `TIPO1` varchar(20) NOT NULL,
  `TIPO2` varchar(20) DEFAULT NULL,
  `IMAGEN` varchar(100) NOT NULL,
  `SONIDO` varchar(100) NOT NULL,
  `NIVEL_EVOLUCION` int(11) DEFAULT NULL,
  `NUM_POKEDEX_EVO` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `pokedex`
--

INSERT INTO `pokedex` (`NUM_POKEDEX`, `NOM_POKEMON`, `TIPO1`, `TIPO2`, `IMAGEN`, `SONIDO`, `NIVEL_EVOLUCION`, `NUM_POKEDEX_EVO`) VALUES
(3, 'VENASAUR', 'PLANTA', 'VENENO', 'DASDFA', 'AEDA', NULL, NULL),
(6, 'CHARIZARD', 'FUEGO', 'DRAGÓN', 'DASDFA', 'AEDA', NULL, NULL),
(9, 'BLASTOISE', 'AGUA', NULL, 'DASDFA', 'AEDA', NULL, NULL),
(25, 'PIKACHU', 'ELECTRICO', NULL, 'DASDFA', 'AEDA', NULL, NULL),
(151, 'MEWTWO', 'PSIQUICO', NULL, 'DASDFA', 'AEDA', NULL, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pokemon`
--

CREATE TABLE `pokemon` (
  `ID_POKEMON` int(11) NOT NULL,
  `ID_ENTRENADOR` int(11) DEFAULT NULL,
  `NUM_POKEDEX` int(11) DEFAULT NULL,
  `MOTE` varchar(20) DEFAULT NULL,
  `ATAQUE` int(11) DEFAULT NULL,
  `ATA_ESPECIAL` int(11) DEFAULT NULL,
  `DEFENSA` int(11) DEFAULT NULL,
  `NIVEL` int(11) DEFAULT NULL,
  `CAJA` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `pokemon`
--

INSERT INTO `pokemon` (`ID_POKEMON`, `ID_ENTRENADOR`, `NUM_POKEDEX`, `MOTE`, `ATAQUE`, `ATA_ESPECIAL`, `DEFENSA`, `NIVEL`, `CAJA`) VALUES
(1, 1, 6, 'dragoncito', 115, 95, 104, 6, 1),
(2, 1, 9, 'Tortuga ninja', 110, 90, 99, 5, 1),
(3, 1, 3, 'plantita', 115, 95, 104, 6, 2),
(4, 1, 25, 'rata electrica', 115, 95, 104, 6, 2),
(5, 1, 151, 'tocho', 115, 95, 104, 6, 2);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `entrenador`
--
ALTER TABLE `entrenador`
  ADD PRIMARY KEY (`ID_ENTRENADOR`);

--
-- Indices de la tabla `pokedex`
--
ALTER TABLE `pokedex`
  ADD PRIMARY KEY (`NUM_POKEDEX`);

--
-- Indices de la tabla `pokemon`
--
ALTER TABLE `pokemon`
  ADD PRIMARY KEY (`ID_POKEMON`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
