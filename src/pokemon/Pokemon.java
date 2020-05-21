package pokemon;

public class Pokemon {
    private String name;
    private int health;
    private String type; //TODO arreglar a private
    public static int counter = 0;


    public Pokemon(String name, int health, String type) {
        setName(name);
        setHealth(health);
        setType(type);
        counter++;
    }

    public void attackPokemon(Pokemon pokemon) {
        pokemon.setHealth(pokemon.getHealth() - 10);
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }




}
