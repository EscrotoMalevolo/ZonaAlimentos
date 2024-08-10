package alimentos.controller.clasesAlimentos;


public abstract class Alimentos{
    String name;
    String tamaño;
    double precio;

    public Alimentos(String name, String tamaño, double precio) {
        this.name = name;
        this.tamaño = tamaño;
        this.precio = precio;

    }

    public String getName() {
        return name;
    }

    public String getTamaño() {
        return tamaño;
    }

    public double getPrecio() {
        return precio;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
