package servico.spec;

import request.AdicionarPaisRequest;
import request.EditarPaisRequest;
import request.ListarPaisesRequest;
import request.RemoverPaisRequest;
import response.AdicionarPaisResponse;
import response.EditarPaisResponse;
import response.ListarPaisesResponse;
import response.RemoverPaisResponse;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/pais")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface PaisSpec {

    @POST
    @Path("/adicionar")
    AdicionarPaisResponse adicionarPais(AdicionarPaisRequest request);

    @POST
    @Path("/listar")
    ListarPaisesResponse listarPaises(ListarPaisesRequest request);

    @POST
    @Path("/editar")
    EditarPaisResponse editaPais(EditarPaisRequest request);

    @POST
    @Path("/remover")
    RemoverPaisResponse removerPais(RemoverPaisRequest request);
}
