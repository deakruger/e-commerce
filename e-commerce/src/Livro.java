package Itens;

public class Livro extends Produto {

    public Livro(){

    }

    public Livro(String nome, String categoria, String marca, Double preco) {
        super(nome, categoria, marca, preco);
    }
    
    public void cadastroLivro(String nome, String categoria, String marca, Double preco){
        listarProdutos.add(new Livro(nome, categoria, marca, preco));
    }
    public void listaLivro(){
        for (int i = 0; i < listarProdutos.size(); i++){
           System.out.println(listarProdutos.get(i));
        }
    }

    
}
