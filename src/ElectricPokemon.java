public class ElectricPokemon extends Pokemon  {

    private String electroball = "electroball";

    public ElectricPokemon(String name, int level){
        super(name, level);
        super.setType("electro");
    }

    public void electroball(){
        System.out.println("Who has an electroball? " + this.getName() + " has!");
    }

    @Override
    public void speaks() {
        System.out.println(this.getName() + " speaks Dutch");
    }

    @Override
    public void eats() {
        System.out.println("Sometimes " + this.getName() + " like to eat Duracell rabbits cooked in RedBull");
    }
}
