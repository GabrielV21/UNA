package listadeexerciciosdecisao;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        Double[] nums;
        nums = new Double[3];
        System.out.println("Informe três números: ");
        for (i = 0; i < 3; i++) {
            nums[i] = sc.nextDouble();
        }
        Arrays.sort(nums, Collections.reverseOrder());
        System.out.println("Em ordem decrescente: ");
        System.out.println(Arrays.toString(nums));
        sc.close();
    }
}