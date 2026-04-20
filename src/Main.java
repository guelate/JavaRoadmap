//Read file
public void readFile(String name) {
    try {
        IO.println(new String(Files.readAllBytes(Paths.get(name))));
    } catch (IOException e) {
        IO.println("file not found");
    }
}

public void readFileThrow(String name) throws IOException{
    IO.println(new String(Files.readAllBytes(Paths.get(name))));

}


void main() {
    IO.println("Hello World !");

    Employee first = new Employee("David",2000);
    IO.println(first.bonus());

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
        System.out.println("access denied"+e);
    }

    //throws
    try {
        readFileThrow("text.txt");
    } catch (IOException e) {
        IO.println("fileThrow not found");
    }
}

//Exception: 4try/Catch, 5Throws, 6Create mine checked and unchecked