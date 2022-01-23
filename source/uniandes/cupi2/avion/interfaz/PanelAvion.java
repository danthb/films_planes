package uniandes.cupi2.avion.interfaz;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.*;

import uniandes.cupi2.avion.mundo.*;

/**
 * Panel para el dibujo del avi�n
 */
public class PanelAvion extends JPanel {
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Avi�n del modelo del mundo
     */
    private Avion avion;

    // -----------------------------------------------------------------
    // Atributos de interfaz
    // -----------------------------------------------------------------

    /**
     * Imagen del avi�n
     */
    private ImageIcon imagen;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Crea el panel del avi�n <br>
     * <b>post: <b>Se dibujan el avi�n y todas las sillas
     * 
     * @param avion1 - avi�n que se va a dibujar - avion1 != null
     */
    public PanelAvion(Avion avion1) {
        super(new BorderLayout());
        avion = avion1;
        imagen = new ImageIcon("data/imagenes/planoAvion.gif");
        setPreferredSize(new Dimension(imagen.getIconWidth(), imagen.getIconHeight()));
        setOpaque(false);

        // Adiciona las im�genes de las sillas ejecutivas
        JPanel panelEjecutivas = new JPanel();
        dibujarSillasEjecutivas(panelEjecutivas);
        add(panelEjecutivas, BorderLayout.NORTH);

        // Adiciona las im�genes de las sillas economicas
        JPanel panelEconomicas = new JPanel();
        dibujarSillasEconomicas(panelEconomicas);
        add(panelEconomicas, BorderLayout.CENTER);
    }

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    /**
     * Dibuja la gr�fica del avi�n
     * 
     * @param grafica - gr�ficos del avi�n - grafica != null
     */
    public void paint(Graphics grafica) {
        grafica.drawImage(imagen.getImage(), 0, 0, null, null);
        super.paint(grafica);
    }

    /**
     * Crea las gr�ficas de las sillas ejecutivas del avi�n <br>
     * <b>pre: </b> avion != null. <br>
     * <b>post: </b> Se dibujan las sillas ejecutivas del avi�n.
     * 
     * @param panel - panel donde se pintan las sillas
     */
    private void dibujarSillasEjecutivas(JPanel panel) {
        panel.setLayout(new GridLayout(Avion.SILLAS_EJECUTIVAS / 4, 5, 8, 5));
        panel.setBorder(new EmptyBorder(90, 210, 20, 210));

        Silla[] ejecutivas = avion.obtenerSillasEjecutivas();
        Silla silla;

        for (int i = 0; i < ejecutivas.length; i++) {
            silla = ejecutivas[i];
            SillaGrafica sillaG = new SillaGrafica(silla);
            panel.add(sillaG);
            if (i % 4 == 1) {
                panel.add(new JLabel(" "));
            }
        }
        panel.setOpaque(false);
    }

    /**
     * Crea las gr�ficas de las sillas econ�micas del avi�n <br>
     * <b>pre: </b> avion != null. <br>
     * <b>post: </b> Se dibujan las sillas econ�micas del avi�n.
     * 
     * @param panel - panel donde se pintan las sillas
     */
    private void dibujarSillasEconomicas(JPanel panel) {
        panel.setLayout(new GridLayout(Avion.SILLAS_ECONOMICAS / 6, 7, 5, 4));
        panel.setBorder(new EmptyBorder(0, 200, 100, 200));

        Silla[] economicas = avion.obtenerSillasEconomicas();
        Silla silla;

        for (int i = 0; i < economicas.length; i++) {
            silla = economicas[i];

            SillaGrafica sillaG = new SillaGrafica(silla);
            panel.add(sillaG);
            if (i % 6 == 2) {
                panel.add(new JLabel(" "));
            }
        }
        panel.setOpaque(false);
    }
}