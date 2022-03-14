package elevator;

public class CloseDoorRequest extends Request {
    int elevatorId;
    public CloseDoorRequest(int elevatorId) {
        this.elevatorId = elevatorId;
    }
}
