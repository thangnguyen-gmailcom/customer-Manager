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

@WebServlet(name = "EditCustomerControllerServlet", urlPatterns = "/editCustomer")
public class EditCustomerControllerServlet extends HttpServlet {
    CustomerService customerService = new CustomerService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String address = request.getParameter("address");

        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer = new Customer(id,name,email,address);
        customerService.update(customer);

        RequestDispatcher dispatcher = request.getRequestDispatcher("edit-customer.jsp");
        request.setAttribute("customer",customer);
        request.setAttribute("message","Thay doi thanh cong");
        dispatcher.forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Customer cus = customerService.findById(id);

        RequestDispatcher dispatcher = request.getRequestDispatcher("edit-customer.jsp");

        request.setAttribute("customer",cus);

        dispatcher.forward(request,response);
    }
}
