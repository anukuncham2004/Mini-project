import java.util.Scanner;
class Matrimony
{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String gender1="Male";
String gender2="Female";
System.out.println("Enter the gender:");
String gender=sc.next();
if(gender.equals(gender1)){
System.out.println("Enter the age:");
int age=sc.nextInt();
if(age>=21){
System.out.println("Eligible to marry");
}else{
System.out.println("Not Eligible to marry");
}
}
else if(gender.equals(gender2)){
System.out.println("Enter the age");
int age=sc.nextInt();
if(age>=18){
System.out.println("Eligible to marry");
}else{
System.out.println("Not Eligible to marry");
}
}else{
    System.out.println("Invalid input option");
    
}
}
}
