package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        String str="";
        str=normalizeText(str);
        System.out.println(str);
        System.out.println(caesarify(str,2));
        groupify(str, 3);

    }
    public static String normalizeText(String str){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Text");
        str = input.nextLine();
        str = str.replaceAll("\\p{Punct}","").replaceAll("\\s+","").toUpperCase();
        return str;
    }

    public static String caesarify(String str, int key){
        if (key> 26){
            key = key%26;
        }
        String ciperText="";
        int length = str.length();
        for (int i=0; i<length; i++){
            char ch = str.charAt(i);
           char c = (char) ( ch + key);
           if (c> 'Z'){
               ciperText += (char)(ch-(26-key));
           }
           else{
               ciperText+=c;
           }

        }
        return ciperText;

    }

    public static void groupify(String str, int n){
        int str_length= str.length();
        int y = str_length%n;
        String prog = Integer.toString(n);
        String str_addition= "x";
        int count= 0;
       if (y!=0){
           while(count<=y){
               str= str+str_addition;
               count++;
           }
           String result = str.replaceAll("(.{"+prog+"})","$1 ").trim();
           System.out.println(result);
       }
       else{
           String result = str.replaceAll("(.{"+prog+"})","$1 ").trim();
           System.out.println(result);
        }

    }


}
