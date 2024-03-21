package Lat2;
public class lat2c {
    public static void main (String[] arguments)
    {
        String num = "33200";
        int num2 = Integer.valueOf(num);

        System.out.println("\n\nCounted improperly: ");
        System.out.println("Original Num = " + num + " | Num + 10 = " + num + 10);
        System.out.println("Original Num2 = " + num2 + " |  Num2 + 100 = " + num2 + 100);
        System.out.println("\nCounted properly: ");
        System.out.println("Original Num = " + num + " | Num + 10 = " + (num + 10));
        System.out.println("Original Num2 = " + num2 + " |  Num2 + 100 = " + (num2 + 100));
    }
}
