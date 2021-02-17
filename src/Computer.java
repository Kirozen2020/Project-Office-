public class Computer implements Identifiable {
    Long id;
    String name;

    public Computer(){}
    public Computer(Long id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public void setId(Long id) {}

    @Override
    public Long getId() {
        return null;
    }

    @Override
    public String getName() {
        return name;
    }
}
