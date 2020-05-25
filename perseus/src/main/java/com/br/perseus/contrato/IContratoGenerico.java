/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.perseus.contrato;

/**
 *
 * @author gabrielrodrigues
 */
public interface IContratoGenerico<T> {

    public T salvar(T entidade) throws Exception;

    public T alterar(T entidade, Integer id) throws Exception;

    public void excluir(T entidade, Integer id) throws Exception;

}
