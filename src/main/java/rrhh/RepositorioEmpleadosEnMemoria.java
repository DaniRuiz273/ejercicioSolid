package rrhh;

import java.util.HashMap;
import java.util.Map;

public class RepositorioEmpleadosEnMemoria {

    private final Map<String, Empleado> bd = new HashMap<>();

    public boolean existe(String dni) {
        return bd.containsKey(dni);
    }

    public void guardar(Empleado e) {
        bd.put(e.getDni(), e);
    }
}