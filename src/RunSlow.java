public interface RunSlow {

    void speedSlow();

    default void getAllure(){
        System.out.println("run slowly");
    }
}