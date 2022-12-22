/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author digit
 */
class Pair<T1,T2>{
    private T1 first;
    private T2 second;

    public Pair(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }
    public boolean ngto(int n){
        if(n<2) return false;
        else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0) return false;
            }
        }
        return true;
    }
    public boolean isPrime(){
        if(ngto((Integer) first) && ngto((Integer) second)){
            return true;
        }
        return false;
    }
    @Override
    public String toString(){
        return first + " " + second;
    }
}
public class LopPair {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
    }
    
}
