package dsa.example.sec8;

public class StringEx130 {
    public static void main(String[] args) {

        char temp = 'A';
        //System.out.println(temp);

        //ARRAY
        char[] x = {'A','B','C','D','E'};
        char[] y = {65,66,67,68,69};

        for(char i: x){
            System.out.println(i);
        }

        for(char i: y){
            System.out.println(i);
        }

        //Array of Char is String
        char[] name = new char[10];
        for(int i=0; i < name.length; i++){
            int j = 65 +i;
            name[i] = (char)j;
            System.out.println(name[i]);
        }

        char[] fn, ln;
        fn = new char[10];
        ln = new char[10];

        char[] fullName1 = {'A','B'};
        char[] fullName2 = new char[10];

    }
}
