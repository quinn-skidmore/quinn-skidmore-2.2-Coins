public class Coins{

    private int cents;
    public Coins(int cents){
        this.cents = cents;
    }

    public void calculateCoins(){
        int c = cents;
        System.out.println("" + cents + " cents is equivalent to:");
        int quarters = c/25;
        c -= quarters*25;
        System.out.println("    Quarters: " + quarters);
        int dimes = c/10;
        c -= dimes*10;
        System.out.println("    Dimes: " + dimes);

        int nickels = c/5;
        c -= nickels * 5;
        System.out.println("    Nickels: " + nickels);

        int pennies = c;
        System.out.println("    Pennies: " + pennies);
        
        //System.out.println("Cents: " + cents + "\nQuarters: " + quarters + "\nDimes: " + dimes + "\nNickels: " + nickels + 
        //"\nPennies: " + pennies);
    }
}