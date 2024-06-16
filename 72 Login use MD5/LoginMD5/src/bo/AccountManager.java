/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import entity.Account;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
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
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    public boolean isTruePassword(String encryptedPass) throws Exception {
        if (!Validation.checkPassword(encryptedPass, account)) {
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
        account.setPassword(MD5Encryption(rewritePass));
        return account;
    }

    private Account encryption() {
        account.setPassword(MD5Encryption(account.getPassword()));
        return account;
    }

    public String MD5Encryption(String password) {
        while (true) {
            try {
                MessageDigest md = MessageDigest.getInstance("MD5");
                md.update(password.getBytes());
                byte[] hashBytes = md.digest();
                String base64Hash = Base64.getEncoder().encodeToString(hashBytes);
                return base64Hash;
            } catch (NoSuchAlgorithmException ex) {
                System.err.println("There is an error occured");
            }
            return null;
        }
    }

    public boolean checkPassMatchesAccount(String encryptedPass) throws Exception {
        if (!Validation.checkPassword(encryptedPass, account)) {
            throw new Exception("Password is incorrect");
        }
        return true;
    }

    private boolean checkPassMatchesPass(String pass, String renewPass) {
        return pass.equals(renewPass);
    }

}
