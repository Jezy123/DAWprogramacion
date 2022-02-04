package Controles.Control03;

public class Ordenador {
    private boolean formato;//Verdadero: portatil / falso: sobremesa
    private String color;
    private Teclado teclado;
    private Ordenador conexiOrdenador;
    public static int contador;


    public boolean isFormato() {
        return formato;
    }

    public String getColor() {
        return color;
    }

    public Teclado getTeclado() {
        return teclado;
    }
    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    //Constructor ordenador sin parametros
    public Ordenador(){
        formato = false;
        color = "Negro";
        teclado = null;
        incrementarContador();
    }

    //Constructor con parametros
    public Ordenador(boolean formato, String color, Teclado teclado) {
        this.formato = formato;
        this.color = color;
        this.teclado = teclado;
        incrementarContador();
    }

    private void incrementarContador(){
        contador++;
    }
    
    public void conectarOrdenador(Ordenador ordenador){
        conexiOrdenador = ordenador;
    }

    
}
