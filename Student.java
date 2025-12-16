public class Student {
    private String name;
    private int id;

    public Student(String name, String id) {
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
    public void printCName() {
        System.out.println(this.name);
    }

    public void printCId() {
        System.out.println(this.id);
    }
}