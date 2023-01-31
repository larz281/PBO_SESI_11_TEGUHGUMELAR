
/*
Teguh Gumelar
20210040047
Ti21A
PBO Sesi 11
 */
package sesi11;

public class Percobaan1 {

    public static void main(String[] args) {
        int a[] = new int[5];
        try {
            a[5] = 100;
        } catch (Exception e) {
            System.out.println("Terjadi pelanggaran memori");
        }
    }
}