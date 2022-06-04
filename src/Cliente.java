
import java.util.ArrayList;

public class Cliente extends Usuario{
    private ArrayList <Cancion> canciones_favoritas = new ArrayList();
    private ArrayList <ListaReproduccion> listas_de_reproduccion = new ArrayList();
    private ArrayList <Cancion> Lista_Me_Gusta = new ArrayList();

    public Cliente() {
    }

    public Cliente(String username, String contrasena, int edad) {
        super(username, contrasena, edad);
    }

    public ArrayList<Cancion> getCanciones_favoritas() {
        return canciones_favoritas;
    }

    public void setCanciones_favoritas(ArrayList<Cancion> canciones_favoritas) {
        this.canciones_favoritas = canciones_favoritas;
    }

    public ArrayList<ListaReproduccion> getListas_de_reproduccion() {
        return listas_de_reproduccion;
    }

    public void setListas_de_reproduccion(ArrayList<ListaReproduccion> listas_de_reproduccion) {
        this.listas_de_reproduccion = listas_de_reproduccion;
    }

    public ArrayList<Cancion> getLista_Me_Gusta() {
        return Lista_Me_Gusta;
    }

    public void setLista_Me_Gusta(ArrayList<Cancion> Lista_Me_Gusta) {
        this.Lista_Me_Gusta = Lista_Me_Gusta;
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
        return "Cliente{" + "canciones_favoritas=" + canciones_favoritas + ", listas_de_reproduccion=" + listas_de_reproduccion + ", Lista_Me_Gusta=" + Lista_Me_Gusta + '}';
    }
    
}
