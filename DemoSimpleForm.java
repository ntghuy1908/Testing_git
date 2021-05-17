/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fu_demo_ex1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ADMIN
 */
@WebServlet(name = "DemoSimpleForm", urlPatterns = {"/DemoSimpleForm"})
public class DemoSimpleForm extends HttpServlet {

    
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out= response.getWriter();
        
        String fname= request.getParameter("firstname");
        String lname= request.getParameter("lastname");
        
        out.println("<h1> you have entered values: </h1>");
        out.println("First name: "+ fname + "<br>");
        out.println("Last Name: "+ lname +"<br>");
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out= response.getWriter();
        
        String name= request.getParameter("name");
        String email= request.getParameter("email");
        String pass= request.getParameter("pass");
        String bio= request.getParameter("bio");
        String[] age= request.getParameterValues("age");
        String[] role= request.getParameterValues("role");
        String[] interest= request.getParameterValues("interest");
        
        out.println("<h1> you have entered values (Using POST): </h1>");
        out.println("Name: "+ name + "<br>");
        out.println("Email: "+ email +"<br>");
        out.println("Password: "+ pass + "<br/>");
        out.println("Age: " + age + "<br/>");
        out.println("Biography: " + bio + "<br/>");
        out.println("Job role: " + role + "</br>");
        for (String string : interest) {
            out.println(string + " ");
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
