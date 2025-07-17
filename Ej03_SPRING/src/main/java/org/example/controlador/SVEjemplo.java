package org.example.controlador;


import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/SVEjemplo")
public class SVEjemplo implements Servlet {

    public SVEjemplo() {
        System.out.println( "Creando SVEjemplo");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println( "Inicializando SVEjemplo");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SVEjemplo</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>¡Hola desde SVEjemplo!</h1>");
            out.println("<p>La hora del servidor es: " + new java.util.Date() + "</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }




    @Override
    public String getServletInfo() {
        return "";
    }

    @Override
    public void destroy() {
        System.out.println( "Destruyendo SVEjemplo");

    }
}
