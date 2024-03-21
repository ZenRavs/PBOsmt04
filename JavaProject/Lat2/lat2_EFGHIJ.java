package Lat2;
import java.util.Scanner;
//import java.io.*;

public class lat2_EFGHIJ {
    private static void Latihan2E(String[] args)
    {
        int a, t;
        double luas;
        a = 10;
        t = 30;
        luas  = 0.5 * a * t;
        System.out.println("--\n\nLat2e: Luas Segitiga = " + luas + "cm3");
    }
    private static void Latihan2F(String[] args)
    {
        System.out.println("\nLat2F: ");
        int[] list = {2,1,3,3,4,5,6,10,45};
        for (int i = 0; i < list.length; i++)
        {
            System.out.println("    List = " + list[i]);
        }
        System.out.println("    Number of 'list' array = " + list.length);
    }
    private static void Latihan2G(String[] args)
    {
        int[] list = {2,1,3,3,4,5,6,10,45};
        System.out.println("\nLat2G");
        int totalInList = 0;

        for (int i = 0; i < list.length; i++)
        {
            totalInList = totalInList + list[i];
        }
        System.out.println("Sum 'List' = " + totalInList);
    }
    private static void Latihan2H(String[] args)
    {
        System.out.println("\nLat2H");
        double dVal = 3.14;
        int iVal = 314; //cannot convert double into int

        System.out.println("Double values = " + dVal);
        System.out.println("INT values = " + iVal);
    
    }
    private static void Latihan2I(String[] args)
    {
        System.out.println("\nLat2I");
        String string0 = "410";
        String string1 = "420";

        int varString0 = Integer.parseInt(string0);
        System.out.println("varString: " + varString0);
        System.out.println("string 0 + varString0 = " + (string0 + varString0));

        int varString1 = Integer.parseInt(string1);
        System.out.println("varString: " + varString1);
    }
    private static void Latihan2J(String[] args)
    {
        System.out.println("\nLat2J");
        Scanner input0 = new Scanner(System.in);

        String name;
        float val0, val1;
        float avg;
        
        System.out.println("Name "); name = input0.next();
        System.out.println("Physics Score  : ");
        val0 = input0.nextFloat();
        System.out.println("Chemistry Score: ");
        val1 = input0.nextFloat();
        System.out.println("---");
        avg = (val0 + val1) / 2;
        System.out.println("Your AVG score: " + avg);
        input0.close();
        System.out.println("=========");
        System.out.println("Name     : " + name + 
        "\nPhysics  : " + val0 + 
        "\nChemistry: " + val1 + 
        "\nAVG      : " + avg);
        System.out.println("=========");

    }
    public static void main(String [] arg)
    {
        //E
        Latihan2E(arg);
        //F
        Latihan2F(arg);
        //G
        Latihan2G(arg);
        //H
        Latihan2H(arg);
        //I
        Latihan2I(arg);
        //J
        Latihan2J(arg);
    }
}
