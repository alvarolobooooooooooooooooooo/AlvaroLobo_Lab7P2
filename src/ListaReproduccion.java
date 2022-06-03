
import java.util.ArrayList;

public class ListaReproduccion {
   private String nombre;
   private ArrayList <Cancion> canciones_agregadas = new ArrayList();
   private int conteo_likes = 0;

    public ListaReproduccion(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cancion> getCanciones_agregadas() {
        return canciones_agregadas;
    }

    public void setCanciones_agregadas(ArrayList<Cancion> canciones_agregadas) {
        this.canciones_agregadas = canciones_agregadas;
    }

    public int getConteo_likes() {
        return conteo_likes;
    }

    public void setConteo_likes(int conteo_likes) {
        this.conteo_likes = conteo_likes;
    }

    @Override
    public String toString() {
        return nombre;
    }
   
}
