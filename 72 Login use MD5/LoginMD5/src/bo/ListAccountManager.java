/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import entity.Account;
import java.util.ArrayList;

/**
 *
 * Quản lý danh sách các tài khoản có trong hệ thống Các tác vụ bao gồm: thêm
 * tài khoản vào danh sách, cập nhật tài khoản trong danh sách, trả về tài khoản
 * cần đăng nhập
 */
public class ListAccountManager {

    private final ArrayList<Account> listOfAccount;

    public ListAccountManager() {
        this.listOfAccount = new ArrayList<>();
    }

    public void addToList(Account account) {
        listOfAccount.add(account);
    }

    public Account getAccountByUserName(String userName) throws Exception { //trả về tài khoản có user name 
        for (Account account : listOfAccount) {
            if (account.getUserName().equalsIgnoreCase(userName)) {
                return account;
            }
        }
        throw new Exception("This account is not existed, please create the new one");
    }

    public void updateAccount(Account account) { //cập nhật lại tài khoản đã cập nhật mật khẩu 
        for (Account acc : listOfAccount) {
            if (account.getUserName().equalsIgnoreCase(acc.getUserName())) {
                acc.setPassword(account.getPassword());
            }
        }
    }

    public void checkWhenCreateAccount(Account account) throws Exception { //kiểm tra xem tk mới đã tồn tại trong danh sách hay không
        if (isUsernameAndEmailExisted(account)) { //nếu trùng tên người dùng và email 
            throw new Exception("User's name is already existed");
        } else if (isAccountExisted(account)) { //nếu tài khoản đã tồn tại 
            throw new Exception("This account is already existed");
        }
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

    public ArrayList<Account> getList() {
        return listOfAccount;
    }
}
