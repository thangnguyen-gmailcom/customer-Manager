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
import java.util.List;

@WebServlet(name = "ListCustomerController",urlPatterns = "/")
public class ListCustomerController extends HttpServlet {
    CustomerService customerService = new CustomerService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> list = customerService.findAll();
        request.setAttribute("customers", list);
        RequestDispatcher dispatcher = request.getRequestDispatcher("list-customer.jsp");
        dispatcher.forward(request,response);
    }
}
