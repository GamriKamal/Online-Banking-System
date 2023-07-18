package com.banksystem.onlinebankingsystem.Servlets;

import com.banksystem.onlinebankingsystem.Account.AccountController;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

@WebServlet(urlPatterns = "/accounts")
public class AccountServlet extends HttpServlet {
    @Autowired
    AccountController controller;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getParameter("myButton") != null) {
            request.setAttribute("list", controller.allAccounts());
            request.getRequestDispatcher("/WEB-INF/view/table.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}

