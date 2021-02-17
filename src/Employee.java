public class Employee implements Identifiable, ComputerSupportable{
    Long id;
    String name;
    Computer computer;
    Office office;

    public Employee(Long id, String name, Computer computer, Office office){
        this.id = id;
        this.name = name;
        this.computer = computer;
        this.office = office;
    }
    public Employee(Long id, String name){
        this.id = id;
        this.name = name;
    }
    public Employee(Computer computer, Office office){
        this.computer = computer;
        this.office = office;
    }

    @Override
    public void setId(Long id) {
        System.out.println(id);
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void getOffice() {}

    @Override
    public Office setOffice(Office o) {
        return office;
    }

    public void print(){
        System.out.println("id: "+id+", name: "+name+", computer: "+computer+", office: "+office);
    }

    @Override
    public void getComputer() {

    }

    @Override
    public Computer setComputer(Computer c) {
        return computer;
    }
}
