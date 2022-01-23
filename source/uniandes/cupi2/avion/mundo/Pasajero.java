package uniandes.cupi2.avion.mundo;

import java.util.ArrayList;

/**
 * Pasajero del avi�n
 */
public class Pasajero {

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------
    /**
     * C�dula del pasajero
     */
    private int cedula;

    /**
     * Nombre del pasajero
     */
    private String nombre;

    /**
     * Lista de pel�culas del pasajero.
     */
    private ArrayList listaPeliculas;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Crea a un pasajero con su c�dula y nombre <br>
     * <b>post: </b>El pasajero tiene sus datos b�sicos c�dula y nombre asignados.
     * 
     * @param unaCedula - c�dula del pasajero - unaCedula >0
     * @param unNombre  - nombre del pasajero - unNombre != ""
     */
    public Pasajero(int unaCedula, String unNombre) {
        cedula = unaCedula;
        nombre = unNombre;
        listaPeliculas = new ArrayList();
    }

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    /**
     * Retorna la c�dula del pasajero
     * 
     * @return cedula del pasajero
     */
    public int darCedula() {
        return cedula;
    }

    /**
     * Retorna el nombre del pasajero
     * 
     * @return nombre del pasajero
     */
    public String darNombre() {
        return nombre;
    }

    /**
     * Indica si el pasajero es igual a otro.
     * 
     * @param otroPasajero - pasajero a comparar - otroPasajero != null
     * @return true si es el mismo pasajero, false en caso contrario
     */
    public boolean igualA(Pasajero otroPasajero) {
        if (cedula == otroPasajero.darCedula())
            return true;
        else
            return false;
    }

    /**
     * Devuelve la lista de pel�culas del pasajero.
     * 
     * @return Lista de pel�culas del pasajero.
     */
    public ArrayList darPeliculas() {
        return listaPeliculas;
    }

    /**
     * Agrega una pel�cula a la lista.
     * 
     * @param nombre   Nombre de la pel�cula. nombre !="" && nombre !=null.
     * @param genero   G�nero de la pel�cula. genero !="" && genero !=null.
     * @param duracion Duraci�n en minutos de la pel�cula. duracion > 0.
     * @param director Director de la pel�cula. director != null && director !="".
     */
    public void agregarPelicula(String nombre, String genero, int duracion, String director) {
        Pelicula pelicula = new Pelicula(nombre, genero, duracion, director);
        listaPeliculas.add(pelicula);
    }

    /**
     * Devuelve la duraci�n total de las pel�culas programadas por el pasajero.
     * 
     * @return Suma de la duraci�n de cada una de las pel�culas del pasajero.
     */
    public int darDuracionTotalPeliculas() {
        int duracionTotal = 0;
        for (int i = 0; i < listaPeliculas.size(); i++) {
            Pelicula pelicula = (Pelicula) listaPeliculas.get(i);
            duracionTotal += pelicula.darDuracion();
        }
        return duracionTotal;
    }

    /**
     * Devuelve una lista de las películas que pertenecen a un género determinado
     * por parámetro.
     * 
     * @param genero Género al que pertencen las películas.
     * @return Lista de las películas que pertenecen al género.
     */
    public ArrayList darPeliculasGenero(String genero) {
        ArrayList listaPeliculasGenero = new ArrayList();
        for (int i = 0; i < listaPeliculas.size(); i++) {
            Pelicula pelicula = (Pelicula) listaPeliculas.get(i);
            if (pelicula.darGenero().equals(genero))
                listaPeliculasGenero.add(pelicula);
        }
        return listaPeliculasGenero;
    }

    /**
     * Determina si hay dos películas que tengan la misma duración.
     * 
     * @return True si hay dos películas con la misma duración, false de lo
     *         contrario.
     */
    public boolean tienePeliculasMismaDuracion() {
        boolean hayPeliculasMismaDuracion = false;
        for (int i = 0; i < listaPeliculas.size() - 1; i++) {
            Pelicula pelicula1 = (Pelicula) listaPeliculas.get(i);
            for (int j = i + 1; j < listaPeliculas.size(); j++) {
                Pelicula pelicula2 = (Pelicula) listaPeliculas.get(j);
                if (pelicula1.darDuracion() == pelicula2.darDuracion())
                    hayPeliculasMismaDuracion = true;
            }
        }
        return hayPeliculasMismaDuracion;

    }

}