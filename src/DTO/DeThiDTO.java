package DTO;

import java.util.HashSet;
import java.util.Set;


public class DeThiDTO {  
    
    private Integer maDeThi;   
    private String tenDeThi;  
    private Integer thoiGian;   
    private Integer diemToiDa;    
    private Integer slCauHoi;
    private Integer slCauHoiDe;
    private Integer slCauHoiTb; 
    private Integer slCauHoiKho;      
    private NguoiDungDTO nguoiDungDTO;       
    private MonHocDTO monHocDTO;    
    private KyThiDTO kyThiDTO;        
    private Set<CauHoiDTO> listCauHoi = new HashSet<>();

    public Set<CauHoiDTO> getListCauHoi() {
        return listCauHoi;
    }

    public void setListCauHoi(Set<CauHoiDTO> listCauHoi) {
        this.listCauHoi = listCauHoi;
    }

    public Integer getMaDeThi() {
        return maDeThi;
    }

    public void setMaDeThi(Integer maDeThi) {
        this.maDeThi = maDeThi;
    }

    public String getTenDeThi() {
        return tenDeThi;
    }

    public void setTenDeThi(String tenDeThi) {
        this.tenDeThi = tenDeThi;
    }

    public Integer getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(Integer thoiGian) {
        this.thoiGian = thoiGian;
    }

    public Integer getDiemToiDa() {
        return diemToiDa;
    }

    public void setDiemToiDa(Integer diemToiDa) {
        this.diemToiDa = diemToiDa;
    }

    public Integer getSlCauHoi() {
        return slCauHoi;
    }

    public void setSlCauHoi(Integer slCauHoi) {
        this.slCauHoi = slCauHoi;
    }

    public Integer getSlCauHoiDe() {
        return slCauHoiDe;
    }

    public void setSlCauHoiDe(Integer slCauHoiDe) {
        this.slCauHoiDe = slCauHoiDe;
    }

    public Integer getSlCauHoiTb() {
        return slCauHoiTb;
    }

    public void setSlCauHoiTb(Integer slCauHoiTb) {
        this.slCauHoiTb = slCauHoiTb;
    }

    public Integer getSlCauHoiKho() {
        return slCauHoiKho;
    }

    public void setSlCauHoiKho(Integer slCauHoiKho) {
        this.slCauHoiKho = slCauHoiKho;
    }

    public KyThiDTO getKyThiDTO() {
        return kyThiDTO;
    }

    public void setKyThiDTO(KyThiDTO kyThiDTO) {
        this.kyThiDTO = kyThiDTO;
    }
    
    
   

    public NguoiDungDTO getNguoiDungDTO() {
        return nguoiDungDTO;
    }

    public void setNguoiDungDTO(NguoiDungDTO nguoiDungDTO) {
        this.nguoiDungDTO = nguoiDungDTO;
    }

    public MonHocDTO getMonHocDTO() {
        return monHocDTO;
    }

    public void setMonHocDTO(MonHocDTO monHocDTO) {
        this.monHocDTO = monHocDTO;
    }

    
    

   
}
