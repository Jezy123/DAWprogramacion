package Character;

public interface IDamageabla {
    double maxHealth();
    double health();
    boolean isDead();
    void recivesDamage(double amount);
    void heals(double amount);

}
