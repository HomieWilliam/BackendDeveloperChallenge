package response;

import model.Pais;

public class AdicionarPaisResponse {
    private int id;
    private String nome;
    private String capital;
    private String regiao;
    private String subregiao;
    private String area;
    private RespostaGenerica respostaGenerica;

    public AdicionarPaisResponse(Pais pais, RespostaGenerica respostaGenerica) {
        this.id = pais.getId();
        this.nome = pais.getNome();
        this.capital = pais.getCapital();
        this.regiao = pais.getRegiao();
        this.subregiao = pais.getSubregiao();
        this.area = pais.getArea();
        this.respostaGenerica = respostaGenerica;
    }

    public AdicionarPaisResponse(RespostaGenerica respostaGenerica) {
        this.respostaGenerica = respostaGenerica;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String getSubregiao() {
        return subregiao;
    }

    public void setSubregiao(String subregiao) {
        this.subregiao = subregiao;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "AdicionarPaisResponse{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", capital='" + capital + '\'' +
                ", regiao='" + regiao + '\'' +
                ", subregiao='" + subregiao + '\'' +
                ", area='" + area + '\'' +
                ", respostaGenerica=" + respostaGenerica +
                '}';
    }
}
