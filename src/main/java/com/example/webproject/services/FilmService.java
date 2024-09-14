package com.example.webproject.services;

import com.example.webproject.dao.FilmDAOImpl;
import com.example.webproject.models.Films;

import java.util.List;

public class FilmService {
    private FilmDAOImpl filmDAO = new FilmDAOImpl();
    public List<Films> getAllFilms () {
        return filmDAO.getAllFilms();
    }
}
