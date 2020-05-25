/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.perseus.dao;

import com.br.perseus.contrato.IContratoGenerico;
import com.br.perseus.contrato.IUsuario;
import com.br.perseus.entidades.Categoria;
import com.br.perseus.entidades.Evento;
import com.br.perseus.entidades.Usuario;
import com.br.perseus.tipos.EnumSimNao;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author gabrielrodrigues
 */
public class DaoUsuario extends DaoGenerico<Usuario> implements IUsuario, IContratoGenerico<Usuario> {

    public DaoUsuario() {
    }

    @Override
    public Usuario desativar(Usuario entidade) throws Exception {
        Usuario us = entidade;
        EntityManager session = getSession();
        try {
            
            session.getTransaction().begin();
            us.setAtivo(EnumSimNao.N);
            session.persist(us);
            session.getTransaction().commit();
        } catch (Exception e) {
            rollback();
        } finally {
            session.close(); 
        }

        return us;
    }

    @Override
    public List<Evento> eventosUsuario(Usuario usuario) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Categoria> buscarCategoriasUsuario(Usuario usuario) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
