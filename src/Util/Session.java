/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;


public class Session {
    //Lop nay de luu thong tin danng nhap cua nguoi dung !!!
    private static String tenDangNhap=null;
    private static String tenVaiTro=null;

    public Session() {
    }

     public static void addSession(String tenDangNhap,String tenVaiTro) 
     {
         Session.tenDangNhap=tenDangNhap;
         Session.tenVaiTro=tenVaiTro;
     }
     public static void removeSession() 
     {
         Session.tenDangNhap=null;
         Session.tenVaiTro=null;
     }
    public static String getTenDangNhap() {
        return tenDangNhap;
    }

    public static void setTenDangNhap(String tenDangNhap) {
        Session.tenDangNhap = tenDangNhap;
    }

    public static String getTenVaiTro() {
        return tenVaiTro;
    }

    public static void setTenVaiTro(String tenVaiTro) {
        Session.tenVaiTro = tenVaiTro;
    }
    
    
    
}
