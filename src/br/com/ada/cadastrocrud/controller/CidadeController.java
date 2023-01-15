package br.com.ada.cadastrocrud.controller;

import br.com.ada.cadastrocrud.model.Cidade;

import java.util.List;

public interface CidadeController {

    void cadastrar(Cidade cidade);

    List<Cidade> listar();
}
