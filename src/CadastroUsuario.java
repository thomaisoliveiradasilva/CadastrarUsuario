public class CadastroUsuario {
    // os tributos são variaveis que podem sofre modificaçoes no programa, são as caracteristicas de um objeto.
    // atributos do usuário
    private String nome;
    private int idade;
    private String telefone;
    private String endereco;
    private String login;
    private String senha;

    // metodos de acesso  e modificação (getters and setters)
    // com ele podemos ter aceso e modificar as variaveis e inicialas com agente quiser,da mais trabalho mas é muito mais seguro.

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public String getTelefone(){
        return telefone;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public String getLogin(){
        return login;
    }
    public void setLogin(String login){
        this.login = login;
    }
    public String getSenha(){
        return senha;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }


}
