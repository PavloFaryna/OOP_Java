package com.tasks6.rle;
 
import java.util.Scanner;
 
public class ApplicationEncoder
{
 
    public static void main(String[] args) {
        char[] input;
        char letter;
        String out="";
        Scanner scan=new Scanner(System.in);
        int counter=1;
 
        input=scan.nextLine().toCharArray();
        letter=input[0];
        for(int i=1;i<input.length;i++){
            if(input[i]==letter && counter<9){
                counter++;
            }
            else{
                out+=letter;
                if(counter>1) out+=Integer.toString(counter);
                counter=1;
            }
            letter=input[i];
        }
        out+=letter;
        if(counter>1) out+=Integer.toString(counter);
        System.out.println(out);
    }
}