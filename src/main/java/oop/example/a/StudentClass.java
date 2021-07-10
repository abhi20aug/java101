package oop.example.a;

class Student {

    protected String name;
    private int age;
    private int height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        //who can do it, that matters.
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight(){
        return this.height;
    }
}


public class StudentClass {

    public static void main(String args[]){

        Student s = new Student();
        s.name = "abhishek";
        s.setHeight(100);
        System.out.println(s.getHeight());
    }

}



