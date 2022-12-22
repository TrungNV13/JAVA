package code;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CapSoNguyenToTrongFile1 {
    public static boolean isprime(int n){
        if(n<2) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }          
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream obj1= new ObjectInputStream(new FileInputStream("DATA1.in"));
        List<Integer> list1 = (ArrayList<Integer>) obj1.readObject();
        Set<Integer> set1 = new TreeSet<>();
        for(Integer i:list1){
            if(isprime(i)== true) set1.add(i);
        }
        obj1= new ObjectInputStream(new FileInputStream("DATA2.in"));
        List<Integer> list2 = (ArrayList<Integer>) obj1.readObject();
        Set<Integer> set2 = new TreeSet<>();
        for(Integer i:list2){
            if(isprime(i)==true) set2.add(i);
        }
        for(Integer i:set1){
            if(i>=1000000-i){
                break;
            }           
            if(set2.contains(1000000-i)){
                System.out.println(i+" " + (1000000-i));
            }           
        }
        obj1.close();       
    }   
}
