package task2_2;

/*2. Create class Pocket.
 a) Add field „money", create constructor, getter and setter.
 b) Add verification for both getter and setter.
    Getter should result in returning as much money, as the user asked for.
    It should return 0 if money <= 10.
 c) Setter should not accept values below 0 and greater than 3000.
    It may print a message like „I don't have enough space in my pocket for as much money!"*/
public class Pocket {
    private int money;

    int threshold = 10;

    public Pocket() {
    }

    public Pocket(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Pocket money: " + money;
    }

    boolean inputCheckOK = true;//further steps would be to program user input and it's validation

    public int getMoney(int money) {
        int getMoney = 0;
        if (this.inputCheckOK) {
            if (((this.money - money) >= 0) && (this.money > 10)) {
                this.money -= money;
                getMoney = money;
                System.out.println("You've withdrawn " + money + " (Balance: " + this.money + ")");
            } else if ((this.money - money) < 0) {
                System.out.println("Not enough money! (Balance: " + this.money + ")");
            } else if (this.money <= 10) {
                System.out.println("Balance reached threshold of " + this.threshold + ", can't withdraw! (Balance: " + this.money + ")");
            }
        } else {
            System.out.println("Not a valid input");
        }
        return getMoney;
    }

    public void setMoney(int money) {
        if (this.inputCheckOK) {
            if ((money >= 0) && (money <= 3000)) {
                this.money += money;
                System.out.println("You've added " + money + ". (balance: " + this.money + ")");
            } else {
                System.out.println("Not a valid input for pocket money!");
            }
        } else {
            System.out.println("Not a valid input");
        }
    }

    public static void main(String[] args) {
        Pocket myPocket = new Pocket(0);

        myPocket.setMoney(-1);
        myPocket.setMoney(3001);
        myPocket.setMoney(3000);
        myPocket.getMoney(2000000000);
        myPocket.getMoney(2990);
        myPocket.getMoney(1);

    }
    //toDo: abstract more, code user input and it's validation
}
