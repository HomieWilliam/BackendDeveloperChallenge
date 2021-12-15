package response;

import java.io.Serializable;

public class RemoverPaisResponse implements Serializable {
    private RespostaGenerica respostaGenerica;

    public RemoverPaisResponse(RespostaGenerica respostaGenerica) {
        this.respostaGenerica = respostaGenerica;
    }

    public RespostaGenerica getRespostaGenerica() {
        return respostaGenerica;
    }

    public void setRespostaGenerica(RespostaGenerica respostaGenerica) {
        this.respostaGenerica = respostaGenerica;
    }

    @Override
    public String toString() {
        return "RemoverPaisResponse{" +
                "respostaGenerica=" + respostaGenerica +
                '}';
    }
}
