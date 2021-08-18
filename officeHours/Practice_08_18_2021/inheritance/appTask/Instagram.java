package Practice_08_18_2021.inheritance.appTask;

public class Instagram extends MobileApp{


    public Instagram(String version) {
        super("Instagram", version);
    }

    public void postPhoto(){

        System.out.println("Posting photo");

    }


    @Override
    public void useTheApp(int minutes) {
        super.useTheApp(minutes);
        System.out.println("Using Instagram");
        postPhoto();
  }
}
