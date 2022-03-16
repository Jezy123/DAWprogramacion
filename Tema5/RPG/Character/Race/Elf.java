package Character.Race;

import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Stat;


public class Elf extends Race {

    int resultado=0;
    @Override
    public int modifier(Stat stat) {
        
        if(stat instanceof Intelligence){
            resultado=3;
        }else if(stat instanceof Constitution){
            resultado=-1;
        }else if(stat instanceof Dexterity){
            resultado=3;
        }
        return resultado;
    }
    
}
