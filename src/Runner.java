public class Runner {
    public static void main(String[] args) {


        School lilahSchool = new School("Berkeley High");

        Section math = new Section("Math",600);
        Section biology = new Section("Biology", 100);
        Section computerSci = new Section("Computer Science", 60);

        Teacher albinson = new Teacher("Computer Science", "Albinson");
        Teacher goodrich = new Teacher("Math", "Goodrich");
        Teacher mueller = new Teacher("Biology", "Mueller");

        Student lilah = new Student(12, "Lilah");
        Student rayna = new Student(12,"Rayna");
        Student ian = new Student(12,"Ian");
        Student safi = new Student(11, "Safi");
        Student isa = new Student (12, "Isa");
        Student james = new Student (11,"James");

        lilahSchool.addSection(math);
        lilahSchool.addSection(biology);
        lilahSchool.addSection(computerSci);

        computerSci.setTeacher(albinson);
        math.setTeacher(goodrich);
        biology.setTeacher(mueller);

        albinson.addSection(computerSci);
        goodrich.addSection(math);
        mueller.addSection(biology);

        math.addStudents(lilah);
        math.addStudents(rayna);
        math.addStudents(ian);
        math.addStudents(safi);
        math.addStudents(isa);
        math.addStudents(james);

        lilah.addSection(math);
        rayna.addSection(math);
        ian.addSection(math);
        safi.addSection(math);
        isa.addSection(math);
        james.addSection(math);

        biology.addStudents(lilah);
        biology.addStudents(rayna);
        biology.addStudents(ian);
        biology.addStudents(safi);
        biology.addStudents(isa);
        biology.addStudents(james);

        lilah.addSection(biology);
        rayna.addSection(biology);
        ian.addSection(biology);
        safi.addSection(biology);
        isa.addSection(biology);
        james.addSection(biology);

        computerSci.addStudents(lilah);
        computerSci.addStudents(rayna);
        computerSci.addStudents(ian);
        computerSci.addStudents(safi);
        computerSci.addStudents(isa);
        computerSci.addStudents(james);

        lilah.addSection(computerSci);
        rayna.addSection(computerSci);
        ian.addSection(computerSci);
        safi.addSection(computerSci);
        isa.addSection(computerSci);
        james.addSection(computerSci);


        System.out.println(lilahSchool.toString());
        System.out.println(biology.toString());
        System.out.println(math.toString());
        System.out.println(computerSci.toString());
        System.out.println(mueller.toString());
        System.out.println(goodrich.toString());
        System.out.println(albinson.toString());
        System.out.println(lilah.toString());
        System.out.println(rayna.toString());
        System.out.println(ian.toString());
        System.out.println(safi.toString());
        System.out.println(isa.toString());
        System.out.println(james.toString());

















    }
}