//Read file
public void readFile(String name) {
    try {
        IO.println(new String(Files.readAllBytes(Paths.get(name))));
    } catch (IOException e) {
        IO.println("file not found");
    }
}

//throw exception
public void readFileThrow(String name) throws IOException{
    IO.println(new String(Files.readAllBytes(Paths.get(name))));
}


void main() throws CarNotAcceptedException {
    IO.println("Hello World !");

    Employee first = new Employee("David",2000);
    first.setSalary(2000);
    IO.println(first.getSalary());

    Dog animal = new Dog("Kevin",11,"Calm",true);
    animal.mange();
    animal.chasse();
    animal.speedFast();
    animal.getAllure();
    IO.println(animal.getState());
    if(animal.getAge() < 18){
        IO.println(animal.isYoung());
    }else{
        IO.println(animal.getName() +"is not young");
    }
    animal.setAge(20);
    if(animal.getAge() < 18){
        IO.println(animal.isYoung());
    }else{
        IO.println(animal.name +" is not young");
    }

    //Exception
    readFile("text.txt");

    //multiple exceptions
    try {
        readFile("multiple.txt");
    }catch (SecurityException e){
        System.out.println("access denied"+e); //it the second catch after IOException
    }


    //throws
    try {
        readFileThrow("text.txt");
    } catch (IOException e) {
        IO.println("fileThrow not found");
    }

    //Encapsulation and mine checked and unchecked exception
   // Garage garage = new Garage("Peugeot",0); // should compile and fail at execution -> unchecked exception

   // IO.println(garage.getCar());
    Garage garageSecond = new Garage("Peugeot",10); // compile and show the result
    IO.println(garageSecond.getCar());

    try{
        garageSecond.setCar("Ferrari");
    }catch (CarNotAcceptedException e){
        IO.println(e.getMessage()); // Car not accepted : Ferrari
    }
    // NullPointerException, ArrayIndexOutOfBounds -> This kind of errors should be not catch but fix

    String car = null;
    String[] cars = {"Peugeot","Mercedes"};

    int index = 2;
    //Remember: we don't use try catch for NullPointerException and ArrayIndexOutOfBounds
    if(car != null){
        IO.println((car));
    }else{
        IO.println("car is null");
    }

    if(index < cars.length){
        IO.println(cars[index]);
    }else{
        IO.println("index "+index+ " is invalid");
    }
}


//equals() and hashcode()