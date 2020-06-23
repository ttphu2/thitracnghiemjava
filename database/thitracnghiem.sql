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
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `baithi`
--

LOCK TABLES `baithi` WRITE;
/*!40000 ALTER TABLE `baithi` DISABLE KEYS */;
INSERT INTO `baithi` VALUES (1,'[{\"maCauHoi\":21,\"cauHoi\":\"Nhà vô địch là ai ?\",\"dapAn1\":\"Thanh Phú chứ ai\",\"dapAn2\":\"Thanh Phú chứ ai\",\"dapAn3\":\"Thanh Phú chứ ai\",\"dapAn4\":\"Thanh Phú chứ ai\",\"dapAnDung\":\"Thanh Phú chứ ai\",\"doKho\":1,\"loaiCauHoi\":\"TRACNGHIEM\",\"nguoiDungDTO\":{\"maNguoiDung\":1,\"tenDangNhap\":\"ttphu\",\"matKhau\":\"1234\",\"ten\":\"Thanh Phú\",\"ho\":\"trần\",\"tenDayDu\":\"Trần Thanh Phú\",\"ngaySinh\":\"Sep 7, 2000\",\"ngayTao\":\"May 16, 2020 5:25:32 PM\",\"soDienThoai\":\"0987845454\",\"gioiTinh\":\"Nam\",\"email\":\"ttphu34@gmail.com\",\"vaiTroDTO\":{\"maVaiTro\":2,\"tenVaiTro\":\"GIANGVIEN\"}},\"chuongMonHocDTO\":{\"maChuong\":7,\"tenChuong\":\"vui hề\",\"monHocDTO\":{\"maMonHoc\":1,\"tenMonHoc\":\"Toán rời rạc\",\"soTinChi\":3},\"soTiet\":3},\"dapAnNguoiDung\":\"Thanh Phú chứ ai\"},{\"maCauHoi\":18,\"cauHoi\":\"Con gà ăn gì ?\",\"dapAn1\":\"Ăn thóc\",\"dapAn2\":\"Ăn Phân\",\"dapAn3\":\"Ăn snack\",\"dapAn4\":\"Ăn cú đấm\",\"dapAnDung\":\"Ăn thóc\",\"doKho\":1,\"loaiCauHoi\":\"TRACNGHIEM\",\"nguoiDungDTO\":{\"maNguoiDung\":1,\"tenDangNhap\":\"ttphu\",\"matKhau\":\"1234\",\"ten\":\"Thanh Phú\",\"ho\":\"trần\",\"tenDayDu\":\"Trần Thanh Phú\",\"ngaySinh\":\"Sep 7, 2000\",\"ngayTao\":\"May 16, 2020 5:25:32 PM\",\"soDienThoai\":\"0987845454\",\"gioiTinh\":\"Nam\",\"email\":\"ttphu34@gmail.com\",\"vaiTroDTO\":{\"maVaiTro\":2,\"tenVaiTro\":\"GIANGVIEN\"}},\"chuongMonHocDTO\":{\"maChuong\":2,\"tenChuong\":\"Ánh xạ\",\"monHocDTO\":{\"maMonHoc\":1,\"tenMonHoc\":\"Toán rời rạc\",\"soTinChi\":3},\"soTiet\":4},\"dapAnNguoiDung\":\"Ăn cú đấm\"},{\"maCauHoi\":17,\"cauHoi\":\"Con gà\",\"dapAn1\":\"asd\",\"dapAn2\":\"999\",\"dapAn3\":\"Bia 333\",\"dapAn4\":\"Heneiken\",\"dapAnDung\":\"Heneiken\",\"doKho\":1,\"loaiCauHoi\":\"TRACNGHIEM\",\"nguoiDungDTO\":{\"maNguoiDung\":1,\"tenDangNhap\":\"ttphu\",\"matKhau\":\"1234\",\"ten\":\"Thanh Phú\",\"ho\":\"trần\",\"tenDayDu\":\"Trần Thanh Phú\",\"ngaySinh\":\"Sep 7, 2000\",\"ngayTao\":\"May 16, 2020 5:25:32 PM\",\"soDienThoai\":\"0987845454\",\"gioiTinh\":\"Nam\",\"email\":\"ttphu34@gmail.com\",\"vaiTroDTO\":{\"maVaiTro\":2,\"tenVaiTro\":\"GIANGVIEN\"}},\"chuongMonHocDTO\":{\"maChuong\":1,\"tenChuong\":\"Trr chương\",\"monHocDTO\":{\"maMonHoc\":1,\"tenMonHoc\":\"Toán rời rạc\",\"soTinChi\":3},\"soTiet\":3},\"dapAnNguoiDung\":\"Heneiken\"},{\"maCauHoi\":10,\"cauHoi\":\"7vnr\",\"dapAn1\":\"a\",\"dapAn2\":\"a\",\"dapAn3\":\"a\",\"dapAn4\":\"a\",\"dapAnDung\":\"a\",\"doKho\":1,\"loaiCauHoi\":\"TRACNGHIEM\",\"nguoiDungDTO\":{\"maNguoiDung\":1,\"tenDangNhap\":\"ttphu\",\"matKhau\":\"1234\",\"ten\":\"Thanh Phú\",\"ho\":\"trần\",\"tenDayDu\":\"Trần Thanh Phú\",\"ngaySinh\":\"Sep 7, 2000\",\"ngayTao\":\"May 16, 2020 5:25:32 PM\",\"soDienThoai\":\"0987845454\",\"gioiTinh\":\"Nam\",\"email\":\"ttphu34@gmail.com\",\"vaiTroDTO\":{\"maVaiTro\":2,\"tenVaiTro\":\"GIANGVIEN\"}},\"chuongMonHocDTO\":{\"maChuong\":2,\"tenChuong\":\"Ánh xạ\",\"monHocDTO\":{\"maMonHoc\":1,\"tenMonHoc\":\"Toán rời rạc\",\"soTinChi\":3},\"soTiet\":4},\"dapAnNguoiDung\":\"a\"},{\"maCauHoi\":24,\"nghe\":\"3\",\"cauHoi\":\"con ga an gi\",\"dapAn1\":\"123\",\"dapAn2\":\"321\",\"dapAn3\":\"222\",\"dapAn4\":\"111\",\"dapAnDung\":\"123\",\"doKho\":2,\"loaiCauHoi\":\"TRACNGHIEM\",\"nguoiDungDTO\":{\"maNguoiDung\":1,\"tenDangNhap\":\"ttphu\",\"matKhau\":\"1234\",\"ten\":\"Thanh Phú\",\"ho\":\"trần\",\"tenDayDu\":\"Trần Thanh Phú\",\"ngaySinh\":\"Sep 7, 2000\",\"ngayTao\":\"May 16, 2020 5:25:32 PM\",\"soDienThoai\":\"0987845454\",\"gioiTinh\":\"Nam\",\"email\":\"ttphu34@gmail.com\",\"vaiTroDTO\":{\"maVaiTro\":2,\"tenVaiTro\":\"GIANGVIEN\"}},\"chuongMonHocDTO\":{\"maChuong\":1,\"tenChuong\":\"Trr chương\",\"monHocDTO\":{\"maMonHoc\":1,\"tenMonHoc\":\"Toán rời rạc\",\"soTinChi\":3},\"soTiet\":3},\"dapAnNguoiDung\":\"111\"},{\"maCauHoi\":7,\"cauHoi\":\"asd123\",\"dapAn1\":\"asd\",\"dapAn2\":\"asd\",\"dapAn3\":\"asd\",\"dapAn4\":\"asd\",\"dapAnDung\":\"asd\",\"doKho\":1,\"loaiCauHoi\":\"TRACNGHIEM\",\"nguoiDungDTO\":{\"maNguoiDung\":1,\"tenDangNhap\":\"ttphu\",\"matKhau\":\"1234\",\"ten\":\"Thanh Phú\",\"ho\":\"trần\",\"tenDayDu\":\"Trần Thanh Phú\",\"ngaySinh\":\"Sep 7, 2000\",\"ngayTao\":\"May 16, 2020 5:25:32 PM\",\"soDienThoai\":\"0987845454\",\"gioiTinh\":\"Nam\",\"email\":\"ttphu34@gmail.com\",\"vaiTroDTO\":{\"maVaiTro\":2,\"tenVaiTro\":\"GIANGVIEN\"}},\"chuongMonHocDTO\":{\"maChuong\":1,\"tenChuong\":\"Trr chương\",\"monHocDTO\":{\"maMonHoc\":1,\"tenMonHoc\":\"Toán rời rạc\",\"soTinChi\":3},\"soTiet\":3},\"dapAnNguoiDung\":\"asd\"},{\"maCauHoi\":23,\"nghe\":\"3\",\"cauHoi\":\"con ga an gi\",\"dapAn1\":\"123\",\"dapAn2\":\"321\",\"dapAn3\":\"222\",\"dapAn4\":\"111\",\"dapAnDung\":\"123\",\"doKho\":3,\"loaiCauHoi\":\"TRACNGHIEM\",\"nguoiDungDTO\":{\"maNguoiDung\":1,\"tenDangNhap\":\"ttphu\",\"matKhau\":\"1234\",\"ten\":\"Thanh Phú\",\"ho\":\"trần\",\"tenDayDu\":\"Trần Thanh Phú\",\"ngaySinh\":\"Sep 7, 2000\",\"ngayTao\":\"May 16, 2020 5:25:32 PM\",\"soDienThoai\":\"0987845454\",\"gioiTinh\":\"Nam\",\"email\":\"ttphu34@gmail.com\",\"vaiTroDTO\":{\"maVaiTro\":2,\"tenVaiTro\":\"GIANGVIEN\"}},\"chuongMonHocDTO\":{\"maChuong\":1,\"tenChuong\":\"Trr chương\",\"monHocDTO\":{\"maMonHoc\":1,\"tenMonHoc\":\"Toán rời rạc\",\"soTinChi\":3},\"soTiet\":3},\"dapAnNguoiDung\":\"111\"}]'),(2,'[{\"maCauHoi\":44,\"cauHoi\":\"Cuộc đấu tranh trong truyện cổ tích là cuộc đấu tranh như thế nào?\",\"dapAn1\":\"Cuộc đấu tranh giữa người nghèo, người giàu\",\"dapAn2\":\" Cuộc đấu tranh giữa địa chủ và nông dân\",\"dapAn3\":\"Cuộc đấu tranh giữa chính nghĩa và phi nghĩa\",\"dapAn4\":\"Cuộc đấu tranh giữa thiện và ác\",\"dapAnDung\":\"Cuộc đấu tranh giữa thiện và ác\",\"doKho\":1,\"nguoiDungDTO\":{\"maNguoiDung\":1,\"tenDangNhap\":\"ttphu\",\"matKhau\":\"1234\",\"ten\":\"Thanh Phú\",\"ho\":\"trần\",\"tenDayDu\":\"Trần Thanh Phú\",\"ngaySinh\":\"Sep 7, 2000\",\"ngayTao\":\"May 16, 2020 5:25:32 PM\",\"soDienThoai\":\"0987845454\",\"gioiTinh\":\"Nam\",\"email\":\"ttphu34@gmail.com\",\"vaiTroDTO\":{\"maVaiTro\":2,\"tenVaiTro\":\"GIANGVIEN\"}},\"chuongMonHocDTO\":{\"maChuong\":10,\"tenChuong\":\"Cổ tích\",\"monHocDTO\":{\"maMonHoc\":5,\"tenMonHoc\":\"Ngữ Văn\",\"soTinChi\":4},\"soTiet\":4},\"dapAnNguoiDung\":\"Cuộc đấu tranh giữa chính nghĩa và phi nghĩa\"},{\"maCauHoi\":52,\"cauHoi\":\"Nghệ thuật nổi bật nhất của truyện Sọ Dừa là gì?\",\"dapAn1\":\"Tương phản\",\"dapAn2\":\"Liệt kê\",\"dapAn3\":\" Nhân cách hóa\",\"dapAn4\":\"Phóng đại\",\"dapAnDung\":\" Nhân cách hóa\",\"doKho\":2,\"nguoiDungDTO\":{\"maNguoiDung\":1,\"tenDangNhap\":\"ttphu\",\"matKhau\":\"1234\",\"ten\":\"Thanh Phú\",\"ho\":\"trần\",\"tenDayDu\":\"Trần Thanh Phú\",\"ngaySinh\":\"Sep 7, 2000\",\"ngayTao\":\"May 16, 2020 5:25:32 PM\",\"soDienThoai\":\"0987845454\",\"gioiTinh\":\"Nam\",\"email\":\"ttphu34@gmail.com\",\"vaiTroDTO\":{\"maVaiTro\":2,\"tenVaiTro\":\"GIANGVIEN\"}},\"chuongMonHocDTO\":{\"maChuong\":10,\"tenChuong\":\"Cổ tích\",\"monHocDTO\":{\"maMonHoc\":5,\"tenMonHoc\":\"Ngữ Văn\",\"soTinChi\":4},\"soTiet\":4},\"dapAnNguoiDung\":\"Phóng đại\"},{\"maCauHoi\":59,\"cauHoi\":\"Nhân vật trữ tình trong bài thơ Ông đồ là ai?\",\"dapAn1\":\"Ông đồ\",\"dapAn2\":\"Tác giả\",\"dapAn3\":\"Người qua đường \",\"dapAn4\":\"Người thuê viết.\",\"dapAnDung\":\"Người qua đường \",\"doKho\":1,\"nguoiDungDTO\":{\"maNguoiDung\":1,\"tenDangNhap\":\"ttphu\",\"matKhau\":\"1234\",\"ten\":\"Thanh Phú\",\"ho\":\"trần\",\"tenDayDu\":\"Trần Thanh Phú\",\"ngaySinh\":\"Sep 7, 2000\",\"ngayTao\":\"May 16, 2020 5:25:32 PM\",\"soDienThoai\":\"0987845454\",\"gioiTinh\":\"Nam\",\"email\":\"ttphu34@gmail.com\",\"vaiTroDTO\":{\"maVaiTro\":2,\"tenVaiTro\":\"GIANGVIEN\"}},\"chuongMonHocDTO\":{\"maChuong\":8,\"tenChuong\":\"Văn học hiện đại\",\"monHocDTO\":{\"maMonHoc\":5,\"tenMonHoc\":\"Ngữ Văn\",\"soTinChi\":4},\"soTiet\":4},\"dapAnNguoiDung\":\"Người thuê viết.\"},{\"maCauHoi\":66,\"cauHoi\":\"Nguyễn Du được cử đi sứ ở Trung Quốc lần 1 vào khoảng thời gian nào?\",\"dapAn1\":\"1786- 1796\",\"dapAn2\":\"1813- 1814\",\"dapAn3\":\"1820- 1821\",\"dapAn4\":\"1823- 1824\",\"dapAnDung\":\"1813- 1814\",\"doKho\":3,\"nguoiDungDTO\":{\"maNguoiDung\":1,\"tenDangNhap\":\"ttphu\",\"matKhau\":\"1234\",\"ten\":\"Thanh Phú\",\"ho\":\"trần\",\"tenDayDu\":\"Trần Thanh Phú\",\"ngaySinh\":\"Sep 7, 2000\",\"ngayTao\":\"May 16, 2020 5:25:32 PM\",\"soDienThoai\":\"0987845454\",\"gioiTinh\":\"Nam\",\"email\":\"ttphu34@gmail.com\",\"vaiTroDTO\":{\"maVaiTro\":2,\"tenVaiTro\":\"GIANGVIEN\"}},\"chuongMonHocDTO\":{\"maChuong\":9,\"tenChuong\":\"Văn học cổ điển\",\"monHocDTO\":{\"maMonHoc\":5,\"tenMonHoc\":\"Ngữ Văn\",\"soTinChi\":4},\"soTiet\":4},\"dapAnNguoiDung\":\"1820- 1821\"},{\"maCauHoi\":69,\"cauHoi\":\"Truyện Kiều gồm mấy phần?\",\"dapAn1\":\"3\",\"dapAn2\":\"4\",\"dapAn3\":\"5\",\"dapAn4\":\"6\",\"dapAnDung\":\"3\",\"doKho\":1,\"nguoiDungDTO\":{\"maNguoiDung\":1,\"tenDangNhap\":\"ttphu\",\"matKhau\":\"1234\",\"ten\":\"Thanh Phú\",\"ho\":\"trần\",\"tenDayDu\":\"Trần Thanh Phú\",\"ngaySinh\":\"Sep 7, 2000\",\"ngayTao\":\"May 16, 2020 5:25:32 PM\",\"soDienThoai\":\"0987845454\",\"gioiTinh\":\"Nam\",\"email\":\"ttphu34@gmail.com\",\"vaiTroDTO\":{\"maVaiTro\":2,\"tenVaiTro\":\"GIANGVIEN\"}},\"chuongMonHocDTO\":{\"maChuong\":9,\"tenChuong\":\"Văn học cổ điển\",\"monHocDTO\":{\"maMonHoc\":5,\"tenMonHoc\":\"Ngữ Văn\",\"soTinChi\":4},\"soTiet\":4},\"dapAnNguoiDung\":\"6\"},{\"maCauHoi\":58,\"cauHoi\":\"Điểm khác biệt nổi bật nhất giữa văn học trung đại với văn nghị luận hiện đại là gì?\",\"dapAn1\":\"Nghị luận trung đại phải theo một bố cục đã thành khuôn mẫu.\",\"dapAn2\":\"Nghị luận trung đại thường được viết bằng văn biền ngẫu.\",\"dapAn3\":\"Nghị luận trung đại có lập luận chặt chẽ, sắc sảo.\",\"dapAn4\":\"Gồ ý A và B.\",\"dapAnDung\":\"Gồ ý A và B.\",\"doKho\":2,\"nguoiDungDTO\":{\"maNguoiDung\":1,\"tenDangNhap\":\"ttphu\",\"matKhau\":\"1234\",\"ten\":\"Thanh Phú\",\"ho\":\"trần\",\"tenDayDu\":\"Trần Thanh Phú\",\"ngaySinh\":\"Sep 7, 2000\",\"ngayTao\":\"May 16, 2020 5:25:32 PM\",\"soDienThoai\":\"0987845454\",\"gioiTinh\":\"Nam\",\"email\":\"ttphu34@gmail.com\",\"vaiTroDTO\":{\"maVaiTro\":2,\"tenVaiTro\":\"GIANGVIEN\"}},\"chuongMonHocDTO\":{\"maChuong\":8,\"tenChuong\":\"Văn học hiện đại\",\"monHocDTO\":{\"maMonHoc\":5,\"tenMonHoc\":\"Ngữ Văn\",\"soTinChi\":4},\"soTiet\":4},\"dapAnNguoiDung\":\"Gồ ý A và B.\"},{\"maCauHoi\":48,\"cauHoi\":\"Tại sao tác giả dân gian không miêu tả chi tiết nhân vật Sọ Dừa\",\"dapAn1\":\"Vì truyện có quá nhiều tình tiết khác hấp dẫn\",\"dapAn2\":\"Dung lượng của truyện cổ tích không cho phép miêu tả kĩ về nhân vật\",\"dapAn3\":\"Nhân vật có tên riêng nhưng đại diện cho một loại ngườ\",\"dapAn4\":\"Nhân vật có bề ngoài không mấy đặc biệt\",\"dapAnDung\":\"Nhân vật có tên riêng nhưng đại diện cho một loại ngườ\",\"doKho\":1,\"nguoiDungDTO\":{\"maNguoiDung\":1,\"tenDangNhap\":\"ttphu\",\"matKhau\":\"1234\",\"ten\":\"Thanh Phú\",\"ho\":\"trần\",\"tenDayDu\":\"Trần Thanh Phú\",\"ngaySinh\":\"Sep 7, 2000\",\"ngayTao\":\"May 16, 2020 5:25:32 PM\",\"soDienThoai\":\"0987845454\",\"gioiTinh\":\"Nam\",\"email\":\"ttphu34@gmail.com\",\"vaiTroDTO\":{\"maVaiTro\":2,\"tenVaiTro\":\"GIANGVIEN\"}},\"chuongMonHocDTO\":{\"maChuong\":10,\"tenChuong\":\"Cổ tích\",\"monHocDTO\":{\"maMonHoc\":5,\"tenMonHoc\":\"Ngữ Văn\",\"soTinChi\":4},\"soTiet\":4},\"dapAnNguoiDung\":\"Nhân vật có bề ngoài không mấy đặc biệt\"},{\"maCauHoi\":40,\"cauHoi\":\" Văn bản \\\"Tinh thần yêu nước của nhân dân ta\\\" (Hồ Chí Minh) thuộc loại văn bản nào?\",\"dapAn1\":\"Tự sự \",\"dapAn2\":\"Nghị luận \",\"dapAn3\":\"Thuyết Minh \",\"dapAn4\":\"Biểu cảm \",\"dapAnDung\":\"Nghị luận \",\"doKho\":3,\"nguoiDungDTO\":{\"maNguoiDung\":1,\"tenDangNhap\":\"ttphu\",\"matKhau\":\"1234\",\"ten\":\"Thanh Phú\",\"ho\":\"trần\",\"tenDayDu\":\"Trần Thanh Phú\",\"ngaySinh\":\"Sep 7, 2000\",\"ngayTao\":\"May 16, 2020 5:25:32 PM\",\"soDienThoai\":\"0987845454\",\"gioiTinh\":\"Nam\",\"email\":\"ttphu34@gmail.com\",\"vaiTroDTO\":{\"maVaiTro\":2,\"tenVaiTro\":\"GIANGVIEN\"}},\"chuongMonHocDTO\":{\"maChuong\":8,\"tenChuong\":\"Văn học hiện đại\",\"monHocDTO\":{\"maMonHoc\":5,\"tenMonHoc\":\"Ngữ Văn\",\"soTinChi\":4},\"soTiet\":4},\"dapAnNguoiDung\":\"Thuyết Minh \"},{\"maCauHoi\":33,\"cauHoi\":\"Qua câu chuyện về thân phận bất hạnh, đáng thương của nàng Kiều, Nguyễn Du đã nhận thức và lí giải vấn đề “tài mệnh tương đố” theo hướng nào ? \",\"dapAn1\":\"Là quy luật tất yếu của “thiên mệnh”, con người không thể tránh khỏi. \",\"dapAn2\":\"Những người làm nghề ca nhi, kỉ nữ đều phải chịu đau khổ. \",\"dapAn3\":\"Xã hội phong kiến đố kị, chà đạp những con người tài sắc. \",\"dapAn4\":\"Người phụ nữ tài sắc không thể không bất hạnh. \",\"dapAnDung\":\"Xã hội phong kiến đố kị, chà đạp những con người tài sắc. \",\"doKho\":2,\"nguoiDungDTO\":{\"maNguoiDung\":1,\"tenDangNhap\":\"ttphu\",\"matKhau\":\"1234\",\"ten\":\"Thanh Phú\",\"ho\":\"trần\",\"tenDayDu\":\"Trần Thanh Phú\",\"ngaySinh\":\"Sep 7, 2000\",\"ngayTao\":\"May 16, 2020 5:25:32 PM\",\"soDienThoai\":\"0987845454\",\"gioiTinh\":\"Nam\",\"email\":\"ttphu34@gmail.com\",\"vaiTroDTO\":{\"maVaiTro\":2,\"tenVaiTro\":\"GIANGVIEN\"}},\"chuongMonHocDTO\":{\"maChuong\":9,\"tenChuong\":\"Văn học cổ điển\",\"monHocDTO\":{\"maMonHoc\":5,\"tenMonHoc\":\"Ngữ Văn\",\"soTinChi\":4},\"soTiet\":4},\"dapAnNguoiDung\":\"Những người làm nghề ca nhi, kỉ nữ đều phải chịu đau khổ. \"},{\"maCauHoi\":35,\"cauHoi\":\"Nội dung Truyện Kiều phản ánh hiện thực xã hội với cảm hứng gì ? \",\"dapAn1\":\"Tự sự\",\"dapAn2\":\"Trữ tình \",\"dapAn3\":\"Kết hợp tự sự và trữ tình \",\"dapAn4\":\"Miêu tả\",\"dapAnDung\":\"Kết hợp tự sự và trữ tình \",\"doKho\":1,\"nguoiDungDTO\":{\"maNguoiDung\":1,\"tenDangNhap\":\"ttphu\",\"matKhau\":\"1234\",\"ten\":\"Thanh Phú\",\"ho\":\"trần\",\"tenDayDu\":\"Trần Thanh Phú\",\"ngaySinh\":\"Sep 7, 2000\",\"ngayTao\":\"May 16, 2020 5:25:32 PM\",\"soDienThoai\":\"0987845454\",\"gioiTinh\":\"Nam\",\"email\":\"ttphu34@gmail.com\",\"vaiTroDTO\":{\"maVaiTro\":2,\"tenVaiTro\":\"GIANGVIEN\"}},\"chuongMonHocDTO\":{\"maChuong\":9,\"tenChuong\":\"Văn học cổ điển\",\"monHocDTO\":{\"maMonHoc\":5,\"tenMonHoc\":\"Ngữ Văn\",\"soTinChi\":4},\"soTiet\":4},\"dapAnNguoiDung\":\"Miêu tả\"}]'),(3,'[{\"maCauHoi\":52,\"cauHoi\":\"Nghệ thuật nổi bật nhất của truyện Sọ Dừa là gì?\",\"dapAn1\":\"Tương phản\",\"dapAn2\":\"Liệt kê\",\"dapAn3\":\" Nhân cách hóa\",\"dapAn4\":\"Phóng đại\",\"dapAnDung\":\" Nhân cách hóa\",\"doKho\":2,\"nguoiDungDTO\":{\"maNguoiDung\":1,\"tenDangNhap\":\"ttphu\",\"matKhau\":\"1234\",\"ten\":\"Thanh Phú\",\"ho\":\"trần\",\"tenDayDu\":\"Trần Thanh Phú\",\"ngaySinh\":\"Sep 7, 2000\",\"ngayTao\":\"May 16, 2020 5:25:32 PM\",\"soDienThoai\":\"0987845454\",\"gioiTinh\":\"Nam\",\"email\":\"ttphu34@gmail.com\",\"vaiTroDTO\":{\"maVaiTro\":2,\"tenVaiTro\":\"GIANGVIEN\"}},\"chuongMonHocDTO\":{\"maChuong\":10,\"tenChuong\":\"Cổ tích\",\"monHocDTO\":{\"maMonHoc\":5,\"tenMonHoc\":\"Ngữ Văn\",\"soTinChi\":4},\"soTiet\":4},\"dapAnNguoiDung\":\" Nhân cách hóa\"},{\"maCauHoi\":44,\"cauHoi\":\"Cuộc đấu tranh trong truyện cổ tích là cuộc đấu tranh như thế nào?\",\"dapAn1\":\"Cuộc đấu tranh giữa người nghèo, người giàu\",\"dapAn2\":\" Cuộc đấu tranh giữa địa chủ và nông dân\",\"dapAn3\":\"Cuộc đấu tranh giữa chính nghĩa và phi nghĩa\",\"dapAn4\":\"Cuộc đấu tranh giữa thiện và ác\",\"dapAnDung\":\"Cuộc đấu tranh giữa thiện và ác\",\"doKho\":1,\"nguoiDungDTO\":{\"maNguoiDung\":1,\"tenDangNhap\":\"ttphu\",\"matKhau\":\"1234\",\"ten\":\"Thanh Phú\",\"ho\":\"trần\",\"tenDayDu\":\"Trần Thanh Phú\",\"ngaySinh\":\"Sep 7, 2000\",\"ngayTao\":\"May 16, 2020 5:25:32 PM\",\"soDienThoai\":\"0987845454\",\"gioiTinh\":\"Nam\",\"email\":\"ttphu34@gmail.com\",\"vaiTroDTO\":{\"maVaiTro\":2,\"tenVaiTro\":\"GIANGVIEN\"}},\"chuongMonHocDTO\":{\"maChuong\":10,\"tenChuong\":\"Cổ tích\",\"monHocDTO\":{\"maMonHoc\":5,\"tenMonHoc\":\"Ngữ Văn\",\"soTinChi\":4},\"soTiet\":4},\"dapAnNguoiDung\":\"Cuộc đấu tranh giữa người nghèo, người giàu\"},{\"maCauHoi\":58,\"cauHoi\":\"Điểm khác biệt nổi bật nhất giữa văn học trung đại với văn nghị luận hiện đại là gì?\",\"dapAn1\":\"Nghị luận trung đại phải theo một bố cục đã thành khuôn mẫu.\",\"dapAn2\":\"Nghị luận trung đại thường được viết bằng văn biền ngẫu.\",\"dapAn3\":\"Nghị luận trung đại có lập luận chặt chẽ, sắc sảo.\",\"dapAn4\":\"Gồ ý A và B.\",\"dapAnDung\":\"Gồ ý A và B.\",\"doKho\":2,\"nguoiDungDTO\":{\"maNguoiDung\":1,\"tenDangNhap\":\"ttphu\",\"matKhau\":\"1234\",\"ten\":\"Thanh Phú\",\"ho\":\"trần\",\"tenDayDu\":\"Trần Thanh Phú\",\"ngaySinh\":\"Sep 7, 2000\",\"ngayTao\":\"May 16, 2020 5:25:32 PM\",\"soDienThoai\":\"0987845454\",\"gioiTinh\":\"Nam\",\"email\":\"ttphu34@gmail.com\",\"vaiTroDTO\":{\"maVaiTro\":2,\"tenVaiTro\":\"GIANGVIEN\"}},\"chuongMonHocDTO\":{\"maChuong\":8,\"tenChuong\":\"Văn học hiện đại\",\"monHocDTO\":{\"maMonHoc\":5,\"tenMonHoc\":\"Ngữ Văn\",\"soTinChi\":4},\"soTiet\":4},\"dapAnNguoiDung\":\"Gồ ý A và B.\"},{\"maCauHoi\":35,\"cauHoi\":\"Nội dung Truyện Kiều phản ánh hiện thực xã hội với cảm hứng gì ? \",\"dapAn1\":\"Tự sự\",\"dapAn2\":\"Trữ tình \",\"dapAn3\":\"Kết hợp tự sự và trữ tình \",\"dapAn4\":\"Miêu tả\",\"dapAnDung\":\"Kết hợp tự sự và trữ tình \",\"doKho\":1,\"nguoiDungDTO\":{\"maNguoiDung\":1,\"tenDangNhap\":\"ttphu\",\"matKhau\":\"1234\",\"ten\":\"Thanh Phú\",\"ho\":\"trần\",\"tenDayDu\":\"Trần Thanh Phú\",\"ngaySinh\":\"Sep 7, 2000\",\"ngayTao\":\"May 16, 2020 5:25:32 PM\",\"soDienThoai\":\"0987845454\",\"gioiTinh\":\"Nam\",\"email\":\"ttphu34@gmail.com\",\"vaiTroDTO\":{\"maVaiTro\":2,\"tenVaiTro\":\"GIANGVIEN\"}},\"chuongMonHocDTO\":{\"maChuong\":9,\"tenChuong\":\"Văn học cổ điển\",\"monHocDTO\":{\"maMonHoc\":5,\"tenMonHoc\":\"Ngữ Văn\",\"soTinChi\":4},\"soTiet\":4},\"dapAnNguoiDung\":\"Tự sự\"},{\"maCauHoi\":33,\"cauHoi\":\"Qua câu chuyện về thân phận bất hạnh, đáng thương của nàng Kiều, Nguyễn Du đã nhận thức và lí giải vấn đề “tài mệnh tương đố” theo hướng nào ? \",\"dapAn1\":\"Là quy luật tất yếu của “thiên mệnh”, con người không thể tránh khỏi. \",\"dapAn2\":\"Những người làm nghề ca nhi, kỉ nữ đều phải chịu đau khổ. \",\"dapAn3\":\"Xã hội phong kiến đố kị, chà đạp những con người tài sắc. \",\"dapAn4\":\"Người phụ nữ tài sắc không thể không bất hạnh. \",\"dapAnDung\":\"Xã hội phong kiến đố kị, chà đạp những con người tài sắc. \",\"doKho\":2,\"nguoiDungDTO\":{\"maNguoiDung\":1,\"tenDangNhap\":\"ttphu\",\"matKhau\":\"1234\",\"ten\":\"Thanh Phú\",\"ho\":\"trần\",\"tenDayDu\":\"Trần Thanh Phú\",\"ngaySinh\":\"Sep 7, 2000\",\"ngayTao\":\"May 16, 2020 5:25:32 PM\",\"soDienThoai\":\"0987845454\",\"gioiTinh\":\"Nam\",\"email\":\"ttphu34@gmail.com\",\"vaiTroDTO\":{\"maVaiTro\":2,\"tenVaiTro\":\"GIANGVIEN\"}},\"chuongMonHocDTO\":{\"maChuong\":9,\"tenChuong\":\"Văn học cổ điển\",\"monHocDTO\":{\"maMonHoc\":5,\"tenMonHoc\":\"Ngữ Văn\",\"soTinChi\":4},\"soTiet\":4},\"dapAnNguoiDung\":\"Xã hội phong kiến đố kị, chà đạp những con người tài sắc. \"},{\"maCauHoi\":59,\"cauHoi\":\"Nhân vật trữ tình trong bài thơ Ông đồ là ai?\",\"dapAn1\":\"Ông đồ\",\"dapAn2\":\"Tác giả\",\"dapAn3\":\"Người qua đường \",\"dapAn4\":\"Người thuê viết.\",\"dapAnDung\":\"Người qua đường \",\"doKho\":1,\"nguoiDungDTO\":{\"maNguoiDung\":1,\"tenDangNhap\":\"ttphu\",\"matKhau\":\"1234\",\"ten\":\"Thanh Phú\",\"ho\":\"trần\",\"tenDayDu\":\"Trần Thanh Phú\",\"ngaySinh\":\"Sep 7, 2000\",\"ngayTao\":\"May 16, 2020 5:25:32 PM\",\"soDienThoai\":\"0987845454\",\"gioiTinh\":\"Nam\",\"email\":\"ttphu34@gmail.com\",\"vaiTroDTO\":{\"maVaiTro\":2,\"tenVaiTro\":\"GIANGVIEN\"}},\"chuongMonHocDTO\":{\"maChuong\":8,\"tenChuong\":\"Văn học hiện đại\",\"monHocDTO\":{\"maMonHoc\":5,\"tenMonHoc\":\"Ngữ Văn\",\"soTinChi\":4},\"soTiet\":4},\"dapAnNguoiDung\":\"Người thuê viết.\"},{\"maCauHoi\":69,\"cauHoi\":\"Truyện Kiều gồm mấy phần?\",\"dapAn1\":\"3\",\"dapAn2\":\"4\",\"dapAn3\":\"5\",\"dapAn4\":\"6\",\"dapAnDung\":\"3\",\"doKho\":1,\"nguoiDungDTO\":{\"maNguoiDung\":1,\"tenDangNhap\":\"ttphu\",\"matKhau\":\"1234\",\"ten\":\"Thanh Phú\",\"ho\":\"trần\",\"tenDayDu\":\"Trần Thanh Phú\",\"ngaySinh\":\"Sep 7, 2000\",\"ngayTao\":\"May 16, 2020 5:25:32 PM\",\"soDienThoai\":\"0987845454\",\"gioiTinh\":\"Nam\",\"email\":\"ttphu34@gmail.com\",\"vaiTroDTO\":{\"maVaiTro\":2,\"tenVaiTro\":\"GIANGVIEN\"}},\"chuongMonHocDTO\":{\"maChuong\":9,\"tenChuong\":\"Văn học cổ điển\",\"monHocDTO\":{\"maMonHoc\":5,\"tenMonHoc\":\"Ngữ Văn\",\"soTinChi\":4},\"soTiet\":4},\"dapAnNguoiDung\":\"5\"},{\"maCauHoi\":40,\"cauHoi\":\" Văn bản \\\"Tinh thần yêu nước của nhân dân ta\\\" (Hồ Chí Minh) thuộc loại văn bản nào?\",\"dapAn1\":\"Tự sự \",\"dapAn2\":\"Nghị luận \",\"dapAn3\":\"Thuyết Minh \",\"dapAn4\":\"Biểu cảm \",\"dapAnDung\":\"Nghị luận \",\"doKho\":3,\"nguoiDungDTO\":{\"maNguoiDung\":1,\"tenDangNhap\":\"ttphu\",\"matKhau\":\"1234\",\"ten\":\"Thanh Phú\",\"ho\":\"trần\",\"tenDayDu\":\"Trần Thanh Phú\",\"ngaySinh\":\"Sep 7, 2000\",\"ngayTao\":\"May 16, 2020 5:25:32 PM\",\"soDienThoai\":\"0987845454\",\"gioiTinh\":\"Nam\",\"email\":\"ttphu34@gmail.com\",\"vaiTroDTO\":{\"maVaiTro\":2,\"tenVaiTro\":\"GIANGVIEN\"}},\"chuongMonHocDTO\":{\"maChuong\":8,\"tenChuong\":\"Văn học hiện đại\",\"monHocDTO\":{\"maMonHoc\":5,\"tenMonHoc\":\"Ngữ Văn\",\"soTinChi\":4},\"soTiet\":4},\"dapAnNguoiDung\":\"Nghị luận \"},{\"maCauHoi\":48,\"cauHoi\":\"Tại sao tác giả dân gian không miêu tả chi tiết nhân vật Sọ Dừa\",\"dapAn1\":\"Vì truyện có quá nhiều tình tiết khác hấp dẫn\",\"dapAn2\":\"Dung lượng của truyện cổ tích không cho phép miêu tả kĩ về nhân vật\",\"dapAn3\":\"Nhân vật có tên riêng nhưng đại diện cho một loại ngườ\",\"dapAn4\":\"Nhân vật có bề ngoài không mấy đặc biệt\",\"dapAnDung\":\"Nhân vật có tên riêng nhưng đại diện cho một loại ngườ\",\"doKho\":1,\"nguoiDungDTO\":{\"maNguoiDung\":1,\"tenDangNhap\":\"ttphu\",\"matKhau\":\"1234\",\"ten\":\"Thanh Phú\",\"ho\":\"trần\",\"tenDayDu\":\"Trần Thanh Phú\",\"ngaySinh\":\"Sep 7, 2000\",\"ngayTao\":\"May 16, 2020 5:25:32 PM\",\"soDienThoai\":\"0987845454\",\"gioiTinh\":\"Nam\",\"email\":\"ttphu34@gmail.com\",\"vaiTroDTO\":{\"maVaiTro\":2,\"tenVaiTro\":\"GIANGVIEN\"}},\"chuongMonHocDTO\":{\"maChuong\":10,\"tenChuong\":\"Cổ tích\",\"monHocDTO\":{\"maMonHoc\":5,\"tenMonHoc\":\"Ngữ Văn\",\"soTinChi\":4},\"soTiet\":4},\"dapAnNguoiDung\":\"Nhân vật có tên riêng nhưng đại diện cho một loại ngườ\"},{\"maCauHoi\":66,\"cauHoi\":\"Nguyễn Du được cử đi sứ ở Trung Quốc lần 1 vào khoảng thời gian nào?\",\"dapAn1\":\"1786- 1796\",\"dapAn2\":\"1813- 1814\",\"dapAn3\":\"1820- 1821\",\"dapAn4\":\"1823- 1824\",\"dapAnDung\":\"1813- 1814\",\"doKho\":3,\"nguoiDungDTO\":{\"maNguoiDung\":1,\"tenDangNhap\":\"ttphu\",\"matKhau\":\"1234\",\"ten\":\"Thanh Phú\",\"ho\":\"trần\",\"tenDayDu\":\"Trần Thanh Phú\",\"ngaySinh\":\"Sep 7, 2000\",\"ngayTao\":\"May 16, 2020 5:25:32 PM\",\"soDienThoai\":\"0987845454\",\"gioiTinh\":\"Nam\",\"email\":\"ttphu34@gmail.com\",\"vaiTroDTO\":{\"maVaiTro\":2,\"tenVaiTro\":\"GIANGVIEN\"}},\"chuongMonHocDTO\":{\"maChuong\":9,\"tenChuong\":\"Văn học cổ điển\",\"monHocDTO\":{\"maMonHoc\":5,\"tenMonHoc\":\"Ngữ Văn\",\"soTinChi\":4},\"soTiet\":4},\"dapAnNguoiDung\":\"1786- 1796\"}]');
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
  KEY `fk_cauhoi_tacgia` (`tacgia`),
  KEY `fk_cauhoi_chuongmonhoc` (`machuong`),
  CONSTRAINT `fk_cauhoi_chuongmonhoc` FOREIGN KEY (`machuong`) REFERENCES `chuongmonhoc` (`machuong`) ON DELETE CASCADE,
  CONSTRAINT `fk_cauhoi_tacgia` FOREIGN KEY (`tacgia`) REFERENCES `nguoidung` (`manguoidung`)
) ENGINE=InnoDB AUTO_INCREMENT=73 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cauhoi`
--

LOCK TABLES `cauhoi` WRITE;
/*!40000 ALTER TABLE `cauhoi` DISABLE KEYS */;
INSERT INTO `cauhoi` VALUES (7,NULL,NULL,'asd123',NULL,'asd','asd','asd','asd','asd',1,'TRACNGHIEM',1,1),(10,NULL,NULL,'7vnr',NULL,'a','a','a','a','a',1,'TRACNGHIEM',1,2),(17,NULL,NULL,'Con gà',NULL,'asd','999','Bia 333','Heneiken','Heneiken',1,'TRACNGHIEM',1,1),(18,NULL,NULL,'Con gà ăn gì ?',NULL,'Ăn thóc','Ăn Phân','Ăn snack','Ăn cú đấm','Ăn thóc',1,'TRACNGHIEM',1,2),(21,NULL,NULL,'Nhà vô địch là ai ?',NULL,'Thanh Phú chứ ai','Thanh Phú chứ ai','Thanh Phú chứ ai','Thanh Phú chứ ai','Thanh Phú chứ ai',1,'TRACNGHIEM',1,7),(23,NULL,'3','con ga an gi',NULL,'123','321','222','111','123',3,'TRACNGHIEM',1,1),(24,NULL,'3','con ga an gi',NULL,'123','321','222','111','123',2,'TRACNGHIEM',1,1),(25,NULL,NULL,'con ga an gi',NULL,'123','321','222','111','123',2,'TRACNGHIEM',1,2),(26,NULL,NULL,'con ga an gi',NULL,'123','321','222','111','123',3,'TRACNGHIEM',1,2),(27,NULL,NULL,'con vit an gi',NULL,'123','321','222','111','123',2,'TRACNGHIEM',1,7),(28,NULL,'Java-Framework.jpg','con ga` an gi ?',NULL,'An thoc\'','An com','An banh\'','An trai cay','An thoc\'',1,NULL,1,1),(29,NULL,NULL,'Truyện Kiều là cách gọi vắn tắt của một truyện thơ của Nguyễn Du có tên là :',NULL,'Đoạn trường tân thanh','Kim Vân Kiều truyện','Kim Trọng – Thúy Kiều','Thúy Vân – Thúy Kiều','Đoạn trường tân thanh',1,NULL,1,8),(30,NULL,NULL,'Truyện Kiều được viết theo thể thơ nào ?',NULL,'Lục bát','Song thất lục bát','Thất ngôn ','Thơ tự do ','Lục bát',1,NULL,1,9),(31,NULL,NULL,'Truyện Kiều gồm bao nhiêu câu thơ ? ',NULL,'10','3245','5246','7894','3245',2,NULL,1,9),(32,NULL,NULL,'Từ Kim Vân Kiều truyện của Thanh Tâm Tài Nhân (Trung Quốc), Nguyễn Du đã làm gì để tạo nên Truyện Kiều ? ',NULL,'Phiên dịch ','Sáng tạo ','Phóng tác','Phiên dịch và sửa đổi','Sáng tạo ',2,NULL,1,1),(33,NULL,NULL,'Qua câu chuyện về thân phận bất hạnh, đáng thương của nàng Kiều, Nguyễn Du đã nhận thức và lí giải vấn đề “tài mệnh tương đố” theo hướng nào ? ',NULL,'Là quy luật tất yếu của “thiên mệnh”, con người không thể tránh khỏi. ','Những người làm nghề ca nhi, kỉ nữ đều phải chịu đau khổ. ','Xã hội phong kiến đố kị, chà đạp những con người tài sắc. ','Người phụ nữ tài sắc không thể không bất hạnh. ','Xã hội phong kiến đố kị, chà đạp những con người tài sắc. ',2,NULL,1,9),(34,NULL,NULL,'Thể loại truyện thơ của Việt Nam có điểm mạnh gì ? ',NULL,'Thiết tha mong cho người phụ nữ có một cuộc sống tốt đẹp ','Cảm thông với người kỉ nữ ','Trăn trở về quyền sống của người phụ nữ ','Băn khoăn về số phận con người nói chung, của tài năng và phẩm giá trong xã hội cũ. ','Băn khoăn về số phận con người nói chung, của tài năng và phẩm giá trong xã hội cũ. ',1,NULL,1,9),(35,NULL,NULL,'Nội dung Truyện Kiều phản ánh hiện thực xã hội với cảm hứng gì ? ',NULL,'Tự sự','Trữ tình ','Kết hợp tự sự và trữ tình ','Miêu tả','Kết hợp tự sự và trữ tình ',1,NULL,1,9),(37,NULL,NULL,' Câu tục ngữ nào không cùng nội dung với câu tục ngữ \"Một mặt người bằng mười mặt của\"?',NULL,'Người sống đống vàng','Người làm ra của, của không làm ra người',' Người ta là hoa của đất','Người còn thì của còn',' Người ta là hoa của đất',1,NULL,1,8),(38,NULL,NULL,'Câu tục ngữ \"Đói cho sạch, rách cho thơm\" khuyên chúng ta điều gì?',NULL,'Dù hoàn cảnh nào cũng phải giữ phẩm giá cho trong sạch','Khi đói có thể không cần giữ sạch sẽ nữa','Khi đói cần giữ cho quần áo sạch sẽ, thơm tho','Khi đói khi no, lúc nào cũng phải giữ gìn quần áo cho sạch sẽ','Dù hoàn cảnh nào cũng phải giữ phẩm giá cho trong sạch',1,NULL,1,8),(39,NULL,NULL,'Đề bài nào dưới đây không phải đề văn nghị luận?',NULL,'Gia đình thân yêu của em.',' Ý kiến của em về câu tục ngữ \"Đói cho sạch, rách cho thơm\"','Chứng minh tính đúng đắn của câu: Ăn quả nhớ kẻ trồng cây','Gia đình là điểm tựa của mỗi người. Ý kiến của em về vấn đề này','Gia đình thân yêu của em.',1,NULL,1,8),(40,NULL,NULL,' Văn bản \"Tinh thần yêu nước của nhân dân ta\" (Hồ Chí Minh) thuộc loại văn bản nào?',NULL,'Tự sự ','Nghị luận ','Thuyết Minh ','Biểu cảm ','Nghị luận ',3,NULL,1,8),(41,NULL,NULL,'Thể loại truyện cổ tích xuất hiện từ thời kì nào',NULL,'Nguyên thủy','Chiếm hữu nô lệ','Phong kiến',' Hiện đại','Phong kiến',3,NULL,1,10),(42,NULL,NULL,'Truyện cổ tích phát triển mạnh trong hoàn cảnh nào?',NULL,'Xã hội có sự phân chia giai cấp, thống trị và bị trị','Xã hội chưa phân chia giai cấp','Bình đẳng, văn minh, dân chủ','Cạnh tranh kinh tế lành mạnh','Xã hội có sự phân chia giai cấp, thống trị và bị trị',2,NULL,1,10),(43,NULL,NULL,' Truyện cổ tích thường phản ánh điều gì?',NULL,'Bước đấu tranh chinh phục thiên nhiên','Đấu tranh chống xâm lược','Đấu tranh giai cấp','Đấu tranh bảo tồn văn hóa','Đấu tranh giai cấp',2,NULL,1,10),(44,NULL,NULL,'Cuộc đấu tranh trong truyện cổ tích là cuộc đấu tranh như thế nào?',NULL,'Cuộc đấu tranh giữa người nghèo, người giàu',' Cuộc đấu tranh giữa địa chủ và nông dân','Cuộc đấu tranh giữa chính nghĩa và phi nghĩa','Cuộc đấu tranh giữa thiện và ác','Cuộc đấu tranh giữa thiện và ác',1,NULL,1,10),(45,NULL,NULL,'Loại truyện nào dưới đây không có trong truyện cổ tích?',NULL,'Truyện cổ tích thần kì','Truyện cổ tích loài vật','Truyện cổ tích loài người','Truyện cổ tích sinh hoạt','Truyện cổ tích loài người',1,NULL,1,10),(46,NULL,NULL,'Yếu tố thần kì đóng vai trò thế nào trong kho tàng truyện cổ tích?',NULL,'Trong tất cả truyện cổ tích','Trong đa số truyện cổ tích','Trong một số ít truyện cổ tích','Không có trong bất cứ truyện nào','Trong đa số truyện cổ tích',1,NULL,1,10),(47,NULL,NULL,'Mục đích chính của việc tác giả dân gian đưa yếu tố kì ảo vào trong truyện cổ tích nhằm?',NULL,'Vì không giải thích được các hiện tượng xảy ra trong xã hội','Giúp trừng trị cái ác tốt hơn',' Nhằm lí giải các mối quan hệ xã hội','Thể hiện ước mơ về lẽ công bằng, góp phần tạo nên chất lãng mạn cho câu chuyện','Thể hiện ước mơ về lẽ công bằng, góp phần tạo nên chất lãng mạn cho câu chuyện',3,NULL,1,10),(48,NULL,NULL,'Tại sao tác giả dân gian không miêu tả chi tiết nhân vật Sọ Dừa',NULL,'Vì truyện có quá nhiều tình tiết khác hấp dẫn','Dung lượng của truyện cổ tích không cho phép miêu tả kĩ về nhân vật','Nhân vật có tên riêng nhưng đại diện cho một loại ngườ','Nhân vật có bề ngoài không mấy đặc biệt','Nhân vật có tên riêng nhưng đại diện cho một loại ngườ',1,NULL,1,10),(49,NULL,NULL,'Truyện cổ tích, cái thiện luôn được khẳng định, đề cao, người hiền lành có thể gặp nhiều thiệt thòi xong cuối cùng vẫn có được cuộc sống hạnh phúc',NULL,' Kết thúc có hậu','Kết thúc bất ngờ','Kết thúc đúng thực tế','Kết thúc không thực tế',' Kết thúc có hậu',1,NULL,1,10),(50,NULL,NULL,'Nhân vật Sọ Dừa đại diện cho kiểu người nào trong xã hội?',NULL,'Kiểu người bị bóc lột',' Kiểu người chịu nhiều bất hạnh','Kiểu người gặp nhiều may mắn','Kiểu người bị hắt hủi, coi thường',' Kiểu người chịu nhiều bất hạnh',1,NULL,1,10),(51,NULL,NULL,'Tại sao cô Út bằng lòng lấy nhân vật Sọ Dừa?',NULL,'Vì thương hại Sọ Dừa',' Biết Sọ Dừa khôi ngô, tuấn tú','Hiểu và coi trọng giá trị bên trong của Sọ Dừa','Cảm nhận được tương lai tốt đẹp của Sọ Dừa','Hiểu và coi trọng giá trị bên trong của Sọ Dừa',2,NULL,1,10),(52,NULL,NULL,'Nghệ thuật nổi bật nhất của truyện Sọ Dừa là gì?',NULL,'Tương phản','Liệt kê',' Nhân cách hóa','Phóng đại',' Nhân cách hóa',2,NULL,1,10),(53,NULL,NULL,'Đặc trưng nổi bật của văn nghị luận là gì?',NULL,'Dùng lời nói hay lời văn làm sống lại một sự vật, một cảnh tượng, một con người,… làm sao cho người đọc, người nghe có thể tưởng tượng điều đó như đang ở trước mắt.','Dùng lời nói hay lời văn làm cho sống lại một câu chuyện, nghĩa là giúp người đọc, người nghe hiểu được diễn biến của câu chuyện đó.','Dùng lời văn hay lời nói để diễn tả cảm xúc, suy nghĩ của người viết về một vấn đề, một hiện tượng nào đó.','Dùng lời văn hay lời nói để trình bày các ý kiến, lí lẽ nhằm giải thích, chứng minh, biện luận, thuyết phục người đọc, người nghe về một vấn đề gì đó.','Dùng lời văn hay lời nói để trình bày các ý kiến, lí lẽ nhằm giải thích, chứng minh, biện luận, thuyết phục người đọc, người nghe về một vấn đề gì đó.',2,NULL,1,8),(54,NULL,NULL,'Tác phẩm nào dưới đây thuộc thể văn nghị luận trung đại?',NULL,'Bài toán dân số','Bản án chế độ thực dân Pháp.','Hịch tướng sĩ. ','Hai chữ nước nhà.','Bản án chế độ thực dân Pháp.',2,NULL,1,8),(55,NULL,NULL,'Đoạn văn sau đã thể hiện các phương thức biểu đạt nào?\n\nVậy nên:\n\n“ Lưu Cung tham công nên thất bại\n\n“ Triệu Tiết thích lớn phải tiêu vong\n\n“ Cửa Hàm Tử bắt sống Toa Đô.\n\n“ Sông Bạch Đằng giết tươi Ô Mã.',NULL,'Nghị luận + miêu tả ','Miêu tả + tự sự','Nghị luận + tự tự ','Nghị luận + thuyết minh.','Miêu tả + tự sự',3,NULL,1,8),(56,NULL,NULL,'iểm tương đồng về nội dung tư tưởng của các văn bản Chiếu dời đô, Hịch tướng sĩ, Nước Đại Việt ta là gì?',NULL,'Đều thể hiện xây dựng một đất nước hùng mạnh, vững bền.','Đề thể hiện ý thức, tình yêu và niềm tự hào dân tộc.','Đều thể hiện lòng căm thù giặc sâu sắc.','Đều thể hiện tinh thần quyết chiến, quyết thắng quân xâm lược.','Đề thể hiện ý thức, tình yêu và niềm tự hào dân tộc.',2,NULL,1,8),(57,NULL,NULL,'Câu nào làm sáng tỏ ý kiến cho rằng Chiếu dời đô thể hiện rõ nỗi lòng của tác giả?',NULL,'Trẫm rất đau xót về việc đó, không thể không dời đổi.','Phải đâu các vua thời Tam đại theo ý riêng mình mà tự tiện chuyển dời?','Xem khắp đất Việt ta chỉ nơi này là thắng địa.','Dân cư khỏi chịu cảnh khốn khổ ngập lụt; muôn vật cũng rất mực phong phú, tốt tươi.','Trẫm rất đau xót về việc đó, không thể không dời đổi.',1,NULL,1,8),(58,NULL,NULL,'Điểm khác biệt nổi bật nhất giữa văn học trung đại với văn nghị luận hiện đại là gì?',NULL,'Nghị luận trung đại phải theo một bố cục đã thành khuôn mẫu.','Nghị luận trung đại thường được viết bằng văn biền ngẫu.','Nghị luận trung đại có lập luận chặt chẽ, sắc sảo.','Gồ ý A và B.','Gồ ý A và B.',2,NULL,1,8),(59,NULL,NULL,'Nhân vật trữ tình trong bài thơ Ông đồ là ai?',NULL,'Ông đồ','Tác giả','Người qua đường ','Người thuê viết.','Người qua đường ',1,NULL,1,8),(60,NULL,NULL,'Điểm khác biệt giữa thơ mới với thơ cũ (thơ ca trung đại) là gì?',NULL,'Không viết bằng chữ Hán.','Không sử dụng các thể loại có kết cấu định hình, có niêm luận chặt chẽ.','Không sử dụng các thi liệu và các hình thức ước lệ tượng trưng.','Gồm cả ý A, B và C.','Gồm cả ý A, B và C.',3,NULL,1,1),(61,NULL,NULL,'Nét chung về hình thức giữa bài thơ Ông đồ và Nhớ rừng?',NULL,'Xây dựng hai hình ảnh, hai cảnh tượng đối lập để làm nổi bật tâm sự và tình cảnh của nhân vật chính.','Sử dụng thể thơ tự do để diện tả cảm xúc mãnh liệt của tác giả.','Ngôn ngữ giản dị, cô đọng và súc tích.','Cả A, B, C đều sai.','Xây dựng hai hình ảnh, hai cảnh tượng đối lập để làm nổi bật tâm sự và tình cảnh của nhân vật chính.',3,NULL,1,8),(62,NULL,NULL,'Vẻ đẹp tâm hồn của Hồ Chí Minh, Tố Hữu – những nhà thơ chiến sĩ qua các bài thơ đã học là gì?',NULL,' Tình yêu cuộc sống tha thiết, nồng nhiệt.','Tình yêu thương con người, nhất là những người lao động.','Tinh thần “thép” của người chiến sĩ cách mạng.','Gồm cả ý A, B, C.','Gồm cả ý A, B, C.',2,NULL,1,8),(63,NULL,NULL,'Nghị luận về tác phẩm truyện (hay đoạn trích) là gì?',NULL,'Là trình bày những nhận xét, đánh giá của mình về nhân vật, sự kiện hay chủ đề, nghệ thuật của một tác phẩm cụ thể','Các nhận xét đánh giá về tác phẩm truyện trong bài nghị luận phải rõ ràng, đúng đắn, có luận cứ và lập luận thuyết phục','Bài nghị luận phải có bố cục mạch lạc có lời văn chuẩn xác và gợi cảm','Cả 3 đáp án trên','Cả 3 đáp án trên',1,NULL,1,8),(64,NULL,NULL,'Nguyễn Du có tên hiệu là gì?',NULL,'Thanh Hiên','Tố Như','Thanh Tâm','Thanh Minh','Thanh Hiên',1,NULL,1,9),(65,NULL,NULL,'Quê hương của Nguyễn Du ở đâu?',NULL,'Thanh Miện, Hải Dương  ','Nghi Xuân, Hà Tĩnh','Can Lộc, Hà Tĩnh','Thọ Xuân, Thanh Hóa','Nghi Xuân, Hà Tĩnh',2,NULL,1,9),(66,NULL,NULL,'Nguyễn Du được cử đi sứ ở Trung Quốc lần 1 vào khoảng thời gian nào?',NULL,'1786- 1796','1813- 1814','1820- 1821','1823- 1824','1813- 1814',3,NULL,1,9),(67,NULL,NULL,'Tác phẩm truyện Kiều được mượn cốt truyện của truyện nào?',NULL,'Truyện Lục Vân Tiên','Truyện Tống Trân- Cúc Hoa','Kim Vân Kiều truyện','Sở kính tân trang','Kim Vân Kiều truyện',2,NULL,1,9),(68,NULL,NULL,'Truyện Kiều là tên gọi do ai đặt?',NULL,'Thanh Tâm tài nhân','Nguyễn Du',' Người dân','Không rõ',' Người dân',1,NULL,1,9),(69,NULL,NULL,'Truyện Kiều gồm mấy phần?',NULL,'3','4','5','6','3',1,NULL,1,9),(70,NULL,NULL,'Đoạn trường tân thanh có nghĩa là gì?',NULL,'Đứt từng mảnh ruột','Tiếng kêu mới','Con đường dài màu xanh đứt đoạn','Tiếng kêu mới tới đứt từng mảnh ruột','Tiếng kêu mới tới đứt từng mảnh ruột',3,NULL,1,9),(71,NULL,NULL,' Đặc sắc nhất về mặt nghệ thuật của Truyện Kiều là gì?',NULL,'Được dịch ra nhiều thứ tiếng, được giới thiệu ở nhiều nơi trên thế giới','Ngôn ngữ văn học dân tộc và thể thơ lục bát đã đạt đến đỉnh cao rực rỡ','Nghệ thuật tự sự có bước phát triển vượt bậc','Cách khắc họa tính cách con người độc đáo','Ngôn ngữ văn học dân tộc và thể thơ lục bát đã đạt đến đỉnh cao rực rỡ',3,NULL,1,9),(72,NULL,NULL,' Giá trị về mặt nội dung của Truyện Kiều là gì?',NULL,'Giá trị nhân đạo, hiện thực','Bức tranh về xã hội bất công, tàn bạo chà đạp lên quyền sống của con người','Đề cao tài năng, nhân phẩm của con người','Cả 3 đáp án trên','Cả 3 đáp án trên',2,NULL,1,8);
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
) ENGINE=InnoDB AUTO_INCREMENT=136 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chitietdethi`
--

LOCK TABLES `chitietdethi` WRITE;
/*!40000 ALTER TABLE `chitietdethi` DISABLE KEYS */;
INSERT INTO `chitietdethi` VALUES (15,21,34),(16,24,34),(17,7,34),(18,18,34),(19,10,34),(20,17,34),(21,23,34),(22,10,35),(23,18,35),(24,21,35),(25,17,35),(26,26,35),(27,7,35),(28,25,35),(29,28,36),(30,7,36),(31,10,36),(32,21,36),(33,26,36),(34,18,36),(35,25,36),(86,58,42),(87,48,42),(88,52,42),(89,59,42),(90,66,42),(91,35,42),(92,44,42),(93,69,42),(94,33,42),(95,40,42),(126,51,46),(127,50,46),(128,29,46),(129,67,46),(130,48,46),(131,40,46),(132,41,46),(133,58,46),(134,68,46),(135,49,46);
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
  KEY `fk_cmh_monhoc` (`mamonhoc`),
  CONSTRAINT `fk_cmh_monhoc` FOREIGN KEY (`mamonhoc`) REFERENCES `monhoc` (`mamonhoc`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chuongmonhoc`
