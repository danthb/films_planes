package uniandes.cupi2.avion.interfaz;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;

/**
 * Panel de botones de interacci�n con el programa del avi�n
 */
public class PanelBotonesAvion extends JPanel implements ActionListener {
    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------

    /**
     * Opci�n registrar
     */
    public final static String REGISTRAR = "REGISTRAR_PASAJERO";

    /**
     * Opci�n anular
     */
    public final static String ANULAR = "ANULAR_PASAJERO";

    /**
     * Opci�n buscar
     */
    public final static String BUSCAR = "BUSCAR_PASAJERO";

    /**
     * Opci�n porcentaje de ocupaci�n
     */
    public final static String PORCENTAJE = "PORCENTAJE_OCUPACION";

    /**
     * Opci�n extensi�n 1
     */
    private final static String OPCION_1 = "OPCION_1";

    /**
     * Opci�n extensi�n 1
     */
    private final static String OPCION_2 = "OPCION_2";

    /**
     * Comando para agregar una pel�cula a un pasajero.
     */
    public final static String AGREGAR_PELICULA = "AGREGAR_PELICULA";

    /**
     * Comando para buscar las pel�culas de un pasajero.
     */
    public final static String BUSCAR_PELICULAS = "BUSCAR_PELICULAS";

    /**
     * Comando para la duraci�n total de las pel�culas.
     */
    public final static String DURACION_TOTAL_PELICULAS = "DURACION_TOTAL_PELICULAS";

    /**
     * Comando para dar las pel�culas de un g�nero.
     */
    public final static String PELICULAS_GENERO = "PELICULAS_GENERO";

    /**
     * Comando para informar si un pasajero tiene dos o mas pel�culas con la misma
     * duraci�n.
     */
    public final static String PELICULAS_MISMA_DURACION = "PELICULAS_MISMA_DURACION";

    // -----------------------------------------------------------------
    // Atributos de interfaz
    // -----------------------------------------------------------------

    /**
     * Bot�n Registro de nuevo pasajero
     */
    private JButton bRegistro;

    /**
     * Bot�n Anular
     */
    private JButton bAnular;

    /**
     * Bot�n de b�squeda
     */
    private JButton bBuscarPasajero;

    /**
     * Bot�n porcentaje de ocupaci�n
     */
    private JButton bPorcOcupacion;

    /**
     * Bot�n de extensi�n 1
     */
    private JButton botonOpcion1;

    /**
     * Bot�n de extensi�n 2
     */
    private JButton botonOpcion2;

    /**
     * Bot�n de agregar pel�culas.
     */
    private JButton bAgregarPelicula;

    /**
     * Bot�n para buscar pel�culas.
     */
    private JButton bBuscarPeliculas;

    /**
     * Bot�n para la duraci�n total de las pel�culas.
     */
    private JButton bDuracionTotalPeliculas;

    /**
     * Bot�n para dar las pel�culas de un g�nero.
     */
    private JButton bPeliculasGenero;

    /**
     * Bot�n para detemrianr si hay dos pel�culas con la misma duraci�n.
     */
    private JButton bPeliculasMismaDuracion;

