package Character;

import Character.Job.Job;
import Character.Race.Race;
import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Stat;
import Character.Stat.Strength;

public class Character {
    private String name;
    private Race race;
    private Job job;
    private Strength strength;
    private Dexterity dexterity;
    private Constitution constitution;
    private Intelligence intelligence;

    public Character(String name, Race race, Job job) {
        this.name = name;
        this.race = race;
        this.job = job;
        this.strength =new Strength(5);
        this.dexterity = new Dexterity(5);
        this.constitution =new Constitution(5);
        this.intelligence = new Intelligence(5);
    }

    public String getName(){
        return name;
    }

    public Race getRace(){
        return race;
    }

    public Job getJob(){
        return job;
    }

    public double velocity(){
    
        double velocidad=(dexterity.getValue() + race.modifier(dexterity)+ job.modifier(dexterity))*2;
        return velocidad;
    }

    public double power(){
    
        double fuerza=(strength.getValue() + race.modifier(strength)+ job.modifier(strength))*2;
        return fuerza;
    }

    public double magic(){
    
        double magia=(intelligence.getValue() + race.modifier(intelligence)+ job.modifier(intelligence))*2;
        return magia;
    }

    public String toString(){
        String frase="My name is "+ getName()+" I'm an "+getClass()+" My stats are: Strength: "+(strength.getValue() + race.modifier(strength)+ job.modifier(strength))+
        " Dexterity: "+ dexterity.getValue()+ race.modifier(dexterity)+ job.modifier(dexterity)
        +" Constitution: "+constitution.getValue()+ race.modifier(constitution)+ job.modifier(constitution)+
        " Intelligence: "+intelligence.getValue() + race.modifier(intelligence)+ job.modifier(intelligence)+
        " Velocity: " +velocity()+" Power: "+power()+ " Magic: "+magic();
        return frase;

    }
}
