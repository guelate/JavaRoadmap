public class Garage {

    private String car;
    private int price;

    public Garage(String car, int price){
        this.setCar(car);
        this.setPrice(price);
    }

    public String getCar() {return car;}
    public int getPrice() {return price;}

    //setter() with condition
    public void setCar(String car) {
        if(car.equals("Peugeot")){
            this.car = car;
        }else{
            IO.println("car not accepted");
        }
    }

    public void setPrice(int price) {
        if (price <= 0) {
            throw new IllegalArgumentException("price can't be 0 or negative");
        } else {
            this.price = price;
        }
    }
}
