public class Garage {

    private String car;
    private int price;

    public Garage(String car, int price) throws CarNotAcceptedException {
        this.setCar(car);
        this.setPrice(price);
    }

    public String getCar() {return car;}
    public int getPrice() {return price;}

    //setter() with condition
    public void setCar(String car) throws CarNotAcceptedException {
        if (!car.equals("Peugeot")) {
            throw new CarNotAcceptedException("Car not accepted" + car);
        }
        this.car = car;
    }

    public void setPrice(int price) {
        if (price <= 0) {
            throw new InvalidPriceException("price can't be 0 or negative");
        } else {
            this.price = price;
        }
    }
}

