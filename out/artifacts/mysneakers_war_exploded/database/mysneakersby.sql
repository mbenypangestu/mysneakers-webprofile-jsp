-- phpMyAdmin SQL Dump
-- version 4.8.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 07, 2018 at 11:47 AM
-- Server version: 10.1.31-MariaDB
-- PHP Version: 7.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mysneakersby`
--

-- --------------------------------------------------------

--
-- Table structure for table `artikel`
--

CREATE TABLE `artikel` (
  `id` int(11) NOT NULL,
  `judul` varchar(50) NOT NULL,
  `konten` text NOT NULL,
  `gambar` varchar(50) NOT NULL,
  `tgl_pos` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `brand`
--

CREATE TABLE `brand` (
  `id` int(11) NOT NULL,
  `nama` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `brand`
--

INSERT INTO `brand` (`id`, `nama`) VALUES
(1, 'Nike'),
(2, 'Adidas'),
(3, 'Converse'),
(4, 'Reebok'),
(5, 'Puma'),
(6, 'Vans'),
(7, 'Off White'),
(8, 'Supreme'),
(9, 'Air Jordan'),
(10, 'Balenciaga');

-- --------------------------------------------------------

--
-- Table structure for table `detail_order`
--

CREATE TABLE `detail_order` (
  `order_id` int(11) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `produk_id` int(11) NOT NULL,
  `subtotal` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `jenis`
--

CREATE TABLE `jenis` (
  `id` int(11) NOT NULL,
  `jenis` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `jenis`
--

INSERT INTO `jenis` (`id`, `jenis`) VALUES
(1, 'Sneakers'),
(2, 'Basketball'),
(3, 'Football'),
(4, 'Tennis'),
(5, 'Running');

-- --------------------------------------------------------

--
-- Table structure for table `kategori_produk`
--

CREATE TABLE `kategori_produk` (
  `id` int(11) NOT NULL,
  `kategori` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `notifikasi`
--

CREATE TABLE `notifikasi` (
  `id` int(11) NOT NULL,
  `order_id` int(11) NOT NULL,
  `notif` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `order`
--

CREATE TABLE `order` (
  `id` int(11) NOT NULL,
  `tgl_order` datetime NOT NULL,
  `total` double NOT NULL,
  `status_kirim` int(11) NOT NULL,
  `status_terima` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `produk`
--

CREATE TABLE `produk` (
  `id` int(11) NOT NULL,
  `brand_id` int(11) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `jenis_id` int(11) NOT NULL,
  `bahan` varchar(50) NOT NULL,
  `harga` double NOT NULL,
  `stok` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `produk`
--

INSERT INTO `produk` (`id`, `brand_id`, `nama`, `jenis_id`, `bahan`, `harga`, `stok`) VALUES
(1, 0, 'Nike Air Jordan 1 x Off-White ', 0, 'suede', 20000000, 3),
(2, 0, 'KITH x Nike Lebron XV', 0, 'suede', 4000000, 6);

-- --------------------------------------------------------

--
-- Table structure for table `promo_produk`
--

CREATE TABLE `promo_produk` (
  `id` int(11) NOT NULL,
  `produk_id` int(11) NOT NULL,
  `diskon` int(11) NOT NULL,
  `harga_promo` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `role_user`
--

CREATE TABLE `role_user` (
  `id` int(11) NOT NULL,
  `role` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `size`
--

CREATE TABLE `size` (
  `id` int(11) NOT NULL,
  `US` double NOT NULL,
  `UK` double NOT NULL,
  `EU` double NOT NULL,
  `CM` double NOT NULL,
  `IN` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `size`
--

INSERT INTO `size` (`id`, `US`, `UK`, `EU`, `CM`, `IN`) VALUES
(1, 4, 3, 37, 22.9, 9),
(2, 4.5, 3.5, 37.5, 23.3, 9.3),
(3, 5, 4, 38, 23.8, 9.4),
(4, 5.5, 4.5, 38.5, 24.1, 9.5),
(5, 6, 5, 39, 24.8, 9.8),
(6, 6.5, 5.5, 39.5, 25.1, 9.9),
(7, 7, 6, 40, 25.4, 10),
(8, 7.5, 6.5, 41, 25.8, 10.2),
(9, 8, 7, 41.5, 26, 10.3),
(10, 8.5, 7.5, 42, 26.7, 10.5),
(11, 9, 8, 43, 27.3, 10.8),
(12, 9.5, 8.5, 43.5, 27.7, 10.9),
(13, 10, 9, 44, 27.9, 11),
(14, 10.5, 9.5, 44.5, 28.6, 11.3),
(15, 11, 10, 45, 29.2, 11.5),
(16, 11.5, 10.5, 45.5, 29.5, 11.7),
(17, 12, 11, 46, 29.8, 11.8),
(18, 13, 12, 48, 30.5, 12),
(19, 14, 13, 49, 31.1, 12.3),
(20, 15, 14, 50, 31.7, 12.5);

-- --------------------------------------------------------

--
-- Table structure for table `size_produk`
--

CREATE TABLE `size_produk` (
  `produk_id` int(11) NOT NULL,
  `size_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `password` text NOT NULL,
  `alamat` text NOT NULL,
  `telp` varchar(20) NOT NULL,
  `foto` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `nama`, `username`, `email`, `password`, `alamat`, `telp`, `foto`) VALUES
(1, 'guskoro pradipta prana arief', 'guskoro', 'guskoroa@yahoo.com', 'guskoro', 'Sukolilo Park Regency E30', '085648761793', ''),
(2, 'muhammad beny pangestu', 'mygetzu', 'mbenypangestu@gmail.com', 'beny', 'gebang wetan 23B', '081232958312', '');

-- --------------------------------------------------------

--
-- Table structure for table `warna`
--

CREATE TABLE `warna` (
  `id` int(11) NOT NULL,
  `warna` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `warna`
--

INSERT INTO `warna` (`id`, `warna`) VALUES
(1, 'Merah'),
(2, 'Biru'),
(3, 'Kuning'),
(4, 'Hijau'),
(5, 'Hitam'),
(6, 'Putih'),
(7, 'Silver'),
(8, 'Abu Abu'),
(9, 'Tosca'),
(10, 'Pink');

-- --------------------------------------------------------

--
-- Table structure for table `warna_produk`
--

CREATE TABLE `warna_produk` (
  `produk_id` int(11) NOT NULL,
  `warna_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `artikel`
--
ALTER TABLE `artikel`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `brand`
--
ALTER TABLE `brand`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `jenis`
--
ALTER TABLE `jenis`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `kategori_produk`
--
ALTER TABLE `kategori_produk`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `notifikasi`
--
ALTER TABLE `notifikasi`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `order`
--
ALTER TABLE `order`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `produk`
--
ALTER TABLE `produk`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `promo_produk`
--
ALTER TABLE `promo_produk`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `role_user`
--
ALTER TABLE `role_user`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `size`
--
ALTER TABLE `size`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `warna`
--
ALTER TABLE `warna`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `artikel`
--
ALTER TABLE `artikel`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `brand`
--
ALTER TABLE `brand`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `jenis`
--
ALTER TABLE `jenis`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `kategori_produk`
--
ALTER TABLE `kategori_produk`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `notifikasi`
--
ALTER TABLE `notifikasi`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `order`
--
ALTER TABLE `order`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `produk`
--
ALTER TABLE `produk`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `promo_produk`
--
ALTER TABLE `promo_produk`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `role_user`
--
ALTER TABLE `role_user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
