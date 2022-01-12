package Objetos;
    /*crear clase alumno cuyos objetos tendran como caracteristicas un id nombre y grupo(1cfs) se pueden crear alumnos
    solo con nombre y el id, o tambien con el nombre el identificador y grupo tiene que tener un 
    metodo propio de los objetos llamado pregutar duda que tiene que imprimir el "nombre del alumno" levanta la manos
    ademas tiene que llevar un contador del total de alumnos creados, tambien hay un metodo de clase llamado imprimir informe
    que muestra el total de alumnos, otro metodo de clase que se llama imprimir informe alumnos al que se
    le pasa un array de alumnos y imprime el nombre y grupo de cada alumno*/

class alumno{
    private int id;
    private String nombre;
    private String grupo;
    private static int numAlumnos;

    public alumno(int i,String nom, String grup){
        id=i;
        nombre=nom;
        grupo=grup;

        numAlumn();
    }
    public alumno(int i,String nom){
        id=i;
        nombre=nom;
        grupo="1CFS"; 

        numAlumn();

    }

    void preguntarDuda(){
        System.out.println(nombre+ " Ha levantado la mano");
    }

    private static void numAlumn(){
        numAlumnos++;
    }
    
    void imprimirInforme(alumno arrayDeAlumnos[]){
        for(int i=0;i<arrayDeAlumnos.length;i++){
            System.out.println(nombre+" "+grupo);
        }
    }

    public static void main(String[] args) {
        alumno a1,a2,a3;
        a1= new alumno(01,"Juanito","2CFS");
        a2= new alumno(01,"Pepito","2CFS");
        a3= new alumno(01,"ALejandrito");
        a1.preguntarDuda();
    

    }

    
}
