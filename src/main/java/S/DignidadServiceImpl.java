/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S;

import java.util.ArrayList;
import java.util.List;
import M.Dignidad;

/**
 *
 * @author Juan Diego Roman
 */
public class DignidadServiceImpl implements DignidadService {
    
    private static List<Dignidad> dignidadList;

    public DignidadServiceImpl() {
        dignidadList = new ArrayList<>();
    }

    @Override
    public void crear(Dignidad dignidad) {
        this.dignidadList.add(dignidad);
    }

    @Override
    public List<Dignidad> listar() {
        return this.dignidadList;
    }

    @Override
    public Dignidad buscarPorCodigo(int codigo) {
        Dignidad retorno = null;
        for (var dignidad : this.dignidadList) {
            if (codigo == dignidad.getCodigo()) {
                retorno = dignidad;
                break;
            }
        }
        return retorno;
    }

    @Override
    public void modificar(Dignidad dignidad, int codigo) {
        var indice = -1;
        for (var candidatos : this.dignidadList ){
            indice++;
            if(codigo ==candidatos.getCodigo()){
                this.dignidadList.set(indice, dignidad);
            }
        }
    }

    @Override
    public void eliminar(int codigo) {
        var indice = -1;
        for (var dignidades : this.dignidadList) {
            indice++;
            if (codigo == dignidades.getCodigo()) {
                this.dignidadList.remove(indice);

            }

        }
    }
}
        
    

   
