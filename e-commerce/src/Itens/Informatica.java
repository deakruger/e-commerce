package Itens;

public class Informatica extends Produto {

    public Informatica(String nome, String categoria, String marca, Double preco) {
        super(nome, categoria, marca, preco);
    }
    public void cadastroProduto(String nome, String categoria, String marca, Double preco){
        listarProdutos.add(new Livro(nome, categoria, marca, preco));
    }
    public void listarProdutos(){
        for (int i = 0; i < listarProdutos.size(); i++){
           System.out.println(listarProdutos.get(i));
        }
    }
}
