package com.muralitrainer;

import java.util.Scanner;

public class Employee_Details {

public static void main(String[] args) {
	
Scanner s=new Scanner(System.in);
System.out.println("EMPLOYEE NAME");
String empname = s.next();
s.nextLine();
System.out.println("EMPLOYEE ADDRESS");
String empaddress= s.nextLine();
System.out.println("SALERY");
double salery = s.nextDouble();
System.out.println("PHONE NUMBER");
long phonenumber = s.nextLong();
System.out.println("AGE");
byte age = s.nextByte();
System.out.println("BIRTH YEAR");
short birthyear = s.nextShort();
System.out.println("GENDER");
String gender = s.next();
System.out.println("marriage");
boolean marriage = s.nextBoolean();
System.out.println(empname+"\n"+empaddress+"\n"+salery+"\n"+phonenumber+"\n"+age+"\n"+birthyear+"\n"+gender+"\n"+marriage);











}






















}
