public class Main {
    // Stap 2.
    public static void main(String[] args) {
        FirePokemon charmander = new FirePokemon("Charmander", 5);
        GrassPokemon pikachu = new GrassPokemon("Pikachu", 2);
        ElectricPokemon bulbasaur = new ElectricPokemon("Bulbasaur", 8);
        WaterPokemon squirtle = new WaterPokemon("Squirtle", 9);

        charmander.flamethrower();
        charmander.eats();
        charmander.speaks();

        pikachu.rainDance();
        pikachu.eats();
        pikachu.speaks();

        bulbasaur.electroball();
        bulbasaur.eats();
        bulbasaur.speaks();

        squirtle.hydropumper();
        squirtle.eats();
        squirtle.speaks();
    }
}
