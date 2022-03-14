package Tema5.Formas;

public class Rectangulo extends Forma {

    private double ladoMenor;
    private double ladoMayor;

    public Rectangulo(String color, int x, int y, String name, int ladoMenor, int ladoMayor) {
        super(color, x, y, name);
        this.ladoMenor = ladoMenor;
        this.ladoMayor = ladoMayor;
    }

    public void imprimirRectangulo(){
        Imprimir();
        System.out.println("Lado menor:"+ladoMenor+"\n Lado mayor:"+ladoMayor);
    }

    public double calcularArea(){
        double area= ladoMayor * ladoMenor;
        System.out.println(area);
        return area;
    }
    public double calcularPerimetro(){
        double perimetro=2*ladoMayor+2*ladoMenor;
        System.out.println(perimetro);
        return perimetro;
    }

    public void cambiarTamaño(double escala){
        ladoMayor=escala*ladoMayor;
        ladoMenor=escala* ladoMenor;
    }
}
