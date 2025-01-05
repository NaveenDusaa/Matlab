package Encapslation;
// this bank balence of holder

public class Account {
	private  long acNo;
	private String name;
	private String email;
	private double bal;
	// in this bank account fill the details
 public long getacNo() {
	 return acNo;
 }
 public void setacNo(long A) {
	 this.acNo=A;
 }
 public String getname() {
	 return name;
 }
 public void setname(String n) {
	 this.name=n;
 }
 public String getemail() {
	 return email;
 }
 public void setemail(String e) {
	 this.email=e;
 }
 public double getbal() {
	 return bal;
 }
 public void setbal(double l) {
	 this.bal=l;
 }

public static void main(String args[]) {
	Account ob=new Account();
	  ob.setacNo(6035647814L);
	  ob.setname("vivekananda");
	  ob.setemail("vivekandam56@gmail.com");
	  ob.setbal(550000.36);
	  System.out.println(ob.getacNo()+   "   "   +ob.getname()+  "  "  +ob.getemail()+  "  "  +ob.getbal());
}
	  
}
