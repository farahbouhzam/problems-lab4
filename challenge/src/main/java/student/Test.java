package student;


public class Test {
    public static void main(String[] args) {
        // ----- Major & Students -----
        Major csMajor = new Major();
        Student s1 = new Student("Safi", "Amal", "05689325", "safi@gmail.com", "22885676", csMajor);
        Student s2 = new Student("Alami", "Samir", "05879325", "alami@gmail.com", "23585976", csMajor);

        System.out.println("The list of students in the " + csMajor.getTitle() + " major is:");
        System.out.println(csMajor.getStudentsListAsString());
        csMajor.printOccupancyRate();

        // ----- Instructor & Subjects -----
        Instructor inst1 = new Instructor("Brown", "Alice", "05551234", "alice@gmail.com", " AB 123 ");
        inst1.cleanEmployeeNumber();

        Subject sub1 = new Subject("cs-101", "introduction to java");
        Subject sub2 = new Subject("cs-201", "object oriented programming");

        inst1.addSubject(sub1);
        inst1.addSubject(sub2);

        sub1.normalizeCode(); sub1.properTitle();
        sub2.normalizeCode(); sub2.properTitle();

        System.out.println("\n" + inst1.summaryLine());
        for (Subject s : inst1.getSubjects()) {
            if (s != null)
                System.out.println(s.syllabusLine());
        }
    }
}
