package com.banksystem.onlinebankingsystem.Servlets;

import com.banksystem.onlinebankingsystem.Account.Account;
import com.banksystem.onlinebankingsystem.Account.AccountController;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

@WebServlet(urlPatterns = "/deleteAccountById")
public class DeleteAccountByIdServlet extends HttpServlet {
    @Autowired
    private AccountController accountController;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String task = "Complete!";
        if (request.getParameter("buttonDel") != null){
            accountController.deleteAccountById(Integer.valueOf(request.getParameter("acc_id")));
            request.setAttribute("task", task);
            request.getRequestDispatcher("/WEB-INF/view/main-menu.jsp").forward(request, response);
        }
    }

    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

}
