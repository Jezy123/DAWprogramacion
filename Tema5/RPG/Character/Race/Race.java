package Character.Race;

import Character.Stat.Stat;

public abstract class Race {
    public abstract int modifier(Stat stat);

    public boolean equals(Object obj){
        if(this.equals(obj)){
            return true;
        }
        return false;
    }

    public String toString(){
        return this.toString();
    }
    
}
