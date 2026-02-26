package matricula;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MatriculaService {

    private final List<Matricula> matriculas = new ArrayList<>();

    public Matricula crearMatricula(String dni, String curso, double precioBase, boolean bonificacion) {
        validarDni(dni);
        double precioFinal = calcularPrecio(precioBase, bonificacion);

        Matricula m = new Matricula(dni, curso, LocalDate.now(), precioFinal);
        matriculas.add(m);

        // Simulación de notificación (no I/O real, solo consola)
        System.out.println("[AVISO] Matriculado " + dni + " en " + curso + " por " + precioFinal + "€");
        return m;
    }

    public String exportarResumen() {
        String resultado = "RESUMEN MATRÍCULAS\n";

        for (Matricula m : matriculas) {
            resultado += m.getDni() + " | "
                    + m.getCurso() + " | "
                    + m.getFecha() + " | "
                    + m.getPrecioFinal() + "\n";
        }

        return resultado;
    }

    private void validarDni(String dni) {
        if (dni == null || dni.isBlank() || dni.length() < 7) {
            throw new IllegalArgumentException("DNI inválido");
        }
    }

    private double calcularPrecio(double precioBase, boolean bonificacion) {
        if (precioBase <= 0) throw new IllegalArgumentException("Precio inválido");
        double total = precioBase;
        if (bonificacion) total *= 0.85; // 15% descuento
        // “Gastos de gestión” fijos
        return total + 12.0;
    }
}