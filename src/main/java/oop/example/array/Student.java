package oop.example.array;

public class Student {

    private int rollno;
    private String name;
    private String dept;
    private Subject[] subject; //object type

    public Student(int rn, String name, String dept, Subject[] subj){
        this.rollno= rn;
        this.name = name;
        this.dept = dept;
        this.subject = subj;
    }


    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public Subject[] getSubject() {
        return subject;
    }

    public String toString() {
        String s1="";
        s1= s1.concat("Name:").concat(getName()).concat(" dept: ").concat(getDept()).concat("\n");

        for (Subject s : subject) {
            s1 = s1.concat(s.toString()).concat("\n");
        }
        return s1;
    }



}
