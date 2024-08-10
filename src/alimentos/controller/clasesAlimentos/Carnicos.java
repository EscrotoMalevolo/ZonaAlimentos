package alimentos.controller.clasesAlimentos;
/**
 *
 * @author juan_
 */
public class Carnicos extends Alimentos{
    
    private String color;

    public Carnicos(String name, String tamaño, double precio, String color) {
        super(name, tamaño, precio);
        this.color= color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
