package Tema5.Temas2;

public class EsTriangulo {
    public static boolean esTriangulo (int n1,int n2, int n3){
        if(n1>n2+n3||n2>n1+n3||n3>n1+n2){
            return (false);
        }else{
            return (true);
        }
    }
    
}
