/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S;

import java.util.ArrayList;
import java.util.List;
import M.Candidato;

/**
 *
 * @author Juan Diego Roman
 */
public class CandidatoServiceImpl implements CandidatoService {

    private static List<Candidato> candidatoList;

    public CandidatoServiceImpl() {
        this.candidatoList = new ArrayList<>();
    }

    @Override
    public void crear(Candidato candidato) {
        this.candidatoList.add(candidato);
    }

    @Override
    public List<Candidato> listar() {
        return this.candidatoList;
    }

    @Override
    public Candidato buscarPorLista(int lista) {
        Candidato retorno = null;
        for (var candidato : this.candidatoList) {
            if (lista == candidato.getNroLista()) {
                retorno = candidato;
                break;
            }
        }
        return retorno;
    }

    @Override
    public Candidato buscarPorNombre(String nombre) {
        Candidato retorno = null;

        for (var candidato : this.candidatoList) {
            if (nombre.equals(candidato.getNombreCandidato())) {
                retorno = candidato;
                break;
            }
        }

        return retorno;
    }

    @Override
    public void modificar(Candidato candidato, int lista) {
        var indice = -1;
        for (var candidatos : this.candidatoList ){
            indice++;
            if(lista ==candidatos.getNroLista()){
                this.candidatoList.set(indice, candidato);
            }
        }
    }

    @Override
    public void eliminar(int lista) {
         var indice = -1;
        for (var candidatos : this.candidatoList) {
            indice++;
            if (lista == candidatos.getNroLista()) {
                this.candidatoList.remove(indice);

            }

        }
    
    }

}
