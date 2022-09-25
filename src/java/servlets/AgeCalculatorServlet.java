/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author kurtm
 */
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String age = request.getParameter("age");
        String ageString = "";
        int nextAge = 0;
        request.setAttribute("age", age);
        
        if (age == null || age == "") {
            ageString = "You must give your current age";
            request.setAttribute("ageString", ageString);
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
            return;
        }
        
        try {
            nextAge = Integer.parseInt(age) + 1;
        } catch (NumberFormatException nfe) {
            ageString = "You must enter a number.";
            request.setAttribute("ageString", ageString);
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
            return;
        }
        ageString = "Your next age will be " + nextAge; 
        request.setAttribute("ageString", ageString);
        
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
    }
}
