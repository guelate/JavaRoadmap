public class Dog extends Animal implements  RunFast,RunSlow{

    private int age;
    private final String state;
    private final boolean young;

    public Dog(String name, int age, String state, boolean young){
        super(name);
        this.age = age;
        this.state = state;
        this.young = young;
    }

    //getter
    public String getState(){return state;}
    public int getAge(){return age;}
    public boolean  isYoung(){ return young;};
    public String getName() {return name;}
    //setter
    public void setAge(int age){
        this.age = age;
    }

    //method from parent class
    @Override
    public void chasse() {
        System.out.println("Dog chasse");
    }

    //method from interface
    @Override
    public void speedSlow(){
        System.out.println("Dog speed is slow");
    }

    @Override
    public void speedFast(){
        System.out.println("Dog speed is fast.");
    }
}