package oop.example.abstractExamples.hosp;

abstract class Hospital {

    public String HospName, stateName;
    public int postalCode, regNumber;

    public String getHospName() {
        return HospName;
    }

    public String getStateName() {
        return stateName;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public int getRegNumber() {
        return regNumber;
    }

    //define abstract methods
    public void register(String HospName, String stateName, int postalCode, int regNumber){
        this.HospName = HospName;
        this.stateName = stateName;
        this.postalCode = postalCode;
        this.regNumber = regNumber;
    };
    abstract public void admit();
    abstract public void OPD();
    abstract public void billing();
    abstract public void medicines();
    abstract public void DocAttendance();


    @Override
    public String toString() {
        return "Hospital{" +
                "HospName='" + HospName + '\'' +
                ", stateName='" + stateName + '\'' +
                ", postalCode=" + postalCode +
                ", regNumber=" + regNumber +
                '}';
    }

}
