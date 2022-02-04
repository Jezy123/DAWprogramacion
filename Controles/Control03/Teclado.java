package Controles.Control03;

public class Teclado {

    private String color;
    private int numeroDeTeclas;
    private boolean conectividad;//verdadero: inalambrico/ falso: con cable
    private String idioma;
    private boolean formato;//verdadero:compacto/ falso: extendido
    private static int contador=0;// Cuenta el numero de teclados que hay

    public static int getcontador() {
        return contador;
    }

    public String getColor() {
        return color;
    }

    public int getNumeroDeTeclas() {
        return numeroDeTeclas;
    }

    public boolean isConectividad() {
        return conectividad;
    }

    public String getIdioma() {
        return idioma;
    }

    public boolean isFormato() {
        return formato;
    }

    public Teclado() {
        color = "Negro";
        numeroDeTeclas = 104;
        conectividad = false;
        idioma = "ES";
        incrementarContador();
    }

    public Teclado(String color, int numeroDeTeclas, boolean conectividad, String idioma, boolean formato) {
        this.color = color;
        this.numeroDeTeclas = numeroDeTeclas;
        this.conectividad = conectividad;
        this.idioma = idioma;
        this.formato = formato;
        incrementarContador();

    }
    private void incrementarContador(){
        contador++;
    }
    
  

}
