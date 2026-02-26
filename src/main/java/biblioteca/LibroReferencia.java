package biblioteca;

import java.time.LocalDate;

public class LibroReferencia extends Libro {

    public LibroReferencia(String titulo) {
        super(titulo);
    }

    @Override
    public void prestarA(String dni, LocalDate fechaDevolucion) {
        // Como no se pueden prestar, ponemos que se prestan a SALA
        this.prestadoA = "SALA";
        this.fechaDevolucion = LocalDate.now();
    }
}