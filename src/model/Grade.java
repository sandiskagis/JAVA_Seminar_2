package model;

public class Grade {
    //1. variables
    private long gID;
    private int grValue;
    private Student student;
    private Course course;

    private static long counter = 200000; //ne get, ne set funkcijas
    //2. get and set

    public long getgID() {
        return gID;
    }

    public void setgID() {
        this.gID = counter;
        counter++;
    }

    public int getGrValue() {
        return grValue;
    }

    public void setGrValue(int grValue) {
        if(grValue >= 0 && grValue <=10)
            this.grValue = grValue;
        else
            this.grValue = 0;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        if(student != null)
            this.student = student;
        else
            this.student = new Student();
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        if(course != null)
            this.course = course;
        else
            this.course = new Course();
    }



    //3. constructors
    public Grade() {
        setgID();
        setGrValue(1);
        setStudent(new Student());
        setCourse(new Course());
    }

    public Grade(int grValue, Student student, Course course) {
        setgID();
        setGrValue(grValue);
        setStudent(student);
        setCourse(course);
    }


    //4.toString

    public String toString() {
        return gID + ":" + grValue + "->" + student.getName()
                + " " + student.getSurname() + "(" + course.getTitle()+ ")";
    }
    //5.other functions
}