
class Employee {

    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

class CellPhone {

    public void ringingPhone() {
        System.out.println("Ringing.....");
    }

    public void vibratingPhone() {
        System.out.println("Vibrating.....");
    }

    public void callFriend() {
        System.out.println("Calling Dhiraj.....");
    }
}

class Square {
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

class smallGame {
    public void hit(){
        System.out.println("Hitting the enemy");
    } 
    public void run(){
        System.out.println("Running from the enemy");
    } 
    public void fire(){
        System.out.println("Firing on the enemy");
    } 
}
public class OOPS_Practice {

    public static void main(String[] args) {
        Employee barun = new Employee();
        barun.setName("BarunPS");
        barun.salary = 24850;
        System.out.println("Name: " + barun.getName());
        System.out.println("Salary: " + barun.getSalary());

        System.out.println("----------------------------------");

        CellPhone lava = new CellPhone();
        lava.callFriend();
        lava.vibratingPhone();
        lava.ringingPhone();

        System.out.println("-----------------------------------");

        Square sq = new Square();
        sq.side = 3;
        System.out.println("Area: " + sq.area());
        System.out.println("Perimeter: " + sq.perimeter());

        System.out.println("------------------------------------");

        smallGame player1 = new smallGame();
        player1.fire();
        player1.run();
        player1.hit();
    }
}
