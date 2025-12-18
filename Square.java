class Square{
public static void main(String[]args){
int n=11;
for(int i=1;i<=n;i++){
for(int j=1;j<=n;j++){
if(i==1||i==n||j==1||j==n||j==n-5||i==n-5){
System.out.print("*");
}else{
System.out.print(" ");
}
}
System.out.println();
}
}
}


