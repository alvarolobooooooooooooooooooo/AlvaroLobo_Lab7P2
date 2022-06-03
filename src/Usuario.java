public class Usuario {
    protected String username;
    protected String contrasena;
    protected int edad;

    public Usuario() {
    }

    
    public Usuario(String username, String contrasena, int edad) {
        this.username = username;
        this.contrasena = contrasena;
        this.edad = edad;
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
        return "Usuario{" + "username=" + username + ", contrasena=" + contrasena + ", edad=" + edad + '}';
    }
    
    
}
