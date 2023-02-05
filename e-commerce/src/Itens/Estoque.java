package Itens;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private static final List<Produto> listaDeProdutos = new ArrayList();

    public Estoque() {
    }

    public static void cadastrarProdutos(String nome, String categoria, String marca, Double preco){
        listaDeProdutos.add(new Produto(nome, categoria, marca, preco));
    }
    public static void listarProdutos(){
        listaDeProdutos.forEach(System.out::println);
    }
}
