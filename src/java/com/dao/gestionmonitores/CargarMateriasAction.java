package com.dao.gestionmonitores;

import com.entidades.gestionmonitores.TblDocentemateria;
import com.entidades.gestionmonitores.TblDocentes;
import com.entidades.gestionmonitores.TblMaterias;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alvaro
 */
public class CargarMateriasAction extends ActionSupport {

    private static final long serialVersionUID = 1L;
    private MateriaDAO matDao = new MateriaDAO();
    private TblDocentemateria docentemat;
    private String docenteCedula;
    private ArrayList<TblMaterias> materias = new ArrayList<>();
    

    @Override
    public String execute() {       
        List<TblDocentemateria> codigosMaterias = matDao.listarMaterias(docenteCedula);

        for (int i = 0; i < codigosMaterias.size(); i++) {
            String codigo = codigosMaterias.get(i).getMateriaCodigo();
            this.materias.add(matDao.buscarMateria(codigo).get(0));
        }
        
        return SUCCESS;

    }

    public String getDocenteCedula() {
        return docenteCedula;
    }

    public List<TblMaterias> getMaterias() {
        return materias;
    }

    public void setDocenteCedula(String docenteCedula) {
        this.docenteCedula = docenteCedula;
}

}
