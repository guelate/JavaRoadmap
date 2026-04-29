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


void main() {
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

    //Encapsulation
    Garage garage = new Garage("Peugeot",0); // should compile and fail at execution -> unchecked exception
    IO.println(garage.getCar());
    Garage garageSecond = new Garage("Peugeot",10); // compile and show the result
    IO.println(garageSecond.getCar());
}

//Exception: 4try/Catch, 5Throws, 6Create mine checked and unchecked
// NullPointerException, ArrayIndexOutOfBounds -> unchecked
//equals() and hashcode()