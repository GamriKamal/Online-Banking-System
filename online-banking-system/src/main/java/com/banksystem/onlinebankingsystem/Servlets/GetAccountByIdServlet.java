package com.banksystem.onlinebankingsystem.Servlets;

import com.banksystem.onlinebankingsystem.Account.Account;
import com.banksystem.onlinebankingsystem.Account.AccountController;
import com.banksystem.onlinebankingsystem.Account.AccountRepository;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

@WebServlet(urlPatterns = "/getAccountById")
public class GetAccountByIdServlet extends HttpServlet {
    @Autowired
    private AccountController accountController;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getParameter("button") != null){
            Account tempAccount = accountController.getAccounts(Integer.valueOf(request.getParameter("account_id")));
            request.setAttribute("account", tempAccount);
            request.getRequestDispatcher("WEB-INF/view/get-account-by-id.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
