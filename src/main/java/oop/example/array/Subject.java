package oop.example.array;

public class Subject {

    private int subid;
    private String name;
    private int maxMarks;
    private int marksObtained;

    public Subject(){
    }


    public Subject(int subid, String name, int maxMarks ){
        this.subid = subid;
        this.name = name;
        this.maxMarks = maxMarks;
    }

    public int getSubid() {
        return subid;
    }

    public String getName() {
        return name;
    }

    public int getMaxMarks() {
        return maxMarks;
    }

    public void setMaxMarks(int maxMarks) {
        this.maxMarks = maxMarks;
    }

    public int getMarksObtained() {
        return marksObtained;
    }

    public void setMarksObtained(int marksObtained) {
        this.marksObtained = marksObtained;
    }

    public String toString(){

        return ("SubjectID: "+this.getSubid() +" Name: "+this.getName()+"  maxMarks:"+this.getMaxMarks() );
    }

}
