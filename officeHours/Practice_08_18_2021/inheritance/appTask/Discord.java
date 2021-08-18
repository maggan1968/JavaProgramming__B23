package Practice_08_18_2021.inheritance.appTask;
public class Discord extends MobileApp {

    public Discord(String version) {
        super("Discord", version);
    }

    public void chat(String someone) {
        System.out.println("Chatting with " + someone +" on Discord");
    }

    @Override
    public void useTheApp(int minutes) {
        super.useTheApp(minutes);
        chat("Yuliang");

    }
}
