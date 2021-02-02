package com.thangnguyen.controller;

import com.thangnguyen.model.Customer;
import com.thangnguyen.service.CustomerService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddCustomerControllerServlet", urlPatterns = "/addCustomer")
public class AddCustomerControllerServlet extends HttpServlet {
    
    CustomerService customerService = new CustomerService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String address = request.getParameter("address");

        Customer cus = new Customer(0,name,email,address);
        customerService.save(cus);

        RequestDispatcher dispatcher = request.getRequestDispatcher("add-customer.jsp");
        Customer customer = new Customer();
        request.setAttribute("customer", customer);
        request.setAttribute("message","Tao moi thanh cong");
        dispatcher.forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("add-customer.jsp");
        Customer cus = new Customer();
        request.setAttribute("customer",cus);
        dispatcher.forward(request,response);
    }
}
