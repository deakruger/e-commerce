package Pessoas;

public class UsuarioComum extends Pessoa {
    protected String cpf;
    
    
    public UsuarioComum(String nome, String senha, String perfil) {
        super(nome, senha, perfil);
    }


 // métodos específicos para usuários comuns aqui
    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
   
}
