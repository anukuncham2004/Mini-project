class Pattern4{
public static void main(String[]args){
int n1=4;
int n2=7;
for(int i=1;i<=n1;i++){
for(int j=i;j<n1;j++){
System.out.print(" ");
}
for(int j=1;j<=(2*i-1);j++){
if(j==1||j==(2*i-1)||i==n1){
System.out.print("*");
}else{
System.out.print(" ");
}
}
System.out.println();
}
for(int i=1;i<=n2-2;i++){
for(int j=1;j<=n2;j++){
if(j==1||j==n2){
System.out.print(" ");
}else if(i==1||i==n2-2||j==2||j==n2-1){
System.out.print("*");
}else{
System.out.print(" ");
}
}
System.out.println();
}
}
}
