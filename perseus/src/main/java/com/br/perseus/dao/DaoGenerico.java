/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.perseus.dao;

import com.br.perseus.fabrica.EntityFactory;
import javax.persistence.EntityManager;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author gabriel-pc
 * @param <T>
 */
public class DaoGenerico<T> extends EntityFactory {

    public T salvar(T entidade) {
        Session session = getSession();
        try {
            session.getTransaction().begin();
            session.persist(entidade);
            session.flush();
            session.getTransaction().commit();
        } catch (Exception e) {
            rollback();
            System.out.println(e.getMessage());
        } finally {
            close();
        }
        return entidade;
    }

    public T alterar(T entidade, Integer id) throws Exception {
        Session session = getSession();
        try {
            T ent = (T) session.find(entidade.getClass(), id);
            if (ent == null) {
                throw new Exception("Entidade não encontrada no banco");
            }
            session.beginTransaction();
            session.update(entidade);
            session.flush();
            session.getTransaction().commit();
        } catch (HibernateException e) {
            rollback();
        } finally {
            close();
        }
        return entidade;
    }

    public void excluir(T entidade, Integer id) throws Exception {
        Session session = getSession();

        session.beginTransaction();
        try {
            T ent = (T) session.find(entidade.getClass(), id);
            if (ent == null) {
                throw new Exception("Entidade não encontrada no banco");
            }
            session.delete(entidade);
            session.flush();
            session.getTransaction().commit();
        } catch (HibernateException e) {
            session.getTransaction().rollback();
            throw e;
        } finally {
            close();
        }
    }
}
