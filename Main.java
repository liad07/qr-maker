package com.company;
import java.util.*;
public class Main {
public static Scanner reader=new Scanner(System.in);
    public static void main(String[] args) {
String str="https://api.qrserver.com/v1/create-qr-code/?data=";
System.out.println("enter text or link");
String str2=reader.nextLine();
System.out.println(str+str2+"&size=500x500");
    }
}
