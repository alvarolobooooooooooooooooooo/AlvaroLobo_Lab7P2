

public class Lanzamientos {
   protected String titulo;
   protected String Fecha;
   protected int conteo_likes = 0;

    public Lanzamientos() {
    }

    public Lanzamientos(String titulo, String Fecha) {
        this.titulo = titulo;
        this.Fecha = Fecha;
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
        return "Lanzamientos{" + "titulo=" + titulo + ", Fecha=" + Fecha + ", conteo_likes=" + conteo_likes + '}';
    }

    
   
}
