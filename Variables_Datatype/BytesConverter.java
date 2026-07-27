//  Write a Program to Convert Bytes into KB, MB, and GB

// Conversion:

// 1 KB = 1024 Bytes
// 1 MB = 1024 KB
// 1 GB = 1024 MB

import java.util.Scanner;

public class BytesConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size in Bytes: ");
        long bytes = sc.nextLong();

        double kb = bytes / 1024.0;
        double mb = kb / 1024;
        double gb = mb / 1024;

        System.out.printf("\nKilobytes (KB) : %.2f KB%n", kb);
        System.out.printf("Megabytes (MB) : %.2f MB%n", mb);
        System.out.printf("Gigabytes (GB) : %.6f GB%n", gb);

        sc.close();
    }
}