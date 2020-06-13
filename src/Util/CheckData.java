/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

/**
 *
 * @author hocgioinhatlop
 */
public class CheckData {
    public static boolean isData(String s){
        if (s.equals("")) return false;
        return true;        
    }
    public static boolean kiemTraSo(String s){
        if (isData(s)){
        if(!s.matches("\\d{1,5}"))
                return false;
        }
        return true;        
    }
    
}
