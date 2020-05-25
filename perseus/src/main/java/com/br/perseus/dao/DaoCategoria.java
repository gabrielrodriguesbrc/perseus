/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.perseus.dao;

import com.br.perseus.contrato.ICategoria;
import com.br.perseus.entidades.Categoria;
import com.br.perseus.entidades.Usuario;

/**
 *
 * @author gabrielrodrigues
 */
public class DaoCategoria extends DaoGenerico<Categoria> implements ICategoria{

    @Override
    public Categoria vincularUsuario(Categoria categoria, Usuario usuario) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  }


