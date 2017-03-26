package com.controladores.gestionmonitores;

import com.modelos.gestionmonitores.HibernateUtil;
import com.modelos.gestionmonitores.TblDocentes;
import com.modelos.gestionmonitores.TblEstudiantes;
import com.opensymphony.xwork2.ActionSupport;
import static javafx.scene.input.KeyCode.T;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class LoginControl extends ActionSupport {

    public String ejecutarLogin() throws Exception {
        return SUCCESS;
    }

    public String autenticacion(String email, String password) {
        SessionFactory conexion = HibernateUtil.getSessionFactory();
        Session sesion = conexion.openSession();
        Transaction tx = sesion.beginTransaction();

        TblDocentes docente = (TblDocentes) sesion.get(TblDocentes.class, email);
        TblEstudiantes estudiante = (TblEstudiantes) sesion.get(TblEstudiantes.class, email);

        if (estudiante == null && docente == null) {
            return "No existe";
        } else {
            if (estudiante.getEmail().equals(email) && estudiante.getPassword().equals(password)) {
                return "Estudiante";
            } else {
                if (docente.getEmail().equals(email) && docente.getPassword().equals(password)) {
                    return "Docente";
                } else {
                    return "Datos incorrectos";
                }
            }
        }
    }
}
