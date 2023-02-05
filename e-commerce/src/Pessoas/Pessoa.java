package Pessoas;

import java.util.ArrayList;

import Itens.Estoque;

public class Pessoa {
    private String nome;
    private String senha;
    private String perfil; // pode ser "admin" ou "comum"
    protected ArrayList<Estoque> produtos;

    public Pessoa(){

    }

    public Pessoa(String nome, String senha, String perfil) {
        this.nome = nome;
        this.senha = senha;
        this.perfil = perfil;
    }
    public Pessoa(String nome, String senha, ArrayList<Estoque> produtos) {
        this.nome = nome;
        this.senha = senha;
        this.produtos = produtos;
    }

    // getters e setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getPerfil() {
        return perfil;
    }
    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
}

