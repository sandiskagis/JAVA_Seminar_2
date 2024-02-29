package model;

public class Grade {
    //1.variables

    private long gID;
    private int value;

    //2.get and set

    public long getGID(){
        return gID;//atgriež pašu vērtību
    }

    public long getValue(){
        return value;//atgriež pašu vērtību
    }

    public void setValue(int value){
        if(value != null && value.matches("[0-9]")){
            this.value = value;
        }
        else
            this.value = "Undefined";
    }
    //3.constructors
    //4.toString
    //5.other functions
}
