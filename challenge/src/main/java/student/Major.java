package student;

public class Major {
    private int id;
    private String code;
    private String title;
    private Student[] students = new Student[50];
    private int numberOfStudents = 0;
    private static int numberOfMajors = 0;

    public Major() { this("23", "Computer Science"); }

    public Major(String code, String title) {
        this.id = ++numberOfMajors;
        this.code = code;
        this.title = title;
    }

    public void addStudent(Student student) {
        if (numberOfStudents < students.length) {
            students[numberOfStudents++] = student;
        } else {
            System.out.println("Major " + title + " is full!");
        }
    }

    public String getTitle() { return title; }
    public Student[] getStudents() { return students; }
    public int getNumberOfStudents() { return numberOfStudents; }

    public void printOccupancyRate() {
        double rate = (double) numberOfStudents / students.length * 100;
        System.out.printf("%s capacity: 50 students%n", title);
        System.out.printf("Current enrollment: %d students%n", numberOfStudents);
        System.out.printf("Occupancy rate: %.2f%%%n", rate);
    }

    public String getStudentsListAsString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numberOfStudents; i++) {
            sb.append((i + 1)).append(". ").append(students[i]).append("\n");
        }
        return sb.toString();
    }
}
