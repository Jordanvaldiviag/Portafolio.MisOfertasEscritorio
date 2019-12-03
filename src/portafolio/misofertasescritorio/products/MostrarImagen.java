/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portafolio.misofertasescritorio.products;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Acer
 */
public class MostrarImagen extends JFrame{
    
    BufferedImage img = null;
    
    public MostrarImagen(){
                
        add(new Insertar_Graficos());
        initComponents();
        setVisible(true);
        

        try {
            //Dentro del File ponemos la ruta exacta de nuestro archivo de imagen a cargar....
            URL url = new URL(UpdateProducts.imagenDelProducto);
            img = ImageIO.read(url);
        }catch (IOException ex) {

            Logger.getLogger(MostrarImagen.class.getName()).log(Level.SEVERE, null, ex);

        }

        setSize(new Dimension(img.getWidth(), img.getHeight()));
    }
    
    public class Insertar_Graficos extends JPanel{

        @Override
        public void paint(Graphics g){
            //System.out.println("graficos");
            super.paint(g);
            Graphics2D g2 = (Graphics2D) g;
            g2.drawImage(img, 0,0, this);
        }

    }
         
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">

    private void initComponents() {
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    

    public static void main(String[] args) {
        new MostrarImagen();
    }

}
