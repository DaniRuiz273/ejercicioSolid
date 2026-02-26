package rrhh;

public class App {

    public static void main(String[] args) {
        AltaEmpleadoService s = new AltaEmpleadoService();
        s.alta("11111111A", "Lucía");
        s.alta("22222222B", "Álvaro");
    }
}