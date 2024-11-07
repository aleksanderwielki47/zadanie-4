interface VendingMachine {
    double insertMoney();

    String selectItem();

    default void connectToServer() {
        System.out.println("Connecting to server...");
    }

    static void shutdown() {
        System.out.println("Shutting down...");
    }
}


class VendingMachineImpl implements VendingMachine {

    public double insertMoney(){
        return 5.4;
    }
    public String selectItem(){
        return "chrupki";
    }
}









public class Main {
    public static void main(String[] args) {
    VendingMachineImpl machine = new VendingMachineImpl();

    System.out.println("wybrano: " + machine.selectItem());
    System.out.println("kwota do zaplaty: " + machine.insertMoney());
    machine.connectToServer();
    VendingMachine.shutdown();


    }
    }
