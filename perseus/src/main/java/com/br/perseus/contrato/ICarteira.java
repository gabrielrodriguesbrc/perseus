/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.perseus.contrato;

import com.br.perseus.entidades.Carteira;
import com.br.perseus.entidades.HistoricoTransacao;
import com.br.perseus.entidades.Usuario;
import java.util.Date;

/**
 *
 * @author gabrielrodrigues
 */
public interface ICarteira {

    public Carteira adicionarCartao(Usuario usuario) throws Exception;

    public Carteira alteraSaldo(Carteira carteira, Double saldo) throws Exception;

    public HistoricoTransacao buscaHistorico(Date dataInicial, Date dataFinal) throws Exception;

}
