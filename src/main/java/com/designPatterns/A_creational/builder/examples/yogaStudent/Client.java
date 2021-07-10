package com.designPatterns.A_creational.builder.examples.yogaStudent;

import com.designPatterns.A_creational.builder.examples.yogaStudent.builder.StudentDTO;
import com.designPatterns.A_creational.builder.examples.yogaStudent.builder.StudentDTOBuilder;
import com.designPatterns.A_creational.builder.examples.yogaStudent.model.CommunicationChannel;
import com.designPatterns.A_creational.builder.examples.yogaStudent.model.Messenger;
import com.designPatterns.A_creational.builder.examples.yogaStudent.model.Student;
import com.designPatterns.A_creational.builder.examples.yogaStudent.model.Yoga;

public class Client {
    public static void main(String[] args) {

        //Data
        Student student = createStudent();

        //Method
        StudentDTOBuilder studentBuilder = new StudentDTOBuilder();

        //final product
        StudentDTO dto = getStudentDTO(studentBuilder, student);
        System.out.println(dto);

    }

    private static StudentDTO getStudentDTO(StudentDTOBuilder studentBuilder, Student student) {
    return studentBuilder.withFirstName(student.getFirstName())
                      .withLastName(student.getLastName())
                      .withCommunicationChannel(student.getCommunicationChannel())
                      .withYoga(student.getYoga())
                      .build();
    }

    public static Student createStudent(){

        //Need to create Messenger
        Messenger messenger = new Messenger();
        messenger.setMessengerAppl("WhatsApp");
        messenger.setMessengerAddr("9971621682");

        //Need to create Communication
        CommunicationChannel cc = new CommunicationChannel();
        cc.setEmail("abhiagr@amazon.com");
        cc.setMessenger(messenger);
        cc.setPhone("9971621682");

        //Need to create Yoga
        Yoga yoga = new Yoga();
        yoga.setYam(true);
        yoga.setNiyam(true);
        yoga.setAasan(true);
        yoga.setPranayam(true);

        Student student = new Student();
        student.setCommunicationChannel(cc);
        student.setFirstName("abhishek");
        student.setLastName("agrawal");
        student.setYoga(yoga);

        return student;

    }

}
