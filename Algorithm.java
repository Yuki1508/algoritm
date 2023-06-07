/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algorithm;

import java.util.Scanner;

public class Algorithm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x,y=2;
        Scanner ba = new Scanner(System.in);
        System.out.println("Masukkan angka: ");
        x = ba.nextInt();
        /*if(x==1){
            System.out.print("Angkat 1 tidak dapat difaktorkan");
        } else{
            System.out.print("Faktor dari "+x+" adalah ");    
        }*/
        while (x>1){
            if (x%y==0){
                System.out.print(y+" ");
                x/=y;
            } else{
                y++;
            }
        }
    }
}
