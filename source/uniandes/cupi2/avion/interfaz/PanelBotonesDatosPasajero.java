package uniandes.cupi2.avion.interfaz;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

/**
 * Panel de los botones de la ventana de informaci�n del pasajero
 */
public class PanelBotonesDatosPasajero extends JPanel implements ActionListener {

    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------

    /**
     * Opci�n Aceptar
     */
    public final static String ACEPTAR = "ACEPTAR";

    // -----------------------------------------------------------------
    // Atributos de interfaz
    // -----------------------------------------------------------------

    /**
     * Ventana principal
     */
    private VentanaDatosPasajero ventana;

    /**
     * Bot�n aceptar
     */
    private JButton botonAceptar;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Crea el panel de botones de la ventana de datos del pasajero
     * 
     * @param laVentana - Ventana de la que hace parte el panel
     */
    public PanelBotonesDatosPasajero(VentanaDatosPasajero laVentana) {
        setLayout(new GridLayout(1, 2, 10, 1));
        ventana = laVentana;

        // Aceptar
        botonAceptar = new JButton();
        botonAceptar.setText("Aceptar");
        botonAceptar.setActionCommand(ACEPTAR);
        botonAceptar.addActionListener(this);
        add(botonAceptar);
    }

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------
    /**
     * Acciones de respuesta a los eventos de la interfaz
     * 
     * @param evento - evento generado por un elemento de la interfaz
     */
    public void actionPerformed(ActionEvent evento) {
        String comando = evento.getActionCommand();

        if (comando.equals(ACEPTAR)) {
            ventana.aceptar();
        }
    }
}