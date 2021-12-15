package request;

import java.io.Serializable;

public class RemoverPaisRequest implements Serializable {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "RemoverPaisRequest{" +
                "id=" + id +
                '}';
    }
}
