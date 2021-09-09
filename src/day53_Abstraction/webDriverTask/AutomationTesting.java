package day53_Abstraction.webDriverTask;

public class AutomationTesting {
    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.get("www.google.com");
        driver.findElement("xpath");
        driver.getTitle();
        driver.close();
        driver.quit();

        System.out.println("---------------------------------");

        FireFoxDriver driver2 = new  FireFoxDriver();
        driver2.get("www.google.com");
        driver2.findElement("xpath");
        driver2.getTitle();
        driver2.close();
        driver2.quit();

        System.out.println("-----------------------------------");

       EdgeDriver driver3 = new EdgeDriver();
        driver3.get("www.google.com");
        driver3.findElement("xpath");
        driver3.getTitle();
        driver3.close();
        driver3.quit();

        System.out.println("----------------------------------------------------");


       OperaDriver driver4 = new  OperaDriver();
        driver4.get("www.google.com");
        driver4.findElement("xpath");
        driver4.getTitle();
        driver4.close();
        driver4.quit();


        System.out.println("--------------------------------------------------");


      //  WebDriver driver5 = new WebDriver();
        //driver3.get("www.amazon.com);

        WebDriver driver5 = new ChromeDriver();
         driver5.get("www.amazon.com");


        System.out.println("---------------------------------------------------");

        WebDriver driver6= getDriver("chrome");

        WebDriver driver7 = new ChromeDriver();
    }


    public static WebDriver getDriver(String name){



        switch (name){
            case "chrome":
                return new ChromeDriver();

            case "firefox":
                return new FireFoxDriver();

            default:
               // return null;
                throw  new RuntimeException("Invalid Browser name");
        }

}
}
