-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 29, 2019 at 09:54 AM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.3.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `login_register`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin_faculty`
--

CREATE TABLE `admin_faculty` (
  `name` varchar(30) NOT NULL,
  `designation` varchar(30) NOT NULL,
  `contact no` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin_faculty`
--

INSERT INTO `admin_faculty` (`name`, `designation`, `contact no`) VALUES
('nirmal kaur', 'assistant professor', 8146522779),
('ravneet kaur', 'assistant professor', 8968500084),
('makhan singh', 'assistant professor', 9417020029),
('ajay mittal', 'associate professor', 9417039925),
('mukesh kumar', 'assistant professor', 9417573099),
('sukhwinder singh', 'professor', 9417756421),
('deepti gupta', 'assistant professor', 9464288284),
('rohit kumar', 'assistant professor', 9501926750),
('dhriti', 'assistant professor', 9530802236),
('manisha kaushal', 'assistant professor', 9592200491),
('akashdeep', 'assistant professor', 9814925790),
('sarbjeet singh', 'professor', 9815951674),
('harish kumar', 'professor', 9815964121),
('preeti aggarwal', 'assistant professor', 9872021863);

-- --------------------------------------------------------

--
-- Table structure for table `admin_gallery`
--

CREATE TABLE `admin_gallery` (
  `image_id` int(10) NOT NULL,
  `image_url` varchar(1000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin_gallery`
--

INSERT INTO `admin_gallery` (`image_id`, `image_url`) VALUES
(1, 'C:\\Users\\Harpreet Singh\\Documents\\NetBeansProjects\\project\\200419115757514_15.jpeg'),
(2, 'C:\\Users\\Harpreet Singh\\Documents\\NetBeansProjects\\project\\200419115757514_3.jpeg'),
(3, 'C:\\Users\\Harpreet Singh\\Documents\\NetBeansProjects\\project\\030519160220955_81.jpeg'),
(4, 'C:\\Users\\Harpreet Singh\\Documents\\NetBeansProjects\\project\\200419115757514_14.jpeg');

-- --------------------------------------------------------

--
-- Table structure for table `admin_notification`
--

CREATE TABLE `admin_notification` (
  `n_id` int(30) NOT NULL,
  `notification` varchar(1000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin_notification`
--

INSERT INTO `admin_notification` (`n_id`, `notification`) VALUES
(3, 'WELCOME TO EDUCATION TIME');

-- --------------------------------------------------------

--
-- Table structure for table `admin_questionpaper`
--

CREATE TABLE `admin_questionpaper` (
  `s_number` int(11) NOT NULL,
  `p_name` varchar(100) NOT NULL,
  `p_url` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin_questionpaper`
--

INSERT INTO `admin_questionpaper` (`s_number`, `p_name`, `p_url`) VALUES
(7, 'advance database systems', 'C:\\Users\\Harpreet Singh\\Documents\\NetBeansProjects\\project\\questionpaper\\sem7\\Advance database system.pdf'),
(4, 'analysis and design of algorithms', 'C:\\Users\\Harpreet Singh\\Documents\\NetBeansProjects\\project\\questionpaper\\sem4\\Ada.pdf'),
(2, 'applied chemistry', 'C:\\Users\\Harpreet Singh\\Documents\\NetBeansProjects\\project\\questionpaper\\sem2\\Applied chemistry.pdf'),
(5, 'artificial intelligence', 'C:\\Users\\Harpreet Singh\\Documents\\NetBeansProjects\\project\\questionpaper\\sem5\\AI.pdf'),
(1, 'calculus', 'C:\\Users\\Harpreet Singh\\Documents\\NetBeansProjects\\project\\questionpaper\\sem1\\Calculus.pdf'),
(7, 'cloud computing', 'C:\\Users\\Harpreet Singh\\Documents\\NetBeansProjects\\project\\questionpaper\\sem7\\Cloud computing.pdf'),
(2, 'communication skills', 'C:\\Users\\Harpreet Singh\\Documents\\NetBeansProjects\\project\\questionpaper\\sem2\\Communication skills.pdf'),
(6, 'compiler design', 'C:\\Users\\Harpreet Singh\\Documents\\NetBeansProjects\\project\\questionpaper\\sem6\\Compiler design.pdf'),
(4, 'computer architecture and organization', 'C:\\Users\\Harpreet Singh\\Documents\\NetBeansProjects\\project\\questionpaper\\sem4\\Cao.pdf'),
(5, 'computer graphics', 'C:\\Users\\Harpreet Singh\\Documents\\NetBeansProjects\\project\\questionpaper\\sem5\\Computer graphics.pdf'),
(6, 'computer networks and security', 'C:\\Users\\Harpreet Singh\\Documents\\NetBeansProjects\\project\\questionpaper\\sem6\\Computer network and security.pdf'),
(5, 'data communication and networks', 'C:\\Users\\Harpreet Singh\\Documents\\NetBeansProjects\\project\\questionpaper\\sem5\\Data communication and network.pdf'),
(6, 'data mining and analysis', 'C:\\Users\\Harpreet Singh\\Documents\\NetBeansProjects\\project\\questionpaper\\sem6\\Data mining.pdf'),
(3, 'data structures', 'C:\\Users\\Harpreet Singh\\Documents\\NetBeansProjects\\project\\questionpaper\\sem3\\Data structures.pdf'),
(3, 'database systems', 'C:\\Users\\Harpreet Singh\\Documents\\NetBeansProjects\\project\\questionpaper\\sem3\\Database systems.pdf'),
(2, 'differential equation and transforms', 'C:\\Users\\Harpreet Singh\\Documents\\NetBeansProjects\\project\\questionpaper\\sem2\\Diff equ & transforms.pdf'),
(2, 'digital electronics and logic gates', 'C:\\Users\\Harpreet Singh\\Documents\\NetBeansProjects\\project\\questionpaper\\sem2\\Digital electronics.pdf'),
(7, 'digital image processing', 'C:\\Users\\Harpreet Singh\\Documents\\NetBeansProjects\\project\\questionpaper\\sem7\\Digital image processing.pdf'),
(3, 'discrete structures', 'C:\\Users\\Harpreet Singh\\Documents\\NetBeansProjects\\project\\questionpaper\\sem3\\Discrete structures.pdf'),
(3, 'economics', 'C:\\Users\\Harpreet Singh\\Documents\\NetBeansProjects\\project\\questionpaper\\sem3\\Eco.pdf'),
(8, 'entrepreneurship and project management', 'C:\\Users\\Harpreet Singh\\Documents\\NetBeansProjects\\project\\questionpaper\\sem8\\Enterpreneurship.pdf'),
(1, 'ethics and self awareness', 'C:\\Users\\Harpreet Singh\\Documents\\NetBeansProjects\\project\\questionpaper\\sem1\\Ethics.pdf'),
(8, 'information retrieval and management', 'C:\\Users\\Harpreet Singh\\Documents\\NetBeansProjects\\project\\questionpaper\\sem8\\Information retrieval.jpg'),
(1, 'introduction to computer science and engineering', 'C:\\Users\\Harpreet Singh\\Documents\\NetBeansProjects\\project\\questionpaper\\sem1\\Icse.pdf'),
(1, 'introduction to environment science', 'C:\\Users\\Harpreet Singh\\Documents\\NetBeansProjects\\project\\questionpaper\\sem1\\Intro to environment science.pdf'),
(6, 'linear algebra and probability theory', 'C:\\Users\\Harpreet Singh\\Documents\\NetBeansProjects\\project\\questionpaper\\sem6\\Linear algebra.pdf'),
(8, 'machine learning and computational intelligence', 'C:\\Users\\Harpreet Singh\\Documents\\NetBeansProjects\\project\\questionpaper\\sem8\\Machine learning.jpg'),
(3, 'microprocessor', 'C:\\Users\\Harpreet Singh\\Documents\\NetBeansProjects\\project\\questionpaper\\sem3\\Microprossor.pdf'),
(6, 'modulation and simulation', 'C:\\Users\\Harpreet Singh\\Documents\\NetBeansProjects\\project\\questionpaper\\sem6\\Linear algebra.pdf'),
(8, 'network science structural analysis and visualization', 'C:\\Users\\Harpreet Singh\\Documents\\NetBeansProjects\\project\\questionpaper\\sem8\\Network science.jpg'),
(2, 'object oriented programming', 'C:\\Users\\Harpreet Singh\\Documents\\NetBeansProjects\\project\\questionpaper\\sem2\\OOP.pdf'),
(4, 'operating systems', 'C:\\Users\\Harpreet Singh\\Documents\\NetBeansProjects\\project\\questionpaper\\sem4\\Os.pdf'),
(5, 'principle of programming languages', 'C:\\Users\\Harpreet Singh\\Documents\\NetBeansProjects\\project\\questionpaper\\sem5\\Principle of programming language.pdf'),
(1, 'programming fundamental', 'C:\\Users\\Harpreet Singh\\Documents\\NetBeansProjects\\project\\questionpaper\\sem1\\Programming fundamental.pdf'),
(1, 'quantum and statistical physics', 'C:\\Users\\Harpreet Singh\\Documents\\NetBeansProjects\\project\\questionpaper\\sem1\\Quantum & S. physics.pdf'),
(4, 'software engineering', 'C:\\Users\\Harpreet Singh\\Documents\\NetBeansProjects\\project\\questionpaper\\sem4\\Se.pdf'),
(7, 'software project management', 'C:\\Users\\Harpreet Singh\\Documents\\NetBeansProjects\\project\\questionpaper\\sem7\\Software project management.pdf'),
(5, 'theory of computation', 'C:\\Users\\Harpreet Singh\\Documents\\NetBeansProjects\\project\\questionpaper\\sem5\\Theory of computation.pdf'),
(4, 'web technologies', 'C:\\Users\\Harpreet Singh\\Documents\\NetBeansProjects\\project\\questionpaper\\sem4\\Web technology.pdf');

-- --------------------------------------------------------

--
-- Table structure for table `admin_result`
--

CREATE TABLE `admin_result` (
  `result_url` varchar(1000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin_result`
--

INSERT INTO `admin_result` (`result_url`) VALUES
('https://uwp.puchd.ac.in/');

-- --------------------------------------------------------

--
-- Table structure for table `admin_syllabus`
--

CREATE TABLE `admin_syllabus` (
  `s_number` int(11) NOT NULL,
  `s_url` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin_syllabus`
--

INSERT INTO `admin_syllabus` (`s_number`, `s_url`) VALUES
(1, 'C:\\Users\\Harpreet Singh\\Documents\\NetBeansProjects\\project\\Sem1.pdf'),
(2, 'C:\\Users\\Harpreet Singh\\Documents\\NetBeansProjects\\project\\Sem2.pdf'),
(3, 'C:\\Users\\Harpreet Singh\\Documents\\NetBeansProjects\\project\\Sem3.pdf'),
(4, 'C:\\Users\\Harpreet Singh\\Documents\\NetBeansProjects\\project\\Sem4.pdf'),
(5, 'C:\\Users\\Harpreet Singh\\Documents\\NetBeansProjects\\project\\Sem5.pdf'),
(6, 'C:\\Users\\Harpreet Singh\\Documents\\NetBeansProjects\\project\\Sem6.pdf'),
(7, 'C:\\Users\\Harpreet Singh\\Documents\\NetBeansProjects\\project\\Sem7.pdf'),
(8, 'C:\\Users\\Harpreet Singh\\Documents\\NetBeansProjects\\project\\Sem8.pdf');

-- --------------------------------------------------------

--
-- Table structure for table `app_users`
--

CREATE TABLE `app_users` (
  `u_id` int(11) NOT NULL,
  `u_username` varchar(30) NOT NULL,
  `u_email` varchar(40) NOT NULL,
  `u_password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `app_users`
--

INSERT INTO `app_users` (`u_id`, `u_username`, `u_email`, `u_password`) VALUES
(26, 'admin', 'admin@gmail.com', 'password'),
(28, 'Kanishk Makkar		', 'kanishk.makkar.333@gmail.com', 'Kanishk33'),
(29, 'simrat', 'simrat@gmail.com', 'simrat');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin_faculty`
--
ALTER TABLE `admin_faculty`
  ADD UNIQUE KEY `contact no` (`contact no`);

--
-- Indexes for table `admin_gallery`
--
ALTER TABLE `admin_gallery`
  ADD PRIMARY KEY (`image_id`);

--
-- Indexes for table `admin_notification`
--
ALTER TABLE `admin_notification`
  ADD PRIMARY KEY (`n_id`);

--
-- Indexes for table `admin_questionpaper`
--
ALTER TABLE `admin_questionpaper`
  ADD UNIQUE KEY `p_name` (`p_name`);

--
-- Indexes for table `admin_syllabus`
--
ALTER TABLE `admin_syllabus`
  ADD PRIMARY KEY (`s_number`),
  ADD UNIQUE KEY `s_number` (`s_number`),
  ADD UNIQUE KEY `s_number_2` (`s_number`);

--
-- Indexes for table `app_users`
--
ALTER TABLE `app_users`
  ADD PRIMARY KEY (`u_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin_notification`
--
ALTER TABLE `admin_notification`
  MODIFY `n_id` int(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `app_users`
--
ALTER TABLE `app_users`
  MODIFY `u_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=30;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
