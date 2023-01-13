/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C;

import java.util.List;
import M.Eleccion;
import S.CandidatoServiceImpl;
import S.DignidadServiceImpl;
import S.EleccionServiceImpl;

/**
 *
 * @author Juan Diego Roman
 */
public class EleccionControl {

    private EleccionServiceImpl eleccionServiceImpl = new EleccionServiceImpl();
    private DignidadServiceImpl dignidadServiceImpl = new DignidadServiceImpl();
    private CandidatoServiceImpl candidatoServiceImpl = new CandidatoServiceImpl();

    public EleccionControl() {
        eleccionServiceImpl = new EleccionServiceImpl();
    }

    public void crear(String[] dato) {
        var canton = dato[0];
        var candidato = this.candidatoServiceImpl.buscarPorLista(Integer.valueOf(dato[1]).intValue());
        var numeroVotos = Integer.valueOf(dato[2]).intValue();
        var dignidad = this.dignidadServiceImpl.buscarPorCodigo(Integer.valueOf(dato[3]).intValue());
        var nroEleccion = Integer.valueOf(dato[4]).intValue();
        var eleccion = new Eleccion(canton, candidato, numeroVotos, dignidad, nroEleccion);
        this.eleccionServiceImpl.crear(eleccion);
    }

    public String modificar(String[] dato) {
        var retorno = "No se pudo modificar";

        var canton = dato[0];
        var candidato = this.candidatoServiceImpl.buscarPorLista(Integer.valueOf(dato[1]).intValue());
        var numeroVotos = Integer.valueOf(dato[2]).intValue();
        var dignidad = this.dignidadServiceImpl.buscarPorCodigo(Integer.valueOf(dato[3]).intValue());
        var nroEleccion = Integer.valueOf(dato[4]).intValue();
        var eleccion = new Eleccion(canton, candidato, numeroVotos, dignidad, nroEleccion);

        this.eleccionServiceImpl.modificar(eleccion, nroEleccion);
        retorno = "Se modifico";
        return retorno;

    }

    public List<Eleccion> listar() {

        return this.eleccionServiceImpl.listar();

    }

    public void eliminar(String nroElecciones) {

        var nroeleccion = Integer.valueOf(nroElecciones).intValue();
        this.eleccionServiceImpl.eliminar(nroeleccion);

    }

}
