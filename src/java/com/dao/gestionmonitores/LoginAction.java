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
        docente = new TblDocentes();
        docente.setEmail(email);
        docente.setPwd(pwd);
        
        estudiante = new TblEstudiantes();
        estudiante.setEmail(email);
        estudiante.setPwd(pwd);
        
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

    public void setEmail(String email){
        this.email = email;
    }
    public void setPwd(String pwd){
        this.pwd = pwd;
    }
    
    public TblDocentes getDocente() {
        return docente;
    }
    
    public TblEstudiantes getEstudiante() {
        return estudiante;
    }
}
