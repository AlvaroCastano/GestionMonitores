package com.dao.gestionmonitores;

import com.entidades.gestionmonitores.TblMaterias;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author Lorena
 */
public class PostularAction extends ActionSupport{
    private static final long serialVersionUID = 1L;
    
    TblMaterias materia;
    private String codigo;
    private boolean estado;
    MateriaDAO matDao = new MateriaDAO();

    @Override
    public String execute() {
        this.materia = new TblMaterias();
        this.materia.setCodigo(codigo);
        matDao.actualizarMateria(materia.getCodigo());
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
    
    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
