package Character.Race;


import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Stat;
import Character.Stat.Strength;

public class Enano extends Race {

    @Override
    public int modifier(Stat stat) {
        int resultado=0;

        if(stat instanceof Intelligence){
            resultado=-1;
        }else if(stat instanceof Strength){
            resultado=3;
        }else if(stat instanceof Dexterity){
            resultado=3;
        }
        return resultado;
    }
}
