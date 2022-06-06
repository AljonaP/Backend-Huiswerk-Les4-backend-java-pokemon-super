public class GrassPokemon extends Pokemon {
    private String rainDance = "raindance";

        public GrassPokemon(String name, int level){
        super(name, level);
        super.setType("grass");
    }

    public void rainDance() {
        System.out.println("Pokemon dances only while raining :)");
    }
}
