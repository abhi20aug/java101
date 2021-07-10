package oop.example.staticFinal.staticMembers;

public class StaticMembersTest {

    public static void main(String[] args) {
        StaticMembers sm = new StaticMembers();
        System.out.println("print static member from Object sm.sx: "+sm.sx);
        System.out.println("print static member from Class directly accessed from method area StaticMembers.sx: "+StaticMembers.sx);
    }
}
