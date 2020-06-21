/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;


public class SessionUser {
    //Lop nay de luu thong tin danng nhap cua nguoi dung !!!
    private static String tenDangNhap=null;
    private static String tenVaiTro=null;
    private static String maNguoiDung=null;

    public SessionUser() {
    }

    
     public static void removeSession() 
     {
         SessionUser.tenDangNhap=null;
         SessionUser.tenVaiTro=null;
         SessionUser.maNguoiDung=null;
     }
    public static String getTenDangNhap() {
        return tenDangNhap;
    }

    public static void setTenDangNhap(String tenDangNhap) {
        SessionUser.tenDangNhap = tenDangNhap;
    }

    public static String getTenVaiTro() {
        return tenVaiTro;
    }

    public static void setTenVaiTro(String tenVaiTro) {
        SessionUser.tenVaiTro = tenVaiTro;
    }

    public static String getMaNguoiDung() {
        return maNguoiDung;
    }

    public static void setMaNguoiDung(String maNguoiDung) {
        SessionUser.maNguoiDung = maNguoiDung;
    }
    
    
    
}
