package day53_Abstraction.webDriverTask;

public interface WebDriver {
     /*
    methods that we cannot have:
    void method2(){
    }
    public WebDriver(){
    }
     */

    void get(String url);
    void findElement(String locator);
    void getTitle();
    void quit();
    void close();

     /*
    public static void main(String[] args) {
    }
    default void method(){
    }
*/


}

/*
WebDriver task:
		1. Create an interface named WebDriver
				abstract methods:
					get(String url);
					findElement(String locator);
					getTitle();
					quit();
 */

