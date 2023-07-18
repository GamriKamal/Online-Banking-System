package com.banksystem.onlinebankingsystem.Account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.util.ReflectionUtils;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class AccountService {
    public static final String RESET = "\033[0m";
    public static final String PURPLE_BOLD_BRIGHT = "\033[1;95m";
    @Autowired
    private AccountRepository repo;

    public List<Account> allAccounts(){
        return repo.findAll();
    }
    public Account getAccountById(int id){
        Optional<Account> tempAccount = repo.findById(id);

        if(tempAccount.isEmpty()) {
            throw new RuntimeException("Player with id {" + id + "} not found");
        }
        return repo.findById(id).get();
    }

    public Account addAccount(Account account){
        System.out.println(PURPLE_BOLD_BRIGHT + account.toString() + RESET);
        return repo.save(account);
    }

    public Account updateAccount(int id, Account account) {
        Optional<Account> tempAccount = repo.findById(id);

        if(tempAccount.isEmpty()) {
            throw new RuntimeException("Player with id {" + id + "} not found");
        }
        account.setAccountId(id);
        return repo.save(account);
    }

    public void deleteAccountById(int id){
        Optional<Account> tempAccount = repo.findById(id);

        if(tempAccount.isEmpty()) {
            throw new RuntimeException("Player with id {" + id + "} not found");
        }
        repo.deleteById(id);
    }

}
