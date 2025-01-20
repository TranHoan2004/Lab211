/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import entity.Account;
import utils.Validation;

import java.util.ArrayList;
import java.util.List;

/**
 * Xử lý các tác vụ liên quan đến tài khoản Các tác vụ: đổi mật khẩu và đăng
 * nhập tài khoản
 */
public class AccountManager {

    private Account account;
    private final List<Account> listOfAccount;

    public AccountManager() {
        this.account = new Account();
        this.listOfAccount = new ArrayList<>();
    }

    public void setAccount(Account account) throws Exception {
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
        if (checkPassMatchesPass(password, rewritePass)) {
            account.setPassword(Validation.MD5Encryption(rewritePass));
            return account;
        }
        throw new Exception("Re-new password is incorrect");
    }

    private Account encryption(Account account) throws Exception {
        account.setPassword(Validation.MD5Encryption(account.getPassword()));
        return account;
    }

    public boolean checkPassMatchesAccount(String encryptedPass) {
        return account.getPassword().equalsIgnoreCase(encryptedPass);
    }

    private boolean checkPassMatchesPass(String pass, String renewPass) {
        return pass.equals(renewPass);
    }

    //trả về tài khoản có user name
    public Account getAccountByUserName(String username) throws Exception {
//        for (Account account : listOfAccount) {
//            if (account.getUserName().equalsIgnoreCase(userName)) {
//                return account;
//            }
//        }
//        return null;
        // co the thay the bang doan code duoi
        return listOfAccount
                .stream()
                .filter(account -> account.getUserName().equalsIgnoreCase(username))
                .findFirst().orElseThrow(() -> new Exception("There is no account has this username"));
    }

    //cập nhật lại tài khoản đã cập nhật mật khẩu
    public void updateAccount(Account account) {
//        for (Account acc : listOfAccount) {
//            if (account.getUserName().equalsIgnoreCase(acc.getUserName())) {
//                acc.setPassword(account.getPassword());
//            }
//        }
        // co the thay the bang doan code duoi
        listOfAccount
                .stream()
                .filter(acc -> account.getUserName().equalsIgnoreCase(acc.getUserName()))
                .forEach(acc -> acc.setPassword(account.getPassword()));
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
//        for (Account acc : listOfAccount) {
//            if (account.getUserName().equalsIgnoreCase(acc.getUserName())
//                || account.getEmailAddress().equalsIgnoreCase(acc.getEmailAddress())) {
//                return true;
//            }
//        }
//        return false;
        // co the thay the bang doan code duoi
        return listOfAccount
                .stream()
                .anyMatch(acc -> account.getUserName().equalsIgnoreCase(acc.getUserName())
                                 || account.getEmailAddress().equalsIgnoreCase(acc.getEmailAddress()));
    }

    private boolean isAccountExisted(Account account) {
//        for (Account acc : listOfAccount) {
//            if (acc.equals(account)) {
//                return true;
//            }
//        }
//        return false;
        // co the thay the bang doan code duoi
        return listOfAccount
                .stream()
                .anyMatch(acc -> acc.equals(account));
    }
}
