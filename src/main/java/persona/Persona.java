package persona;

public class Persona {

    private String nombre;
    private String apellido;
    private int cedula;

    public Persona(String nombre, String apellido, int cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public long getCedula() {
        return cedula;
    }


    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void mostrarPersona(){

        System.out.println(


                "nombre='" + nombre + '\'' +
                        ", apellido=" + apellido+
                        ", cedula=" + cedula


        );

    }

}
