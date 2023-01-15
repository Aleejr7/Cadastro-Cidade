package br.com.ada.cadastrocrud.controller;

import br.com.ada.cadastrocrud.controller.impl.CidadeArmazenamentoVolatilController;

public class CidadeControllerFactory {

    public CidadeController criar(CidadeArmazenamentoTipo tipo){
        if (tipo == CidadeArmazenamentoTipo.VOLATIL){
            return new CidadeArmazenamentoVolatilController();
        }else{
            throw new RuntimeException("Nenhuma implementação disponível.");
        }
    }
}
