package day53_Abstraction.webDriverTask;

public class FireFoxDriver implements WebDriver{



    @Override
    public void get(String url) {
        System.out.println("FireFoxDriver -navigate to: "+url);
    }

    @Override
    public void findElement(String locator) {
        System.out.println("FireFoxDriver - locating the element by "+locator);
    }

    @Override
    public void getTitle() {
        System.out.println("FireFoxDriver - getting the title");
    }

    @Override
    public void close() {
        System.out.println("FireFoxDriverDriver - closing the tab");
    }

    @Override
    public void quit() {
        System.out.println("FireFoxDriverDriver - quit");
    }

}
