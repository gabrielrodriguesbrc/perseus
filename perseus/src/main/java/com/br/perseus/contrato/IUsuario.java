/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.perseus.contrato;

import com.br.perseus.entidades.Categoria;
import com.br.perseus.entidades.Evento;
import com.br.perseus.entidades.Usuario;
import java.util.List;

/**
 *
 * @author gabriel-pc
 */
public interface IUsuario {

    public Usuario desativar(Usuario usuario) throws Exception;

    public List<Evento> eventosUsuario(Usuario usuario) throws Exception;

    public List<Categoria> buscarCategoriasUsuario(Usuario usuario) throws Exception;

    public Usuario salvar(Usuario entidade) throws Exception;

    public Usuario alterar(Usuario entidade, Integer id) throws Exception;

}
