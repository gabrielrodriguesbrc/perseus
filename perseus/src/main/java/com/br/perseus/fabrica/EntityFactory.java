/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.perseus.fabrica;

import java.io.File;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author gabriel-pc
 * @param <T>
 */
public class EntityFactory<T> {

    private static final ThreadLocal session = new ThreadLocal();
    private static final SessionFactory sessionFactory = new Configuration().configure(new File("hibernate.cfg.xml")).buildSessionFactory();

    protected EntityFactory() {
    }

    public static Session getSession() {
        Session session = (Session) EntityFactory.session.get();

        if (session == null) {
            session = sessionFactory.openSession();
            EntityFactory.session.set(session);
        }

        return session;
    }

    protected void begin() {
        getSession().beginTransaction();
    }

    protected void commit() {
        getSession().getTransaction().commit();
    }

    protected void rollback() {
        try {
            getSession().getTransaction().rollback();
        } catch (HibernateException e) {
            System.out.println("Não foi possível fazer rollback da transação");
        }

        try {
            getSession().close();
        } catch (HibernateException e) {
            System.out.println("Não foi possível fazer fechar a sessão");
        }

        EntityFactory.session.set(null);
    }

    public static void close() {
        getSession().close();
        EntityFactory.session.set(null);
    }

}
