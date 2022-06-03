public class Singles extends Lanzamientos{
    private Cancion cancion_perteneciente;

    public Singles() {
    }

    public Singles(String titulo, String Fecha) {
        super(titulo, Fecha);
    }

    
    public Singles(Cancion cancion_perteneciente, String titulo, String Fecha) {
        super(titulo, Fecha);
        this.cancion_perteneciente = cancion_perteneciente;
    }

    public Cancion getCancion_perteneciente() {
        return cancion_perteneciente;
    }

    public void setCancion_perteneciente(Cancion cancion_perteneciente) {
        this.cancion_perteneciente = cancion_perteneciente;
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
