package modelo;

public class Usuario {

    public static final boolean FEMININO = false;
    public static final boolean MASCULINO = true;

    private String nome;
    private String email;
    private String senha;
    private String login;
    private int idade;
    private boolean sexo;
    private int nivel; //Nivel de acesso, normal 0 ou adm 99
    private final Carteira carteira = new Carteira();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Carteira getCarteira() {
        return carteira;
    }

}
