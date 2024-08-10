package alimentos.controller;

import alimentos.view.Pantalla;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import alimentos.controller.clasesAlimentos.Alimentos;
import alimentos.controller.clasesAlimentos.Carnicos;
import alimentos.controller.clasesAlimentos.Frutas;
import alimentos.controller.clasesAlimentos.Vegetales;
import alimentos.model.Db;


/**
 *
 * @author Sergio Vanegas y Juan José Hernandez
 */
public class ZonaAlimentos{
    private static List<Alimentos> canasta= new ArrayList<>();
    private static List<Frutas> frutas = new ArrayList<>();
    private static List<Vegetales> vegetales = new ArrayList<>();
    private static List<Carnicos> carne = new ArrayList<>();
    private static Db db= new Db();

    
    public static void main(String[] args) {
       Pantalla pantalla = new Pantalla();
       pantalla.setVisible(true);
       pantalla.setLocationRelativeTo(null);
       pantalla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void CrearFruta(String nombre, String tamaño ,double precio) throws SQLException{
        frutas.add(new Frutas(nombre, tamaño, precio));
        Frutas fruta= new Frutas(nombre, tamaño, precio);
        db.guardarFruta(fruta);
        
    }
    public static void CrearVerdura(String nombre, String tamaño, double precio) throws SQLException{
        vegetales.add(new Vegetales(nombre, tamaño, precio));
        Vegetales vegetal= new Vegetales(nombre, tamaño, precio);
        db.guardarVerdura(vegetal);
    }
    public static void CrearCarne(String nombre, String tamaño, double precio, String color) throws SQLException{
        carne.add(new Carnicos(nombre, tamaño, precio, color));
        Carnicos carnes= new Carnicos(nombre, tamaño, precio, color);
        db.guardarCarne(carnes);
    }
    public static void LlenarCanasta(Alimentos alimento){
        canasta.add(alimento);
    }

    public static List<Alimentos> getCanasta() {
        return canasta;
    }

    public static List<Frutas> getFrutas() {
        return frutas;
    }

    public static List<Vegetales> getVegetales() {
        return vegetales;
    }

    public static List<Carnicos> getCarne() {
        return carne;
    }

    public static void setCanasta(Alimentos alimento) {
        ZonaAlimentos.canasta.add(alimento);
    }
    
    public static void setCarnes(Carnicos carnes) {
        ZonaAlimentos.carne.add(carnes);
    }
    
    public static void setVerduras(Vegetales vegetal) {
        ZonaAlimentos.vegetales.add(vegetal);
    }
    
    public static void setFrutas(Frutas fruta) {
        ZonaAlimentos.frutas.add(fruta);
    }
    
    public static List<Alimentos> getAlimentos() {
        return canasta;
    }
    
}
