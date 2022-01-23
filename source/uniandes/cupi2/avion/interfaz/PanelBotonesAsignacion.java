package uniandes.cupi2.avion.interfaz;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

/**
 * Panel de botones para el di�logo de asignaci�n
 */
public class PanelBotonesAsignacion extends JPanel implements ActionListener {

    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------

    /**
     * Opci�n Aceptar
     */
    public final static String ACEPTAR = "ACEPTAR";

    /**
     * Opci�n Cancelar
     */
    public final static String CANCELAR = "CANCELAR";

    // -----------------------------------------------------------------
    // Atributos de interfaz
    // -----------------------------------------------------------------

    /**
     * Bot�n aceptar
     */
    private JButton botonAceptar;

    /**
     * Bot�n cancelar
     */
    private JButton botonCancelar;

    /**
     * Di�logo del que hace parte el panel
     */
    private DialogoAsignacion dialogo;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Crea el panel de botones para la asignaci�n de cupo en el avi�n
     * 
     * @param elDialogo - di�logo al que pertenece el panel de botones - elDialogo
     *                  != null
     */
    public PanelBotonesAsignacion(DialogoAsignacion elDialogo) {
        setLayout(new GridLayout(1, 2, 8, 1));
        dialogo = elDialogo;

        // Aceptar
        botonAceptar = new JButton();
        botonAceptar.setText("Aceptar");
        botonAceptar.setActionCommand(ACEPTAR);
        botonAceptar.addActionListener(this);
        add(botonAceptar);

        // Cancelar
        botonCancelar = new JButton();
        botonCancelar.setText("Cancelar");
        botonCancelar.setActionCommand(CANCELAR);
        botonCancelar.addActionListener(this);
        add(botonCancelar);
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
            dialogo.registrar();
        } else if (comando.equals(CANCELAR)) {
            dialogo.cancelar();
        }
    }
}