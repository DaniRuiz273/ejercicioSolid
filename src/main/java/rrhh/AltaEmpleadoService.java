package rrhh;

public class AltaEmpleadoService {

    private final RepositorioEmpleadosEnMemoria repositorio = new RepositorioEmpleadosEnMemoria();
    private final GeneradorPasswordSimple generadorPassword = new GeneradorPasswordSimple();

    public Empleado alta(String dni, String nombre) {
        if (dni == null || dni.isBlank()) throw new IllegalArgumentException("DNI requerido");
        if (repositorio.existe(dni)) throw new IllegalStateException("Ya existe empleado");

        String passwordTemporal = generadorPassword.generar();
        Empleado e = new Empleado(dni, nombre, passwordTemporal);

        repositorio.guardar(e);

        // Simulación de “envío” (sin I/O real)
        System.out.println("Creado usuario para " + nombre + " con password temporal: " + passwordTemporal);
        return e;
    }
}