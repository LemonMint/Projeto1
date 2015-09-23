
package modelo;


public class Jogos {
    private String nomeJogo;
    private int preçoJogo;
    private String plataformaJogo;
    private String anoJogo;
    private String generoJogo;

    public Jogos() {
    }

    public Jogos(String nomeJogo, int preçoJogo, String plataformaJogo, String anoJogo, String generoJogo) {
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

    public int getPreçoJogo() {
        return preçoJogo;
    }

    public void setPreçoJogo(int preçoJogo) {
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
}
