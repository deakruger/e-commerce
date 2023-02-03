package Itens;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Produto implements Comparable<Produto>{
    protected String nome;
    protected String categoria;
    protected String marca;
    protected Double preco;
    protected List<Produto> listarProdutos = new ArrayList<>();

    public Produto(){

    }
    
    public Produto(String nome, String categoria, String marca, Double preco) {
        setNome(nome);
        setCategoria(categoria);
        setMarca(marca);
        setPreco(preco);
    }

    public void cadastroProdutos(String nome, String categoria, String marca, Double preco){
        listarProdutos.add(new Produto(nome, categoria, marca, preco));
    }
    
    @Override
    public int compareTo(Produto outroProduto) {
        if(this.preco > outroProduto.getPreco()){
            return -1;
        }
        if(this.preco < outroProduto.getPreco()){
            return +1;
        }
        else{
        return 0;
        }
    }

    public void ordenarProdutos(){
        Collections.sort(listarProdutos);
    }
    

    public void listarProdutos(){
        for (int i = 0; i < listarProdutos.size(); i++){
           System.out.println(listarProdutos.get(i));
        }
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCategoria(String categoria){
        this.categoria = categoria;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setPreco(Double preco){
        this.preco = preco;
    }

    public String getNome(){
        return nome;
    }

    public String getCategoria(){
        return categoria;
    }

    public String getMarca(){
        return marca;
    }
    public Double getPreco(){
        return preco;
    }

    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", categoria=" + categoria + ", marca=" + marca + ", preco=" + preco + "]";
    }
}