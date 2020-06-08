package DTO;

import java.io.Serializable;

public class CheckLogin implements Serializable {
    // lop nay để luu kết quả sau khi kiểm tra là nguoi` dung có tồn tại hay không
    private boolean isUserExist;
    private String roleName;

    public boolean isUserExist() {
        return isUserExist;
    }

    public void setUserExist(boolean userExist) {
        isUserExist = userExist;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
