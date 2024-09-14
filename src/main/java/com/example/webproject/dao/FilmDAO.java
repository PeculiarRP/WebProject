package com.example.webproject.dao;

import com.example.webproject.models.Films;

import java.io.IOException;
import java.util.List;

public interface FilmDAO {
    public List<Films> getAllFilms();
    public void postFilms(Films film);
}
