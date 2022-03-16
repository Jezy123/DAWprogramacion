package Character.Race;

import Character.Stat.Constitution;
import Character.Stat.Intelligence;
import Character.Stat.Stat;
import Character.Stat.Strength;

public class Draconico extends Race {

    @Override
    public int modifier(Stat stat) {
        int resultado=0;

        if(stat instanceof Intelligence){
            resultado=-2;
        }else if(stat instanceof Strength){
            resultado=4;
        }else if(stat instanceof Constitution){
            resultado=3;
        }
        return resultado;
    }
}
