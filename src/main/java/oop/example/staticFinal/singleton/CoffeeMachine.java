package oop.example.staticFinal.singleton;

public class CoffeeMachine {

    //members of cm
    public int sugarQty;
    public int coffeeQty;
    public int waterQty;
    public int milkQty;
    private static int cf_cnt=0;

    static CoffeeMachine coffeeMachine_ref = null;

//    public CoffeeMachine(int sugarQty, int coffeeQty, int waterQty, int milkQty) {
//        this.sugarQty = sugarQty;
//        this.coffeeQty = coffeeQty;
//        this.waterQty = waterQty;
//        this.milkQty = milkQty;
//    }

    private CoffeeMachine() {
        this.sugarQty=1;
        this.coffeeQty=1;
        this.waterQty=1;
        this.milkQty=1;
        System.out.println("coffee is prepared");
    }

    static CoffeeMachine getCoffee(){

        //Only 1 instance code
        if ( coffeeMachine_ref == null )
        {
            //create instance of private construtor
            System.out.println("coffeeMachine_ref is null");
            CoffeeMachine c = new CoffeeMachine();
            coffeeMachine_ref = c;
            return coffeeMachine_ref;
        }
        else
            System.out.println("coffeeMachine_ref is not null");
            return coffeeMachine_ref;
    }

    static CoffeeMachine get4Coffee(){

        //Only 1 instance code
        //        0,1,2,3, [4]
        if ( cf_cnt < 4 )
        {

            CoffeeMachine c = new CoffeeMachine();
            cf_cnt = cf_cnt+1;
            System.out.println("coffeeMachine cf_cnt:"+cf_cnt);
            return c;
        }
        else
            System.out.println("coffeeMachine out .. can not be used more than 4 times");
        return null;
    }


}
