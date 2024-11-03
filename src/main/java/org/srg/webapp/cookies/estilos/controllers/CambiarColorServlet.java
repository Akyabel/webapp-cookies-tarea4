package org.srg.webapp.cookies.estilos.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Optional;

@WebServlet("webapp-cookies-tarea4/cambiar-color")
public class CambiarColorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String colorValue = req.getParameter("color");
        Cookie color = new Cookie("color", colorValue);

        resp.addCookie(color);
        resp.sendRedirect("/index.jsp");
    }
}
