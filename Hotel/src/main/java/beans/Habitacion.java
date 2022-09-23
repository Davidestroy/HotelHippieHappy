
package beans;


public class Habitacion {
    private int id_hab;
    private String nombre_hab;
    private int capacidad_hab;
    private int camas_hab;
    private int terraza_hab;
    private int baños_hab;
    private String especificaciones;

    public Habitacion(int id_hab, String nombre_hab, int capacidad_hab, int camas_hab, int terraza_hab, int baños_hab, String especificaciones) {
        this.id_hab = id_hab;
        this.nombre_hab = nombre_hab;
        this.capacidad_hab = capacidad_hab;
        this.camas_hab = camas_hab;
        this.terraza_hab = terraza_hab;
        this.baños_hab = baños_hab;
        this.especificaciones = especificaciones;
    }
    
    

    public int getId_hab() {
        return id_hab;
    }

    public void setId_hab(int id_hab) {
        this.id_hab = id_hab;
    }

    public String getNombre_hab() {
        return nombre_hab;
    }

    public void setNombre_hab(String nombre_hab) {
        this.nombre_hab = nombre_hab;
    }

    public int getCapacidad_hab() {
        return capacidad_hab;
    }

    public void setCapacidad_hab(int capacidad_hab) {
        this.capacidad_hab = capacidad_hab;
    }

    public int getCamas_hab() {
        return camas_hab;
    }

    public void setCamas_hab(int camas_hab) {
        this.camas_hab = camas_hab;
    }

    public int getTerraza_hab() {
        return terraza_hab;
    }

    public void setTerraza_hab(int terraza_hab) {
        this.terraza_hab = terraza_hab;
    }

    public int getBaños_hab() {
        return baños_hab;
    }

    public void setBaños_hab(int baños_hab) {
        this.baños_hab = baños_hab;
    }

    public String getEspecificaciones() {
        return especificaciones;
    }

    public void setEspecificaciones(String especificaciones) {
        this.especificaciones = especificaciones;
    }

    @Override
    public String toString() {
        return "Habitacion{" + "id_hab=" + id_hab + ", nombre_hab=" + nombre_hab + ", "
                + "capacidad_hab=" + capacidad_hab + ", camas_hab=" + camas_hab + ","
                + " terraza_hab=" + terraza_hab + ", ba\u00f1os_hab=" + baños_hab + ","
                + " especificaciones=" + especificaciones + '}';
    }
    
    
}
