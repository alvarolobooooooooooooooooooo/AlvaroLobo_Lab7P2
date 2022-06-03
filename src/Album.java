
import java.util.ArrayList;
import java.util.Date;

public class Album extends Lanzamientos{
    private ArrayList <Cancion> canciones_pertenecientes = new ArrayList();
    private int cantidad_canciones;

    public Album(int cantidad_canciones) {
        this.cantidad_canciones = cantidad_canciones;
    }

    public Album(int cantidad_canciones, String titulo, String Fecha) {
        super(titulo, Fecha);
        this.cantidad_canciones = cantidad_canciones;
    }

    public ArrayList<Cancion> getCanciones_pertenecientes() {
        return canciones_pertenecientes;
    }

    public void setCanciones_pertenecientes(ArrayList<Cancion> canciones_pertenecientes) {
        this.canciones_pertenecientes = canciones_pertenecientes;
    }

    public int getCantidad_canciones() {
        return cantidad_canciones;
    }

    public void setCantidad_canciones(int cantidad_canciones) {
        this.cantidad_canciones = cantidad_canciones;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public int getConteo_likes() {
        return conteo_likes;
    }

    public void setConteo_likes(int conteo_likes) {
        this.conteo_likes = conteo_likes;
    }

    @Override
    public String toString() {
        return getTitulo();
    }


    
    

    
}
