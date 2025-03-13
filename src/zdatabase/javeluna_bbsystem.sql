-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 13, 2025 at 04:17 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `javeluna_bbsystem`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_prop`
--

CREATE TABLE `tbl_prop` (
  `propID` int(20) NOT NULL,
  `hostID` int(20) NOT NULL,
  `proptype` varchar(50) NOT NULL,
  `loc` varchar(50) NOT NULL,
  `availability` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_user`
--

CREATE TABLE `tbl_user` (
  `userID` int(20) NOT NULL,
  `u_role` varchar(20) NOT NULL,
  `fname` varchar(50) NOT NULL,
  `lname` varchar(50) NOT NULL,
  `mname` varchar(50) DEFAULT NULL,
  `u_name` varchar(50) NOT NULL,
  `u_email` varchar(50) NOT NULL,
  `u_phone` int(20) NOT NULL,
  `u_address` varchar(50) NOT NULL,
  `u_pass` varchar(50) NOT NULL,
  `u_status` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_user`
--

INSERT INTO `tbl_user` (`userID`, `u_role`, `fname`, `lname`, `mname`, `u_name`, `u_email`, `u_phone`, `u_address`, `u_pass`, `u_status`) VALUES
(7, 'Admin', 'Jwymeth Louise', 'Javeluna', 'G.', 'methy', 'jjwymeth@gmail.com', 9154, 'Lipata, Minglanilla', '12345678', 'Active'),
(8, 'Guest', 'Jwymeth', 'Javeluna', '', 'methyy', 'jjwymeth@yahoo.com', 123, 'Lipata, Minglanilla', '12345678', 'Active'),
(9, 'Host', 'ven', 'violon', '', 'elgato', 'msv', 908, 'tunghaan', '12345678', 'Active'),
(11, 'Admin', '11', '11', '11', '11', 'kllknkj', 11, '11', '11111111', 'Active'),
(12, 'Admin', 'test', 'test', NULL, 'fgfg', 'test', 912345678, 'test', 'testtesttest', 'Pending'),
(13, 'Guest', 'jwy', 'meth', NULL, 'jwy', 'jwabol', 123, '123', 'jwyjwyjwy', 'Pending');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_prop`
--
ALTER TABLE `tbl_prop`
  ADD PRIMARY KEY (`propID`);

--
-- Indexes for table `tbl_user`
--
ALTER TABLE `tbl_user`
  ADD PRIMARY KEY (`userID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_prop`
--
ALTER TABLE `tbl_prop`
  MODIFY `propID` int(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tbl_user`
--
ALTER TABLE `tbl_user`
  MODIFY `userID` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
