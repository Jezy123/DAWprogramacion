package Tema5.Temas2;
public class LetraDNI {
    public static char letraDNI( int DNI){


        char[] Letras={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        char Letra;
        Letra=(Letras[DNI%23]);
        return Letra;
    }
}
