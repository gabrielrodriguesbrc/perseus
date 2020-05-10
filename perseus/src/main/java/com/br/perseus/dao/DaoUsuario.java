/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.perseus.dao;

import com.br.perseus.contrato.IUsuario;
import com.br.perseus.entidades.Usuario;
import com.br.perseus.tipos.EnumSimNao;
import javax.persistence.EntityManager;
import org.hibernate.Session;

/**
 *
 * @author gabriel-pc
 */
public class DaoUsuario extends DaoGenerico<Usuario> implements IUsuario {

    public DaoUsuario() {
    }

    @Override
    public Usuario desativar(Usuario entidade) throws Exception {
        Usuario us = entidade;
        Session session = getSession();
        try {
            
            session.getTransaction().begin();
            us.setAtivo(EnumSimNao.N);
            session.persist(us);
            session.getTransaction().commit();
        } catch (Exception e) {
            rollback();
        } finally {
            close();
        }

        return us;
    }


}
