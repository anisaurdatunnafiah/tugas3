/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul1_202357201043;

/**
 *
 * @author LENOVO
 */
public class Modul1_202357201043 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int data [][] = {{4, 6, 4, 2, 8, 4, 2, 10}, {4, 6, 4, 2, 8, 4, 2, 10}};
        
        for (int a = 0; a < data.length; a++) {
            for (int b = 0; b < data [0].length; b++) {
            System.out.print(data[a][b] +" ");
    }
            System.out.print("\n");
        
       }
    } 
}