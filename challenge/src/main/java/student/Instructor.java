package student;


public class Instructor extends Person {
    private String employeeNumber;
    private Subject[] subjects = new Subject[10];
    private int subjectCount = 0;

    public Instructor(String lastName, String firstName, String phone, String email, String employeeNumber) {
        super(lastName, firstName, phone, email);
        this.employeeNumber = employeeNumber;
    }

    public void cleanEmployeeNumber() {
        employeeNumber = employeeNumber.replaceAll("\\s+", "").trim();
    }

    public void addSubject(Subject subject) {
        if (subjectCount < subjects.length) {
            subjects[subjectCount++] = subject;
            subject.setInstructor(this);
        } else {
            System.out.println("Instructor " + getLastName() + " already teaches 10 subjects.");
        }
    }

    public Subject[] getSubjects() { return subjects; }

    public String summaryLine() {
        return String.format("Instructor[employeeNumber=%s, lastName=%s, firstName=%s]",
                employeeNumber, getLastName(), getFirstName());
    }

    public String toCard() {
        return "Instructor\n-----------\nEmployee#: " + employeeNumber +
                "\nName: " + getLastName() + ", " + getFirstName() +
                "\nEmail: " + getEmail() +
                "\nPhone: " + getPhone();
    }

    public String displayName() {
        return "Instructor: " + getLastName() + " " + getFirstName();
    }
}
