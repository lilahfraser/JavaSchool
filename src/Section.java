public class Section {
    private String name;
    private Teacher teacher;
    private int currentSize;
    private Student[] students = new Student[50];

    public Section(String name, int currentSize){
        this.name = name;
    }


    public void setTeacher(Teacher t){
        this.teacher = t;
    }
    public Teacher getTeacher(){
        return this.teacher;
    }

    public void addStudents(Student s){
        this.students[currentSize] = s;
        currentSize++;
    }

    public Student[] getStudents(){
        return this.students;
    }

    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return this.name;
    }

    public String toString(){
        String o = this.name + " is taught by " + this.teacher.getName() + " and has " + this.currentSize + " students: ";

        for(int i=0; i<this.currentSize; i++ ){
            o += students[i].getName();
            o += " ,";
        }
        return o;
    }

}











