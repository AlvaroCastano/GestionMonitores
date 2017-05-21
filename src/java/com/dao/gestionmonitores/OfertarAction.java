package com.dao.gestionmonitores;

import com.entidades.gestionmonitores.TblMaterias;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author Lorena
 */
public class OfertarAction extends ActionSupport {

    private static final long serialVersionUID = 1L;
    
    TblMaterias materia;
    private String codigo, estado;
    MateriaDAO matDao = new MateriaDAO();

    @Override
    public String execute() {
        this.materia = new TblMaterias();
        this.materia.setCodigo(codigo);
        this.materia.setEstado(estado);
        matDao.actualizarMateria(materia.getCodigo(), materia.isEstado());
        return SUCCESS;
    }
    
    public TblMaterias getMateria() {
        return materia;
    }

    public void setMateria(TblMaterias materia) {
        this.materia = materia;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public String isEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