--

LOCK TABLES `chuongmonhoc` WRITE;
/*!40000 ALTER TABLE `chuongmonhoc` DISABLE KEYS */;
INSERT INTO `chuongmonhoc` VALUES (1,'Trr chương',3,1),(2,'Ánh xạ',4,1),(7,'vui hề',3,1),(8,'Văn học hiện đại',4,5),(9,'Văn học cổ điển',4,5),(10,'Cổ tích',4,5);
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
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dethi`
--

LOCK TABLES `dethi` WRITE;
/*!40000 ALTER TABLE `dethi` DISABLE KEYS */;
INSERT INTO `dethi` VALUES (34,'TST',10,10,7,5,1,1,1,1,1),(35,'Test 2',10,10,7,5,1,1,1,1,1),(36,'Thi thu',10,10,7,5,1,1,1,1,1),(42,'Ngữ văn',60,10,10,5,3,2,1,5,1),(46,'Ngữ văn test',10,10,10,5,3,2,1,5,1);
/*!40000 ALTER TABLE `dethi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `giangvien`
--

DROP TABLE IF EXISTS `giangvien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `giangvien` (
  `magv` bigint NOT NULL AUTO_INCREMENT,
  `chuyenmon` text COLLATE utf8mb4_unicode_ci,
  `kinhnghiem` int DEFAULT NULL,
  `mamonhoc` bigint NOT NULL,
  `manguoidung` bigint NOT NULL,
  PRIMARY KEY (`magv`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `giangvien`
--

LOCK TABLES `giangvien` WRITE;
/*!40000 ALTER TABLE `giangvien` DISABLE KEYS */;
INSERT INTO `giangvien` VALUES (1,'Ngữ văn',3,5,1);
/*!40000 ALTER TABLE `giangvien` ENABLE KEYS */;
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
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ketqua`
--

LOCK TABLES `ketqua` WRITE;
/*!40000 ALTER TABLE `ketqua` DISABLE KEYS */;
INSERT INTO `ketqua` VALUES (1,5.7,34,1,'2020-06-18 13:57:43',1),(2,5.8,34,1,'2020-06-21 08:16:40',1),(3,1,42,1,'2020-06-23 06:03:42',2),(4,5,42,2,'2020-06-23 06:08:47',3);
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
INSERT INTO `monhoc` VALUES (1,'Toán rời rạc',3),(5,'Ngữ Văn',4);
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
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `phongthi`
--

LOCK TABLES `phongthi` WRITE;
/*!40000 ALTER TABLE `phongthi` DISABLE KEYS */;
INSERT INTO `phongthi` VALUES (1,1,1,34,1),(2,1,2,34,1),(4,3,1,34,0),(5,4,1,35,0),(6,4,2,35,0),(7,4,3,35,0),(8,5,2,42,1),(9,5,3,42,1),(10,5,4,42,1);
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

-- Dump completed on 2020-06-23 19:20:17
