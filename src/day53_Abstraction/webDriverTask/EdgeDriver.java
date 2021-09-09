package day53_Abstraction.webDriverTask;

public class EdgeDriver implements  WebDriver{

    @Override
    public void get(String url) {
        System.out.println("EdgeDriver -navigate to: "+url);
    }

    @Override
    public void findElement(String locator) {
        System.out.println("EdgeDriver - locating the element by "+locator);
    }

    @Override
    public void getTitle() {
        System.out.println("EdgeDriver - getting the title");
    }

    @Override
    public void close() {

    }

    @Override
    public void quit() {
        System.out.println("EdgeDriver - closing the tab");

    }

}

