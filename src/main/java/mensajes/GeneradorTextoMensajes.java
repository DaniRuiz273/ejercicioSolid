package mensajes;

public class GeneradorTextoMensajes {

    public String generar(Mensaje msg) {
        String asuntoBase = "[" + msg.getCanal().toUpperCase() + "] ";

        if (msg.getTipo() == TipoMensaje.AVISO) {
            return asuntoBase + "Aviso: " + msg.getTitulo() + "\n" +
                   "Hola " + msg.getDestinatario() + ",\n" +
                   msg.getCuerpo() + "\n" +
                   "Fecha: " + msg.getFecha() + "\n";
        }

        if (msg.getTipo() == TipoMensaje.INCIDENCIA) {
            return asuntoBase + "Incidencia (" + msg.getGravedad() + "): " + msg.getTitulo() + "\n" +
                   "Alumno/a: " + msg.getAlumno() + "\n" +
                   "Tutoría: " + msg.getTutoria() + "\n" +
                   "Detalle: " + msg.getCuerpo() + "\n";
        }

        if (msg.getTipo() == TipoMensaje.FELICITACION) {
            return asuntoBase + "¡Enhorabuena! " + msg.getTitulo() + "\n" +
                   msg.getDestinatario() + ", " + msg.getCuerpo() + "\n";
        }

        return asuntoBase + msg.getTitulo() + "\n" + msg.getCuerpo();
    }
}