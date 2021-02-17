public class Office implements Identifiable {

    Long id;
    String name;

    public Office(){}
    public Office(Long id, String name){
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
