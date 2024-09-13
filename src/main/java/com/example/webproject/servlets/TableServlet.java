package com.example.webproject.servlets;

import com.example.webproject.models.Person;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@WebServlet(name = "tableServlet", value = "/table-servlet")
public class TableServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        List<Person> people = new ArrayList<>();
        people.add(new Person(UUID.randomUUID(),
                "Ivan",
                "Per",
                22,
                "IT",
                "H"));
        req.setAttribute("people", people);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("view/table.jsp");
        requestDispatcher.forward(req, res);
    }

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{

    }
}
