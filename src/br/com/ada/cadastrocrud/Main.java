package br.com.ada.cadastrocrud;

import br.com.ada.cadastrocrud.controller.CidadeArmazenamentoTipo;
import br.com.ada.cadastrocrud.controller.CidadeControllerFactory;
import br.com.ada.cadastrocrud.controller.impl.CidadeArmazenamentoVolatilController;
import br.com.ada.cadastrocrud.view.CidadeView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String tipoArmazenamento = args[0];
        CidadeArmazenamentoTipo tipo = CidadeArmazenamentoTipo.valueOf(tipoArmazenamento);

        CidadeControllerFactory factory = new CidadeControllerFactory();

        CidadeView view = new CidadeView(
                factory.criar(tipo),
                new Scanner(System.in)
        );
        view.menu();
    }
}