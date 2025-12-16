public class Teacher {
    private String name;
    private String id;
    private String Age;

    public Teacher(String name, String id, String Age) {
        this.name = name;
        this.id = id;
        this.Age = Age;
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
    public void printAge(){System.out.println(Age);}

}
