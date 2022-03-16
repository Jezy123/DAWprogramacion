package Character.Job;

import Character.Stat.Stat;

public abstract class Job {
    public abstract int modifier(Stat stat);

    public boolean equals(Object obj){
        if(this.equals(obj)){
            return true;
        }
        return false;
    }

    public String toString(){
        return getClass().getName();
    }
    
}

