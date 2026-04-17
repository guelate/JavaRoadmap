public abstract class Animal {

    private final String name; //final is used when an attribute is assigned one time and never change

    public Animal(String name){
        this.name = name;
    }

    public void mange(){
        System.out.println(name+" mange.");
    }

    public abstract void chasse();
}
