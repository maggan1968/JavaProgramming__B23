package Practice_08_18_2021.inheritance.appTask;

public class AppObjects {

    public static void main(String[] args) {
        Instagram instagram=new Instagram("5,3");
        System.out.println("instagram = " + instagram);

        instagram.useTheApp(10);


        // DISCORD
        Discord b23Discord = new Discord("6.234");
        b23Discord.useTheApp(100);
        b23Discord.download();
        System.out.println("b23Discord.toString() = " + b23Discord.toString());
        System.out.println(b23Discord.getName());
    }



}
