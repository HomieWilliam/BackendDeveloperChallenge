package request;

import java.io.Serializable;

public class ListarPaisesRequest implements Serializable {
    private int limite;
    private int salto;
    private String ordenarPor;
    private String direcao; //asc or desc

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public int getSalto() {
        return salto;
    }

    public void setSalto(int salto) {
        this.salto = salto;
    }

    public String getOrdenarPor() {
        return ordenarPor;
    }

    public void setOrdenarPor(String ordenarPor) {
        this.ordenarPor = ordenarPor;
    }

    public String getDirecao() {
        return direcao;
    }

    public void setDirecao(String direcao) {
        this.direcao = direcao;
    }

    @Override
    public String toString() {
        return "ListarPaisesRequest{" +
                "limite=" + limite +
                ", salto=" + salto +
                ", ordenarPor='" + ordenarPor + '\'' +
                '}';
    }
}
