package Practice_08_11_2021.statics;


import static Practice_08_11_2021.statics.StaticBlock.*;



public class StaticBlockObject {
    public static void main(String[] args) {


        System.out.println("StaticBlock.carModels = " + carModels);
        System.out.println("StaticBlock.num = " + num);

        StaticBlock staticBlock=new StaticBlock();
        System.out.println("StaticBlock.num = " + num);


        StaticBlock staticBlock1=new StaticBlock(40);
        System.out.println("StaticBlock.num = " + num);



    }
}
