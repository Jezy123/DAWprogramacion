package Items.Food;
import Character.Character;
import Items.IConsumibles;

public abstract class Food implements IConsumibles{
    
    private double power;

    public Food(double power) {
        this.power = power;
    }

    @Override
    public void consumedby(Character character) {
       character.heals(power);
        
    }
    
}
