package com.banksystem.onlinebankingsystem.Account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    AccountService service;

    @GetMapping
    public List<Account> allAccounts() {
        return service.allAccounts();
    }

    @GetMapping("/{id}")
    public Account getAccounts(@PathVariable int id){
        return service.getAccountById(id);
    }

    @PostMapping
    public Account addAccount(@RequestBody Account account) {
        System.out.println(account.toString());
        return service.addAccount(account);
    }

    @PutMapping("/{id}")
    public Account updatePlayer(@PathVariable int id, @RequestBody Account account) {
        return service.updateAccount(id, account);
    }

    @DeleteMapping("/{id}")
    public void deleteAccountById(@PathVariable int id){
        service.deleteAccountById(id);
    }

}
