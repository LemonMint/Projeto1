package br.game.modelo;

public class Cliente {

    public static final boolean FEMININO = false;
    public static final boolean MASCULINO = true;

    private String nome;
    private String email;
    private int idade;
    private boolean sexo;
    private String cpf;
    private int CEP;
    private String telefone;
    private Integer codigo;

    
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public int getCEP() {
        return CEP;
    }

    public void setCEP(int CEP) {
        this.CEP = CEP;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return codigo + " - " + nome + "   CPF: " + cpf + "   E-Mail: " + email;
    }

    
}
