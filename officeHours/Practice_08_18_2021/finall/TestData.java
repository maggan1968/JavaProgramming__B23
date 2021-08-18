package Practice_08_18_2021.finall;

public  class TestData {

    public static final String username="username";
    public static final String password="123";


    public  final void finalMethod(){
        System.out.println("Final method");
    }
}

/**
 * Final class can not inherited
 */
class Child extends TestData{
/*
    @Override
    public void finalMethod() {
        super.finalMethod();
    }

 */
}
