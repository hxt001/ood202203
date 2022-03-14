package elevator;

public class Elevator {
    private int id;
    private int maxWeight = 1000; //kg
    private Display display;
    private Phone emergencyphone;
    private ControlPanel controlPanel;
    private Door door;
    private static Elevator instance = null;

    public static Elevator getInstance() {
        if (instance == null) {
            instance = new Elevator();
        }
        return instance;
    }
    public void CloseDoor() {
        display.display("Close door");
        door.close();
       // System.out.println("Close door");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
