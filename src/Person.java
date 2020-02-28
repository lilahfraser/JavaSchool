public class Person {
    public String name;
    private int id;
    private static int nextId;

    public Person(String name){
        this.name = name;
        this.id = nextId;
        nextId++;
    }


    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return this.name;
    }

    public void setId(int id){
        this.id =id;
    }

    public int getId(){
        return this.id;
    }



}

