package model;

public class Professor extends Person{
    //1. variables
    private long pID;

    private Degree degree;

    private static long counter = 0; //ne get, ne set funkcijas

    //2. get and set
    public long getpID(){
        return pID;//atgriež pašu vērtību
    }

    public Degree getDegree() {
        return degree;
    }

    public void setpID() {
        pID = counter;
        counter++;
    }


    public void setDegree(Degree degree) {
        if(degree != null)
            this.degree = degree;
        else
            this.degree = Degree.other;
    }

    //3. constructors
    public Professor() {
        super();//te tiks izsaukts noklusētais Person() konstruktors. super() koandai ir jābūt 1.koda rindā funkcijā
        setpID();
        setDegree(Degree.other);
    }

    public Professor(String name, String surname, Degree degree, String personCode) {
        super(name, surname, personCode);//te tiek izsaukts public Person(String name, String surname, String personCode) konstruktors
        setpID();
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
        return pID + ": " + degree + ", " + super.toString();
    }

    //5. other functions

}