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

    public boolean buscar(String email, String pwd) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        //session.beginTransaction();
        String sql = "from TblDocentes d where d.email=:email and d.pwd=:pwd";
        Query query = session.createQuery(sql);
        query.setParameter("email", email);
        query.setParameter("pwd", pwd);
        List<TblDocentes> list = query.list();
        if (list.size() > 0) {
            session.close();
            return true;
        }
        session.close();
        return false;
    }
}