import java.math.BigInteger;
import java.math.BigDecimal;
public class Bigintegerdecimanal {
	BigInteger a=new BigInteger("12324567890");
	BigInteger b= new BigInteger("9876543210");
	
	BigDecimal m=new BigDecimal("100000000000000000.5");
	BigDecimal n=new BigDecimal("29999999999999999999.5");
	
	void addition()
	{
		System.out.println("Sum of Bigintegers="+a.add(b));
		System.out.println("Sum of Bigdsecimals="+m.add(n));
	}
	void multiply() {
		System.out.println("Product of Two BigIntegers="+a.multiply(b));
		System.out.println("Product of Two BigDecimals="+m.multiply(n));
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bigintegerdecimanal b1=new Bigintegerdecimanal();
		b1.addition();
		b1.multiply();
	}

}
