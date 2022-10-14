1. what is platform independece?
java is a platform independent beacuse write once run anywhere 
we write the java program  it can be run in the  any other platform also java is called platform idependence
 

-----------------------------------------------------------------------------------------------
5.remove dulpicates in a below array int [] values {43,78,90,53,34,11,53,15,78,91,8,4,67,11}
class Dulpicate
{
	public static void main(String args[])
	{
	int arr[] = {43,78,90,53,34,11,53,15,78,91,8,4,67,11}
	int len = arr.length;
	
	for(int i=0;i<len-1;i++)
	{
		for(int j=i+1;j<len-1;j++)
		{
			if(arr[i]==arr[j] && arr[i]!=-1)
			{
				arr[i]=-1;
	
			}
		}
	}
	for(int i=0;i<len;i++)
	{
		arr[i]!=-1;
		System.out.println(arr[i]);
	}
	}
}

------------------------------------------------------------------------------
7. revers of a number

mport java.util.Scanner;

public class Reverse 
{
	public static void main(String[] args)
	{
		int rev=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		int n=s.nextInt();
		
		while(n!=0)
		{
			 int rem=n%10;
			 rev=rev*10+rem;
			n=n/10;
		}
		System.out.println(rev);
	}
}
-----------------------------------------------------------
9. program to find Armstrong number
class Armstrong 
{
	public static void main(String args[])
	{
	int number = 371,originalNumber,remainder,result = 0;
	originalNumber = number;
	while(originalNumber !=0)
	{
		remainder = originalNumber %10;
		result += Math.pow(remainder,3);
		originalNumber /=10;
	}
	if(result == number)
    System.out.println(number + " is an Armstrong number.");
		else
	System.out.println(number + " is not an Armstrong number.");
 
 }
}
-----------------------------------------------------------------------------

3.explain class and its members with example
  * class is blueprint of a object in real time which are physically exist is called class
  * class are nothing but state and behaviours of members
  * state is represented as a 
  * behavois is represented as members
  * class can store the variables and members
  example : 
		class Example
		{
		int a=20;
		String name="xyz";
		float s=4.5;
		}
	variables : variables are the memory allocated to the  value or information  to the  datatype
    Instance : is non static variables 
    static : it can be declared indside class only
-------------------------------------------------------------------------------------
2. difference between primitive and non primitive data type

 * datatype is register area used to specifies the  type of data to be stored into a variables 
   In datatype 2 types 
     * primitive  
	 * non primitive
	 primitive means it contains 8 types 
	  * int
	  * byte
	  * short
	  * long
	  * boolean
	  * char
	  * double
	  * float
	In prtimitive datatype size are fixed 
	
    
	Non primitive datatype is all upper case lettles of the refernces words like
	String , System
    * in non primitive datatype cannot have a fixed size.
	* 

----------------------------------------------------------------------
6. explain main method with the memory it execute in
  main method is 
  public static void main(String args[])
  
  in this main method public stands for access specifier , static refered is keyword ,void refered as no return type  in void nothiy will return, 
   main refered as main method where the execution start,String refered as in the  conlose to give the   


































