-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 22-05-2017 a las 00:26:45
-- Versión del servidor: 10.1.16-MariaDB
-- Versión de PHP: 5.6.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `gestionmonitores`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_docentemateria`
--

CREATE TABLE `tbl_docentemateria` (
  `id` int(11) NOT NULL,
  `docente_cedula` varchar(10) NOT NULL,
  `estudiante_cedula` varchar(10) NOT NULL,
  `materia_codigo` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tbl_docentemateria`
--

INSERT INTO `tbl_docentemateria` (`id`, `docente_cedula`, `estudiante_cedula`, `materia_codigo`) VALUES
(1, '0987654321', '', '12346'),
(2, '0987654321', '', '12347'),
(3, '1234567890', '', '12345');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_docentes`
--

CREATE TABLE `tbl_docentes` (
  `cedula` varchar(10) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `nombre` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `apellidos` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `telefono` varchar(10) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `direccion` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `fechaNacimiento` date DEFAULT NULL,
  `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `pwd` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `perfil` char(1) NOT NULL DEFAULT 'd'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `tbl_docentes`
--

INSERT INTO `tbl_docentes` (`cedula`, `nombre`, `apellidos`, `telefono`, `direccion`, `fechaNacimiento`, `email`, `pwd`, `perfil`) VALUES
('0987654321', 'Jorge Iván', 'Meza Martinez', NULL, NULL, NULL, 'jorge.m@autonoma.edu.co', '123', 'd'),
('1234567890', 'Sandra', 'Victoria Hurtado', NULL, NULL, NULL, 'sandra.h@autonoma.edu.co', '123', 'd');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_estudiantemateria`
--

CREATE TABLE `tbl_estudiantemateria` (
  `id` int(11) NOT NULL,
  `estudiante_cedula` varchar(10) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `materia_codigo` varchar(5) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `nota` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tbl_estudiantemateria`
--

INSERT INTO `tbl_estudiantemateria` (`id`, `estudiante_cedula`, `materia_codigo`, `nota`) VALUES
(1, '67890', '12346', 4),
(2, '13579', '12345', 4),
(3, '12345', '12346', 4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_estudiantes`
--

CREATE TABLE `tbl_estudiantes` (
  `cedula` varchar(10) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `nombre` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `apellido` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `fechaNacimiento` date NOT NULL,
  `pwd` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `telefono` varchar(10) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `direccion` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `monitor` tinyint(1) NOT NULL DEFAULT '0',
  `perfil` char(1) NOT NULL DEFAULT 'e'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `tbl_estudiantes`
--

INSERT INTO `tbl_estudiantes` (`cedula`, `nombre`, `apellido`, `email`, `fechaNacimiento`, `pwd`, `telefono`, `direccion`, `monitor`, `perfil`) VALUES
('12345', 'Alvaro', 'Castaño', 'alvaro@gmail.com', '2013-05-05', '123', '8882040', 'la Cumbre', 0, 'e'),
('13579', 'Yasmin', 'Montoya', 'yasmin@gmail.com', '2017-04-23', '123', '8883066', 'Malabar', 0, 'e'),
('67890', 'Ruby', 'Lopez', 'ruby@gmail.com', '1995-01-16', '123', '8883066', 'Camilo torres', 0, 'e');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_materias`
--

CREATE TABLE `tbl_materias` (
  `codigo` varchar(5) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `estado` tinyint(1) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tbl_materias`
--

INSERT INTO `tbl_materias` (`codigo`, `nombre`, `estado`) VALUES
('12345', 'Ingenieria de Software II', 1),
('12346', 'Sistemas Distribuidos', 1),
('12347', 'Enfasis', 0);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `tbl_docentemateria`
--
ALTER TABLE `tbl_docentemateria`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id` (`id`);

--
-- Indices de la tabla `tbl_docentes`
--
ALTER TABLE `tbl_docentes`
  ADD PRIMARY KEY (`cedula`),
  ADD UNIQUE KEY `cedula` (`cedula`),
  ADD UNIQUE KEY `email` (`email`);

--
-- Indices de la tabla `tbl_estudiantemateria`
--
ALTER TABLE `tbl_estudiantemateria`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `tbl_estudiantes`
--
ALTER TABLE `tbl_estudiantes`
  ADD PRIMARY KEY (`cedula`),
  ADD UNIQUE KEY `cedula` (`cedula`),
  ADD UNIQUE KEY `email` (`email`);

--
-- Indices de la tabla `tbl_materias`
--
ALTER TABLE `tbl_materias`
  ADD PRIMARY KEY (`codigo`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `tbl_docentemateria`
--
ALTER TABLE `tbl_docentemateria`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT de la tabla `tbl_estudiantemateria`
--
ALTER TABLE `tbl_estudiantemateria`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
