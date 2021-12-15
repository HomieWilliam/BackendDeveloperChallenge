package response;

import model.Pais;

import java.io.Serializable;
import java.util.List;

public class ListarPaisesResponse implements Serializable {
    private List<Pais> paisList;
    private RespostaGenerica respostaGenerica;

    public ListarPaisesResponse(RespostaGenerica respostaGenerica) {
        this.respostaGenerica = respostaGenerica;
    }

    public ListarPaisesResponse(List<Pais> paisList, RespostaGenerica respostaGenerica) {
        this.paisList = paisList;
        this.respostaGenerica = respostaGenerica;
    }

    public RespostaGenerica getRespostaGenerica() {
        return respostaGenerica;
    }

    public void setRespostaGenerica(RespostaGenerica respostaGenerica) {
        this.respostaGenerica = respostaGenerica;
    }

    public List<Pais> getPaisList() {
        return paisList;
    }
    public void setPaisList(List<Pais> paisList) {
        this.paisList = paisList;
    }

    @Override
    public String toString() {
        return "ListarPaisesResponse{" +
                "paisList=" + paisList +
                ", respostaGenerica=" + respostaGenerica +
                '}';
    }
}
