import java.util.*;

public class PBL_Practical5B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = {34, 12, 56, 78, 1, 9, 100};
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = 0; j < num.length - i - 1; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted Integers: ");
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        String[] names = {"Sharvari", "Sai","Nidhi","Sumedha"};
        for (int i = 0; i < names.length - 1; i++) {
            for (int j = 0; j < names.length - i - 1; j++) {
                if (names[j].compareTo(names[j + 1]) > 0) {
                    String temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Sorted Strings: ");
        for(int i=0;i<names.length;i++){
            System.out.print(names[i]+" ");
        }

        sc.close();
    }
}
