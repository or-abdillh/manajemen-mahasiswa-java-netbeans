/*
MySQL Data Transfer
Source Host: localhost
Source Database: pos
Target Host: localhost
Target Database: pos
Date: 23/02/2021 13:03:18
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for barang
-- ----------------------------

CREATE TABLE `mhs`(
  `nim` varchar(20) NOT NULL,
  `nama` varchar(200) DEFAULT NULL,
  `alamat` text NOT NULL,
  `whatsapp` varchar(20) DEFAULT NULL,
  `email` varchar(100) NOT NULL,
  PRIMARY KEY (`nim`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records 
-- ----------------------------
INSERT INTO `mhs` VALUES ('20302022', 'Fulanah', 'Handil', '0654745454645', 'fulanah05@yahooo.com');
INSERT INTO `mhs` VALUES ('20302013', 'Fulan', 'Gampa', '0654745454645', 'fulan05@yahooo.com');