    /**
     * Interfaz principal
     */
    private InterfazAvion ventana;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Crea el panel de botones <br>
     * <b <post: </b> se crean y alistan los botones de la interfaz.
     * 
     * @param laVentana - ventana o frame padre - laVentana != null
     */
    public PanelBotonesAvion(InterfazAvion laVentana) {
        // guarda la referencia a la ventana padre
        ventana = laVentana;

        // Configura propiedades visuales
        setLayout(new GridLayout(6, 3, 8, 2));
        setBorder(new EmptyBorder(5, 5, 5, 5));

        // Linea avi�n
        add(new JLabel("Opciones del avi�n:"));
        add(new JLabel());
        add(new JLabel());

        // Bot�n registrar
        bRegistro = new JButton("Registrar pasajero");
        bRegistro.setActionCommand(REGISTRAR);
        bRegistro.addActionListener(this);
        bRegistro.setPreferredSize(new Dimension(40, 10));
        add(bRegistro);

        // Bot�n anular registro
        bAnular = new JButton("Eliminar pasajero");
        bAnular.setActionCommand(ANULAR);
        bAnular.addActionListener(this);
        add(bAnular);

        // Bot�n buscar pasajero
        bBuscarPasajero = new JButton("Buscar pasajero");
        bBuscarPasajero.setActionCommand(BUSCAR);
        bBuscarPasajero.addActionListener(this);
        add(bBuscarPasajero);

        // Bot�n porcentaje de ocupaci�n
        bPorcOcupacion = new JButton("Porcentaje ocupaci�n");
        bPorcOcupacion.setActionCommand(PORCENTAJE);
        bPorcOcupacion.addActionListener(this);
        add(bPorcOcupacion);

        // Bot�n duraci�n total de pel�culas
        bDuracionTotalPeliculas = new JButton("Duraci�n total pel�culas");
        bDuracionTotalPeliculas.setActionCommand(DURACION_TOTAL_PELICULAS);
        bDuracionTotalPeliculas.addActionListener(this);
        add(bDuracionTotalPeliculas);

        // vac�o al final
        add(new JLabel());

        // l�nea pasajero
        add(new JLabel("Opciones del pasajero:"));
        add(new JLabel());
        add(new JLabel());

        // Bot�n agregar pel�cula
        bAgregarPelicula = new JButton("Agregar pel�cula");
        bAgregarPelicula.setActionCommand(AGREGAR_PELICULA);
        bAgregarPelicula.addActionListener(this);
        add(bAgregarPelicula);

        // Bot�n buscar pel�culas
        bBuscarPeliculas = new JButton("Buscar pel�culas");
        bBuscarPeliculas.setActionCommand(BUSCAR_PELICULAS);
        bBuscarPeliculas.addActionListener(this);
        add(bBuscarPeliculas);

        // Bot�n pel�culas de g�nero
        bPeliculasGenero = new JButton("Pel�culas g�nero");
        bPeliculasGenero.setActionCommand(PELICULAS_GENERO);
        bPeliculasGenero.addActionListener(this);
        add(bPeliculasGenero);

        // Bot�n pel�culas misma duraci�n
        bPeliculasMismaDuracion = new JButton("Pel�culas misma duraci�n");
        bPeliculasMismaDuracion.setActionCommand(PELICULAS_MISMA_DURACION);
        bPeliculasMismaDuracion.addActionListener(this);
        add(bPeliculasMismaDuracion);

        // Botones de opciones adicionales
        botonOpcion1 = new JButton("Opci�n 1");
        botonOpcion1.setActionCommand(OPCION_1);
        botonOpcion1.addActionListener(this);
        add(botonOpcion1);
        botonOpcion2 = new JButton("Opci�n 2");
        botonOpcion2.setActionCommand(OPCION_2);
        botonOpcion2.addActionListener(this);
        add(botonOpcion2);
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

        if (comando.equals(REGISTRAR)) {
            ventana.registrarPasajero();
        } else if (comando.equals(ANULAR)) {
            ventana.anularPasajero();
        } else if (comando.equals(BUSCAR)) {
            ventana.buscarPasajero();
        } else if (comando.equals(PORCENTAJE)) {
            ventana.mostrarPorcentajeOcupacion();
        } else if (comando.equals(OPCION_1)) {
            ventana.reqFuncOpcion1();
        } else if (comando.equals(OPCION_2)) {
            ventana.reqFuncOpcion2();
        } else if (comando.equals(AGREGAR_PELICULA)) {
            ventana.mostrarDialogoAgregarPelicula();
        } else if (comando.equals(BUSCAR_PELICULAS)) {
            ventana.buscarPeliculas();
        } else if (comando.equals(DURACION_TOTAL_PELICULAS)) {
            ventana.duracionTotalPeliculas();
        } else if (comando.equals(PELICULAS_GENERO)) {
            ventana.mostrarDialogoPeliculasGenero();
        } else if (comando.equals(PELICULAS_MISMA_DURACION)) {
            ventana.peliculasMismaDuracion();
        }
    }
}