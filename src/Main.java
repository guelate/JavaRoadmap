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
        IO.println(animal.name +"is not young");
    }
    animal.setAge(20);
    if(animal.getAge() < 18){
        IO.println(animal.isYoung());
    }else{
        IO.println(animal.name +" is not young");
    }


}

//implement abstract class with subclasses that implement two interfaces: ok
//call mange() subclass and interface methode: ok
//one interfaces must have a default method call it in main():ok
//add getter() for boolean type and other type:ok