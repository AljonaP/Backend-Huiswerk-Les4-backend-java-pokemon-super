public class FirePokemon extends Pokemon {

    private String flamethrower = "flamethrower";

    public FirePokemon(String name, int level){
        super(name, level);
        super.setType("fire");
    }

    public void flamethrower() {
        System.out.println(this.getName() + " throws flame");
    }

    @Override
    public void speaks() {
        System.out.println(this.getName() + " can't speak at all");
    }

    @Override
    public void eats() {
        System.out.println(this.getName() + " love to eat well done meat");
    }
}
