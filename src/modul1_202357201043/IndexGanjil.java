package modul1_202357201043;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class IndexGanjil {

    public static void main(String[] args) {
        int data[][] = {{4, 6, 4, 2, 8, 4, 2, 10}, {4, 6, 4, 2, 8, 4, 2, 10}};
        int jumlah = 0;
        for (int a = 0; a < data.length; a++) {
            for (int b = 0; b < data[a].length; b++) {
                if (b % 2 == 1) {
                    System.out.print(data[a][b] + " ");
                    jumlah += data[a][b];
                }

            }
            System.out.println("");
        }
        System.out.println("Jumlah Ganjil = " + jumlah);
    }

}
