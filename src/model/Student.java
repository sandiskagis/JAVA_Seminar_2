package model;

public class Student extends Person
{
    //1.variables
    private long sID;

    private static long counter = 10000; //ne get, ne set funkcijas
    //2.get and set

    public long getsID()
    {
        return sID;
    }

    public void setsID()
    {
        this.sID = counter;
        counter++;
    }



    //3. constructors
    public Student()
    {
        setsID();
        setName("Baiba");
        setSurname("Jaukā");
        setPersonCode("123456-12345");
    }

    public Student(String name, String surname, String personCode)
    {
        super(name, surname, personCode);
        setsID();
    }
    //4. toString
    public String toString()
    {
        return sID + ": " + super.toString();
    }


    //5. other functions


}