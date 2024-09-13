package com.example.webproject.servlets;

import com.example.webproject.models.Films;
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

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        List<Films> films = new ArrayList<>();
        films.add(new Films(UUID.randomUUID(),
                "Хрюк",
                "Очень интересно"));
        films.add(new Films(UUID.randomUUID(),
                "Хрюк2",
                "Очень интересно @"));
        req.setAttribute("films", films);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("view/film-cards.jsp");
        requestDispatcher.forward(req, res);
    }
    public void doPost(HttpServletRequest req, HttpServletResponse res){

    }
}
