package com.dao.gestionmonitores;

import com.opensymphony.xwork2.ActionSupport;
/**
 *
 * @author Alvaro
 */
public class CargarMateriasAction extends ActionSupport {
    
    private static final long serialVersionUID = 1L;
    LoginAction la;
    MateriaDAO matDao = new MateriaDAO();
    
    @Override
    public String execute() {        
        System.out.println(la.getDocente().getCedula());
        if (matDao.listarMaterias(la.getDocente().getCedula())) {
            return SUCCESS;
        } else {
            return INPUT;
        }
    }
}
