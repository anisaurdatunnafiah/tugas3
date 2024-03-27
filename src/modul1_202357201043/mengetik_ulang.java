/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul1_202357201043;

/**
 *
 * @author LENOVO
 */
public class mengetik_ulang {

    public static void main(String[] args) {
        int data[][] = {{4, 6, 4, 2, 8, 4, 2, 10}, {4, 6, 4, 2, 8, 4, 2, 10}};
        double total = 0;
        double elment = 0;

        for (int a = 0; a < data.length; a++) {
            for (int b = 0; b < data[0].length; b++) {
                System.out.print(data[a][b] + " ");
                total += data[a][b];
                elment++;

            }
            System.out.println("");
        }
        double rarata = total / elment;
        System.out.println("Rata rata = " + rarata);
    }
}

                
    
