-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: thitracnghiem
-- ------------------------------------------------------
-- Server version	8.0.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `baithi`
--

DROP TABLE IF EXISTS `baithi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `baithi` (
  `mabaithi` bigint NOT NULL AUTO_INCREMENT,
  `noidung` text COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`mabaithi`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `baithi`
--

LOCK TABLES `baithi` WRITE;
/*!40000 ALTER TABLE `baithi` DISABLE KEYS */;
INSERT INTO `baithi` VALUES (1,'[{\"maCauHoi\":21,\"cauHoi\":\"Nhà vô địch là ai ?\",\"dapAn1\":\"Thanh Phú chứ ai\",\"dapAn2\":\"Thanh Phú chứ ai\",\"dapAn3\":\"Thanh Phú chứ ai\",\"dapAn4\":\"Thanh Phú chứ ai\",\"dapAnDung\":\"Thanh Phú chứ ai\",\"doKho\":1,\"loaiCauHoi\":\"TRACNGHIEM\",\"nguoiDungDTO\":{\"maNguoiDung\":1,\"tenDangNhap\":\"ttphu\",\"matKhau\":\"1234\",\"ten\":\"Thanh Phú\",\"ho\":\"trần\",\"tenDayDu\":\"Trần Thanh Phú\",\"ngaySinh\":\"Sep 7, 2000\",\"ngayTao\":\"May 16, 2020 5:25:32 PM\",\"soDienThoai\":\"0987845454\",\"gioiTinh\":\"Nam\",\"email\":\"ttphu34@gmail.com\",\"vaiTroDTO\":{\"maVaiTro\":2,\"tenVaiTro\":\"GIANGVIEN\"}},\"chuongMonHocDTO\":{\"maChuong\":7,\"tenChuong\":\"vui hề\",\"monHocDTO\":{\"maMonHoc\":1,\"tenMonHoc\":\"Toán rời rạc\",\"soTinChi\":3},\"soTiet\":3},\"dapAnNguoiDung\":\"Thanh Phú chứ ai\"},{\"maCauHoi\":18,\"cauHoi\":\"Con gà ăn gì ?\",\"dapAn1\":\"Ăn thóc\",\"dapAn2\":\"Ăn Phân\",\"dapAn3\":\"Ăn snack\",\"dapAn4\":\"Ăn cú đấm\",\"dapAnDung\":\"Ăn thóc\",\"doKho\":1,\"loaiCauHoi\":\"TRACNGHIEM\",\"nguoiDungDTO\":{\"maNguoiDung\":1,\"tenDangNhap\":\"ttphu\",\"matKhau\":\"1234\",\"ten\":\"Thanh Phú\",\"ho\":\"trần\",\"tenDayDu\":\"Trần Thanh Phú\",\"ngaySinh\":\"Sep 7, 2000\",\"ngayTao\":\"May 16, 2020 5:25:32 PM\",\"soDienThoai\":\"0987845454\",\"gioiTinh\":\"Nam\",\"email\":\"ttphu34@gmail.com\",\"vaiTroDTO\":{\"maVaiTro\":2,\"tenVaiTro\":\"GIANGVIEN\"}},\"chuongMonHocDTO\":{\"maChuong\":2,\"tenChuong\":\"Ánh xạ\",\"monHocDTO\":{\"maMonHoc\":1,\"tenMonHoc\":\"Toán rời rạc\",\"soTinChi\":3},\"soTiet\":4},\"dapAnNguoiDung\":\"Ăn cú đấm\"},{\"maCauHoi\":17,\"cauHoi\":\"Con gà\",\"dapAn1\":\"asd\",\"dapAn2\":\"999\",\"dapAn3\":\"Bia 333\",\"dapAn4\":\"Heneiken\",\"dapAnDung\":\"Heneiken\",\"doKho\":1,\"loaiCauHoi\":\"TRACNGHIEM\",\"nguoiDungDTO\":{\"maNguoiDung\":1,\"tenDangNhap\":\"ttphu\",\"matKhau\":\"1234\",\"ten\":\"Thanh Phú\",\"ho\":\"trần\",\"tenDayDu\":\"Trần Thanh Phú\",\"ngaySinh\":\"Sep 7, 2000\",\"ngayTao\":\"May 16, 2020 5:25:32 PM\",\"soDienThoai\":\"0987845454\",\"gioiTinh\":\"Nam\",\"email\":\"ttphu34@gmail.com\",\"vaiTroDTO\":{\"maVaiTro\":2,\"tenVaiTro\":\"GIANGVIEN\"}},\"chuongMonHocDTO\":{\"maChuong\":1,\"tenChuong\":\"Trr chương\",\"monHocDTO\":{\"maMonHoc\":1,\"tenMonHoc\":\"Toán rời rạc\",\"soTinChi\":3},\"soTiet\":3},\"dapAnNguoiDung\":\"Heneiken\"},{\"maCauHoi\":10,\"cauHoi\":\"7vnr\",\"dapAn1\":\"a\",\"dapAn2\":\"a\",\"dapAn3\":\"a\",\"dapAn4\":\"a\",\"dapAnDung\":\"a\",\"doKho\":1,\"loaiCauHoi\":\"TRACNGHIEM\",\"nguoiDungDTO\":{\"maNguoiDung\":1,\"tenDangNhap\":\"ttphu\",\"matKhau\":\"1234\",\"ten\":\"Thanh Phú\",\"ho\":\"trần\",\"tenDayDu\":\"Trần Thanh Phú\",\"ngaySinh\":\"Sep 7, 2000\",\"ngayTao\":\"May 16, 2020 5:25:32 PM\",\"soDienThoai\":\"0987845454\",\"gioiTinh\":\"Nam\",\"email\":\"ttphu34@gmail.com\",\"vaiTroDTO\":{\"maVaiTro\":2,\"tenVaiTro\":\"GIANGVIEN\"}},\"chuongMonHocDTO\":{\"maChuong\":2,\"tenChuong\":\"Ánh xạ\",\"monHocDTO\":{\"maMonHoc\":1,\"tenMonHoc\":\"Toán rời rạc\",\"soTinChi\":3},\"soTiet\":4},\"dapAnNguoiDung\":\"a\"},{\"maCauHoi\":24,\"nghe\":\"3\",\"cauHoi\":\"con ga an gi\",\"dapAn1\":\"123\",\"dapAn2\":\"321\",\"dapAn3\":\"222\",\"dapAn4\":\"111\",\"dapAnDung\":\"123\",\"doKho\":2,\"loaiCauHoi\":\"TRACNGHIEM\",\"nguoiDungDTO\":{\"maNguoiDung\":1,\"tenDangNhap\":\"ttphu\",\"matKhau\":\"1234\",\"ten\":\"Thanh Phú\",\"ho\":\"trần\",\"tenDayDu\":\"Trần Thanh Phú\",\"ngaySinh\":\"Sep 7, 2000\",\"ngayTao\":\"May 16, 2020 5:25:32 PM\",\"soDienThoai\":\"0987845454\",\"gioiTinh\":\"Nam\",\"email\":\"ttphu34@gmail.com\",\"vaiTroDTO\":{\"maVaiTro\":2,\"tenVaiTro\":\"GIANGVIEN\"}},\"chuongMonHocDTO\":{\"maChuong\":1,\"tenChuong\":\"Trr chương\",\"monHocDTO\":{\"maMonHoc\":1,\"tenMonHoc\":\"Toán rời rạc\",\"soTinChi\":3},\"soTiet\":3},\"dapAnNguoiDung\":\"111\"},{\"maCauHoi\":7,\"cauHoi\":\"asd123\",\"dapAn1\":\"asd\",\"dapAn2\":\"asd\",\"dapAn3\":\"asd\",\"dapAn4\":\"asd\",\"dapAnDung\":\"asd\",\"doKho\":1,\"loaiCauHoi\":\"TRACNGHIEM\",\"nguoiDungDTO\":{\"maNguoiDung\":1,\"tenDangNhap\":\"ttphu\",\"matKhau\":\"1234\",\"ten\":\"Thanh Phú\",\"ho\":\"trần\",\"tenDayDu\":\"Trần Thanh Phú\",\"ngaySinh\":\"Sep 7, 2000\",\"ngayTao\":\"May 16, 2020 5:25:32 PM\",\"soDienThoai\":\"0987845454\",\"gioiTinh\":\"Nam\",\"email\":\"ttphu34@gmail.com\",\"vaiTroDTO\":{\"maVaiTro\":2,\"tenVaiTro\":\"GIANGVIEN\"}},\"chuongMonHocDTO\":{\"maChuong\":1,\"tenChuong\":\"Trr chương\",\"monHocDTO\":{\"maMonHoc\":1,\"tenMonHoc\":\"Toán rời rạc\",\"soTinChi\":3},\"soTiet\":3},\"dapAnNguoiDung\":\"asd\"},{\"maCauHoi\":23,\"nghe\":\"3\",\"cauHoi\":\"con ga an gi\",\"dapAn1\":\"123\",\"dapAn2\":\"321\",\"dapAn3\":\"222\",\"dapAn4\":\"111\",\"dapAnDung\":\"123\",\"doKho\":3,\"loaiCauHoi\":\"TRACNGHIEM\",\"nguoiDungDTO\":{\"maNguoiDung\":1,\"tenDangNhap\":\"ttphu\",\"matKhau\":\"1234\",\"ten\":\"Thanh Phú\",\"ho\":\"trần\",\"tenDayDu\":\"Trần Thanh Phú\",\"ngaySinh\":\"Sep 7, 2000\",\"ngayTao\":\"May 16, 2020 5:25:32 PM\",\"soDienThoai\":\"0987845454\",\"gioiTinh\":\"Nam\",\"email\":\"ttphu34@gmail.com\",\"vaiTroDTO\":{\"maVaiTro\":2,\"tenVaiTro\":\"GIANGVIEN\"}},\"chuongMonHocDTO\":{\"maChuong\":1,\"tenChuong\":\"Trr chương\",\"monHocDTO\":{\"maMonHoc\":1,\"tenMonHoc\":\"Toán rời rạc\",\"soTinChi\":3},\"soTiet\":3},\"dapAnNguoiDung\":\"111\"}]');
/*!40000 ALTER TABLE `baithi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cauhoi`
--

DROP TABLE IF EXISTS `cauhoi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cauhoi` (
  `macauhoi` bigint NOT NULL AUTO_INCREMENT,
  `hinhanh` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nghe` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `cauhoi` text COLLATE utf8mb4_unicode_ci NOT NULL,
  `doanvan` text COLLATE utf8mb4_unicode_ci,
  `dapan1` varchar(300) COLLATE utf8mb4_unicode_ci NOT NULL,
  `dapan2` varchar(300) COLLATE utf8mb4_unicode_ci NOT NULL,
  `dapan3` varchar(300) COLLATE utf8mb4_unicode_ci NOT NULL,
  `dapan4` varchar(300) COLLATE utf8mb4_unicode_ci NOT NULL,
  `dapandung` varchar(300) COLLATE utf8mb4_unicode_ci NOT NULL,
  `dokho` int NOT NULL,
  `loaicauhoi` varchar(45) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `tacgia` bigint DEFAULT NULL,
  `machuong` bigint DEFAULT NULL,
  PRIMARY KEY (`macauhoi`),
  KEY `fk_cauhoi_chuongmonhoc` (`machuong`),
  KEY `fk_cauhoi_tacgia` (`tacgia`),
  CONSTRAINT `fk_cauhoi_chuongmonhoc` FOREIGN KEY (`machuong`) REFERENCES `chuongmonhoc` (`machuong`),
  CONSTRAINT `fk_cauhoi_tacgia` FOREIGN KEY (`tacgia`) REFERENCES `nguoidung` (`manguoidung`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cauhoi`
--

LOCK TABLES `cauhoi` WRITE;
/*!40000 ALTER TABLE `cauhoi` DISABLE KEYS */;
INSERT INTO `cauhoi` VALUES (7,NULL,NULL,'asd123',NULL,'asd','asd','asd','asd','asd',1,'TRACNGHIEM',1,1),(10,NULL,NULL,'7vnr',NULL,'a','a','a','a','a',1,'TRACNGHIEM',1,2),(11,NULL,NULL,'7vnr',NULL,'a','a','a','a','a',1,'NGHE',1,3),(12,NULL,NULL,'asd',NULL,'a','asd','asd','asd','asd',3,'NGHE',1,4),(13,NULL,NULL,'asdtst',NULL,'test','1','1','1','1',2,'TRACNGHIEM',1,4),(14,NULL,NULL,'testzui',NULL,'1asd','asd','asd','123','asd',2,'TRACNGHIEM',1,4),(17,NULL,NULL,'Con gà',NULL,'asd','999','Bia 333','Heneiken','Heneiken',1,'TRACNGHIEM',1,1),(18,NULL,NULL,'Con gà ăn gì ?',NULL,'Ăn thóc','Ăn Phân','Ăn snack','Ăn cú đấm','Ăn thóc',1,'TRACNGHIEM',1,2),(21,NULL,NULL,'Nhà vô địch là ai ?',NULL,'Thanh Phú chứ ai','Thanh Phú chứ ai','Thanh Phú chứ ai','Thanh Phú chứ ai','Thanh Phú chứ ai',1,'TRACNGHIEM',1,7),(23,NULL,'3','con ga an gi',NULL,'123','321','222','111','123',3,'TRACNGHIEM',1,1),(24,NULL,'3','con ga an gi',NULL,'123','321','222','111','123',2,'TRACNGHIEM',1,1),(25,NULL,NULL,'con ga an gi',NULL,'123','321','222','111','123',2,'TRACNGHIEM',1,2),(26,NULL,NULL,'con ga an gi',NULL,'123','321','222','111','123',3,'TRACNGHIEM',1,2),(27,NULL,NULL,'con vit an gi',NULL,'123','321','222','111','123',2,'TRACNGHIEM',1,7),(28,NULL,'Java-Framework.jpg','con ga` an gi ?',NULL,'An thoc\'','An com','An banh\'','An trai cay','An thoc\'',1,NULL,1,1);
/*!40000 ALTER TABLE `cauhoi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chitietdethi`
--

DROP TABLE IF EXISTS `chitietdethi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `chitietdethi` (
  `ID` bigint NOT NULL AUTO_INCREMENT,
  `macauhoi` bigint NOT NULL,
  `madethi` bigint NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `fk_ctdt_dethi` (`madethi`),
  KEY `fk_ctdt_cauhoi` (`macauhoi`),
  CONSTRAINT `fk_ctdt_cauhoi` FOREIGN KEY (`macauhoi`) REFERENCES `cauhoi` (`macauhoi`),
  CONSTRAINT `fk_ctdt_dethi` FOREIGN KEY (`madethi`) REFERENCES `dethi` (`madethi`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chitietdethi`
--

LOCK TABLES `chitietdethi` WRITE;
/*!40000 ALTER TABLE `chitietdethi` DISABLE KEYS */;
INSERT INTO `chitietdethi` VALUES (15,21,34),(16,24,34),(17,7,34),(18,18,34),(19,10,34),(20,17,34),(21,23,34),(22,10,35),(23,18,35),(24,21,35),(25,17,35),(26,26,35),(27,7,35),(28,25,35),(29,28,36),(30,7,36),(31,10,36),(32,21,36),(33,26,36),(34,18,36),(35,25,36);
/*!40000 ALTER TABLE `chitietdethi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chuongmonhoc`
--

DROP TABLE IF EXISTS `chuongmonhoc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `chuongmonhoc` (
  `machuong` bigint NOT NULL,
  `tenchuong` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `sotiet` int DEFAULT NULL,
  `mamonhoc` bigint DEFAULT NULL,
  PRIMARY KEY (`machuong`),
  KEY `fk_chuongmonhoc_monhoc` (`mamonhoc`),
  CONSTRAINT `fk_chuongmonhoc_monhoc` FOREIGN KEY (`mamonhoc`) REFERENCES `monhoc` (`mamonhoc`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chuongmonhoc`
--

LOCK TABLES `chuongmonhoc` WRITE;
/*!40000 ALTER TABLE `chuongmonhoc` DISABLE KEYS */;
INSERT INTO `chuongmonhoc` VALUES (1,'Trr chương',3,1),(2,'Ánh xạ',4,1),(3,'test zui',4,2),(4,'Test',4,3),(5,'test1',4,2),(6,'Phản xạ',4,4),(7,'vui hề',3,1);
/*!40000 ALTER TABLE `chuongmonhoc` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dethi`
--

DROP TABLE IF EXISTS `dethi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dethi` (
  `madethi` bigint NOT NULL AUTO_INCREMENT,
  `tendethi` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `thoigian` int DEFAULT NULL,
  `diemtoida` int DEFAULT NULL,
  `slcauhoi` int DEFAULT NULL,
  `slcauhoide` int DEFAULT NULL,
  `slcauhoitb` int DEFAULT NULL,
  `slcauhoikho` int DEFAULT NULL,
  `tacgia` bigint DEFAULT NULL,
  `mamonhoc` bigint DEFAULT NULL,
  `makythi` bigint DEFAULT NULL,
  PRIMARY KEY (`madethi`),
  KEY `fk_dethi_kythi` (`makythi`),
  KEY `fk_dethi_tacgia` (`tacgia`),
  KEY `fk_dethi_chuongmonhoc_idx` (`mamonhoc`),
  CONSTRAINT `fk_dethi_kythi` FOREIGN KEY (`makythi`) REFERENCES `kythi` (`makythi`),
  CONSTRAINT `fk_dethi_monhoc` FOREIGN KEY (`mamonhoc`) REFERENCES `monhoc` (`mamonhoc`),
  CONSTRAINT `fk_dethi_tacgia` FOREIGN KEY (`tacgia`) REFERENCES `nguoidung` (`manguoidung`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dethi`
--

LOCK TABLES `dethi` WRITE;
/*!40000 ALTER TABLE `dethi` DISABLE KEYS */;
INSERT INTO `dethi` VALUES (34,'TST',10,10,7,5,1,1,1,1,1),(35,'Test 2',10,10,7,5,1,1,1,1,1),(36,'Thi thu',10,10,7,5,1,1,1,1,1);
/*!40000 ALTER TABLE `dethi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ketqua`
--

DROP TABLE IF EXISTS `ketqua`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ketqua` (
  `maketqua` bigint NOT NULL AUTO_INCREMENT,
  `diembaithi` double NOT NULL,
  `madethi` bigint NOT NULL,
  `manguoidung` bigint NOT NULL,
  `ngaytao` timestamp NULL DEFAULT NULL,
  `mabaithi` bigint DEFAULT NULL,
  PRIMARY KEY (`maketqua`),
  KEY `fk_ketqua_nguoidung` (`manguoidung`),
  KEY `fk_ketqua_dethi` (`madethi`),
  KEY `fk_ketqua_baithi` (`mabaithi`),
  CONSTRAINT `fk_ketqua_baithi` FOREIGN KEY (`mabaithi`) REFERENCES `baithi` (`mabaithi`),
  CONSTRAINT `fk_ketqua_dethi` FOREIGN KEY (`madethi`) REFERENCES `dethi` (`madethi`),
  CONSTRAINT `fk_ketqua_nguoidung` FOREIGN KEY (`manguoidung`) REFERENCES `nguoidung` (`manguoidung`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ketqua`
--

LOCK TABLES `ketqua` WRITE;
/*!40000 ALTER TABLE `ketqua` DISABLE KEYS */;
INSERT INTO `ketqua` VALUES (1,5.7,34,1,'2020-06-18 13:57:43',1),(2,5.8,34,1,'2020-06-21 08:16:40',1);
/*!40000 ALTER TABLE `ketqua` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kythi`
--

DROP TABLE IF EXISTS `kythi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `kythi` (
  `makythi` bigint NOT NULL AUTO_INCREMENT,
  `tenkythi` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `ngaythi` date DEFAULT NULL,
  `ngayketthuc` date DEFAULT NULL,
  `diadiem` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`makythi`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kythi`
--

LOCK TABLES `kythi` WRITE;
/*!40000 ALTER TABLE `kythi` DISABLE KEYS */;
INSERT INTO `kythi` VALUES (1,'Thi thử','2020-06-20','2020-06-21','DHSG'),(3,'Thi thử lần 2','2020-06-20','2020-06-21','DHSG');
/*!40000 ALTER TABLE `kythi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `monhoc`
--

DROP TABLE IF EXISTS `monhoc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `monhoc` (
  `mamonhoc` bigint NOT NULL,
  `tenmonhoc` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `sotinchi` int DEFAULT NULL,
  PRIMARY KEY (`mamonhoc`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `monhoc`
--

LOCK TABLES `monhoc` WRITE;
/*!40000 ALTER TABLE `monhoc` DISABLE KEYS */;
INSERT INTO `monhoc` VALUES (1,'Toán rời rạc',3),(2,'Toán vui vẻ',4),(3,'Toán hài hước',3),(4,'Toán hề',4);
/*!40000 ALTER TABLE `monhoc` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nguoidung`
--

DROP TABLE IF EXISTS `nguoidung`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nguoidung` (
  `manguoidung` bigint NOT NULL AUTO_INCREMENT,
  `tendangnhap` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `matkhau` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `ten` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `ho` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `tendaydu` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `ngaysinh` date DEFAULT NULL,
  `ngaytao` timestamp NULL DEFAULT NULL,
  `email` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `gioitinh` varchar(45) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `sodienthoai` varchar(45) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `mavaitro` bigint DEFAULT NULL,
  PRIMARY KEY (`manguoidung`),
  UNIQUE KEY `tendangnhap_UNIQUE` (`tendangnhap`),
  UNIQUE KEY `email_UNIQUE` (`email`),
  KEY `fk_nguoidung_vaitro` (`mavaitro`),
  CONSTRAINT `fk_nguoidung_vaitro` FOREIGN KEY (`mavaitro`) REFERENCES `vaitro` (`mavaitro`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nguoidung`
--

LOCK TABLES `nguoidung` WRITE;
/*!40000 ALTER TABLE `nguoidung` DISABLE KEYS */;
INSERT INTO `nguoidung` VALUES (1,'ttphu','1234','Thanh Phú','trần','Trần Thanh Phú','2000-09-07','2020-05-16 10:25:32','ttphu34@gmail.com','Nam','0987845454',2),(2,'khongminh','1234','Cat Luong','Gia','GiaCat Luong','2000-05-13','2020-05-24 05:57:50','test@gmail.com','Nam','0987845454',1),(3,'giacat','1234','Cat','Gia','GiaCat','2020-05-14','2020-05-24 06:06:51','1@','Nam','0987845454',1),(4,'asd123','1234','asd','Giacat','Giacatasd','2020-05-14','2020-05-24 06:08:30','2@','Nam','0987845454',1),(6,'asd1234','1234','asd','chiton','chitonasd','2020-05-27','2020-05-24 06:11:35','3@','Nam','0987845454',1),(7,'asd11','1234','asd1123','asd','1test','2020-12-27','2020-05-24 06:11:35','4@','Nam','0987845454',1);
/*!40000 ALTER TABLE `nguoidung` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `phongthi`
--

DROP TABLE IF EXISTS `phongthi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `phongthi` (
  `ID` bigint NOT NULL AUTO_INCREMENT,
  `maphong` bigint NOT NULL,
  `manguoidung` bigint NOT NULL,
  `madethi` bigint NOT NULL,
  `trangthai` int DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `fk_phongthi_dethi` (`madethi`),
  KEY `fk_phongthi_nguoidung` (`manguoidung`),
  CONSTRAINT `fk_phongthi_dethi` FOREIGN KEY (`madethi`) REFERENCES `dethi` (`madethi`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `phongthi`
--

LOCK TABLES `phongthi` WRITE;
/*!40000 ALTER TABLE `phongthi` DISABLE KEYS */;
INSERT INTO `phongthi` VALUES (1,1,1,34,1),(2,1,2,34,1),(4,3,1,34,1),(5,4,1,35,1),(6,4,2,35,1),(7,4,3,35,1);
/*!40000 ALTER TABLE `phongthi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vaitro`
--

DROP TABLE IF EXISTS `vaitro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vaitro` (
  `mavaitro` bigint NOT NULL,
  `tenvaitro` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`mavaitro`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vaitro`
--

LOCK TABLES `vaitro` WRITE;
/*!40000 ALTER TABLE `vaitro` DISABLE KEYS */;
INSERT INTO `vaitro` VALUES (1,'SINHVIEN'),(2,'GIANGVIEN'),(3,'ADMIN');
/*!40000 ALTER TABLE `vaitro` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-06-22 21:47:16
