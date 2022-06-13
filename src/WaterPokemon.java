public class WaterPokemon extends Pokemon {

    private String hydropumper = "hydropumper";

    public WaterPokemon(String name, int level) {
        super(name, level);
        super.setType("water");
    }

    public void hydropumper() {
        System.out.println(this.getName() + " can hydropump");
    }

    @Override
    public void speaks() {
        System.out.println(this.getName() + " can speak with 'grrrr' and 'brrrr'. ");
    }

    @Override
    public void eats() {
        System.out.println(this.getName() + " eats fish");
    }
}
