public class Teacher extends Person {
    private Section[] sections = new Section[10];
    private String subject;
    private int sectionCount;

    public Teacher(String subject, String name){
        super(name);
        this.subject = subject;
    }

    public void setSubject(String n){
        this.subject = n;
    }
    public String getSubject(){
        return this.subject;
    }

    public void addSection(Section s){
        this.sections[sectionCount] = s;
        sectionCount++;
    }

    public Section[] getSections(){
        return this.sections;
    }

    public String toString(){
        String q = this.name + " teaches the following sections: ";

        for(int i=0; i<this.sectionCount; i++ ){
            q += sections[i].getName();
            q += " , ";
        }
        return q;

    }
}

