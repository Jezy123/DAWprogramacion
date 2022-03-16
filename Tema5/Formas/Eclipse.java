package Tema5.Formas;

public class Eclipse extends Forma{
    private double radeoMayor;
    private double radeoMenor;


    public Eclipse(String color, int x, int y, String name, double radeoMayor, double radeoMenor) {
        super(color, x, y, name);
        this.radeoMayor = radeoMayor;
        this.radeoMenor = radeoMenor;
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Radeo menor:"+radeoMenor+"\nRadeo mayor:"+radeoMayor);
    }

    public double calcularArea(){
        double area= Math.PI*(radeoMayor*radeoMenor);
        System.out.println(area);
        return area;
    }
    public double calcularPerimetro(){
        double perimetro=2*Math.PI*(Math.sqrt((radeoMayor*radeoMayor)+(radeoMenor*radeoMenor)/2));
        System.out.println(perimetro);
        return perimetro;
    }

    public void cambiarTamaño(double escala){
        radeoMayor=escala*radeoMayor;
        radeoMenor=escala* radeoMenor;
    }
}

