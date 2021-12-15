package servico.impl;

import model.Pais;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import repositorio.PaisRepositorio;
import request.AdicionarPaisRequest;
import request.EditarPaisRequest;
import request.ListarPaisesRequest;
import request.RemoverPaisRequest;
import response.*;
import servico.spec.PaisSpec;
import javax.inject.Inject;
import javax.persistence.NoResultException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class PaisImpl implements PaisSpec {
    private Logger LOG = LoggerFactory.getLogger(PaisImpl.class);

    @Inject
    private PaisRepositorio paisRepositorio;

    @Override
    public AdicionarPaisResponse adicionarPais(AdicionarPaisRequest request) {
        AdicionarPaisResponse response;
        LOG.info("Request: " + request.toString());
        try {
            Pais pais = new Pais();

            pais.setArea(request.getArea());
            pais.setCapital(request.getCapital());
            pais.setNome(request.getNome());
            pais.setRegiao(request.getRegiao());
            pais.setSubregiao(request.getSubregiao());

            Pais resultado = paisRepositorio.save(pais);
            response = new AdicionarPaisResponse(resultado, new RespostaGenerica(true,"200"));
            LOG.info("Response: "+ response.toString());
        }
        catch (Exception exception){
            response = new AdicionarPaisResponse(new RespostaGenerica(false, exception.getMessage()));
            LOG.error("Exception: " + response.toString());
        }

        return response;
    }

    @Override
    public ListarPaisesResponse listarPaises(ListarPaisesRequest request) {
        ListarPaisesResponse response;
        LOG.info("Request: " + request.toString());
        try {
            List<Pais> list;
            if(request.getOrdenarPor()!=null && request.getDirecao()!=null){
                list = ordenarPor(request.getOrdenarPor(), request.getDirecao());
            } else {
                list = buscarPaises(request.getLimite(), request.getSalto());
            }

            if(list.isEmpty()){
                response = new ListarPaisesResponse(new RespostaGenerica(true,"Registos nao encotrados"));
            }
            else {
                response = new ListarPaisesResponse(list, new RespostaGenerica(true,"200"));
            }
            LOG.info("Response: " + response.toString());
        }
        catch (Exception e){
            response = new ListarPaisesResponse(new RespostaGenerica(false,e.getMessage()));
            LOG.error("Exception: " + response.toString());
        }
        return response;
    }

    @Override
    public EditarPaisResponse editaPais(EditarPaisRequest request) {
        EditarPaisResponse response;

        LOG.info("Request: " +request.toString());
        try {
            Pais pais = buscarPeloId(request.getId());
            if(Objects.isNull(pais)){
                response = new EditarPaisResponse(new RespostaGenerica(false, "Pais nao encotrado"));
                LOG.error("Erro: " + response.toString());
                return response;
            }

            pais.setSubregiao(request.getSubregiao());
            pais.setRegiao(request.getRegiao());
            pais.setNome(request.getNome());
            pais.setCapital(request.getCapital());
            pais.setArea(request.getArea());

            Pais result = paisRepositorio.save(pais);
            response = new EditarPaisResponse(result, new RespostaGenerica(true, "200"));
            LOG.info("Response: " + response.toString());

            return response;
        }catch (Exception e){
            response = new EditarPaisResponse(new RespostaGenerica(false, e.getMessage()));
            LOG.error("Exception: " + response.toString());
            return response;
        }

    }

    @Override
    public RemoverPaisResponse removerPais(RemoverPaisRequest request) {
        LOG.info("Request: " + request.toString());
        RemoverPaisResponse response;

        try {
            Pais pais = buscarPeloId(request.getId());
            if(Objects.isNull(pais)){
                response = new RemoverPaisResponse(new RespostaGenerica(false, "Pais nao encotrado"));
                LOG.error("Erro: " + response.toString());
                return response;
            }

            paisRepositorio.removeById(pais.getId());
            return new RemoverPaisResponse(new RespostaGenerica(true, "Removido"));
        }
        catch (Exception e){
            response = new RemoverPaisResponse(new RespostaGenerica(false, e.getMessage()));
            LOG.error("Exception: " + response.toString());
            return response;
        }
    }

    private Pais buscarPeloId(int id){
        try {
            return paisRepositorio.findBy(id);
        }
        catch (NoResultException e){
            return null;
        }
    }

    private List<Pais> buscarPaises(int limite, int salto){
        try {
             return paisRepositorio.findAll(salto, limite);
        }
        catch (NoResultException e){
            return new ArrayList<>();
        }
    }

    private List<Pais> ordenarPor(String valor, String direcao){
        try {
            return paisRepositorio.findAllOrderBy(valor, direcao);
        }catch (NoResultException e){
            return new ArrayList<>();
        }
    }
}
