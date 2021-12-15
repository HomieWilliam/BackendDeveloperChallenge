package request;

import java.io.Serializable;

public class AdicionarPaisRequest implements Serializable {
    private String nome;
    private String capital;
    private String regiao;
    private String subregiao;
    private String area;

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
        return "AdicionarPaisRequest{" +
                "nome='" + nome + '\'' +
                ", capital='" + capital + '\'' +
                ", regiao='" + regiao + '\'' +
                ", subregiao='" + subregiao + '\'' +
                ", area='" + area + '\'' +
                '}';
    }
}
