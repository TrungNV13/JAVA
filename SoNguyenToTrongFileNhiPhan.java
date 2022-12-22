/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.List;


/**
 *
 * @author digit
 */
public class SoNguyenToTrongFileNhiPhan {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream o = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        List<Integer> list = (List<Integer>) o.readObject();
        int a[] =  new int[10000];
        Arrays.fill(a, 1);
        a[0]=a[1]=0;
        for(int i=2;i<=100;i++){
            if(a[i]==1){
                for(int j=i*i ; j<10000 ; j+=i){
                    a[j]=0;
                }
            }
        }
        int b[] =  new int[10000];
        for(Integer i:list){
            b[i]+=a[i];
        }
        for(int i=2;i<10000;i++){
            if(b[i] > 0){
                System.out.println(i+" "+ b[i]);
            }
            
        }
        o.close();
    }
    
}
