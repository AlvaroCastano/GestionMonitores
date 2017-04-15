package com.dao.gestionmonitores;

import com.entidades.gestionmonitores.TblDocentes;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Alvaro
 */
public class DocenteDAO {

    public TblDocentes buscar(String email, String pwd) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        //session.beginTransaction();
        String sql = "from TblDocentes d where d.email=:email and d.pwd=:pwd";
        Query query = session.createQuery(sql);
        query.setParameter("email", email);
        query.setParameter("pwd", pwd);
        TblDocentes docente = (TblDocentes) query.uniqueResult();
        if (docente!=null) {
            session.close();
            return  docente;
        }
        session.close();
        return null;
    }
    
    public TblDocentes buscarPorCedula(String cedula) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        //session.beginTransaction();
        String sql = "from TblDocentes d where d.cedula=:cedula";
        Query query = session.createQuery(sql);
        query.setParameter("cedula", cedula);
        TblDocentes docente = (TblDocentes) query.uniqueResult();
        if (docente!=null) {
            session.close();
            return  docente;
        }
        session.close();
        return null;
    }
}