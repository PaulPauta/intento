/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S;

import java.util.ArrayList;
import java.util.List;
import M.Eleccion;

/**
 *
 * @author Juan Diego Roman
 */
public class EleccionServiceImpl implements EleccionService {

    private List<Eleccion> eleccionList;

    public EleccionServiceImpl() {
        eleccionList = new ArrayList<>();
    }

    @Override
    public void crear(Eleccion eleccion) {
        this.eleccionList.add(eleccion);
    }

    @Override
    public List<Eleccion> listar() {
        return this.eleccionList;
    }

    @Override
    public Eleccion buscarPorNroEleccion(int nroEleccion) {
        Eleccion retorno = null;
        for (var eleccion : this.eleccionList) {
            if (nroEleccion == eleccion.getNroEleccion()) {
                retorno = eleccion;
                break;
            }
        }
        return null;
    }

    @Override
    public void modificar(Eleccion eleccion, int nroEleccion) {
        var indice = -1;
        for (var eleciones : this.eleccionList) {
            indice++;
            if (nroEleccion == eleciones.getNroEleccion()) {
                this.eleccionList.set(indice, eleccion);
            }
        }
    }

    @Override
    public void eliminar(int nroEleccion) {
        
        var indice = -1;
        for (var eleciones : this.eleccionList) {
            indice++;
            if (nroEleccion == eleciones.getNroEleccion()) {
                this.eleccionList.remove(indice);

            }

        }

    }
}


