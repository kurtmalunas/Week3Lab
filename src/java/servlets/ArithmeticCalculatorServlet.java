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
public class ArithmeticCalculatorServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String result = "---";
        request.setAttribute("result", result);
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstNumber = request.getParameter("first");
        String secondNumber = request.getParameter("second");
        String operation = request.getParameter("operation");
        String result = "";
        
        request.setAttribute("firstNumber", firstNumber);
        request.setAttribute("secondNumber", secondNumber);
        request.setAttribute("operation", operation);
        
        if(firstNumber == null || firstNumber == "" || secondNumber == null || secondNumber == "") {
            result = "Invalid";
            request.setAttribute("result", result);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
        }
        
        try {
            int intFirstNumber = Integer.parseInt(firstNumber);
            int intSecondNumber = Integer.parseInt(secondNumber);
            double doubleFirstNumber = Double.parseDouble(firstNumber);
            double doubleSecondNumber = Double.parseDouble(secondNumber);
        } catch (NumberFormatException nfe) {
            result = "Invalid";
            request.setAttribute("result", result);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
            return;
        }
        
        if (operation.equalsIgnoreCase("+")) {
            result = (int)(Double.parseDouble(firstNumber) + Double.parseDouble(secondNumber)) + "";
            request.setAttribute("result", result);
        }
        
        if (operation.equalsIgnoreCase("-")) {
            result = (int) (Double.parseDouble(firstNumber) - Double.parseDouble(secondNumber)) + "";
            request.setAttribute("result", result);
        }
        
        if (operation.equalsIgnoreCase("*")) {
            result = (int) (Double.parseDouble(firstNumber) * Double.parseDouble(secondNumber)) + "";
            request.setAttribute("result", result);
        }
        
        if (operation.equalsIgnoreCase("%")) {
            result = (int) (Double.parseDouble(firstNumber) % Double.parseDouble(secondNumber)) + "";
            request.setAttribute("result", result);
        }
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
    }
}
