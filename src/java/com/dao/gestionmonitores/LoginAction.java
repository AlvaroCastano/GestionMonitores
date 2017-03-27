package com.dao.gestionmonitores;

import com.entidades.gestionmonitores.TblDocentes;
import com.entidades.gestionmonitores.TblEstudiantes;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

    private static final long serialVersionUID = 1L;
    private String pwd,email;
    DocenteDAO docDao = new DocenteDAO();
    EstudianteDAO estDao = new EstudianteDAO();
    TblDocentes docente;
    TblEstudiantes estudiante;

    @Override
    public String execute() {
        if (docDao.buscar(docente.getEmail(), docente.getPwd())) {
            return "Docente";
        } else {
            if (estDao.buscar(estudiante.getEmail(), estudiante.getPwd())) {
                return "Estudiante";
            } else {
                this.addActionError("Invalid username and password");
            }
        }
        return INPUT;
    }

    public TblDocentes getUser() {
        return docente;
    }

    public void setUser(TblDocentes docente) {
        this.docente = docente;
    }
}
