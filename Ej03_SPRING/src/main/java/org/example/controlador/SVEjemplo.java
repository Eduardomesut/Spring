package org.example.controlador;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

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
        System.out.println("Petición recibida en SVEjemplo");
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
