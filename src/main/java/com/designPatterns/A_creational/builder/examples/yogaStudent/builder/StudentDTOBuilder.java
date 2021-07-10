package com.designPatterns.A_creational.builder.examples.yogaStudent.builder;

import com.designPatterns.A_creational.builder.examples.yogaStudent.model.CommunicationChannel;
import com.designPatterns.A_creational.builder.examples.yogaStudent.model.Yoga;

public class StudentDTOBuilder {

    String firstName;
    String lastName;
    String phoneNo;
    CommunicationChannel communicationChannel;
    Yoga yoga;

    StudentDTO dto;

    //building parts
    public StudentDTOBuilder withFirstName(String fName){
        this.firstName = fName;
        return this;
    };

    public StudentDTOBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public StudentDTOBuilder withPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
        return this;
    }


    public StudentDTOBuilder withCommunicationChannel(CommunicationChannel cc) {
        this.communicationChannel = cc;
        return this;
    }

    public StudentDTOBuilder withYoga(Yoga yoga) {
        this.yoga = yoga;
        return this;
    }


    //build Method
    public StudentDTO build(){
        //need
        String name = this.firstName+" "+this.lastName;
        String cchannel = "Pho No: "+this.communicationChannel.getPhone()+
                          "Email: " +this.communicationChannel.getEmail()+
                          "Messenger: "+this.communicationChannel.getMessenger().getMessengerAppl() +" "+
                                        this.communicationChannel.getMessenger().getMessengerAddr();
        String yoga =     "Yoga Practices: "+
                          "     Yam: "+ Boolean.toString(this.yoga.isYam())+
                          "     Niyam: "+ Boolean.toString(this.yoga.isNiyam())+
                          "     Aaasn: "+ Boolean.toString(this.yoga.isAasan())+
                          "     Prayanam: "+ Boolean.toString(this.yoga.isPranayam());

        dto = new StudentDTO(name, cchannel, yoga);
        return dto;
    }

    public StudentDTO getStudentDTO(){
        return dto;
    }

}
