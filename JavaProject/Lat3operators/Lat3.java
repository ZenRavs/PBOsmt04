package Lat3operators;

public class Lat3 {
    private static void Lat3a (String [] a)
    {
        System.out.println("---");
        System.out.println("A12.2022.06867");
        System.out.println("Ridho Farizqi");

        int x = 5;
        System.out.println("--- Latihan 3A");
        System.out.println("X Val: " + x);
        System.out.println("X Val += 6 : " + (x += 6));
        System.out.println("X Val -= 6 : " + (x -= 6));
        System.out.println("X Val *= 6 : " + (x *= 6));
        System.out.println("X Val /= 6 : " + (x /= 6));
        System.out.println("X Val %= 6 : " + (x %= 6));
        System.out.println("\n--- Latihan 3B");
    }

    private static void Lat3b (String[] b)
    {
        int a, results;
        a = 14;
        results = (a++ > 14) ? 10:20;
        System.out.println("Output 1 : " + results);
        results = (a <= 14) ? 30:40;
        System.out.println("Output 2 : " + results);
        results = (a>14 && a<14) ? 50:60;
        System.out.println("Output 3 : " + results);
        results = (a<14 || a<45) ? 10:20;
        System.out.println("Output 4 : " + results);
        System.out.println("\n--- Latihan 3C");
    }

    private static void Lat3c (String[] c)
    {
        int x = 9;
        int y = 3;
        System.out.println("1. " + (x > 3 && x < 10));
        System.out.println("2. " + (x > 3 && y > 10));
        System.out.println("3. " + (x < 3 || y < 10));
        System.out.println("4. " + (x < 3 || y >10));
        System.out.println("5. " + (++x >9 && y+1 >4));
        System.out.println("6. " + (x>9 && y+1 >4));
        System.out.println("7. " +(++x>9||y+1==4));
        System.out.println("8. " +(x>9||y+1==4));
        System.out.println("\n--- Latihan 3D");
    }
    private static void Lat3d (String[] d)
    {
        int a = 17;
        int b = 8;
        int c = 5;

        System.out.println("a & b = " + (a & b));
        System.out.println("b | c = " + (b | c));
        System.out.println("b ^ c = " + (b ^ c));
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("\n--- Latihan 3E");
    }
    private static void Lat3e (String [] e)
    {
        int a = 8;
        int b = 20;
        System.out.println("Nilai a        : " + (a));
        System.out.println("Nilai b        : " + (b));
        System.out.println("Hasil a>>1     : " + (a>>1));
        System.out.println("Hasil a>>2     : " + (a>>2));
        System.out.println("Hasil b<<1     : " + (b<<1));
        System.out.println("Hasil b<<2     : " + (b<<2));
        System.out.println("\n--- Latihan 3F");
    }
    private static void Lat3f (String [] f)
    {
        int a = 8;
        int b = 10;
        System.out.println("Nilai a : " + (a));
        System.out.println("Nilai b : " + (b));
        System.out.println("a++ : " + (a++));
        System.out.println("++b : " + (++b));
        System.out.println("a++ + ++a : " + (a++ + ++a));
        System.out.println("b++ + b++ : "+ ( b++ + b++ ));
        System.out.println("\n--- Latihan 3G");
    }
    private static void Lat3g (String [] g)
    {
        int x1, x2, x3, x4, x5;
        x1 = 5 + 7 * 2;
        x2 = (5 + 7) * 2;
        x3 = 5 + 7 * 2 - 1;
        x4 = (5 + 7) * (2 - 1);
        x5 = 1 + 2 -3 *4 % 5;

        System.out.println("5 + 7 * 2 : "+(x1));
        System.out.println("(5+7) * 2 : "+(x2));
        System.out.println("5 + 7 * 2 - 1 : "+(x3));
        System.out.println("(5+7) * (2-1) : "+(x4));
        System.out.println("1 + 2 - 3 * 4 % 5 : "+(x5));
        System.out.println("---");
    }
    public static void main (String[] arg)
    {
        Lat3a(arg);
        Lat3b(arg);
        Lat3c(arg);
        Lat3d(arg);
        Lat3e(arg);
        Lat3f(arg);
        Lat3g(arg);
    }
}
