package Controles.Control03;

public class TestOrdenadorTeclado {
    public static void main(String[] args) {
        Teclado tecladoRazer=new Teclado();
        Teclado newskill=new Teclado("Rojo", 86, false,"it", true);
        Teclado otroTeclado=new Teclado();
        Ordenador ordenadorN1=new Ordenador();
        Ordenador ordenadorN2=new Ordenador(true,"Blanco",newskill);
        ordenadorN1.setTeclado(otroTeclado);
        System.out.println(Teclado.getcontador());
        ordenadorN1.conectarOrdenador(ordenadorN2);
        
    }
}
