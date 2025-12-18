import java.util.Scanner;
public class ThreeDimensionalArray{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
int age[][][]=new int[2][3][5];
for(int i=0;i<age.length;i++){
for(int j=0;j<age[i].length;j++){
for(int k=0;k<age[i][j].length;k++){
System.out.println("enter the age of the student:"+k+"classroom "+j+" Branch "+i);
age[i][j][k]=s.nextInt();
}
}
}
for(int i=0;i<age.length;i++){
for(int j=0;j<age[i].length;j++){
for(int k=0;k<age[i][j].length;k++){
System.out.println(age[i][j][k]);
}
}
}
}
}