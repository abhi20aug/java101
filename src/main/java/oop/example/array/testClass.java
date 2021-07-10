package oop.example.array;

public class testClass {

    public static void main(String[] args) {

        //array of objects
        Subject[] subject = new Subject[3];

        subject[0] = new Subject(1, "ML", 100);
        subject[1] = new Subject(2, "AI", 100);
        subject[2] = new Subject(3, "DM", 100);

        for (Subject s : subject)
            System.out.println(s);

        Student abhishek = new Student(1, "abhishek", "cs", subject);

        System.out.println("****");
        System.out.println(abhishek.toString());



    }
}