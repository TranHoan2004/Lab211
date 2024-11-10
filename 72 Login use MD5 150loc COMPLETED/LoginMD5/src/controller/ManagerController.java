/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import bo.AccountInput;
import bo.AccountManager;
import entity.Account;
import utils.Validation;

import static utils.Validation.getStringByRegex;

/**
 * @author ADMIN
 */
public class ManagerController {

    private final AccountManager accountManager;

    public ManagerController() {
        this.accountManager = new AccountManager();
    }

    public void createAccount() throws Exception {
        AccountInput input = new AccountInput();
        Account account = input.getAccountInformation();
        accountManager.setAccount(account);
        account = accountManager.checkWhenCreateAccount(accountManager.getAccount());
        accountManager.addToList(account);
    }

    /**
     * Chương trình đăng nhập.Nếu không có tài khoản nào trong danh sách thì
     * không thực hiện tiếp, yêu cầu phải đăng nhập.Nếu có, tìm tài khoản trong
     * danh sách bằng tên đăng nhập, kiểm tra mật khẩu trùng khớp thì đăng nhập
     * thành công và trả về tài khoản đó
     */
    public Account login() throws Exception {
        //user name
        String userAccount = getStringByRegex("Account: ", "Only words", "[A-Za-z]+");
        Account account = accountManager.getAccountByUserName(userAccount);
        if (account == null) {
            throw new Exception("This account is not existed, please create the new one");
        }
        accountManager.setAccount(account);

        //password 
        String password = Validation.getPassword("Password: ");
        String encryptedPass = Validation.MD5Encryption(password);
        if (accountManager.isTruePassword(encryptedPass)) {
            account = accountManager.getAccount();
            return account;
        }
        throw new Exception("Password is incorrect");
    }

    /**
     * Chương trình thay đổi mật khẩu.Kiểm tra xem mật khẩu cũ đúng chưa, nếu
     * đúng thì ghi nhận mật khẩu mới và cập nhật tài khoản đó trong danh sách
     */
    public void changePassword() throws Exception {
        String oldPassword = Validation.getPassword("Old Password: ");
        String encryptedPass = Validation.MD5Encryption(oldPassword);
        if (accountManager.checkPassMatchesAccount(encryptedPass)) {
            String newPass = Validation.getPassword("New Password: ");
            String rewritePass = Validation.getPassword("Re-new Password: ");
            Account account = accountManager.resetPassword(newPass, rewritePass);
            accountManager.updateAccount(account);
        } else {
            throw new Exception("Password is incorrect");
        }
    }
}
