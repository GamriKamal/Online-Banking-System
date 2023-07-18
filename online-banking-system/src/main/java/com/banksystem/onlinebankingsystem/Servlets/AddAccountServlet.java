package com.banksystem.onlinebankingsystem.Servlets;

import com.banksystem.onlinebankingsystem.Account.Account;
import com.banksystem.onlinebankingsystem.Account.AccountController;
import com.banksystem.onlinebankingsystem.Account.AccountService;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletComponentScan;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@ServletComponentScan
@WebServlet(urlPatterns = "/addAccount")
public class AddAccountServlet extends HttpServlet {
    String RESET = "\033[0m";
    String YELLOW_BOLD_BRIGHT  = "\033[1;93m";
    @Autowired
    private AccountController service;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/view/add-new-account.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String vvv = request.getParameter("cvv");
        short cvv = Short.valueOf(vvv);
        Date period;
        try {
            period = new SimpleDateFormat("MM/yyyy").parse(request.getParameter("validityPeriod"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        if (request.getParameter("myButton1") != null) {
            Account tempAcc = new Account(request.getParameter("cardNumber"),
                    request.getParameter("firstName"),
                    request.getParameter("lastName"),
                    period,
                    request.getParameter("nameOfBank"),
                    cvv);

            if(tempAcc == null){
                Exception exception = new Exception("Not all lines were filled in!");
                request.setAttribute("ERROR", "System Error: " + exception.getMessage());
                request.getRequestDispatcher("/WEB-INF/view/add-new-account.jsp").forward(request, response);
            } else{
                service.addAccount(tempAcc);
                String success = "Action is completed!";
                request.setAttribute("message", success);
                request.getRequestDispatcher("/WEB-INF/view/add-new-account.jsp").forward(request, response);
            }
        } else {
            Exception exception = new Exception("Not all lines were filled in!");
            request.setAttribute("message", "System Error: " + exception.getMessage());
            request.getRequestDispatcher("/WEB-INF/view/add-new-account.jsp").forward(request, response);
        }
    }
}
