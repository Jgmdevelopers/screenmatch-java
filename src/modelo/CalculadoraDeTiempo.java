package modelo;

public class CalculadoraDeTiempo {
    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye(Titulo titulo){
        tiempoTotal += titulo.getTiempoDeDurancionEnMinutos();
    }



}
