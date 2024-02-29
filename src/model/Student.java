package model;

public class Student {

    //1.variables
    private long sID;
    private String name;
    private String surname;

    private static long counter = 0; // ne get ne set funkcijas, lai nelauj mainit ta vertibu, lai nesakrit student id



    //2.get and set
    public long getSID(){
        return sID;//atgriež pašu vērtību
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public void setsID(){
        sID = counter;
        counter++;
    }

    public void setName(String name){
        if(name != null && name.matches("[A-ZĀĒŪĪŠĢĶĻŽČŅ]{1}[a-zēūīāšģķļžčņ]+")){
            this.name = name;
        }
        else
            this.name = "Undefined";
    }

    public void setSurname(String surname) {
        if(name != null && name.matches("[A-ZĀĒŪĪŠĢĶĻŽČŅ]{1}[a-zēūīāšģķļžčņ]+"))
            this.surname = surname;
        else
            this.surname = "Undefined";
    }

    public Student(){
        setsID();
        setName("Pēteris");
        setSurname("Liepiņš");
    }

    public Student(String name, String surname, Degree degree){
        setsID();
        setName(name);
        setSurname(surname);
    }

}
