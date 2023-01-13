/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C;

import java.util.List;
import M.Dignidad;
import S.DignidadServiceImpl;

/**
 *
 * @author Juan Diego Roman
 */
public class DignidadControl {

    private DignidadServiceImpl dignidadServiceImpl;

    public DignidadControl() {
        dignidadServiceImpl = new DignidadServiceImpl();
    }

    public void crear(String[] dat) {

        var publicidad = dat[0];
        var campaña = dat[1];
        var propuestas = dat[2];
        var codigo = Integer.valueOf(dat[3]).intValue();
        var dignidad = new Dignidad(publicidad, campaña, propuestas, codigo);

        this.dignidadServiceImpl.crear(dignidad);
    }

    public String modificar(String[] dat) {
        var retorno = "No se pudo crear";

        var publicidad = dat[0];
        var campaña = dat[1];
        var propuestas = dat[2];
        var codigo = Integer.valueOf(dat[3]).intValue();

        var dignidad = new Dignidad(publicidad, campaña, propuestas, codigo);

        this.dignidadServiceImpl.modificar(dignidad, codigo);
        retorno = "Dignidad" + dignidad.getCodigo() + "Modificado";
        return retorno;
    }

    public List<Dignidad> listar() {
        return this.dignidadServiceImpl.listar();

    }

    public void eliminar(String codigos) {

        var codigo = Integer.valueOf(codigos).intValue();
        this.dignidadServiceImpl.eliminar(codigo);
    }
}
