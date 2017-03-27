package com.dao.gestionmonitores;

import com.entidades.gestionmonitores.TblDocentes;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

    private static final long serialVersionUID = 1L;
    UsuarioDAO dao = new UsuarioDAO();
    TblDocentes docente;

    @Override
    public void validate() {
        if (docente.getEmail().length() == (0)) {
            this.addFieldError("docente.email", "email is required");
        }
        if (docente.getPwd().length() == (0)) {
            this.addFieldError("docente.pwd", "Password is required");
        }
    }

    @Override
    public String execute() {
        if (dao.find(docente.getEmail(), docente.getPwd())) {
            return SUCCESS;
        } else {
            this.addActionError("Invalid username and password");
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

