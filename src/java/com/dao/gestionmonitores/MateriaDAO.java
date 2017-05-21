package com.dao.gestionmonitores;

import com.entidades.gestionmonitores.TblDocentemateria;
import com.entidades.gestionmonitores.TblMaterias;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
/**
 *
 * @author Alvaro
 */
public class MateriaDAO {
    
    public List<TblDocentemateria> listarMaterias(String docenteCedula) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String sql = "from TblDocentemateria dm where dm.docenteCedula=:docenteCedula";
        Query query = session.createQuery(sql);
        query.setParameter("docenteCedula", docenteCedula);
        List<TblDocentemateria> list = query.list();
        
        if (list.size() > 0) {
            session.close();
            return list;
        }
        session.close();
        return null;
    }
    
    public List<TblMaterias> buscarMateria(String codigo) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String sql = "from TblMaterias m where m.codigo=:codigo";
        Query query = session.createQuery(sql);
        query.setParameter("codigo", codigo);
        List<TblMaterias> list = query.list();
        
        if (list.size() > 0) {
            session.close();
            return list;
        }
        session.close();
        return null;
    }
    
    public void actualizarMateria(String codigo, String estado) {
        Session session = HibernateUtil.getSessionFactory().openSession();  
        System.out.println(codigo + " "+ estado);
        
        String sql = "update TblMaterias m set m.estado=:estado where m.codigo=:codigo";
        Query query = session.createQuery(sql);
        query.setParameter("codigo", codigo);
        query.setParameter("estado", estado);
        session.close();
    }
}
