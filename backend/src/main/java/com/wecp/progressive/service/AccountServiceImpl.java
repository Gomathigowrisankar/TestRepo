package com.wecp.progressive.service;


<<<<<<< HEAD
import com.wecp.progressive.dao.AccountDAO;
import com.wecp.progressive.entity.Accounts;

import java.sql.SQLException;
import java.util.List;

public class AccountServiceImpl implements AccountService {

    private AccountDAO accountDAO;

    public AccountServiceImpl(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }
    @Override
    public List<Accounts> getAllAccounts() throws SQLException {
        return null;
    }

    @Override
    public Accounts getAccountById(int accountId) throws SQLException {
        return null;
    }

    @Override
    public int addAccount(Accounts accounts) throws SQLException {
        return -1;
    }

    @Override
    public void updateAccount(Accounts accounts) throws SQLException {

    }

    @Override
    public void deleteAccount(int accountId) throws SQLException {

    }

    @Override
    public List<Accounts> getAllAccountsSortedByBalance() throws SQLException {
        return null;
    }


    @Override
    public List<Accounts> getAccountsByUser(int userId) throws SQLException{
        return null;
    }

    @Override
    public List<Accounts> getAllAccountsSortedByBalanceFromArrayList() {
        return null;
    }

    @Override
    public void emptyArrayList() {

    }

    @Override
    public List<Accounts> getAllAccountsFromArrayList() {
        return null;
    }
    @Override
    public List<Accounts> addAccountToArrayList(Accounts accounts) {
        return null;
    }
=======

public class AccountServiceImpl  {

>>>>>>> a21dcac851fe5e4560c4b92396de391a156b1a2d
}