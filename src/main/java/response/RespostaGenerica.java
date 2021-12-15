package response;

import java.io.Serializable;

public class RespostaGenerica implements Serializable {
    private boolean sucesso;
    private String detalhes;

    public RespostaGenerica(boolean sucesso, String detalhes) {
        this.sucesso = sucesso;
        this.detalhes = detalhes;
    }

    public boolean isSucesso() {
        return sucesso;
    }

    public void setSucesso(boolean sucesso) {
        this.sucesso = sucesso;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }

    @Override
    public String toString() {
        return "RespostaGenerica{" +
                "sucesso=" + sucesso +
                ", detalhes='" + detalhes + '\'' +
                '}';
    }
}
