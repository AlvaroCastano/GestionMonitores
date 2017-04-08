package com.dao.gestionmonitores;

import com.entidades.gestionmonitores.TblDocentemateria;
import com.entidades.gestionmonitores.TblDocentes;
import com.entidades.gestionmonitores.TblMaterias;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;

/**
 *
 * @author Alvaro
 */
public class CargarMateriasAction extends ActionSupport {

    private static final long serialVersionUID = 1L;
    private MateriaDAO matDao = new MateriaDAO();
    private TblDocentemateria docentemat;
    private String nombreMateria;
    private String docenteCedula;
    private String docenteNombre;
    private String docenteApellidos;
    private TblDocentes docente;
    

    @Override
    public String execute() {
        docente= new TblDocentes();
        docente.setCedula(this.docenteCedula);
        docente.setNombre(this.docenteNombre);
        docente.setApellidos(this.docenteApellidos);
        
        List<TblDocentemateria> codigosMaterias = matDao.listarMaterias(docenteCedula);
        for (int i = 0; i < codigosMaterias.size(); i++) {
            String codigo = codigosMaterias.get(i).getMateriaCodigo();
            List<TblMaterias> materias = matDao.buscarMateria(codigo);
            for (int j = 0; j < materias.size(); j++) {
                this.nombreMateria = materias.get(j).getNombre();
            }

        }
        return SUCCESS;

    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public String getDocenteCedula() {
        return docenteCedula;
    }

    public String getDocenteNombre() {
        return docenteNombre;
    }

    public String getDocenteApellidos() {
        return docenteApellidos;
    }
    
    

    public void setDocenteCedula(String docenteCedula) {
        this.docenteCedula = docenteCedula;
    }

}
