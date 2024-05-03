package modelo;

public class Titulo {

    private String nombre;
    private int fechaDeLanzamiento;

    private double evaluacion;

    private boolean incluiodoEnElPlanBasico;

    private String sinopsis;

    private int tiempoDeDurancionEnMinutos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public boolean isIncluiodoEnElPlanBasico() {
        return incluiodoEnElPlanBasico;
    }

    public void setIncluiodoEnElPlanBasico(boolean incluiodoEnElPlanBasico) {
        this.incluiodoEnElPlanBasico = incluiodoEnElPlanBasico;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getTiempoDeDurancionEnMinutos() {
        return tiempoDeDurancionEnMinutos;
    }

    public void setTiempoDeDurancionEnMinutos(int tiempoDeDurancionEnMinutos) {
        this.tiempoDeDurancionEnMinutos = tiempoDeDurancionEnMinutos;
    }

    public void muestraFichaTecnica(){
        System.out.println("***Ficha Técnica***");
        System.out.println("Nombre del Titulo: " + nombre);
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Tiempo de duración: "+ getTiempoDeDurancionEnMinutos() + " minutos");
    }
}
