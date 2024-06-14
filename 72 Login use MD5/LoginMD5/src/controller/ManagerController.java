/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import bo.Input;
import bo.AccountManager;
import bo.ListAccountManager;
import entity.Account;
import utils.Validation;
import static utils.Validation.getStringByRegex;

/**
 *
 * @author ADMIN
 */
public class ManagerController {

    private final AccountManager accountManager;
    private final ListAccountManager listManager;

    public ManagerController() {
        this.accountManager = new AccountManager();
        this.listManager = new ListAccountManager();
    }

    public void createAccount() throws Exception {
        Input input = new Input();
        Account account = input.getAccountInformation();
        listManager.checkWhenCreateAccount(account);
        listManager.addToList(account);
    }

    /**
     *
     * Chương trình đăng nhập.Nếu không có tài khoản nào trong danh sách thì
     * không thực hiện tiếp, yêu cầu phải đăng nhập.Nếu có, tìm tài khoản trong
     * danh sách bằng tên đăng nhập, kiểm tra mật khẩu trùng khớp thì đăng nhập
     * thành công và trả về tài khoản đó
     *
     * @throws Exception
     */
    public Account login() throws Exception {
        if (listManager.getList().isEmpty()) {
            throw new Exception("There is no account in this device, cannot be login");
        }
        String userAccount = getStringByRegex("Account: ", "Only words", "[A-Za-z]+");
        Account account = listManager.getAccountByUserName(userAccount);
        accountManager.setAccount(account);
        String encryptedPass = Validation.MD5Encryption(getStringByRegex("Password: ", "Not null or empty", "^[a-zA-Z0-9@#$%^&+=.]+$"));
        if (accountManager.isTruePassword(encryptedPass)) {
            account = accountManager.getAccount();
        }
        return account;
    }

    /**
     * Chương trình thay đổi mật khẩu.Kiểm tra xem mật khẩu cũ đúng chưa, nếu
     * đúng thì ghi nhận mật khẩu mới và cập nhật tài khoản đó trong danh sách
     *
     * @throws Exception
     */
    public void changePassword() throws Exception {
        String encryptedPass = Validation.MD5Encryption(getStringByRegex("Old password: ", "Not null", "^[a-zA-Z0-9@#$%^&+=.]+$"));
        if (accountManager.checkPassMatchesAccount(encryptedPass)) {
            String newPass = Validation.getStringByRegex("New password: ", "Not null or empty", "^[a-zA-Z0-9@#$%^&+=.]+$");
            String rewritePass = Validation.getStringByRegex("Re-new password: ", "Not null or empty", "^[a-zA-Z0-9@#$%^&+=.]+$");
            if (accountManager.resetPassword(newPass, rewritePass)) {
                listManager.updateAccount(accountManager.getAccount());
            }
        }
    }
}
