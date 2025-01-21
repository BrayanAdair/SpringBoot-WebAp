package mx.capi.expediente.Modelo;

public class Expediente {

    private long id;
    private String titulo;
    private String concepto;

    public Expediente() {

    }

    public Expediente(long id, String titulo, String concepto) {
        this.id = id;
        this.titulo = titulo;
        this.concepto = concepto;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    @Override
    public String toString() {
        return "Expediente{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", concepto='" + concepto + '\'' +
                '}';
    }
}
