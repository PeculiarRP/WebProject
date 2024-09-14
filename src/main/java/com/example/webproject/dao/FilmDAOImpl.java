package com.example.webproject.dao;

import com.example.webproject.models.Films;
import com.example.webproject.utils.HibernateSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.IOException;
import java.util.List;
import java.util.UUID;
import java.nio.file.Files;
import java.io.File;

public class FilmDAOImpl implements FilmDAO{
    @Override
    public List<Films> getAllFilms() {
        return (List<Films>) HibernateSessionFactoryUtil
                .getSessionFactory()
                .openSession()
                .createQuery("from Films ").list();
    }

    @Override
    public void postFilms(Films film) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(film);
        transaction.commit();
        session.close();
    }
}
