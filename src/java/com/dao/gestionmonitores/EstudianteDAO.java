package com.dao.gestionmonitores;

import com.entidades.gestionmonitores.TblDocentes;
import com.entidades.gestionmonitores.TblEstudiantes;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Alvaro
 */
public class EstudianteDAO {

    public TblEstudiantes buscar(String email, String pwd) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String sql = "from TblEstudiantes e where e.email=:email and e.pwd=:pwd";
        Query query = session.createQuery(sql);
        query.setParameter("email", email);
        query.setParameter("pwd", pwd);
        TblEstudiantes estudiante = (TblEstudiantes) query.uniqueResult();
          if (estudiante!=null) {
            session.close();
            return estudiante;
        }
        session.close();
        return null;
    }
    
    public TblEstudiantes buscarPorCedula(String cedula) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        //session.beginTransaction();
        String sql = "from TblEstudiantes d where d.cedula=:cedula";
        Query query = session.createQuery(sql);
        query.setParameter("cedula", cedula);
        TblEstudiantes estudiante = (TblEstudiantes) query.uniqueResult();
        if (estudiante!=null) {
            session.close();
            return  estudiante;
        }
        session.close();
        return null;
    }
}
