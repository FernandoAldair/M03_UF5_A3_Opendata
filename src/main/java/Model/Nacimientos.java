package Model;

import com.opencsv.bean.CsvBindByName;

public class Nacimientos {
    @CsvBindByName
    String id;
    @CsvBindByName
    String Any;
    @CsvBindByName
    String Codi_Districte;
    @CsvBindByName
    String Nom_Districte;
    @CsvBindByName
    String Codi_Barri;
    @CsvBindByName
    String Nom_Barri;
    @CsvBindByName
    String Lloc_naixement;
    @CsvBindByName
    String Nombre;

    @Override
    public String toString() {
        return "Model.Nacimientos{" +
                "id='" + id + '\'' +
                "Any='" + Any + '\'' +
                ", Codi_Districte='" + Codi_Districte + '\'' +
                ", Nom_Districte='" + Nom_Districte + '\'' +
                ", Codi_Barri='" + Codi_Barri + '\'' +
                ", Nom_Barri='" + Nom_Barri + '\'' +
                ", Lloc_naixement='" + Lloc_naixement + '\'' +
                ", Nombre='" + Nombre + '\'' +
                '}';
    }


    public String getAny() {
        return Any;
    }

    public void setAny(String any) {
        Any = any;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCodi_Districte() {
        return Codi_Districte;
    }

    public void setCodi_Districte(String codi_Districte) {
        Codi_Districte = codi_Districte;
    }

    public String getNom_Districte() {
        return Nom_Districte;
    }

    public void setNom_Districte(String nom_Districte) {
        Nom_Districte = nom_Districte;
    }

    public String getCodi_Barri() {
        return Codi_Barri;
    }

    public void setCodi_Barri(String codi_Barri) {
        Codi_Barri = codi_Barri;
    }

    public String getNom_Barri() {
        return Nom_Barri;
    }

    public void setNom_Barri(String nom_Barri) {
        Nom_Barri = nom_Barri;
    }

    public String getLloc_naixement() {
        return Lloc_naixement;
    }

    public void setLloc_naixement(String lloc_naixement) {
        Lloc_naixement = lloc_naixement;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
}
