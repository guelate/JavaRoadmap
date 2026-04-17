public class Dog extends Animal implements  RunFast,RunSlow{

    public Dog(String name){
        super(name);
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