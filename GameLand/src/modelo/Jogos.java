
package modelo;


public class Jogos {
    private String nomeJogo;
    private double preçoJogo;
    private String plataformaJogo;
    private String anoJogo;
    private String generoJogo;
    private double porcentagem;

    public Jogos() {
    }

    public Jogos(String nomeJogo, double preçoJogo, String plataformaJogo, String anoJogo, String generoJogo) {
        this.nomeJogo = nomeJogo;
        this.preçoJogo = preçoJogo;
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

    public double getPreçoJogo() {
        return preçoJogo;
    }

    public void setPreçoJogo(double preçoJogo) {
        this.preçoJogo = preçoJogo;
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
