package Items.Potions;
import Character.Character;
import Items.IConsumibles;

public abstract class Potion implements IConsumibles{
    
    private double power;

    public Potion(double power) {
        this.power = power;
    }

    @Override
    public void consumedby(Character character) {
       character.heals(power);
        
    }
    
}
