package utilities;

public class Data2 {

    public String s1 = "public";
    protected String s2 = "protected";
    String s3 = "default";
    private String s4 = "private";


    public void publicMethod(){
        System.out.println("Public Method");
    }

    protected void protectedMethod(){
        System.out.println("Protected Method");
    }

    void defaultMethod(){
        System.out.println("Default Method");
    }

    private void privateMethod(){
        System.out.println("Private Method");
    }


}
