public class ElectricPokemon extends Pokemon  {

    private String electroball = "electroball";

    public ElectricPokemon(String name, int level){
        super(name, level);
        super.setType("electro");
    }

    public void electroball(){
        System.out.println("Who has an electroball? He has!");
    }

}
