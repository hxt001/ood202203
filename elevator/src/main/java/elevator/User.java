package elevator;

public class User {
    private String name;
//    void pressBtn(int buttonId){
//
//    }
    void pressBtn(Button button){
        Request req = RequestFactory.makeRequestFromButton(button);


        RequestProcessor processor =  RequestProcessor.getInstance();
        processor.AddRequest(req);
    }

    public static void main(String[] args) {
        User user = new User();
        user.pressBtn(new CarButton());
    }
}
