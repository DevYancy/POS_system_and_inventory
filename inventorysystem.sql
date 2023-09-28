-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Sep 28, 2023 at 03:45 PM
-- Server version: 5.5.24-log
-- PHP Version: 5.3.13

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `inventorysystem`
--

-- --------------------------------------------------------

--
-- Table structure for table `cashier`
--

CREATE TABLE IF NOT EXISTS `cashier` (
  `id` int(250) NOT NULL AUTO_INCREMENT,
  `name` varchar(250) NOT NULL,
  `address` varchar(250) NOT NULL,
  `password` varchar(250) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `cashier`
--

INSERT INTO `cashier` (`id`, `name`, `address`, `password`) VALUES
(1, 'yancy', 'SECN', 'yancy');

-- --------------------------------------------------------

--
-- Table structure for table `expired`
--

CREATE TABLE IF NOT EXISTS `expired` (
  `id` int(250) NOT NULL AUTO_INCREMENT,
  `code_num` varchar(250) NOT NULL,
  `name_item` varchar(250) NOT NULL,
  `expired_date` varchar(250) NOT NULL,
  `sales_price` varchar(250) NOT NULL,
  `purchase_price` varchar(250) NOT NULL,
  `quantity` varchar(250) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `income`
--

CREATE TABLE IF NOT EXISTS `income` (
  `id` int(250) NOT NULL AUTO_INCREMENT,
  `date` varchar(250) NOT NULL,
  `cashier_name` varchar(250) NOT NULL,
  `income` varchar(250) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `outofstock`
--

CREATE TABLE IF NOT EXISTS `outofstock` (
  `id` int(11) NOT NULL,
  `item_name` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `purchased_item`
--

CREATE TABLE IF NOT EXISTS `purchased_item` (
  `id` int(250) NOT NULL AUTO_INCREMENT,
  `code_num` varchar(250) NOT NULL,
  `name_item` varchar(250) NOT NULL,
  `expired_date` varchar(250) NOT NULL,
  `sales_price` varchar(250) NOT NULL,
  `purchase_price` varchar(250) NOT NULL,
  `quantity` varchar(250) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `purchased_item`
--

INSERT INTO `purchased_item` (`id`, `code_num`, `name_item`, `expired_date`, `sales_price`, `purchase_price`, `quantity`) VALUES
(1, '2356669875122', 'sample_item_1', 'February 2024', '200.0', '100.0', '10');

-- --------------------------------------------------------

--
-- Table structure for table `transaction`
--

CREATE TABLE IF NOT EXISTS `transaction` (
  `id` int(250) NOT NULL AUTO_INCREMENT,
  `cashier_name` varchar(250) NOT NULL,
  `Quantity` varchar(250) NOT NULL,
  `Amount_per_item` varchar(250) NOT NULL,
  `items` varchar(250) NOT NULL,
  `total_amount` varchar(250) NOT NULL,
  `date` varchar(250) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
