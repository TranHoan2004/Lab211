/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import entity.Account;
import utils.Validation;

import java.util.ArrayList;

/**
 * Xử lý các tác vụ liên quan đến tài khoản Các tác vụ: đổi mật khẩu và đăng
 * nhập tài khoản
 */
public class AccountManager {

    private Account account;
    private final ArrayList<Account> listOfAccount;

    public AccountManager() {
        this.account = new Account();
        this.listOfAccount = new ArrayList<>();
    }

    public void setAccount(Account account) {
        this.account = encryption(account);
    }

    public Account getAccount() {
        return account;
    }

    public void addToList(Account account) {
        listOfAccount.add(account);
    }

    public boolean isTruePassword(String encryptedPass) {
        return account.getPassword().equalsIgnoreCase(encryptedPass);
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

    private Account encryption(Account account) {
        account.setPassword(Validation.MD5Encryption(account.getPassword()));
        return account;
    }

    public boolean checkPassMatchesAccount(String encryptedPass) {
        return account.getPassword().equalsIgnoreCase(encryptedPass);
    }

    private boolean checkPassMatchesPass(String pass, String renewPass) {
        return pass.equals(renewPass);
    }


    public Account getAccountByUserName(String userName) { //trả về tài khoản có user name
        for (Account account : listOfAccount) {
            if (account.getUserName().equalsIgnoreCase(userName)) {
                return account;
            }
        }
        return null;
    }

    public void updateAccount(Account account) { //cập nhật lại tài khoản đã cập nhật mật khẩu
        for (Account acc : listOfAccount) {
            if (account.getUserName().equalsIgnoreCase(acc.getUserName())) {
                acc.setPassword(account.getPassword());
            }
        }
    }

    public Account checkWhenCreateAccount(Account account) throws Exception { //kiểm tra xem tk mới đã tồn tại trong danh sách hay không
        if (isUsernameAndEmailExisted(account)) { //nếu trùng tên người dùng và email
            throw new Exception("User's name is already existed");
        } else if (isAccountExisted(account)) { //nếu tài khoản đã tồn tại
            throw new Exception("This account is already existed");
        }
        return account;
    }

    private boolean isUsernameAndEmailExisted(Account account) {
        for (Account acc : listOfAccount) {
            if (account.getUserName().equalsIgnoreCase(acc.getUserName())
                    || account.getEmailAddress().equalsIgnoreCase(acc.getEmailAddress())) {
                return true;
            }
        }
        return false;
    }

    private boolean isAccountExisted(Account account) {
        for (Account acc : listOfAccount) {
            if (acc == account) {
                return true;
            }
        }
        return false;
    }
}
