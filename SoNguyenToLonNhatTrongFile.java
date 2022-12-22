/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 *
 * @author digit
 */
public class SoNguyenToLonNhatTrongFile {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {      
        ObjectInputStream o = new ObjectInputStream(new FileInputStream("DATA.in")); 
        List<Integer> list = (ArrayList<Integer>) o.readObject();    
        int a[] =  new int[1000001];
        int f[] = new int[1000001];
        Arrays.fill(f, 1);
        f[0]=f[1]=0;
        for(int i=2;i<=1000;i++){
            if(f[i]==1){
                for(int j=i*i;j<=1000000;j+=i){
                    f[j]=0;
                }
            }
        }
        for(Integer i:list){
            a[i]+=f[i];
        }       
        int cout=0;
        for(int i = 1000000;i>=2;i--){
            if(a[i]>0){
             cout++;
                System.out.println(i +" "+ a[i]);
            }
        
            if(cout==10) break;
        }
        o.close();
    }
}


