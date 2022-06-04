
import java.util.ArrayList;

public class Artistas extends Usuario{
    private String nombre_artistico;
    private ArrayList <Cancion> canciones = new ArrayList();
    private ArrayList <Album> albumes = new ArrayList();

    public Artistas(String nombre_artistico) {
        this.nombre_artistico = nombre_artistico;
    }

    public Artistas(String nombre_artistico, String username, String contrasena, int edad) {
        super(username, contrasena, edad);
        this.nombre_artistico = nombre_artistico;
    }

    public String getNombre_artistico() {
        return nombre_artistico;
    }

    public void setNombre_artistico(String nombre_artistico) {
        this.nombre_artistico = nombre_artistico;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public ArrayList<Album> getAlbumes() {
        return albumes;
    }

    public void setAlbumes(ArrayList<Album> albumes) {
        this.albumes = albumes;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Artistas{" + "nombre_artistico=" + nombre_artistico + ", canciones=" + canciones + ", albumes=" + albumes + '}';
    }
    
}
