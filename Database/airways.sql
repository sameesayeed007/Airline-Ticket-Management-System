-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 09, 2019 at 10:53 PM
-- Server version: 10.1.36-MariaDB
-- PHP Version: 5.6.38

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `airways`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `email_id` varchar(10) NOT NULL,
  `password` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`email_id`, `password`) VALUES
('admin1', '1234'),
('admin2', '1234');

-- --------------------------------------------------------

--
-- Table structure for table `airplane`
--

CREATE TABLE `airplane` (
  `license` varchar(10) NOT NULL,
  `Airline` varchar(20) NOT NULL,
  `B_available` int(11) NOT NULL,
  `E_availabe` int(11) NOT NULL,
  `Rating` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `bookings`
--

CREATE TABLE `bookings` (
  `id` int(11) NOT NULL,
  `username` varchar(20) NOT NULL,
  `trip_id` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bookings`
--

INSERT INTO `bookings` (`id`, `username`, `trip_id`) VALUES
(1, 'atoshi', 'CVCVC'),
(2, 'atoshi', 'AWtrtr'),
(3, 'atoshi', 'CVCVC'),
(4, 'atoshi', '4737347');

-- --------------------------------------------------------

--
-- Table structure for table `passwordz`
--

CREATE TABLE `passwordz` (
  `personid` int(11) NOT NULL,
  `email_id` varchar(20) NOT NULL,
  `pass` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `passwordz`
--

INSERT INTO `passwordz` (`personid`, `email_id`, `pass`) VALUES
(1, 'rez', '1222'),
(8, 'atosh', '1212'),
(12, 'sudd', '11'),
(16, 'atosh', 'xyz'),
(18, 'cam', '1234'),
(21, 'eee', 'a0a080f42e6f13b3a2df133f073095dd'),
(22, 'eee', 'a0a080f42e6f13b3a2df133f073095dd'),
(23, 'Shahid', '202cb962ac59075b964b07152d234b70'),
(24, 'bo', '7fa8282ad93047a4d6fe6111c93b308a'),
(25, 'qwq', 'fcea920f7412b5da7be0cf42b8c93759'),
(26, 'felix ', 'fcea920f7412b5da7be0cf42b8c93759'),
(27, 'felix', 'fcea920f7412b5da7be0cf42b8c93759'),
(29, 'Mona', 'fcea920f7412b5da7be0cf42b8c93759'),
(30, 'Mona', 'fcea920f7412b5da7be0cf42b8c93759'),
(31, 'Mona', 'fcea920f7412b5da7be0cf42b8c93759'),
(32, 'err', 'fcea920f7412b5da7be0cf42b8c93759'),
(33, 'err', 'fcea920f7412b5da7be0cf42b8c93759'),
(34, 'err', 'fcea920f7412b5da7be0cf42b8c93759'),
(35, 'atoshi', '1234567'),
(36, 'atoshi', '12345678'),
(37, 'atoshi', '12345678'),
(38, 'sak', '1234567'),
(39, 'sak', '12345678'),
(40, 'sak', '12345678'),
(41, 'fshahid', '1234567'),
(42, 'xxx', '12345678'),
(43, 'sally', '12345678q'),
(44, 'sally', '12345678'),
(45, 'sally', '12345678'),
(46, 'sally', '12345677'),
(47, 'sally', '12345677'),
(48, 'hasin', '12345678'),
(49, 'atosh', '12345678'),
(50, 'atosh', '12345678');

-- --------------------------------------------------------

--
-- Table structure for table `trip`
--

CREATE TABLE `trip` (
  `trip_id` varchar(10) NOT NULL,
  `travel_class` varchar(20) NOT NULL,
  `price` int(5) NOT NULL,
  `departure_date` date NOT NULL,
  `departure_location` varchar(20) NOT NULL,
  `arrival_location` varchar(20) NOT NULL,
  `transit_location` varchar(20) NOT NULL,
  `transit_time` varchar(10) NOT NULL,
  `A_lic` varchar(10) NOT NULL,
  `estimated_traveltime` varchar(20) NOT NULL,
  `cprice` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `trip`
--

INSERT INTO `trip` (`trip_id`, `travel_class`, `price`, `departure_date`, `departure_location`, `arrival_location`, `transit_location`, `transit_time`, `A_lic`, `estimated_traveltime`, `cprice`) VALUES
('4737347', 'Business Class', 75, '2019-10-23', 'New York', 'Paris', 'Vietnam', '6hours', '323', '18hours', 75),
('aaa', 'Business Class ', 125, '2019-08-28', 'Jamaica ', 'Chittagong', 'Singapore', '7 hours', 'qwer', '11 hours', 25),
('asas', 'Business Class', 75, '2019-08-23', 'Colombo', 'Lisbon ', 'Colombo', '7 hours', 'aza', '13 hours', 120),
('AWtrtr', 'Business Class ', 120, '2019-08-15', 'Colombo', 'New York', 'Singapore', '7 hours', '1232', '8hours', 60),
('CVCVC', 'Business Class ', 130, '2019-09-24', 'Colombo', 'New York', 'Mumbai', '9 hours ', '1121221', '14hours', 65),
('qwqwq', 'First Class', 75, '2019-08-30', 'Paris', 'Colombo', 'Singapore', '7 hours', 'qwq', '5', 125),
('xyz', 'First Class', 125, '2019-08-28', 'Dhaka', 'Colombo', 'Singapore', '7 hours', 'qqqq', '3hours', 25),
('zxc', 'Economy Class', 100, '2019-11-26', 'Athens', 'Chittagong', 'Singapore', '8 hours', '123', '9', 35);

-- --------------------------------------------------------

--
-- Table structure for table `userz`
--

CREATE TABLE `userz` (
  `name` varchar(20) NOT NULL,
  `email_id` varchar(10) NOT NULL,
  `password` varchar(40) NOT NULL,
  `phone_no` int(11) NOT NULL,
  `credit_card_no` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `userz`
--

INSERT INTO `userz` (`name`, `email_id`, `password`, `phone_no`, `credit_card_no`) VALUES
('Atoshi', 'atosh', '25d55ad283aa400af464c76d713c07ad', 122123232, 3223233),
('Atoshi', 'atoshi', '25d55ad283aa400af464c76d713c07ad', 123456, 12),
('boo', 'bo', '7fa8282ad93047a4d6fe6111c93b308a', 12, 12),
('Sheersho', 'cam', '1234', 11, 11),
('Erina ', 'eee', 'a0a080f42e6f13b3a2df133f073095dd', 123, 123),
('Erina', 'erinaa', '12', 121, 121),
('erina', 'err', 'fcea920f7412b5da7be0cf42b8c93759', 1234567, 123),
('Felix ', 'felix ', 'fcea920f7412b5da7be0cf42b8c93759', 1234567, 1232123),
('Ford', 'fordd', '121', 12341, 1234),
('Farhana', 'fshahid', 'fcea920f7412b5da7be0cf42b8c93759', 11234, 4345345),
('hasin', 'has', '202cb962ac59075b964b07152d234b70', 121, 121),
('Hasin Sadique', 'hasin', '25d55ad283aa400af464c76d713c07ad', 123456, 12345),
('Moonami ', 'Mona', 'fcea920f7412b5da7be0cf42b8c93759', 1234567, 123),
('bbgerina', 'qwq', 'fcea920f7412b5da7be0cf42b8c93759', 123, 123),
('Sakif', 'sak', '25d55ad283aa400af464c76d713c07ad', 123456, 123),
('Salman Anjum', 'sally', 'c5fde9de2d29789a81d1bc0f16292048', 123456, 123456),
('Samee', 'samzz', '1234', 1212, 12121),
('Farhana', 'Shahid', '202cb962ac59075b964b07152d234b70', 0, 0),
('Sudeeptio Bose', 'sudd', '11', 122, 133),
('xyz', 'xxx', '25d55ad283aa400af464c76d713c07ad', 123456, 123),
('Zaziba', 'zaz', '123', 12, 12);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`email_id`);

--
-- Indexes for table `airplane`
--
ALTER TABLE `airplane`
  ADD PRIMARY KEY (`license`);

--
-- Indexes for table `bookings`
--
ALTER TABLE `bookings`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `passwordz`
--
ALTER TABLE `passwordz`
  ADD PRIMARY KEY (`personid`);

--
-- Indexes for table `trip`
--
ALTER TABLE `trip`
  ADD PRIMARY KEY (`trip_id`);

--
-- Indexes for table `userz`
--
ALTER TABLE `userz`
  ADD PRIMARY KEY (`email_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `bookings`
--
ALTER TABLE `bookings`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `passwordz`
--
ALTER TABLE `passwordz`
  MODIFY `personid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=51;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
