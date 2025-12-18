class Login{
private String username;
private String password;
public void setUsername(String  username){
this.username=username;
}
public void setPassword(String password){
if(password!=null&&password.length()>=8){
this.password=password;	
}
else{
System.out.println("the password must contain atleast 8 characters");
}
}
public String getUsername(){
return username;
}
public String getPassword(){
return password;
}
public static void main(String[]args){
Login l1=new Login();
Login l2=new Login();
l1.setUsername("anu");
l1.setPassword("12345678");
System.out.println(l1.getUsername());
System.out.println(l1.getPassword());
l2.setUsername("minnu");
System.out.println(l2.getUsername());
l2.setPassword("1234567");
System.out.println(l2.getPassword());
}
}