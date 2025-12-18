class Methods1{
double amount;
Methods1(double amount){
this.amount=amount;
}
double withdrawalAmount(double x){
amount=amount-x;
if(amount>=x){
System.out.println("withdrawal successful");
}else{
System.out.println("Insufficient balance");
}
return amount;
}
double depositAmount(double y){
amount=amount+y;
return amount;
}
public static void main(String[]args){
Methods1 m=new Methods1(2000);
m.withdrawalAmount(500);
System.out.println("total balance after deposit is:" +m.depositAmount(300));
}
}
