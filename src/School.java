public class School {
    public String name;
    private Section[] sections = new Section[200];
    private int sectionCount;


    public School (String name){
        this.name = name;
}
    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return this.name;
    }

    public void addSection(Section s){
        this.sections[sectionCount] = s;
        sectionCount++;
    }

    public Section[] getSections(){
        return sections;
    }
    public String toString(){
        return "The school named " + name + " has " +
                sectionCount + " sections.";

    }
}




