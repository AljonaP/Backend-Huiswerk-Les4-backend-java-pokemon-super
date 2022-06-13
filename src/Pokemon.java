public abstract class Pokemon {
    // Een Super klasse waarvan minimaal 2 private variabelen, 1 constructor, 2 methodes, 2 getters en 2 setters;
    private String name;
    private int level;
    private String type;


    public Pokemon (String name, int level){
        this.name = name;
        this.level = level;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level= level;
    }

    public void setType(String type){
        this.type = type;
    }


    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public String getType() {
        return type;
    }


    public void speaks(){
        System.out.println(this.getName() + " can speak");
    }

    public void eats(){
        System.out.println(this.getName() + " doesn't mind to eat from time to time");
    }
}
