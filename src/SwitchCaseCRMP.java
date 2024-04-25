import java.util.Scanner;

public class SwitchCaseCRMP {
    public static void main(String[] args) {

//        System.out.println("Enter signal color");
//        Scanner sc=new Scanner(System.in);
//        String color=sc.next();
//        if(color.equals("GREEN")){
//            System.out.println("GO");
//        } else if (color.equals("YELLOW")) {
//            System.out.println("READY");
//
//        }else if(color.equals("RED")){
//            System.out.println("STOP");
//        }else{
//            System.out.println("SIGNAL NOT WORKING ");
//        }
//
//        switch(color){
//            case "GREEN":
//                System.out.println("GO");
//                break;
//            case "RED":
//                System.out.println("STOP");
//                break;
//            case "YELLOW":
//                System.out.println("READY");
//                break;
//            default:
//                System.out.println("SIGNAL NOT WORKING ");
//        }

        for(int i=1;i<=10;i=i+2){
            if(i==5){
                continue;
            }else{
                System.out.println(i);
            }
        }
        System.out.println("------------");
        for(int i=1;i<=10;i=i+2){
            if(i==5){
                break;
            }else{
                System.out.println(i);
            }
        }
    }

}
