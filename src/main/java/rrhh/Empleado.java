package rrhh;

public class Empleado {

    private final String dni;
    private final String nombre;
    private final String passwordTemporal;

    public Empleado(String dni, String nombre, String passwordTemporal) {
        this.dni = dni;
        this.nombre = nombre;
        this.passwordTemporal = passwordTemporal;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPasswordTemporal() {
        return passwordTemporal;
    }
}