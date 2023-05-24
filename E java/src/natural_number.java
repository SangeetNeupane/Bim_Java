public class natural_number {
    public static void main(String[] args) {
        int i, count_odd = 0, count_even = 0,sum_odd=0,sum_even=0;
        for (i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("Odd Numbers");
        for (i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                count_odd = count_odd + 1;
                sum_odd=sum_odd+i;
                System.out.println(i);
            }
            }
            System.out.println("There are "+count_odd+ " Odd Numbers");
            System.out.println("The sum of odd numbers  is"+sum_odd);
        System.out.println("\n\nEven Numbers");
        for (i = 1; i <= 10; i++) {
            if(i%2==0)
            {
                count_even = count_even + 1;
                sum_even=sum_even+i;
                System.out.println(i);
            }
        }
        System.out.println("There are "+count_even+ " even Numbers");
        System.out.println("The sum of even numbers  is"+sum_even);
    }
}