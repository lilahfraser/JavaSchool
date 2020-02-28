public class Student extends Person{
    private Section[] sections = new Section[10];
    private int grade;
    private int sectionCount;

    public Student(int grade, String name){
        super(name);
        this.grade= grade;
    }

    public void setGrade(int g){
        this.grade = g;
    }
    public int getGrade(){
        return this.grade;
    }

    public void addSection(Section s){
        this.sections[sectionCount] = s;
        sectionCount++;
    }

    public Section[] getSections(){
        return this.sections;
    }

    public String toString(){
        String z= this.name +" is in " + this.grade + "th grade and is in the following sections: ";

        for(int i=0; i<this.sectionCount; i++){
            z+= sections[i].getName();
            z+= " (" + sections[i].getTeacher().getName() + ") ";
        }
        return z;
    }

}

