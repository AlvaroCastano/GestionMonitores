package com.entidades.gestionmonitores;
// Generated 03-abr-2017 20:46:03 by Hibernate Tools 4.3.1



/**
 * TblDocentemateria generated by hbm2java
 */
public class TblDocentemateria  implements java.io.Serializable {


     private Integer id;
     private String docenteCedula;
     private String estudianteCedula;
     private String materiaCodigo;

    public TblDocentemateria() {
    }

    public TblDocentemateria(String docenteCedula, String estudianteCedula, String materiaCodigo) {
       this.docenteCedula = docenteCedula;
       this.estudianteCedula = estudianteCedula;
       this.materiaCodigo = materiaCodigo;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getDocenteCedula() {
        return this.docenteCedula;
    }
    
    public void setDocenteCedula(String docenteCedula) {
        this.docenteCedula = docenteCedula;
    }
    public String getEstudianteCedula() {
        return this.estudianteCedula;
    }
    
    public void setEstudianteCedula(String estudianteCedula) {
        this.estudianteCedula = estudianteCedula;
    }
    public String getMateriaCodigo() {
        return this.materiaCodigo;
    }
    
    public void setMateriaCodigo(String materiaCodigo) {
        this.materiaCodigo = materiaCodigo;
    }

    @Override
    public String toString() {
        return "TblDocentemateria{" + "id=" + id + ", docenteCedula=" + docenteCedula + ", estudianteCedula=" + estudianteCedula + ", materiaCodigo=" + materiaCodigo + '}';
    }
    
}


