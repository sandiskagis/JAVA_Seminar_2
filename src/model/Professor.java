package model;

public class Professor {
    //1. variables
    private long pID;
    private String name;
    private String surname;
    private Degree degree;

    private static long counter = 0; //ne get, ne set funkcijas

    //2. get and set
    public long getpID(){
        return pID;//atgriež pašu vērtību
    }

    public String getName(){
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Degree getDegree() {
        return degree;
    }

    public void setpID() {
        pID = counter;
        counter++;
    }

    public void setName(String name) {
        if(name != null && name.matches("[A-ZĒŪĪĻĶĢŠĀŽČŅ]{1}[a-zēūīļķģšāžčņ]+")) {
            this.name = name;
        }
        else
            this.name = "Undefined";

    }

    public void setSurname(String surname) {
        if(surname != null && surname.matches("[A-ZĒŪĪĻĶĢŠĀŽČŅ]{1}[a-zēūīļķģšāžčņ]+"))
            this.surname = surname;
        else
            this.surname = "Undefined";
    }

    public void setDegree(Degree degree) {
        if(degree != null)
            this.degree = degree;
        else
            this.degree = Degree.other;
    }

    //3. constructors
    public Professor() {
        setpID();
        setName("Jānis");
        setSurname("Bērziņš");
        setDegree(Degree.other);
    }

    public Professor(String name, String surname, Degree degree) {
        setpID();
        setName(name);
        setSurname(surname);
        setDegree(degree);
    }

	/*
	//ģenerētā toString
	public String toString() {
		return "Professor [pID=" + pID + ", name=" + name + ", surname=" + surname + ", degree=" + degree + "]";
	}
	*/




    //4.toString - manis paša
    public String toString()
    {
        return pID + ": " + degree + ", " + name + " " + surname;
    }

    //5. other functions

}