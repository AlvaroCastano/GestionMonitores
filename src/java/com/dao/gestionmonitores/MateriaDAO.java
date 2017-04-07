package com.dao.gestionmonitores;

import com.entidades.gestionmonitores.TblDocentemateria;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
/**
 *
 * @author Alvaro
 */
public class MateriaDAO {
    
    public boolean listarMaterias(String docenteCedula) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        //session.beginTransaction();
        String sql = "from TblDocentemateria dm where dm.docenteCedula=:docenteCedula";
        Query query = session.createQuery(sql);
        query.setParameter("docenteCedula", docenteCedula);
        List<TblDocentemateria> list = query.list();
        System.out.println(list.get(0).getMateriaCodigo());
        if (list.size() > 0) {
            session.close();
            return true;
        }
        session.close();
        return false;
    }
    
}
