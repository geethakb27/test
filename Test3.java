3.
	Gerneralization :
		converting a sub class type into a super class type is called gerneralization.
		becouse we are making the subclass to become more genral and its scope is widening.
	Specialization :
	   coverting a super class type into sub class type is called Specialization.
	   it is also called as norrowing.
	   
===============================================================================
4.
 a) We can also stop a class to be extended/inherited by other classes in Java by making the class
	constructor private. If we make the class constructor private we'll not be able to create the
	object of this class from outside of this class.
	
	b) few example of final classes defined in java 
	--java.lang, string,
	  java.lang.math are final
 	  classes.

 b)example for final classes identifed in java API --
 final keyword can be used with a variable,methods or class 
 final keywords is non access modifier so we can 
 
 A class which is already has all its implementation complete so none in 
 the world should not be able to provi	de additional to original class.
 To achieve this scenario we should declare it as "final".

 c)alternative to inheritance is DELEGATION can be the alternative to inheritance 
 it means that you use an object of another class as an instance variables and 
 forwared message to the instance.
 ===============================================
5. sort() method is present in java. util. Collections class.
	It is used to sort the elements present in the specified list of Collection in ascending order.
===================================================
  Sorted collection is used in java is
6. difference bt LinkedList and ArrayList
	Linkedlist:
	* It is in the form Nodes.
	* Writing is slower in linkedlist.
	* Reading faster in linkedlist.
	
	Arraylist:
	* It is in the form of array.
	* Writing is faster in arralist.
	* Reading is slower in arralist.
===========================================================	
9. Memory leaking java :
	Memory management is Java’s strongest suit and one of the many reasons developers choose Java over other platforms 
	and programming languages. On paper, you create objects, 
	and Java deploys its garbage collector to allocate and free up memory. 
	But that’s not to say Java is flawless. As a matter of fact, memory leaks happen and
	they happen a lot in Java applications. 
====================================================================
8. Inheritance is a substantial rule of any Object-Oriented Programming (OOP) language but still,
  there are ways to prevent method overriding in child classes which are as follows:
   The covariant method overriding approach, implemented in Java 5, helps to remove
	the client-side typecasting by enabling you to return a subtype of the overridden
	method's actual return type. Covariant Method overriding means that when overriding
	a method in the child class, the return type may vary.
	
Methods:

	* Using a static method
	* Using private access modifier
	* Using default access modifier
	* Using the final keyword method
===================================================================
7.
		Iterator:
	Iterator can traverse the elements in a collection only in forward direction.
	Iterator can traverse Map, List and Set.
	AIterator is unable to add elements to a collection.
	Iterator can not modify the elements in a collection.
    Iterator has no method to obtain an index of the element in a collection.
	
	ListIterator:
	ListIterator can traverse the elements in a collection in forward as well as the backwards direction.
	ListIterator can traverse List objects only.
	ListIteror can add elements to a collection.
	ListIterator can modify the elements in a collection using set().
	Using ListIterator,we can obtain an index of the element in a collection.
===============================================================================	
1.
	
	public class MinMax
	{
    public static void main(String args[])
    {
        // Creating arraylist
        ArrayList<Integer> arr = new ArrayList<Integer>();
  
        // Adding object in arraylist
        arr.add(10);
        arr.add(20);
        arr.add(5);
        arr.add(8);
   
       int n = arr.size();
 
        System.out.println("ArrayList elements are :");
  
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
  
        System.out.println();
  
      
        int max = Collections.max(arr);
        System.out.println("Maximum is : " + max);
  
        int min = Collections.min(arr);
        System.out.println("Minimum is : " + min);
    }
}
============================================================================
2.
 public class Love {

	public static boolean flowersPetals(int flower1Petals, int flower2Petals) {
		return false;
		
	}
	
	    public static void main(String[] args) {

	        Scanner flower1 = new Scanner(System.in);
	        Scanner flower2 = new Scanner(System.in);

	        System.out.print("Enter a number of petals: ");
	        int num1 = flower1.nextInt();
	        int num2 = flower2.nextInt();
	        flowersPetals(num1,num2);
	        
	        if(num1%2==0 && num2%2==0) {
	        	System.out.println("They are not in love");
	        }else {
	        	System.out.println("They are in love");
	        }
	    }
	}
===================================================================	
10. 
	Static polymorphism(Compile time polymorphism):
	* Static polymorphism is nothing but Compile time polymorphism or Method Overloading.
	* Process of calling a method at compile time is called static polymorphism.
	* Inheritance is not involved.
	* Method is executed quite earlier but provide fast execution.
	
	Dynamic polymorphism(Runtime polymorphism):
	* Dynamic polymorphism is nothing but runtime polymorphism or Method Overriding.
	* Process of calling a method at runtime is called Dynamic polymorphism.
	* Inheritance is involved.
	* Method is execution slow because of runtime.
===========================================================================
11. 	She can give security for her programs by making  properties as privite and providing
	access by setter and getter methos and this also called as encapsulatiom so she can give
	security for her programs. or she can use the property of the Oops called Abstract calss
	she can give security.

	   
	   