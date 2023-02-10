import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String soz=scanner.nextLine();
        Winter winter=Winter.valueOf(soz.toUpperCase());
        switch (winter){
            case DECEMBER -> System.out.println(Winter.DECEMBER);
            case JANUARY -> System.out.println(Winter.JANUARY);
            case FEBRUARY -> System.out.println(Winter.FEBRUARY);
        }



    }
}