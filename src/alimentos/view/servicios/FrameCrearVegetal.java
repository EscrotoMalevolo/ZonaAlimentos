package alimentos.view.servicios;
import javax.swing.JOptionPane;
import alimentos.controller.ZonaAlimentos;
import alimentos.view.FrutasFrame;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author juan_
 */
public class FrameCrearVegetal extends javax.swing.JFrame {
    
    String nombreVegetal, tamañoVegetal; 
    double precioVerdura;

    /**
     * Creates new form frameCrearAnimal
     */
    public FrameCrearVegetal() {
        initComponents();
        botones = new javax.swing.ButtonGroup();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botones = new javax.swing.ButtonGroup();
        texto1CrearAnimal = new javax.swing.JLabel();
        varNombre = new javax.swing.JTextField();
        varTamaño = new javax.swing.JTextField();
        varPrecio = new javax.swing.JTextField();
        botonCrearAnimal = new javax.swing.JButton();
        botonVolver = new javax.swing.JButton();
        texto2Nombre = new javax.swing.JLabel();
        texto3Especie = new javax.swing.JLabel();
        texto4Alimentacion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        texto1CrearAnimal.setText("Creación de Vegetal:");

        varNombre.setText("Nombre");
        varNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                varNombreMousePressed(evt);
            }
        });
        varNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varNombreActionPerformed(evt);
            }
        });
        varNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                varNombreKeyTyped(evt);
            }
        });

        varTamaño.setText("Tamaño");
        varTamaño.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                varTamañoMousePressed(evt);
            }
        });
        varTamaño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varTamañoActionPerformed(evt);
            }
        });
        varTamaño.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                varTamañoKeyTyped(evt);
            }
        });

        varPrecio.setText("Precio");
        varPrecio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                varPrecioMousePressed(evt);
            }
        });
        varPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varPrecioActionPerformed(evt);
            }
        });
        varPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                varPrecioKeyTyped(evt);
            }
        });

        botonCrearAnimal.setText("Crear Vegetal");
        botonCrearAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearAnimalActionPerformed(evt);
            }
        });

        botonVolver.setText("Volver");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        texto2Nombre.setText(": Nombre de Vegetal");

        texto3Especie.setText(":(Grande g, Mediano m, Pequeño p)");

        texto4Alimentacion.setText(": Precio(COP)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(295, 295, 295)
                                .addComponent(botonCrearAnimal))
                            .addComponent(texto1CrearAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(varTamaño, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(texto3Especie))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(varNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(texto2Nombre))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(varPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(texto4Alimentacion))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(botonVolver)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(texto1CrearAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(varNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(texto2Nombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(varTamaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texto3Especie))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(varPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texto4Alimentacion))
                .addGap(61, 61, 61)
                .addComponent(botonCrearAnimal)
                .addGap(51, 51, 51)
                .addComponent(botonVolver)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void varNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_varNombreActionPerformed

    private void varPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_varPrecioActionPerformed

    private void botonCrearAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearAnimalActionPerformed
        tamañoVegetal= varTamaño.getText(); 
        nombreVegetal= varNombre.getText();
        try{
            precioVerdura = Double.parseDouble(varPrecio.getText());
            if("Nombre".equals(nombreVegetal)||"Tamaño".equals(tamañoVegetal)){
                JOptionPane.showMessageDialog(null, "Ha dejado espacios sin llenar");
            }else if(!"grande".equalsIgnoreCase(tamañoVegetal) && !"g".equalsIgnoreCase(tamañoVegetal) && !"mediana".equalsIgnoreCase(tamañoVegetal) && !"m".equalsIgnoreCase(tamañoVegetal) && !"pequeña".equalsIgnoreCase(tamañoVegetal) && !"p".equalsIgnoreCase(tamañoVegetal)){
                JOptionPane.showMessageDialog(null, "Ha digitado un tamaño incorrecto");
            }else{
                ZonaAlimentos.CrearVerdura(nombreVegetal, tamañoVegetal, precioVerdura);
                varTamaño.setText("Tamaño");
                varNombre.setText("Nombre");
                varPrecio.setText("Precio");
                JOptionPane.showMessageDialog(null, "Guardado con Exito");
            }
        }catch(NumberFormatException e){JOptionPane.showMessageDialog(null, "Ha digitado en precio un valor no númerico");} catch (SQLException ex) {
            Logger.getLogger(FrameCrearVegetal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonCrearAnimalActionPerformed

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        FrutasFrame animalView = new FrutasFrame();
        animalView.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonVolverActionPerformed

    private void varTamañoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varTamañoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_varTamañoActionPerformed

    private void varPrecioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_varPrecioMousePressed
        if("Precio".equals(varPrecio.getText())){
            varPrecio.setText("");
        }
        
        if("".equals(varNombre.getText())){
            varNombre.setText("Nombre");
        }
        
        if("".equals(varTamaño.getText())){
            varTamaño.setText("Tamaño");
        }
    }//GEN-LAST:event_varPrecioMousePressed

    private void varPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_varPrecioKeyTyped
        if("Precio".equals(varPrecio.getText())){
            varPrecio.setText("");
        }
        
        if("".equals(varNombre.getText())){
            varNombre.setText("Nombre");
        }
        
        if("".equals(varTamaño.getText())){
            varTamaño.setText("Tamaño");
        }
    }//GEN-LAST:event_varPrecioKeyTyped

    private void varNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_varNombreMousePressed
        if("Nombre".equals(varNombre.getText())){
            varNombre.setText("");
        }
        
        if("".equals(varPrecio.getText())){
            varPrecio.setText("Precio");
        }
        
        if("".equals(varTamaño.getText())){
            varTamaño.setText("Tamaño");
        }
    }//GEN-LAST:event_varNombreMousePressed

    private void varNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_varNombreKeyTyped
        if("Nombre".equals(varNombre.getText())){
            varNombre.setText("");
        }
        
        if("".equals(varPrecio.getText())){
            varPrecio.setText("Precio");
        }
        
        if("".equals(varTamaño.getText())){
            varTamaño.setText("Tamaño");
        }
    }//GEN-LAST:event_varNombreKeyTyped

    private void varTamañoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_varTamañoKeyTyped
        if("Tamaño".equals(varTamaño.getText())){
            varTamaño.setText("");
        }
        
        if("".equals(varPrecio.getText())){
            varPrecio.setText("Precio");
        }
        
        if("".equals(varNombre.getText())){
            varNombre.setText("Nombre");
        }
    }//GEN-LAST:event_varTamañoKeyTyped

    private void varTamañoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_varTamañoMousePressed
        if("Tamaño".equals(varTamaño.getText())){
            varTamaño.setText("");
        }
        
        if("".equals(varPrecio.getText())){
            varPrecio.setText("Precio");
        }
        
        if("".equals(varNombre.getText())){
            varNombre.setText("Nombre");
        }
    }//GEN-LAST:event_varTamañoMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCrearAnimal;
    private javax.swing.JButton botonVolver;
    private javax.swing.ButtonGroup botones;
    private javax.swing.JLabel texto1CrearAnimal;
    private javax.swing.JLabel texto2Nombre;
    private javax.swing.JLabel texto3Especie;
    private javax.swing.JLabel texto4Alimentacion;
    private javax.swing.JTextField varNombre;
    private javax.swing.JTextField varPrecio;
    private javax.swing.JTextField varTamaño;
    // End of variables declaration//GEN-END:variables
}
