package com.dao.gestionmonitores;

import com.entidades.gestionmonitores.TblDocentes;
import com.entidades.gestionmonitores.TblEstudiantes;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Alvaro
 */
public class EstudianteDAO {

    public boolean buscar(String email, String pwd) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String sql = "from TblEstudiantes e where e.email=:email and e.pwd=:pwd";
        Query query = session.createQuery(sql);
        query.setParameter("email", email);
        query.setParameter("pwd", pwd);
        List<TblEstudiantes> list = query.list();
        if (list.size() > 0) {
            session.close();
            return true;
        }
        session.close();
        return false;
    }
}
