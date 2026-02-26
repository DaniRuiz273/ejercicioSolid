package mensajes;

public class Mensaje {

    private final TipoMensaje tipo;
    private final String canal;
    private final String destinatario;
    private final String titulo;
    private final String cuerpo;
    private final String fecha;

    // Atributos extra para indicencias
    private final String alumno;
    private final String tutoria;
    private final String gravedad;

    public Mensaje(TipoMensaje tipo,
                   String canal,
                   String destinatario,
                   String titulo,
                   String cuerpo,
                   String fecha,
                   String alumno,
                   String tutoria,
                   String gravedad) {
        this.tipo = tipo;
        this.canal = canal;
        this.destinatario = destinatario;
        this.titulo = titulo;
        this.cuerpo = cuerpo;
        this.fecha = fecha;
        this.alumno = alumno;
        this.tutoria = tutoria;
        this.gravedad = gravedad;
    }

    public TipoMensaje getTipo() { return tipo; }
    public String getCanal() { return canal; }
    public String getDestinatario() { return destinatario; }
    public String getTitulo() { return titulo; }
    public String getCuerpo() { return cuerpo; }
    public String getFecha() { return fecha; }

    public String getAlumno() { return alumno; }
    public String getTutoria() { return tutoria; }
    public String getGravedad() { return gravedad; }
}