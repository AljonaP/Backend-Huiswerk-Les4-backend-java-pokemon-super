public class FirePokemon extends Pokemon {

    private String flamethrower = "flamethrower";

    public FirePokemon(String name, int level){
        super(name, level);
        super.setType("fire");
    }

    public void flamethrower() {
        System.out.println("Pokemon throws flame");
    }
}
