package oop.example.abstractExamples.hosp;

public class myHospitalTest {
    public static void main(String[] args) {

        Hospital mh = new MyHospital();
        mh.register("AAMSP","Rajasthan",302033,745763);
        System.out.println("register"+mh.toString());
        mh.admit();
        mh.billing();
        mh.OPD();
        mh.medicines();
    }
}
