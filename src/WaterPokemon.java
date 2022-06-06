public class WaterPokemon extends Pokemon {

    private String hydropumper = "hydropumper";

        public WaterPokemon(String name, int level){
            super(name, level);
            super.setType("water");
        }

    public void hydropumper() {
        System.out.println("Pokemon can hydropump");
    }
}
