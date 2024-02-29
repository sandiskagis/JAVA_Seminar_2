package model;

public class Grade {
    //1.variables

    private long gID;
    private int value;
    private Student student;
    private Course course;
    private static long counter = 200000; // ne get ne set funkcijas, lai nelauj mainit ta vertibu, lai nesakrit student id

    //2.get and set

    public long getGID(){
        return gID;//atgriež pašu vērtību
    }
    public void setgID(){
        gID = counter;
        counter++;
    }


    public long getValue(){
        return value;//atgriež pašu vērtību
    }
    public void setValue(int value){
        if(value >= 0 && value <= 10){
            this.value = value;
        }
        else
            this.value = 1;
    }


    public Student getStudent(){
        return student;
    }
    public void setStudent(Student student) {
        if(student != null)
            this.student = student;
        else
            this.student = new Student();
    }


    public Course getCourse(){
        return course;
    }
    public void setCourse(Course course) {
        if(course != null)
            this.course = course;
        else
            this.course = new Course();
    }

    //3.constructors
    public Grade(){
        setgID();
        setValue(1);
        setStudent(new Student());
        setCourse(new Course());
    }

    public Grade(int value, Student student, Course course){
        setgID();
        setValue(value);
        setStudent(student);
        setCourse(course);
    }


    //4.toString
    public String toString(){
        return gID + ": " + value + "-> " + student.getName() + " " + student.getSurname() + course;
    }
    //5.other functions
}
