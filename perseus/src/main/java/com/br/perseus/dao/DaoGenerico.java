/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.perseus.dao;

import com.br.perseus.fabrica.EntityFactory;
import org.hibernate.HibernateException;

/**
 *
 * @author gabriel-pc
 * @param <T>
 */
public class DaoGenerico<T> extends EntityFactory {

    public T salvar(T entidade) {
        begin();
        try {
            getSession().persist(entidade);
            getSession().flush();
            getSession().getTransaction().commit();
        } catch (HibernateException e) {
            rollback();
            System.out.println(e.getMessage());
        } finally {
            close();
        }
        return entidade;
    }

    public T alterar(T entidade, Integer id) throws Exception {

        begin();
        try {
            getSession().merge(entidade);
            getSession().flush();
            getSession().getTransaction().commit();
        } catch (HibernateException e) {
            rollback();
        } finally {
            close();
        }
        return entidade;
    }

    public void excluir(T entidade, Integer id) throws Exception {

        begin();
        try {
            getSession().remove(entidade);
            getSession().flush();
            getSession().getTransaction().commit();
        } catch (HibernateException e) {
            rollback();
            throw e;
        } finally {
            close();
        }
    }
}
