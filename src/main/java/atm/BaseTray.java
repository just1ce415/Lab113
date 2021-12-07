package atm;

public abstract class BaseTray implements Tray {
    private final int bill;
    private Tray nextTray;

    public BaseTray(int bill){
        this.bill = bill;
    }

    public void process(int amount){
        if (nextTray != null){
            nextTray.process(amount % bill);
        }
        if (nextTray == null && amount % bill > 0){
            throw new IllegalArgumentException();
        }
        System.out.println("Extracted " + amount / bill + " with amount of " + bill);
    }

    public void setNext(Tray tray) {
        this.nextTray = tray;
    }


}