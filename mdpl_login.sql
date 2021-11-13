-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 13, 2021 at 06:37 AM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.0.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mdpl_login`
--

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `u_id` int(11) NOT NULL COMMENT '6',
  `u_nama` varchar(255) NOT NULL,
  `u_username` varchar(50) NOT NULL,
  `u_password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`u_id`, `u_nama`, `u_username`, `u_password`) VALUES
(3, 'Oktia Dwi Hapsari', 'Oktia Dwi Hapsari', 'oktia'),
(4, 'hi', 'hai', '11'),
(5, 'echa jessica', 'echa', 'echa');

-- --------------------------------------------------------

--
-- Table structure for table `peminjaman`
--

CREATE TABLE `peminjaman` (
  `id` int(11) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `kode_buku` varchar(50) NOT NULL,
  `tgl_pinjam` varchar(10) NOT NULL,
  `tgl_kembali` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `peminjaman`
--

INSERT INTO `peminjaman` (`id`, `nama`, `kode_buku`, `tgl_pinjam`, `tgl_kembali`) VALUES
(1, 'Oktia Dwi Hapsari', 'A5', '30/05/2021', '10/06/2021'),
(2, 'Sri Lestari', 'A2', '30/05/2021', '10/06/2021'),
(3, 'Echa Jessica Putri', 'A4', '30/05/2021', '10/06/2021'),
(4, 'Rizal Hafidz', 'A3', '30/05/2021', '10/06/2021');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`u_id`);

--
-- Indexes for table `peminjaman`
--
ALTER TABLE `peminjaman`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `login`
--
ALTER TABLE `login`
  MODIFY `u_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '6', AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
