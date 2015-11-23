package br.game.modelo;

public class Jogo {

    private String nomeJogo;
    private double precoJogo;
    private String plataformaJogo;
    private String generoJogo;
    private int codigoJogo;
    private String descricao;
    private double precoVenda;
    private String produtora;

    public String getProdutora() {
        return produtora;
    }

    public void setProdutora(String produtora) {
        this.produtora = produtora;
    }

    public Jogo() {
    }

    public Jogo(String nomeJogo, double precoJogo, String plataformaJogo, String generoJogo, int codigoJogo, String descricao) {
        this.nomeJogo = nomeJogo;
        this.precoJogo = precoJogo;
        this.plataformaJogo = plataformaJogo;
        this.generoJogo = generoJogo;
        this.codigoJogo = codigoJogo;
        this.descricao = descricao;
    }

    public String getNomeJogo() {
        return nomeJogo;
    }

    public void setNomeJogo(String nomeJogo) {
        this.nomeJogo = nomeJogo;
    }

    public double getPrecoJogo() {
        return precoJogo;
    }

    public void setPrecoJogo(double precoJogo) {
        this.precoJogo = precoJogo;
    }

    public String getPlataformaJogo() {
        return plataformaJogo;
    }

    public void setPlataformaJogo(String plataformaJogo) {
        this.plataformaJogo = plataformaJogo;
    }

    public String getGeneroJogo() {
        return generoJogo;
    }

    public void setGeneroJogo(String generoJogo) {
        this.generoJogo = generoJogo;
    }

    public int getCodigoJogo() {
        return codigoJogo;
    }

    public void setCodigoJogo(int codigoJogo) {
        this.codigoJogo = codigoJogo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }
    
    
}
