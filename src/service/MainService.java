package service;

import model.Degree;
import model.Professor;
import model.Student;

public class MainService {
    public static void main(String[] args){
        Professor pr1 = new Professor();
        Professor pr2 = new Professor("Karina", "Šķirmante", Degree.mg);
        System.out.println(pr1);
        System.out.println(pr2);

        Student stu1 = new Student();
        Student stu2 = new Student("Klāvs", "Students");
        System.out.println(stu1);
        System.out.println(stu2);




    }
}
