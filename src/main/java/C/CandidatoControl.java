/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C;

import java.util.List;
import M.Candidato;
import S.CandidatoServiceImpl;

/**
 *
 * @author Juan Diego Roman
 */
public class CandidatoControl {

    private CandidatoServiceImpl candidatoServiceImpl;

    public CandidatoControl() {
        candidatoServiceImpl = new CandidatoServiceImpl();
    }

    public void crear(String[] data) {

        var nombreCandidato = data[0];
        var edad = Integer.valueOf(data[1]).intValue();
        var genero = data[2];
        var lugarDeNacimiento = data[3];
        var nrolista = Integer.valueOf(data[4]).intValue();
        var candidato = new Candidato(nombreCandidato, edad, genero, lugarDeNacimiento, nrolista);
        
        this.candidatoServiceImpl.crear(candidato);
    }

    public String modifcar(String[] data) {
        var retorno = "No se pudo crear el candidato";

        var nombreCandidato = data[0];
        var edad = Integer.valueOf(data[1]).intValue();
        var genero = data[2];
        var lugarDeNacimiento = data[3];
        var nrolista = Integer.valueOf(data[4]).intValue();
        var candidato = new Candidato(nombreCandidato, edad, genero, lugarDeNacimiento, nrolista);

        this.candidatoServiceImpl.modificar(candidato, nrolista);
        retorno = "Candidato " + candidato.getNombreCandidato() + " Modificado";

        return retorno;

    }

    public List<Candidato> listar() {
        return this.candidatoServiceImpl.listar();

    }

    public void eliminar(String listas) {

        var lista = Integer.valueOf(listas).intValue();
        this.candidatoServiceImpl.eliminar(lista);
    }
    public Candidato buscarPorNombre(String nombreCandidato){
        return this.candidatoServiceImpl.buscarPorNombre(nombreCandidato);
        
    }
    public Candidato buscarPorLista(int lista) {
        
        return this.candidatoServiceImpl.buscarPorLista(lista);
    }

    

    

}
