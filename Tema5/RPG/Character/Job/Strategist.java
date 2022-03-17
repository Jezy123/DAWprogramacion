package Character.Job;

import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Stat;
import Character.Stat.Strength;

public class Strategist extends Job {
    @Override
    public int modifier(Stat stat) {
        int resultado=0;

        if(stat instanceof Intelligence){
            resultado=5;
        }else if(stat instanceof Dexterity){
            resultado=-1;
        }else if(stat instanceof Strength){
            resultado=-2;
        }
        return resultado;
    }
}
