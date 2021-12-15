package repositorio;

import model.Pais;
import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.Modifying;
import org.apache.deltaspike.data.api.Query;
import org.apache.deltaspike.data.api.Repository;
import java.util.List;

@Repository(forEntity = Pais.class)
public abstract class PaisRepositorio extends AbstractEntityRepository<Pais, Integer> {

    @Modifying
    @Query("delete from Pais p where p.id=?1")
    public abstract void removeById(int id);

    public List<Pais> findAllOrderBy(String orderByElement, String orderByDirection){
        String query = "select p from Pais p order by ".concat("p."+ orderByElement + " ")
                .concat(orderByDirection);
        return typedQuery(query).getResultList();
    }
}
