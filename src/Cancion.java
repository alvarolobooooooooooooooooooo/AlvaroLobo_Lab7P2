public class Cancion {
    private String titulo;
    private double duracion;
    private String ref_album;

    public Cancion(String titulo, double duracion, String ref_album) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.ref_album = ref_album;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getRef_album() {
        return ref_album;
    }

    public void setRef_album(String ref_album) {
        this.ref_album = ref_album;
    }

    @Override
    public String toString() {
        return titulo;
    }



 
    
}
