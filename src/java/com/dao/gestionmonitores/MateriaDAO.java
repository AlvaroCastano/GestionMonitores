package com.dao.gestionmonitores;

import com.entidades.gestionmonitores.TblDocentemateria;
import com.entidades.gestionmonitores.TblEstudiantemateria;
import com.entidades.gestionmonitores.TblMaterias;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
/**
 *
 * @author Alvaro
 */
public class MateriaDAO {
    
    public List<TblDocentemateria> listarMateriasDocente(String docenteCedula) {
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
    
    public List<TblEstudiantemateria> listarMateriasEstudiante(String estudianteCedula) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String sql = "from TblEstudiantemateria em where em.estudianteCedula=:estudianteCedula";
        Query query = session.createQuery(sql);
        query.setParameter("estudianteCedula", estudianteCedula);
        List<TblEstudiantemateria> list = query.list();
        
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
    
    public TblMaterias setEstado(String codigo) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        //session.beginTransaction();
        boolean estado= true;
        String sql = "update TblMaterias m set m.estado=:estado where m.codigo=:codigo";
        Query query = session.createQuery(sql);
        query.setParameter("estado", estado);
        query.setString("codigo", codigo);
        query.executeUpdate();
        
        TblMaterias materia = (TblMaterias) query.uniqueResult();
        if (materia!=null) {
            session.close();
            return  materia;
        }
        session.close();
        return null;
    }
    
}
