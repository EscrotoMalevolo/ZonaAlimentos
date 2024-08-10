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
public class FrameCrearCarnico extends javax.swing.JFrame {
    String carneRoja, carneBlanca, nombreCarne, tamañoCarne;
    double precioCarne;
    /**
     * Creates new form frameCrearAnimal
     */
    public FrameCrearCarnico() {
        initComponents();
        botones = new javax.swing.ButtonGroup();
        botones.add(radioRoja);
        botones.add(radioBlanca);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botones = new javax.swing.ButtonGroup();
        texto1CrearAnimal = new javax.swing.JLabel();
        radioRoja = new javax.swing.JRadioButton();
        radioBlanca = new javax.swing.JRadioButton();
        varNombre = new javax.swing.JTextField();
        varTamaño = new javax.swing.JTextField();
        varPrecio = new javax.swing.JTextField();
        botonCrearCarne = new javax.swing.JButton();
        botonVolver = new javax.swing.JButton();
        texto2Nombre = new javax.swing.JLabel();
        texto3Tamaño = new javax.swing.JLabel();
        texto4Precio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        texto1CrearAnimal.setText("Creación de Carnico:");

        radioRoja.setText("Roja");
        radioRoja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioRojaActionPerformed(evt);
            }
        });

        radioBlanca.setText("Blanca");
        radioBlanca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBlancaActionPerformed(evt);
            }
        });

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

        botonCrearCarne.setText("Crear Carne");
        botonCrearCarne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearCarneActionPerformed(evt);
            }
        });

        botonVolver.setText("Volver");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        texto2Nombre.setText(": Nombre de la Carne");

        texto3Tamaño.setText(": (Grande g, Mediana m, Pequeña p)");

        texto4Precio.setText(": Precio(COP$)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(texto1CrearAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(varTamaño, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(texto3Tamaño))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(varNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(texto2Nombre))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(varPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(texto4Precio)))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioRoja, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radioBlanca, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(botonVolver)))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botonCrearCarne)
                .addGap(182, 182, 182))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(texto1CrearAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(varNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(texto2Nombre)
                        .addComponent(radioRoja)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(varTamaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texto3Tamaño)
                    .addComponent(radioBlanca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(varPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texto4Precio))
                .addGap(45, 45, 45)
                .addComponent(botonCrearCarne)
                .addGap(67, 67, 67)
                .addComponent(botonVolver)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioBlancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBlancaActionPerformed
        if (carneBlanca!=null) {
            carneBlanca= null;
        }
        carneRoja= "Roja";
    }//GEN-LAST:event_radioBlancaActionPerformed

    private void varNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varNombreActionPerformed
    }//GEN-LAST:event_varNombreActionPerformed

    private void radioRojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioRojaActionPerformed
        if (carneRoja!=null) {
            carneRoja= null;
        }
        carneBlanca= "Blanca";
    }//GEN-LAST:event_radioRojaActionPerformed

    private void botonCrearCarneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearCarneActionPerformed
        tamañoCarne= varTamaño.getText(); 
        nombreCarne= varNombre.getText();
        
        try{
            precioCarne = Double.parseDouble(varPrecio.getText());
            if("Nombre".equals(nombreCarne)||"Tamaño".equals(tamañoCarne)){
                JOptionPane.showMessageDialog(null, "Ha dejado espacios sin llenar");
            }else if(!"grande".equalsIgnoreCase(tamañoCarne) && !"g".equalsIgnoreCase(tamañoCarne) && !"mediana".equalsIgnoreCase(tamañoCarne) && !"m".equalsIgnoreCase(tamañoCarne) && !"pequeña".equalsIgnoreCase(tamañoCarne) && !"p".equalsIgnoreCase(tamañoCarne)){
                JOptionPane.showMessageDialog(null, "Ha digitado un tamaño incorrecto");
            }else{
                if(carneBlanca!=null){ZonaAlimentos.CrearCarne(nombreCarne, tamañoCarne, precioCarne, "Roja");
                    JOptionPane.showMessageDialog(null, "Guardado con Exito");
                    varTamaño.setText("Tamaño");
                    varNombre.setText("Nombre");
                    varPrecio.setText("Precio");
                }else if(carneRoja!=null){ZonaAlimentos.CrearCarne(nombreCarne, tamañoCarne, precioCarne, "Blanca");
                    JOptionPane.showMessageDialog(null, "Guardado con Exito");
                    varTamaño.setText("Tamaño");
                    varNombre.setText("Nombre");
                    varPrecio.setText("Precio");
                }else{JOptionPane.showMessageDialog(null, "No ha Seleccionado el color");}
            }
        }catch(NumberFormatException e){JOptionPane.showMessageDialog(null, "Ha digitado en precio un valor no númerico");} catch (SQLException ex) {
            Logger.getLogger(FrameCrearCarnico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonCrearCarneActionPerformed

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        FrutasFrame animalView = new FrutasFrame();
        animalView.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonVolverActionPerformed

    private void varPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varPrecioActionPerformed
    }//GEN-LAST:event_varPrecioActionPerformed

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

    private void varTamañoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varTamañoActionPerformed
    }//GEN-LAST:event_varTamañoActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCrearCarne;
    private javax.swing.JButton botonVolver;
    private javax.swing.ButtonGroup botones;
    private javax.swing.JRadioButton radioBlanca;
    private javax.swing.JRadioButton radioRoja;
    private javax.swing.JLabel texto1CrearAnimal;
    private javax.swing.JLabel texto2Nombre;
    private javax.swing.JLabel texto3Tamaño;
    private javax.swing.JLabel texto4Precio;
    private javax.swing.JTextField varNombre;
    private javax.swing.JTextField varPrecio;
    private javax.swing.JTextField varTamaño;
    // End of variables declaration//GEN-END:variables
}
