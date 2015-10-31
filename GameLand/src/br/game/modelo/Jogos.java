
package br.game.modelo;


public class Jogos {
    private String nomeJogo;
    private double precoJogo;
    private String plataformaJogo;
    private String anoJogo;
    private String generoJogo;
    private double porcentagem;
    private int codigoJogo;

    public int getCodigoJogo() {
        return codigoJogo;
    }

    public void setCodigoJogo(int codigoJogo) {
        this.codigoJogo = codigoJogo;
    }
    public Jogos() {
    }

    public Jogos(String nomeJogo, double preçoJogo, String plataformaJogo, String anoJogo, String generoJogo) {
        this.nomeJogo = nomeJogo;
        this.precoJogo = precoJogo;
        this.plataformaJogo = plataformaJogo;
        this.anoJogo = anoJogo;
        this.generoJogo = generoJogo;
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

    public void setPrecoJogo(double preçoJogo) {
        this.precoJogo = preçoJogo;
    }

    public String getPlataformaJogo() {
        return plataformaJogo;
    }

    public void setPlataformaJogo(String plataformaJogo) {
        this.plataformaJogo = plataformaJogo;
    }

    public String getAnoJogo() {
        return anoJogo;
    }

    public void setAnoJogo(String anoJogo) {
        this.anoJogo = anoJogo;
    }

    public String getGeneroJogo() {
        return generoJogo;
    }

    public void setGeneroJogo(String generoJogo) {
        this.generoJogo = generoJogo;
    }

    public double getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(double porcentagem) {
        this.porcentagem = porcentagem;
    }
}
