/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import entity.Account;
import utils.Validation;

/**
 *
 * Xử lý các tác vụ liên quan đến tài khoản
 * Các tác vụ: đổi mật khẩu và đăng nhập tài khoản
 */
public class AccountManager {

    private Account account = new Account();

    public AccountManager() {
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    public boolean login(String encryptedPass) throws Exception {
        return (Validation.checkPassword(encryptedPass, account));
    }

    public boolean resetPassword(String password, String rewritePass) {
        //nếu mật khẩu mới và mật khẩu mới viết lại không trùng nhau thì trả về false
        //ngược lại thì đặt lại mật khẩu mã hóa 
        if (!checkPassMatchesPass(password, rewritePass)) { 
            return false;
        } else {
            account.setPassword(Validation.MD5Encryption(rewritePass));
            return true;
        }
    }

    public boolean checkPassMatchesAccount(String encryptedPass) {
        return Validation.checkPassword(encryptedPass, account);
    }

    private boolean checkPassMatchesPass(String pass, String renewPass) {
        return pass.equals(renewPass);
    }

}
