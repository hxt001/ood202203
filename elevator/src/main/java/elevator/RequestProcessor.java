package elevator;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class RequestProcessor implements Runnable {
    public HashMap<Integer, Elevator> elevatorsMap;
    public LinkedList<Request> queue;
    public RequestProcessor() {
        queue = new LinkedList<>();
    }

    private static RequestProcessor instance;

    public static RequestProcessor getInstance() {
        if (instance == null) {
            instance = new RequestProcessor();
        }
        return instance;
    }
    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            processRequest();
        }
    }

    private void processRequest() {
        Request request = queue.getFirst();
        //Elevator elevator = Elevator.getInstance();

        // find best elvator
        // Elevator elevator = findBestElevator()

        //
        if (request instanceof CloseDoorRequest) {
            CloseDoorRequest closeDoorRequest = (CloseDoorRequest) request;
            Elevator elevator = elevatorsMap.get(closeDoorRequest.elevatorId);
            elevator.CloseDoor();
        } else if (request instanceof GoToFloorRequest) {
            GoToFloorRequest goToFloorRequest = (GoToFloorRequest)request;
            Elevator best = findBestElevator();
            moveToFloor(best, goToFloorRequest.floor);
        }
    }

    private void moveToFloor(Elevator best, int floor) {
        // todo
    }

    private Elevator findBestElevator() {
        return elevatorsMap.get(1);
    }

    public void AddRequest(Request request) {
        queue.add(request);
    }
}
