/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DTO.ChuongMonHocDTO;
import java.util.List;

/**
 *
 * @author hocgioinhatlop
 */
public interface ChuongMonHocBUS {
     Integer saveChuongMonHoc(ChuongMonHocDTO chuongMonHocDTO);
    Integer deleteChuongMonHoc(Integer ID);
    List<ChuongMonHocDTO> findAll();
     List<ChuongMonHocDTO> findByMonHoc(Object value);
    // ChuongMonHocDTO findByTenChu
}
