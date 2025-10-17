package student;


public class Subject {
    private int id;
    private String code;
    private String title;
    private Instructor instructor; // one instructor per subject
    private static int totalSubjects = 0;

    public Subject(String code, String title) {
        this.id = ++totalSubjects;
        this.code = code;
        this.title = title;
    }

    public void setInstructor(Instructor instructor) { this.instructor = instructor; }

    public Instructor getInstructor() { return instructor; }

    public void normalizeCode() {
        if (code != null) code = code.trim().toUpperCase();
    }

    public void properTitle() {
        if (title == null || title.isEmpty()) return;
        String[] words = title.split(" ");
        StringBuilder newTitle = new StringBuilder();
        for (String w : words) {
            if (!w.isEmpty()) {
                newTitle.append(Character.toUpperCase(w.charAt(0)))
                        .append(w.substring(1).toLowerCase())
                        .append(" ");
            }
        }
        title = newTitle.toString().trim();
    }

    public boolean isIntroCourse() {
        return title.toLowerCase().contains("intro") || title.toUpperCase().startsWith("INTRO-");
    }

    public String syllabusLine() {
        StringBuilder sb = new StringBuilder();
        sb.append(code).append(" - ").append(title);
        if (instructor != null) {
            sb.append(" (Instructor: ").append(instructor.getLastName())
                    .append(", ").append(instructor.getFirstName()).append(")");
        }
        return sb.toString();
    }
}
