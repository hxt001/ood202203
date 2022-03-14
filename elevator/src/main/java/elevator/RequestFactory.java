package elevator;

public class RequestFactory {

    static Request makeRequestFromButton(Button button) {
        switch (button.buttonType) {
            case OPEN:
                break;
            case CLOSE:
                CloseDoorRequest closeDoorRequest = new CloseDoorRequest(button.elevator.getId());
                return closeDoorRequest;
            case TOFLOOR:
                ToFloorButton toFloorButton = (ToFloorButton) button;
                GoToFloorRequest goToFloorRequest = new GoToFloorRequest(toFloorButton.floorNum);
                return goToFloorRequest;
            case EMEMERGENCY:
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + button.buttonType);
        }
    }
}
