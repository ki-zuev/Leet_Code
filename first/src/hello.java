import java.math.BigInteger;

public class hello {
	public static BigInteger factorial(int value) {
	    BigInteger x = BigInteger.valueOf(1), y;
	    for (int i=1; i<=value; i++)
	    {
	        y = BigInteger.valueOf(i);
	        x = x.multiply(y);
	    }
	    return x;
	}
	
	public static int[] mergeArrays(int[] a1, int[] a2) {
	    int n = a1.length+a2.length, i1 = 0, i2 = 0, k = 0;
	    int[] mass = new int[n];
	    for (int i=0; i<n; i++)
	    {
	    	k = 0;
	        if (i1<a1.length)
	        {
	        	if (i2==a2.length)
	        	{
	        		mass[i] = a1[i1];
		            i1++;
	        	}
	        	else
	        	{
		        	if (a1[i1]<a2[i2])
		        	{
			            mass[i] = a1[i1];
			            i1++;
			            k = 1;
		        	}
	        	}
	        }
	        if (i2<a2.length & k==0)
	        {
	        	if (i1==a1.length)
	        	{
	        		mass[i] = a2[i2];
		            i2++;
	        	}
	        	else
	        	{
		        	if (a1[i1]>=a2[i2])
		        	{
			            mass[i] = a2[i2];
			            i2++;
		        	}
	        	}
	        }
	    }
	    return mass;
	}
	
	public static void main (String args[]){
		Person bob = new Person();
        bob.displayInfo();
         
        Person tom = new Person("Tom");
        tom.displayInfo();
         
        Person sam = new Person("Sam", 19);
        sam.displayInfo();
        
        System.out.println();
        
		System.out.println(factorial(0));
		
		System.out.println();
		
		int[] a1 = {-9, 1, 4, 5};
		int[] a2 = {0, 1, 5, 9};
		int[] result = new int[a1.length+a2.length];
		result = mergeArrays(a1,a2);
	    for(int i=0; i<a1.length+a2.length; i++)
		{
			System.out.println(result[i]);
		}
	    
	    System.out.println();
	    
	    System.out.println("hello");
	}
}

class Person{
    
    String name;
    int age;
    Person()
    {
        this("Undefined", 18);
    }
    Person(String name)
    {
        this(name, 18);
    }
    Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    void displayInfo(){
        System.out.println(name);
        System.out.println(age);
    }
}