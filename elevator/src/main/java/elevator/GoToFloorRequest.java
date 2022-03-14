package elevator;

public class GoToFloorRequest extends Request{
    int floor;
    public GoToFloorRequest(int floor) {
        this.floor = floor;
    }
}
