public class Courier implements Identifiable {
    Long id;
    String name;

    public Courier(){}
    public Courier(Long id, String name){
        this.id = id;
        this.name = name;
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

    public void print(){
        System.out.println("id: "+id+", name: "+name);
    }
}
