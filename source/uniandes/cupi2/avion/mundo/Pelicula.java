package uniandes.cupi2.avion.mundo;

public class Pelicula {

    public static final String ACCION = "Acción";
    public static final String COMEDIA = "Comedia";
    public static final String DRAMA = "Drama";
    public static final String INFANTIL = "Infantil";
    public static final String ROMANCE = "Romance";

    private String nombre;
    private String genero;
    private int duracion;
    private String director;

    public Pelicula(String nombre, String genero, int duracion, String director) {
        this.nombre = nombre;
        this.genero = genero;
        this.duracion = duracion;
        this.director = director;
    }

    public String darNombre() {
        return nombre;
    }

    public String darGenero() {
        return genero;
    }

    public int darDuracion() {
        return duracion;
    }

    public String darDirector() {
        return director;
    }

    public void cambiarNombre(String pNombre) {
        nombre = pNombre;
    }

    public void cambiarGenero(String pGener) {
        genero = pGener;
    }

    public void cambiarDuracion(int pDuracion) {
        duracion = pDuracion;
    }

    public void cambiarDirector(String pDirector) {
        director = pDirector;
    }

    public String returnString() {
        /**
         * Retorna una cadena de texto con la información de la película
         * siguiendo el siguiente formato:
         * <nombre> (<genero>). <duracion> minutos - director.
         * 
         * @return La cadena de texto con el formato definido.
         */
        String strInfo = String.format(
                "My name"
                        + " is: %1$s, %1$s and %2$s",
                nombre, genero);
        return strInfo;
    }
}
