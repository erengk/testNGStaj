package Utility;

public class MyFunctions {
    public static void Bekle(int s){

        try{
            Thread.sleep(1000*s);
        }catch(InterruptedException e){
            throw new RuntimeException(e);
        }

    }
}
