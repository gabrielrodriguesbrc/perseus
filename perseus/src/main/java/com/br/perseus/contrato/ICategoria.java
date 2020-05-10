/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.perseus.contrato;

import com.br.perseus.entidades.Categoria;
import com.br.perseus.entidades.Usuario;

/**
 *
 * @author gabriel-pc
 */
public interface ICategoria {

    public Categoria salvar(Categoria entidade) throws Exception;

    public Categoria alterar(Categoria entidade, Integer id) throws Exception;

    public void excluir(Categoria entidade, Integer id) throws Exception;

    public Categoria vincularUsuario(Categoria categoria, Usuario usuario) throws Exception;

}
