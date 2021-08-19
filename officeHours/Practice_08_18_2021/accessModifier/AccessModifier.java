package Practice_08_18_2021.accessModifier;

public class AccessModifier extends Person {
 /*

        How many access modifier we have ?

        - public    --> ALWAYS REACHABLE
        - protected --> same package OR subclasses(inheritance) in different package
        - default   --> SAME PACKAGE (package private )
        - private   --> SAME CLASS

        NOTE :
            - We can use all of them for Variables, Constructor, Methods

            - A top level class can be two access modifiers : public and default

     */

    public static void main(String[] args) {


        Person p=new Person();
        p.name="";
        //  p.age=0; // private is not visible
        // p.ID=0;
       /* AccessModifier accessModifier=new AccessModifier();
        accessModifier.DoB="0";

        */













    }
}
