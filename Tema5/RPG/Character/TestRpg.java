package Character;
import Character.Job.*;
import Character.Race.*;
import Items.Food.Apple;

public class TestRpg {
    public static void main(String[] args) {
        Elf elfo= new Elf();
        Apple manzana= new Apple();
        Hunter cazador=new Hunter();
        Character desty= new Character("Desty", elfo , cazador);
        System.out.println( desty.toString());
        desty.consumes(manzana);
        
    }
    
}
