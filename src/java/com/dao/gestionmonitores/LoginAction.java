package com.dao.gestionmonitores;

import com.entidades.gestionmonitores.TblDocentemateria;
import com.entidades.gestionmonitores.TblDocentes;
import com.entidades.gestionmonitores.TblEstudiantemateria;
import com.entidades.gestionmonitores.TblEstudiantes;
import com.entidades.gestionmonitores.TblMaterias;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;

public class LoginAction extends ActionSupport {

    private static final long serialVersionUID = 1L;
    private String pwd;
    private String email;
    DocenteDAO docDao = new DocenteDAO();
    EstudianteDAO estDao = new EstudianteDAO();
    TblDocentes docente;
    TblEstudiantes estudiante;
    MateriaDAO matDao = new MateriaDAO();
    TblDocentemateria docentemat;
    private String docenteCedula;
    private ArrayList<TblMaterias> materias = new ArrayList<>();

    @Override
    public String execute() {
        this.docente = new TblDocentes();
        this.docente.setEmail(email);
        this.docente.setPwd(pwd);

        this.estudiante = new TblEstudiantes();
        this.estudiante.setEmail(email);
        this.estudiante.setPwd(pwd);

        if (docDao.buscar(docente.getEmail(), docente.getPwd()) != null) {
            this.docente = docDao.buscar(docente.getEmail(), docente.getPwd());
            List<TblDocentemateria> materiasDocente = matDao.listarMateriasDocente(docente.getCedula());

            for (int i = 0; i < materiasDocente.size(); i++) {
                String codigo = materiasDocente.get(i).getMateriaCodigo();
                this.materias.add(matDao.buscarMateria(codigo).get(0));
            }
            return "Docente";
        } else {
            if (estDao.buscar(estudiante.getEmail(), estudiante.getPwd()) !=null) {
                this.estudiante = estDao.buscar(estudiante.getEmail(), estudiante.getPwd());
                List<TblEstudiantemateria> materiasEstudiante = matDao.listarMateriasEstudiante(estudiante.getCedula());
                
                for (int i = 0; i < materiasEstudiante.size(); i++) {
                    String codigo = materiasEstudiante.get(i).getMateriaCodigo();
                    if(matDao.buscarMateria(codigo).get(0).isEstado()==true){
                        this.materias.add(matDao.buscarMateria(codigo).get(0));
                    }
                }
                
                return "Estudiante";
            } else {
                this.addActionError("Invalid username and password");
            }
        }
        return INPUT;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public TblDocentes getDocente() {
        return docente;
    }

    public void setDocente(TblDocentes docente) {
        this.docente = docente;
    }

    public TblEstudiantes getEstudiante() {
        return estudiante;
    }

    public ArrayList<TblMaterias> getMaterias() {
        return materias;
    }
    
}
