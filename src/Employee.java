public class Employee {

    private final String name;
    private int salary;

    public Employee(String name, int salary){
        this.name = name;
        this.setSalary(salary);
    }

    public int bonus(){
        return setSalary(getSalary() + 500);
    };

    public String getName(){
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
