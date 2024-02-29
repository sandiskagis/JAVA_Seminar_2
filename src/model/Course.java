package model;

public class Course {

    //1.variables

    private long cID;
    private String title;
    private int creditPoints;
    private Professor professor;

    private static long counter = 0; // ne get ne set funkcijas, lai nelauj mainit ta vertibu, lai nesakrit student id


    //2.get and set
    public long getGID(){
        return cID;//atgriež pašu vērtību
    }
    public void setcID(){
        cID = counter;
        counter++;
    }
    public String getTitle(){
        return title;//atgriež pašu vērtību
    }
    public void setTitle(String title){
        if(title != null && title.matches("[A-ZĀĒŪĪŠĢĶĻŽČŅ]{1}[a-zēūīāšģķļžčņ]+")){
            this.title = title;
        }
        else
            this.title = "Undefined";
    }


    public int getCreditPoints(){
        return creditPoints;
    }
    public void setCreditPoints(int creditPoints) {
        if(creditPoints > 0 && creditPoints <= 20)
            this.creditPoints = creditPoints;
        else
            this.creditPoints = 2;
    }


    public Professor getProfessor(){
        return professor;
    }
    public void setProfessor(Professor professor) {
        if(professor != null)
            this.professor = professor;
        else
            this.professor = new Professor();
    }


    //3.constructors
    public Course(){
        setcID();
        setCreditPoints(4);
        setTitle("Civilā aizsardzība");
        setProfessor(new Professor());
    }

    public Course(String title, int creditPoints, Professor professor){
        setcID();
        setCreditPoints(creditPoints);
        setTitle(title);
        setProfessor(professor);
    }

    //4.toString
    public String toString(){
        return cID + ": " + title + " " + creditPoints + " " + professor;
    }
    //5.other functions
}
