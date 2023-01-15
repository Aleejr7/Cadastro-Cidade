package br.com.ada.cadastrocrud.controller.impl;

import br.com.ada.cadastrocrud.controller.CidadeController;
import br.com.ada.cadastrocrud.model.Cidade;

import java.util.*;

public class CidadeArmazenamentoVolatilController implements CidadeController {

    private Map<UUID, Cidade> cidades = new HashMap<>();

    @Override
    public void cadastrar(Cidade cidade) {
        cidade.setId(UUID.randomUUID());
        cidades.put(cidade.getId(), cidade);
    }
    @Override
    public List<Cidade> listar() {
        return new ArrayList<>(cidades.values());
    }
}
