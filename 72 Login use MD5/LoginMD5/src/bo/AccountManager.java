/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import entity.Account;
import utils.Validation;

/**
 *
 * Xử lý các tác vụ liên quan đến tài khoản Các tác vụ: đổi mật khẩu và đăng
 * nhập tài khoản
 */
public class AccountManager {

    private Account account = new Account();

    public AccountManager() {
    }

    public void setAccount(Account account) {
        encryption();
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    public boolean isTruePassword(String encryptedPass) throws Exception {
        if (!account.getPassword().equalsIgnoreCase(encryptedPass)) {
            throw new Exception("Password is incorrect");
        }
        return true;
    }

    public Account resetPassword(String password, String rewritePass) throws Exception {
        //nếu mật khẩu mới và mật khẩu mới viết lại không trùng nhau thì trả về false
        //ngược lại thì đặt lại mật khẩu mã hóa 
        if (!checkPassMatchesPass(password, rewritePass)) {
            throw new Exception("Re-new password is incorrect");
        }
        account.setPassword(Validation.MD5Encryption(rewritePass));
        return account;
    }

    private Account encryption() {
        account.setPassword(Validation.MD5Encryption(account.getPassword()));
        return account;
    }

    public boolean checkPassMatchesAccount(String encryptedPass) throws Exception {
        if (!account.getPassword().equalsIgnoreCase(encryptedPass)) {
            throw new Exception("Password is incorrect");
        }
        return true;
    }

    private boolean checkPassMatchesPass(String pass, String renewPass) {
        return pass.equals(renewPass);
    }

}
