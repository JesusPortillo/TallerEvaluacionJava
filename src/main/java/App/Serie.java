package App;

public class Serie implements Entregable{
    static final boolean estadoEntregado = false;
    static final int temporadasPorDefecto =0;
    private String titulo, genero, creador;
    private int temporadas;
    private boolean entregado;

    public Serie(){
        this.temporadas= temporadasPorDefecto;
        this.entregado= estadoEntregado;
        this.titulo="";
        this.genero="";
        this.creador="";
    }
    public Serie(String titulo, String creador){
        this.temporadas= temporadasPorDefecto;
        this.entregado= estadoEntregado;
        this.titulo=titulo;
        this.creador=creador;
        this.genero="";
    }

    public Serie(String titulo, String genero, String creador, int temporadas) {
        this.titulo = titulo;
        this.genero = genero;
        this.creador = creador;
        this.temporadas = temporadas;
        this.entregado=false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    @Override
    public String toString() {
        return  "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                ", temporadas=" + temporadas +
                ", entregado=" + entregado ;
    }

    @Override
    public void entregar() {
        this.entregado=true;
    }

    @Override
    public void devolver() {
        this.entregado=false;
    }

    @Override
    public boolean isEntregado() {
        return this.entregado;
    }

    @Override
    public int compareTo(Object a) {
        int resultado=-1;
        Serie miSerie= (Serie) a;
        if (this.temporadas>miSerie.getTemporadas()){
            resultado=1;
        }else if(this.temporadas==miSerie.getTemporadas()){
            resultado=0;
        }
        return resultado;
    }
}