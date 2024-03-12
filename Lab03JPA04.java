import java.util.Scanner;

public class Lab03JPA04 {
    public static void main(String[] args) {
        int i = 0;
        double total = 0;
        int  meal = 0;
        Scanner input = new Scanner(System.in);
        while ( i != -1) {

            System.out.print("Please enter meal dollars or enter -1 to stop:");
            int number = input.nextInt();
            if(number==-1){
                break;
            }
            total += number;
            meal +=1 ;
        }
        System.out.println("餐點總費用:"+total);
        System.out.printf(" "+meal+" 道餐點平均費用為: %.2f%n",total/meal);
        input.close();
    }
}
