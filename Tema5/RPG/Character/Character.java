package Character;

import Character.Job.Job;
import Character.Race.Race;
import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Strength;
import Items.IConsumibles;


public class Character implements IDamageabla{
    private String name;
    private Race race;
    private Job job;
    private Strength strength;
    private Dexterity dexterity;
    private Constitution constitution;
    private Intelligence intelligence;
    private double vida;

    public Character(String name, Race race, Job job) {
        this.name = name;
        this.race = race;
        this.job = job;
        this.strength =new Strength(5);
        this.dexterity = new Dexterity(5);
        this.constitution =new Constitution(5);
        this.intelligence = new Intelligence(5);
        this.vida=(constitution.getValue() + race.modifier(constitution)+ job.modifier(constitution))*25;
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
        " Velocity: " +velocity()+" Power: "+power()+ " Magic: "+magic() + " Health:"+vida;
        return frase;

    }


    @Override
    public double maxHealth() {
         double vidaMax=(constitution.getValue() + race.modifier(constitution)+ job.modifier(constitution))*25;
        return vidaMax;
    }

    @Override
    public double health() {
       double vidaActual=vida;
        return vidaActual;
    }

    @Override
    public boolean isDead() {
        if (vida<0 || vida==0){
            return true;
        }
        return false;
    }

    @Override
    public void recivesDamage(double amount) {
       this.vida=(health()-amount);
       System.out.println(name+": recived "+amount+". Heatlh: "+vida+"/"+maxHealth());
        
    }

    @Override
    public void heals(double amount) {
       if(this.vida+amount<maxHealth()){
           this.vida=this.vida+amount;
        }
        else{
            this.vida=maxHealth();
        }
        System.out.println(name+": healed "+amount+". Heatlh: "+vida+"/"+maxHealth());
        
    }

    public void consumes(IConsumibles consumible){
        consumible.consumedby(this);
        System.out.println(name+" consumed: "+consumible.getClass().getSimpleName());
    }
}
