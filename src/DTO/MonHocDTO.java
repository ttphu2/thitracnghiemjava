/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author hocgioinhatlop
 */
public class MonHocDTO implements Serializable{
     private Integer maMonHoc;
     private String tenMonHoc;
      private List<ChuongMonHocDTO> chuongMonHocList;

    public MonHocDTO() {
    }

    public MonHocDTO(Integer maMonHoc, String tenMonHoc) {
        this.maMonHoc = maMonHoc;
        this.tenMonHoc = tenMonHoc;
    }
     
    public Integer getMaMonHoc() {
        return maMonHoc;
    }

    public void setMaMonHoc(Integer maMonHoc) {
        this.maMonHoc = maMonHoc;
    }

    public String getTenMonHoc() {
        return tenMonHoc;
    }

    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }

    public List<ChuongMonHocDTO> getChuongMonHocList() {
        return chuongMonHocList;
    }

    public void setChuongMonHocList(List<ChuongMonHocDTO> chuongMonHocList) {
        this.chuongMonHocList = chuongMonHocList;
    }
     
    
}
