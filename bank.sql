-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Nov 15, 2017 at 07:49 PM
-- Server version: 10.1.19-MariaDB
-- PHP Version: 7.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `a`
--

-- --------------------------------------------------------

--
-- Table structure for table `doctor`
--

CREATE TABLE `doctor` (
  `DoctorID` int(11) NOT NULL,
  `Doctorname` text,
  `FatherName` text,
  `Email` text,
  `ContactNo` int(11) DEFAULT NULL,
  `Qualifications` text,
  `Specialization` text,
  `Gender` text,
  `BloodGroup` text,
  `DateOfJoining` text,
  `Address` text,
  `username` varchar(10) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `doctor`
--

INSERT INTO `doctor` (`DoctorID`, `Doctorname`, `FatherName`, `Email`, `ContactNo`, `Qualifications`, `Specialization`, `Gender`, `BloodGroup`, `DateOfJoining`, `Address`, `username`, `password`) VALUES
(1234, 'Harmesh', 'Adesh', 'rana@gmail.com', 98760, 'MBBS', 'Blood', 'M', 'A+', '10/10/2010', '1 Deep Complex', 'harmesh', '123456789');

-- --------------------------------------------------------

--
-- Table structure for table `donor`
--

CREATE TABLE `donor` (
  `name` text,
  `gender` varchar(10) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `email` text,
  `district` text,
  `pincode` int(11) DEFAULT NULL,
  `address` text,
  `number` text,
  `bloodtype` varchar(10) DEFAULT NULL,
  `pbgdd` date DEFAULT NULL,
  `pid` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `donor`
--

INSERT INTO `donor` (`name`, `gender`, `dob`, `email`, `district`, `pincode`, `address`, `number`, `bloodtype`, `pbgdd`, `pid`) VALUES
('1', 'MALE', '1111-11-11', '11', '11', 11, '111', '11', 'A+', '1111-11-11', 1),
('1', 'MALE', '1111-11-11', '11', '11', 11, '111', '11', 'A+', '1111-11-11', 2),
('1', 'MALE', '1111-11-11', '11', '11', 11, '111', '11', 'A+', '1111-11-11', 3),
('google', 'MALE', '2012-12-12', 'kaisdua@gmail.com', 'chd', 160002, 'chd', '369874125', 'A+', '2012-12-12', 6),
('Harmesh', 'MALE', '2012-12-12', 'abc@gmail.com', 'Chd', 160002, 'xyz', '47896587', 'A-', '2012-12-12', 7),
('Rana', 'MALE', '1990-10-10', 'Bohemia@kali.com', 'Chandigarh', 160002, '#1, North Street, Chennai - 11', '9876554727', 'A+', '2011-10-10', 8),
('a', 'MALE', '1998-12-12', 'xz@gmail.com', 'chandigarh', 160004, '#123 deep dfg', '9898787767', 'A+', '2017-12-12', 9),
('a', 'MALE', '1998-12-12', 'xz@gmail.com', 'chandigarh', 160004, '#123 deep dfg', '9898787767', 'A+', '2017-12-12', 10),
('a', 'MALE', '1998-12-12', 'xz@gmail.com', 'chandigarh', 160004, '#123 deep dfg', '9898787767', 'AB+', '2017-12-12', 11),
('po', 'MALE', '1998-12-12', 'pop@gmail.com', 'chandigarh', 160005, '#1234 deep hello', '9876544332', 'AB+', '2019-12-12', 12),
('po', 'FEMALE', '1994-12-12', 'koi@gmail.com', 'chandigarh', 160004, '#123 depp hello', '9876987542', 'AB+', '2014-12-12', 13),
('po', 'FEMALE', '1994-12-12', 'koi@gmail.com', 'chandigarh', 160004, '#123 depp hello', '9876987542', 'AB+', '2014-12-12', 14),
('po', 'FEMALE', '1994-12-12', 'koi@gmail.com', 'chandigarh', 160004, '#123 depp hello', '9876987542', 'A+', '2014-12-12', 15),
('Hello', 'MALE', '1990-12-12', 'vck@bsdk.com', 'chandigarh', 160002, '1, Deep, Complex ', '9878987654', 'A+', '2012-12-12', 16),
('kaushal', 'MALE', '1998-01-09', 'kaushal@gmail.com', 'chandigarh', 160002, '#1000 hall', '9876543212', 'O+', '2015-12-12', 17),
('raman', 'MALE', '1998-12-12', 'rana@gmail.com', 'chandigarh', 160014, '#1020 haha', '9875689750', 'O+', '2015-12-12', 18),
('hahah', 'MALE', '2014-12-12', 'o@GMAIL.COM', 'CHANDIGARH', 160025, '#123 GGG', '9638527412', 'B+', '2013-12-12', 19),
('hahah', 'MALE', '2014-12-12', 'o@GMAIL.COM', 'CHANDIGARH', 160025, '#123 GGG', '9638527412', 'B+', '2013-12-12', 20),
('hahah', 'MALE', '2014-12-12', 'o@GMAIL.COM', 'CHANDIGARH', 160025, '#123 GGG', '9638527412', 'B+', '2013-12-12', 21),
('bsdk', 'MALE', '1998-10-14', 'xyz@gmail.com', 'chandigarh', 160002, '#1, Hallomajra', '7009965741', 'B+', '2010-10-10', 22),
('Harmesh', 'MALE', '1998-10-10', 'raman@gmail.com', 'Chandigarh', 160002, '1, Hallomajra', '9876554727', 'A+', '2010-10-10', 23),
('Harmesh', 'MALE', '1998-10-10', 'raman@gmail.com', 'Chandigarh', 160002, '1, Hallomajra', '9876554727', 'A+', '2012-10-10', 24),
('Harmesh', 'MALE', '1998-01-10', 'bsdk@gmail.com', 'Chandigarh', 160002, '1, Hallomajra', '9988956267', 'A+', '2010-10-10', 25),
('as', 'MALE', '2017-03-12', '122@gmail.com', 'chandigarh', 160002, '#wads hak', '9878965454', 'B+', '2017-01-12', 26),
('as', 'MALE', '2017-03-12', '122@gmail.com', 'chandigarh', 160002, '#wads hak', '9878965454', 'B+', '2017-11-12', 27),
('nitish', 'MALE', '1998-10-14', 'snitish@gmail.com', 'chandigarh', 160002, '#564564 chd', '9879876547', 'AB+', '2014-12-12', 28),
('nitish', 'MALE', '1998-10-14', 'snitish@gmail.com', 'chandigarh', 160002, '#564564 chd', '9879876547', 'AB+', '2014-12-12', 29),
('hello', 'MALE', '2017-12-12', 'x@gmail.com', 'chandigarh', 160002, '#ff hallo', '9876543214', 'O+', '2017-07-15', 30),
('Harmesh', 'MALE', '1998-10-10', 'raman@gmail.com', 'Chandigarh', 160002, '1, Hallomajra', '9876707456', 'A+', '2010-10-10', 31),
('kaushal', 'MALE', '1998-01-12', 'kaushal@gmail.com', 'chandigarh', 160002, '#123 hallo', '9879879878', 'AB+', '2017-03-12', 32),
('Harmesh', 'MALE', '1998-10-10', 'raman@gmail.com', 'Chnadigarh', 160002, '#1, Deep', '9876554727', 'A+', '2010-10-10', 33),
('Harmesh', 'MALE', '1998-10-10', 'raman@gmail.com', 'Chandigarh', 160002, '1, DeepComplex', '9876554727', 'A+', '2010-10-10', 34),
('gojoaiga', 'FEMALE', '1998-12-12', 'hsh@fnns.com', 'chandigarh', 160003, '21 sdd', '9876543322', 'B+', '2017-10-12', 35),
('aksk', 'FEMALE', '1998-12-12', 'gmoo@sjd.com', 'punjab', 160080, '12 qw', '9876543212', 'A+', '2017-06-12', 36),
('Harmesh', 'MALE', '1998-10-10', 'asd@gmail.com', 'chandigarh', 160002, '234 fd ', '9876543422', 'A-', '2017-07-12', 37),
('rachit', 'MALE', '1998-05-30', 'raman.rana45@gmail.com', 'Chandigarh', 160002, '#1052 DeepComplex Chandigarh', '9914045232', 'A+', '2017-05-15', 38);

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `username` varchar(20) NOT NULL,
  `password` text,
  `name` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`username`, `password`, `name`) VALUES
('admin', 'admin@123', 'Rana'),
('google7708', 'kaushal7708', 'Kaushal');

-- --------------------------------------------------------

--
-- Table structure for table `searchh`
--

CREATE TABLE `searchh` (
  `state` text,
  `bloodgorup` text,
  `quantity` int(11) DEFAULT NULL,
  `city` text,
  `phone` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `searchh`
--

INSERT INTO `searchh` (`state`, `bloodgorup`, `quantity`, `city`, `phone`) VALUES
('Chandigarh', 'A+', 32, 'Sector-32', 5016216),
('Chandigarh', 'O-', 12, 'Sector-32', 5016216),
('Chandigarh', 'B+', 19, 'Sector-32', 5016216),
('Chandigarh', 'A-', 31, 'Sector-32', 5016216),
('Chandigarh', 'AB+', 17, 'Sector-32', 5016216),
('Chandigarh', 'AB-', 26, 'Sector-32', 5016216),
('Chandigarh', 'B-', 71, 'Sector-32', 5016216),
('Chandigarh', 'O+', 38, 'Sector-32', 5016216),
('Chandigarh', 'A+', 29, 'Sector-16', 5016221),
('Chandigarh', 'O+', 101, 'Sector-16', 5016221),
('Chandigarh', 'B-', 23, 'Sector-16', 5016221),
('Chandigarh', 'B+', 20, 'Sector-16', 5016221),
('Chandigarh', 'A-', 56, 'Sector-16', 5016221),
('Chandigarh', 'O-', 48, 'Sector-16', 5016221),
('Chandigarh', 'AB-', 31, 'Sector-16', 5016221),
('Chandigarh', 'AB+', 25, 'Sector-16', 5016221),
('Chandigarh', 'A+', 145, 'P.G.I.', 5016123),
('Chandigarh', 'O+', 112, 'P.G.I.', 5016123),
('Chandigarh', 'B-', 90, 'P.G.I.', 5016123),
('Chandigarh', 'B+', 62, 'P.G.I.', 5016123),
('Chandigarh', 'A-', 77, 'P.G.I.', 5016123),
('Chandigarh', 'O-', 75, 'P.G.I.', 5016123),
('Chandigarh', 'AB-', 54, 'P.G.I.', 5016123),
('Chandigarh', 'AB+', 39, 'P.G.I.', 5016123),
('Punjab', 'A+', 124, 'Patial', 3019213),
('Punjab', 'O-', 142, 'Patial', 3019213),
('Punjab', 'B+', 105, 'Patial', 3019213),
('Punjab', 'A-', 130, 'Patial', 3019213),
('Punjab', 'AB+', 112, 'Patial', 3019213),
('Punjab', 'AB-', 75, 'Patial', 3019213),
('Punjab', 'B-', 171, 'Patial', 3019213),
('Punjab', 'O+', 135, 'Patial', 3019213),
('Punjab', 'A+', 121, 'Amritsar', 3204731),
('Punjab', 'O+', 198, 'Amritsar', 3204731),
('Punjab', 'B-', 71, 'Amritsar', 3204731),
('Punjab', 'B+', 102, 'Amritsar', 3204731),
('Punjab', 'A-', 34, 'Amritsar', 3204731),
('Punjab', 'O-', 78, 'Amritsar', 3204731),
('Punjab', 'AB-', 90, 'Amritsar', 3204731),
('Punjab', 'AB+', 43, 'Amritsar', 3204731),
('Punjab', 'A+', 103, 'ludhiana', 3021901),
('Punjab', 'O+', 55, 'ludhiana', 3021901),
('Punjab', 'B-', 76, 'ludhiana', 3021901),
('Punjab', 'B+', 88, 'ludhiana', 3021901),
('Punjab', 'A-', 10, 'ludhiana', 3021901),
('Punjab', 'O-', 55, 'ludhiana', 3021901),
('Punjab', 'AB-', 25, 'ludhiana', 3021901),
('Punjab', 'AB+', 90, 'ludhiana', 3021901),
('Punjab', 'A+', 93, 'Bhatinda', 3016123),
('Punjab', 'O+', 90, 'Bhatinda', 3016123),
('Punjab', 'B-', 106, 'Bhatinda', 3016123),
('Punjab', 'B+', 128, 'Bhatinda', 3016123),
('Punjab', 'A-', 77, 'Bhatinda', 3016123),
('Punjab', 'O-', 81, 'Bhatinda', 3016123),
('Punjab', 'AB-', 69, 'Bhatinda', 3016123),
('Punjab', 'AB+', 101, 'Bhatinda', 3016123),
('Haryana', 'A+', 123, 'Ambala', 4019213),
('Haryana', 'O-', 142, 'Ambala', 4019213),
('Haryana', 'B+', 105, 'Ambala', 4019213),
('Haryana', 'A-', 140, 'Ambala', 4019213),
('Haryana', 'AB+', 112, 'Ambala', 4019213),
('Haryana', 'AB-', 75, 'Ambala', 4019213),
('Haryana', 'B-', 171, 'Ambala', 4019213),
('Haryana', 'O+', 135, 'Ambala', 4019213),
('Haryana', 'A+', 120, 'Hissar', 4004731),
('Haryana', 'O+', 198, 'Hissar', 4004731),
('Haryana', 'B-', 71, 'Hissar', 4004731),
('Haryana', 'B+', 102, 'Hissar', 4004731),
('Haryana', 'A-', 34, 'Hissar', 4004731),
('Haryana', 'O-', 78, 'Hissar', 4004731),
('Haryana', 'AB-', 90, 'Hissar', 4004731),
('Haryana', 'AB+', 43, 'Hissar', 4004731),
('Haryana', 'A+', 102, 'Bhiwani', 4021901),
('Haryana', 'O+', 55, 'Bhiwani', 4021901),
('Haryana', 'B-', 76, 'Bhiwani', 4021901),
('Haryana', 'B+', 88, 'Bhiwani', 4021901),
('Haryana', 'A-', 10, 'Bhiwani', 4021901),
('Haryana', 'O-', 55, 'Bhiwani', 4021901),
('Haryana', 'AB-', 25, 'Bhiwani', 4021901),
('Haryana', 'AB+', 90, 'Bhiwani', 4021901),
('Haryana', 'A+', 92, 'Kurukshetra', 4016123),
('Haryana', 'O+', 90, 'Kurukshetra', 4016123),
('Haryana', 'B-', 106, 'Kurukshetra', 4016123),
('Haryana', 'B+', 128, 'Kurukshetra', 4016123),
('Haryana', 'A-', 77, 'Kurukshetra', 4016123),
('Haryana', 'O-', 81, 'Kurukshetra', 4016123),
('Haryana', 'AB-', 69, 'Kurukshetra', 4016123),
('Haryana', 'AB+', 101, 'Kurukshetra', 4016123),
('Chandigarh', 'A+', 32, 'Sector-32', 5016216),
('Chandigarh', 'O-', 12, 'Sector-32', 5016216),
('Chandigarh', 'B+', 19, 'Sector-32', 5016216),
('Chandigarh', 'A-', 31, 'Sector-32', 5016216),
('Chandigarh', 'AB+', 17, 'Sector-32', 5016216),
('Chandigarh', 'AB-', 26, 'Sector-32', 5016216),
('Chandigarh', 'B-', 71, 'Sector-32', 5016216),
('Chandigarh', 'O+', 38, 'Sector-32', 5016216),
('Chandigarh', 'A+', 29, 'Sector-16', 5016221),
('Chandigarh', 'O+', 101, 'Sector-16', 5016221),
('Chandigarh', 'B-', 23, 'Sector-16', 5016221),
('Chandigarh', 'B+', 20, 'Sector-16', 5016221),
('Chandigarh', 'A-', 56, 'Sector-16', 5016221),
('Chandigarh', 'O-', 48, 'Sector-16', 5016221),
('Chandigarh', 'AB-', 31, 'Sector-16', 5016221),
('Chandigarh', 'AB+', 25, 'Sector-16', 5016221),
('Chandigarh', 'A+', 145, 'P.G.I.', 5016123),
('Chandigarh', 'O+', 112, 'P.G.I.', 5016123),
('Chandigarh', 'B-', 90, 'P.G.I.', 5016123),
('Chandigarh', 'B+', 62, 'P.G.I.', 5016123),
('Chandigarh', 'A-', 77, 'P.G.I.', 5016123),
('Chandigarh', 'O-', 75, 'P.G.I.', 5016123),
('Chandigarh', 'AB-', 54, 'P.G.I.', 5016123),
('Chandigarh', 'AB+', 39, 'P.G.I.', 5016123),
('Punjab', 'A+', 124, 'Patial', 3019213),
('Punjab', 'O-', 142, 'Patial', 3019213),
('Punjab', 'B+', 105, 'Patial', 3019213),
('Punjab', 'A-', 130, 'Patial', 3019213),
('Punjab', 'AB+', 112, 'Patial', 3019213),
('Punjab', 'AB-', 75, 'Patial', 3019213),
('Punjab', 'B-', 171, 'Patial', 3019213),
('Punjab', 'O+', 135, 'Patial', 3019213),
('Punjab', 'A+', 121, 'Amritsar', 3204731),
('Punjab', 'O+', 198, 'Amritsar', 3204731),
('Punjab', 'B-', 71, 'Amritsar', 3204731),
('Punjab', 'B+', 102, 'Amritsar', 3204731),
('Punjab', 'A-', 34, 'Amritsar', 3204731),
('Punjab', 'O-', 78, 'Amritsar', 3204731),
('Punjab', 'AB-', 90, 'Amritsar', 3204731),
('Punjab', 'AB+', 43, 'Amritsar', 3204731),
('Punjab', 'A+', 103, 'ludhiana', 3021901),
('Punjab', 'O+', 55, 'ludhiana', 3021901),
('Punjab', 'B-', 76, 'ludhiana', 3021901),
('Punjab', 'B+', 88, 'ludhiana', 3021901),
('Punjab', 'A-', 10, 'ludhiana', 3021901),
('Punjab', 'O-', 55, 'ludhiana', 3021901),
('Punjab', 'AB-', 25, 'ludhiana', 3021901),
('Punjab', 'AB+', 90, 'ludhiana', 3021901),
('Punjab', 'A+', 93, 'Bhatinda', 3016123),
('Punjab', 'O+', 90, 'Bhatinda', 3016123),
('Punjab', 'B-', 106, 'Bhatinda', 3016123),
('Punjab', 'B+', 128, 'Bhatinda', 3016123),
('Punjab', 'A-', 77, 'Bhatinda', 3016123),
('Punjab', 'O-', 81, 'Bhatinda', 3016123),
('Punjab', 'AB-', 69, 'Bhatinda', 3016123),
('Punjab', 'AB+', 101, 'Bhatinda', 3016123),
('Haryana', 'A+', 123, 'Ambala', 4019213),
('Haryana', 'O-', 142, 'Ambala', 4019213),
('Haryana', 'B+', 105, 'Ambala', 4019213),
('Haryana', 'A-', 140, 'Ambala', 4019213),
('Haryana', 'AB+', 112, 'Ambala', 4019213),
('Haryana', 'AB-', 75, 'Ambala', 4019213),
('Haryana', 'B-', 171, 'Ambala', 4019213),
('Haryana', 'O+', 135, 'Ambala', 4019213),
('Haryana', 'A+', 120, 'Hissar', 4004731),
('Haryana', 'O+', 198, 'Hissar', 4004731),
('Haryana', 'B-', 71, 'Hissar', 4004731),
('Haryana', 'B+', 102, 'Hissar', 4004731),
('Haryana', 'A-', 34, 'Hissar', 4004731),
('Haryana', 'O-', 78, 'Hissar', 4004731),
('Haryana', 'AB-', 90, 'Hissar', 4004731),
('Haryana', 'AB+', 43, 'Hissar', 4004731),
('Haryana', 'A+', 102, 'Bhiwani', 4021901),
('Haryana', 'O+', 55, 'Bhiwani', 4021901),
('Haryana', 'B-', 76, 'Bhiwani', 4021901),
('Haryana', 'B+', 88, 'Bhiwani', 4021901),
('Haryana', 'A-', 10, 'Bhiwani', 4021901),
('Haryana', 'O-', 55, 'Bhiwani', 4021901),
('Haryana', 'AB-', 25, 'Bhiwani', 4021901),
('Haryana', 'AB+', 90, 'Bhiwani', 4021901),
('Haryana', 'A+', 92, 'Kurukshetra', 4016123),
('Haryana', 'O+', 90, 'Kurukshetra', 4016123),
('Haryana', 'B-', 106, 'Kurukshetra', 4016123),
('Haryana', 'B+', 128, 'Kurukshetra', 4016123),
('Haryana', 'A-', 77, 'Kurukshetra', 4016123),
('Haryana', 'O-', 81, 'Kurukshetra', 4016123),
('Haryana', 'AB-', 69, 'Kurukshetra', 4016123),
('Haryana', 'AB+', 101, 'Kurukshetra', 4016123);

-- --------------------------------------------------------

--
-- Table structure for table `signup`
--

CREATE TABLE `signup` (
  `name` text,
  `gender` text,
  `dob` date DEFAULT NULL,
  `email` text,
  `district` text,
  `username` varchar(20) NOT NULL,
  `address` text,
  `phone` text,
  `password` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `signup`
--

INSERT INTO `signup` (`name`, `gender`, `dob`, `email`, `district`, `username`, `address`, `phone`, `password`) VALUES
('Rana', 'MALE', '1970-10-10', 'raman@gmail.com', 'Chandigarh', 'admin', '#1062 Halloomajra', '9876554727', 'admin@123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `doctor`
--
ALTER TABLE `doctor`
  ADD PRIMARY KEY (`DoctorID`);

--
-- Indexes for table `donor`
--
ALTER TABLE `donor`
  ADD PRIMARY KEY (`pid`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `signup`
--
ALTER TABLE `signup`
  ADD PRIMARY KEY (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `donor`
--
ALTER TABLE `donor`
  MODIFY `pid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=39;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
