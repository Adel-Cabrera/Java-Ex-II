package pokemon;

public class PokeTest {
    public static void main(String[] args) {
        Pokedex pokedex = new Pokedex();

        Pokemon charizard = pokedex.createPokemon("Charizard", 100, "Fire");
        Pokemon mewTwo = pokedex.createPokemon("Mew Two", 150, "Psychic");

        System.out.println(charizard.getName());
        System.out.println(charizard.getType());
        mewTwo.attackPokemon(charizard);
        System.out.println(charizard.getHealth());

        System.out.println(mewTwo.getName());
        System.out.println(mewTwo.getType());
        charizard.attackPokemon(mewTwo);
        System.out.println(mewTwo.getHealth());

        pokedex.listPokemon();
        System.out.println(pokedex.myPokemons);

    }
}
