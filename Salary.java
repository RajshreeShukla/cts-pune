package cognizant.com;

public class Salary extends Employee{
 int basicPay;
 int dA;
 int hra;
  int grossPay;
  int pF;
  int netPay;
     public int getBasicPay() {
	return basicPay;
}
public void setBasicPay(int basicPay) {
	this.basicPay = basicPay;
}
public int getdA() {
	return dA;
}
public void setdA(int dA) {
	this.dA = dA;
}
public int getHra() {
	return hra;
}
public void setHra(int hra) {
	this.hra = hra;
}
public int getGrossPay() {
	return grossPay;
}
public void setGrossPay(int grossPay) {
	this.grossPay = grossPay;
}
public int getpF() {
	return pF;
}
public void setpF(int pF) {
	this.pF = pF;
}
void Calculate() {
	  netPay = basicPay+dA+hra+grossPay+pF;
 System.out.println("netpay = " +netPay);
}
void Display() {
Salary sal=new Salary();
sal.setBasicPay(45);
sal.setdA(5000);
sal.setGrossPay(3400);
sal.setHra(670);
sal.setpF(15000);
netPay=basicPay+dA+hra+grossPay+pF;
}
}