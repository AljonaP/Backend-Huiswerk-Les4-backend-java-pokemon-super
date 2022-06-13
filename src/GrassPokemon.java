public class GrassPokemon extends Pokemon {
    private String rainDance = "raindance";

        public GrassPokemon(String name, int level){
        super(name, level);
        super.setType("grass");
    }

    public void rainDance() {
        System.out.println(this.getName() + " dances only while raining :)");
    }

    @Override
    public void speaks() {
        System.out.println(this.getName() + " does speak English");
    }

    @Override
    public void eats() {
        System.out.println(this.getName() + " eats apples and cucumbers");
    }
}


