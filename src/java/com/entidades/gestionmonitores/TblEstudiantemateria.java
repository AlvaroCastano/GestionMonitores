package com.entidades.gestionmonitores;
// Generated 03-abr-2017 20:46:03 by Hibernate Tools 4.3.1



/**
 * TblEstudiantemateria generated by hbm2java
 */
public class TblEstudiantemateria  implements java.io.Serializable {


     private Integer id;
     private String materiaCodigo;
     private String estudianteCedula;
     private float nota;

    public TblEstudiantemateria() {
    }

    public TblEstudiantemateria(String materiaCodigo, String estudianteCedula, float nota) {
       this.materiaCodigo = materiaCodigo;
       this.estudianteCedula = estudianteCedula;
       this.nota = nota;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getMateriaCodigo() {
        return this.materiaCodigo;
    }
    
    public void setMateriaCodigo(String materiaCodigo) {
        this.materiaCodigo = materiaCodigo;
    }
    public String getEstudianteCedula() {
        return this.estudianteCedula;
    }
    
    public void setEstudianteCedula(String estudianteCedula) {
        this.estudianteCedula = estudianteCedula;
    }
    public float getNota() {
        return this.nota;
    }
    
    public void setNota(float nota) {
        this.nota = nota;
    }




}

