public class School {
    private String name;
    private String id;

    public School(String name, String id) {
        this.name = name;
        this.id = id;
    }
    public void setName(String name){
        this.name=name;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getName(){
        return this.name;
    }
    public String getID(){
        return this.id;
    }
    public void printName() {
        System.out.println(this.name);
    }

    public void printId() {
        System.out.println(this.id);
    }
}
