package ui.controller;

import domain.db.GerechtDB;
import domain.model.Gerecht;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
    private GerechtDB gerecht = new GerechtDB();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String naam = request.getParameter("naam");
        String soort = request.getParameter("soort");
        String aantal = request.getParameter("aantal");
        int aantalNaarInt = Integer.parseInt(aantal);
        if (naam.trim().isEmpty() || soort.trim().isEmpty() || aantalNaarInt < 0) {
            request.getRequestDispatcher("voegtoe.jsp").forward(request, response);
        } else {
            Gerecht g = new Gerecht(naam, soort, aantalNaarInt);
            gerecht.addGerecht(g);
            request.setAttribute("Gert", gerecht.getMenu());
            request.setAttribute("GerechtCaloriën", gerecht.meesteCaloriën());
            request.getRequestDispatcher("overzicht.jsp").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("Gert", gerecht.getMenu());
        request.setAttribute("GerechtCaloriën", gerecht.meesteCaloriën());
        request.getRequestDispatcher("overzicht.jsp").forward(request,response);
    }
}
