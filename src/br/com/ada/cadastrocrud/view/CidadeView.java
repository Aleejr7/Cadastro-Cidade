package br.com.ada.cadastrocrud.view;

import br.com.ada.cadastrocrud.controller.CidadeController;
import br.com.ada.cadastrocrud.controller.impl.CidadeArmazenamentoVolatilController;
import br.com.ada.cadastrocrud.model.Cidade;

import java.util.List;
import java.util.Scanner;

public class CidadeView {

    private CidadeController controller;
    private Scanner scanner;

    public CidadeView(CidadeController controller, Scanner scanner) {
        this.controller = controller;
        this.scanner = scanner;
    }

    public void cadastrar(){
        Cidade cidade = new Cidade();

        System.out.println("Informe o nome da cidade:");
        String nome = scanner.nextLine();
        cidade.setNome(nome);
        System.out.println("Informe o nome do estado que a cidade pertence:");
        String estado = scanner.nextLine();
        cidade.setSeuEstado(estado);

        controller.cadastrar(cidade);
    }
    public void listar(){
        List<Cidade> cidades = controller.listar();
        for(int i = 0; i < cidades.size(); i++){
            System.out.println((i+1) + " - Cidade: " + cidades.get(i).getNome() +
                                       " | Estado: " + cidades.get(i).getSeuEstado());
        }
    }
    public void menu(){
        System.out.println("########## MENU ##########");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Listar");
        System.out.println("3 - Sair");
        Integer opcao = scanner.nextInt();
        scanner.nextLine();
        switch (opcao) {
            case 1:
                cadastrar();
                break;
            case 2:
                listar();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Opção inválida.");
        }
        menu();
    }
}
