/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.perseus.dao;

import com.br.perseus.contrato.ICarteira;
import com.br.perseus.entidades.Carteira;
import com.br.perseus.entidades.HistoricoTransacao;
import com.br.perseus.entidades.Usuario;
import java.util.Date;

/**
 *
 * @author gabrielrodrigues
 */
public class DaoCarteira implements ICarteira {

    @Override
    public Carteira adicionarCartao(Usuario usuario) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Carteira alteraSaldo(Carteira carteira, Double saldo) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HistoricoTransacao buscaHistorico(Date dataInicial, Date dataFinal) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
