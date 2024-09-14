package com.example.webproject.servlets;

import com.example.webproject.models.Films;
import com.example.webproject.services.FilmService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@WebServlet(name = "films-servlet", value = "/films-servlet")
public class FilmServlet extends HttpServlet {
    private final FilmService filmsService = new FilmService();
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        List<Films> films = filmsService.getAllFilms();

        req.setAttribute("films", films);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("view/film-cards.jsp");
        requestDispatcher.forward(req, res);
    }
    public void doPost(HttpServletRequest req, HttpServletResponse res){

    }
}
