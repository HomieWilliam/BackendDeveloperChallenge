package request;

import java.io.Serializable;

public class EditarPaisRequest implements Serializable {
    private int id;
    private String nome;
    private String capital;
    private String regiao;
    private String subregiao;
    private String area;

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
}
