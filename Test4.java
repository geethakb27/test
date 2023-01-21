1) The hierarchy of the entire collection framework consists of four core
   interfaces such as
   * Iterable extends Collection.
   * Collection extends List,Set,Queue.
   * List implements LinkedList and ArrayList.
   * Set implements Hashset,LinkedHashset,Treeset.
   * Queue implements linked
   
   List:
   * Index based.
   * Allows duplicates.
   * Positional access.
   * Insertion order.
   
   Set:
   * Non-Index based.
   * Allows Unique elements.
   * Not positional access.
   * Un-order.
   
   Linkedlist:
	* It is in the form Nodes.
	* Writing is slower in linkedlist.
	* Reading faster in linkedlist.
	
	Arraylist:
	* It is in the form of array.
	* Writing is faster in arralist.
	* Reading is slower in arralist.
	
2)Describe Various Implementations of the Map Interface and Their Use Case Differences.

	There are two interfaces for implementing Map in java: Map and SortedMap, and three 
	classes: HashMap, LinkedHashMap, and TreeMap.
	
	A) HashMap Class
	The most common class that implements the Java Map interface is the HashMap. 
	It is a hash table based implementation of the Map interface. 
	It implements all of the Map operations and allows null values and one null key. 
	Also this class does not maintain any order among its elements.

	B) TreeMap Class

	This implementation uses the Red-Black tree as the underlying data structure.
	 A TreeMap is sorted according to the natural ordering of its keys, or by a Comparator provided at creation time. 
	This implementation doesn allow nulls but maintains order on its elements.

	C) LinkedHashMap.

	This implementation of Java Map interface uses a hash table and a linked list as the underlying data structures. 
	Thus the order of a LinkedHashMap is predictable, with insertion-order as the default order. 
	Also, allows nulls like in HashMap.

   
3)	Hashset:
	* The Hash set is executed with the help of a HashTable.
	* It does not authorise a heterogeneous object.
	* It does not support any order.
	* To compare two objects, we use the equals method.
	* It permits a null object.
	
	
	TreeSet:
	* The tree set is executed with the help of a tree structure.
	* It authorises a heterogeneous object.
	* It does not permit the null object.
	* To compare two objects, we use the compare method.
	* TreeSet supports an object in sorted order.

 
	

4)HashCode() method:
	* HashCode() method is used to get the hash code of an object.
	* HashCode() method of the object class returns the memory reference of an object in 
		integer form.
	* Definition of hashCode() method is public native hashCode().
	* It indicates the implementation of hashCode() is native because there is not any direct
		method in java to fetch the reference of the object.
	* It is possible to provide your implementation of hashCode().
	* In HashMap, hashCode() is used to calculate the bucket and therefore calculate the index.

	equals() method: 
	* This method is used to check whether 2 objects are equal or not.
	* This method is provided by the Object class. You can override this in your class to provide 
		your implementation.
	* HashMap uses equals() to compare the key to whether they are equal or not.
	* If the equals() method return true, they are equal otherwise not equal
	
5) what is fail fast and fail safe Itrator

		fail fast
		Fail-fast iterators in Java don't play along when the underlying collection gets modified.
		Collections maintain an internal counter called modCount.
		Each time an item is added or removed from the Collection, this counter gets incremented.
		
		fail safe
		Fail-Safe iterators favor lack of failures over the inconvenience of exception handling.
		Those iterators create a clone of the actual Collection and iterate over it. 
		If any modification happens after the iterator is created, the copy still remains untouched.
		Hence, these Iterators continue looping over the Collection even if it's modified.
		
6)using the instream and using codepoints() the string is converted to char
		
7)
	Spliterators, like Iterator s, are for traversing the elements of a source.
	The Spliterator API was designed to support efficient parallel traversal in addition to sequential traversal, 
	by supporting decomposition as well as single-element iteration.
	Spliterators can be used for traversing the elements of a source one by one. 
	These sources could be an array, a Collection,
	an IO Channel or a generator function.
	The main functionalities of Spliterator are-
	*Splitting the source data
	*Processing the source data
	The Interface Spliterator is included in JDK 8 for taking the advantages of parallelism in addition to sequential traversal. 
	It is designed as a parallel analogue of an iterator.

8)Spring operation with Stream
	With Spring Cloud Stream, developers can: 
	* Build, test, iterate, and deploy data-centric applications in isolation.
	* Apply modern microservices architecture patterns, including composition through messaging. 
	* Decouple application responsibilities with event-centric thinking.

		
9)	Core (spring-core) is the core of the framework that power features 
	such as Inversion of Control and dependency injection. Beans (spring-beans) provides
	Beanfactory,which is a sophisticatedimplementation of the factory pattern.

10)	Dependency Injection in Java is a way to achieve Inversion of control (IoC)
	in our application by moving objects binding from compile time to runtime.
	We can achieve IoC through Factory Pattern,Template Method Design Pattern, 
	Strategy Pattern and Service Locator pattern.				
	In the previous chapter, related to DIP, we created and used abstraction to make the classes loosely coupled. 
	Here, we are going to implement Dependency Injection and strategy pattern together to move the dependency object creation completely out of the class. 
	This is our third step in making the classes completely loose coupled.
	Dependency Injection (DI) is a design pattern used to implement IoC. It allows the creation of dependent objects outside of a class and provides those objects to a class through different ways. 
	Using DI, we move the creation and binding of the dependent objects outside of the class that depends on them.
11)
		In Spring Boot, we can use Spring Framework to define our beans and their dependency injection. 
		The @ComponentScan annotation is used to find beans and the corresponding injected with @Autowired annotation. 
		If you followed the Spring Boot typical layout, no need to specify any arguments for @ComponentScan annotation.
12)No,by @Configuration annotation

13) StringBuffer	
	*StringBuffer is synchronized i.e. thread safe.
	*It means two threads can't call the methods of StringBuffer simultaneously.	
	*StringBuffer is less efficient than StringBuilder.	
	*StringBuffer was introduced in Java 1.0	
	
	StringBuilder	
	*StringBuilder is more efficient than StringBuffer.
	*StringBuilder was introduced in Java 1.5
	*StringBuilder is non-synchronized i.e. not thread safe.
	*It means two threads can call the methods of StringBuilder simultaneously.			
14)  BeanFactory:
	*It is suitable to build standalone applications.
	*It supports only Singleton and Prototype bean scopes.	
	*It supports Annotation based configuration in Bean Autowiring.
	*It is a fundamental container that provides the basic functionality for managing beans.
	*It does not support Annotations.In Bean Autowiring, we need to configure the properties in XML file only.
	*This interface does not provides messaging functionality.
    ApplicationContex:
	*It is an advanced container that extends the BeanFactory that provides all basic functionality and adds some advanced features.
	*It is suitable to build Web applications, integration with AOP modules, ORM and distributed applications.
	*It supports all types of bean scopes such as Singleton, Prototype, Request, Session etc.
	*ApplicationContext interface extends MessageSource interface, thus it provides messaging Functionality.
	

15)
		1.Spring AOP :
		In Spring AOP, aspects are implemented using regular classes (the schema-based approach) or regular classes annotated with the @Aspect annotation (the @AspectJ style).
		Join point: a point during the execution of a program, such as the execution of a method or the handling of an exception.
		
		2.IOC:Spring IoC is the mechanism to achieve loose-coupling between Objects dependencies.
		To achieve loose coupling and dynamic binding of the objects at runtime, objects dependencies are injected by other assembler objects.
		
		3.POJO:POJO is short for Plain old java object, an application implemented in pojo way means the logic resides in POJO with little to no boilerplate code, thus it's very portable. 
		An PoJo application can be ported from Spring to another container with little modification.
		
		4.@Componment:Spring Component annotation is used to denote a class as Component. 
		It means that Spring framework will autodetect these classes for dependency injection when annotation-based configuration and classpath scanning is used.
		
		5.@ComponmentScan:One of the most important annotations in spring is @ComponentScan which is used along with the @Configuration annotation to specify the packages that we want to be scanned.
		@ComponentScan without arguments tells Spring to scan the current package and all of its sub-packages.
		
		6.@Bean:the objects that form the backbone of your application and that are managed by the Spring IoC container are called beans. A bean is an object that is instantiated,
		assembled, and otherwise managed by a Spring IoC container.
		
17.What is the use of below mentioned tool

1. Maven :Maven tutorial provides basic and advanced concepts of apache maven technology. Our maven tutorial is developed for beginners and professionals.
		Maven is a powerful project management tool that is based on POM (project object model). 
		It is used for projects build, dependency and documentation.

2. Gradle :Gradle is an open-source build automation tool flexible enough to build almost any type of software. Gradle makes few assumptions about what you’re trying to build or how to build it.
			This makes Gradle particularly flexible.

3. Tomcat:It is an open-source Java servlet container that implements many Java Enterprise Specs such as the Websites API,
	Java-Server Pages and last but not least, the Java Servlet.
	The complete name of Tomcat is "Apache Tomcat" it was developed in an open, participatory environment and released in 1998 for the very first time.
	It began as the reference implementation for the very first Java-Server Pages and the Java Servlet API. However, it no longer works as the reference implementation for both of these technologies, but it is considered as the first choice among the users even after that. It is still one of the most widely used java-sever due to several capabilities such as good extensibility, proven core engine, and well-test and durable. Here we used the term "servlet" many times, so what is java servlet; it is a kind of software that enables the webserver to handle the dynamic(java-based) content using the Http protocols.

4. Quarkus:Traditional Java stacks were engineered for monolithic applications with long startup times and large memory requirements in a world where the cloud, containers, and Kubernetes did not exist. 
	Java frameworks needed to evolve to meet the needs of this new world.

6. Server:A server is a computer program or device that provides a service to another computer program and its user, also known as the client. In a data center, the physical computer that a server program runs on is also frequently referred to as a server. 
	That machine might be a dedicated server or it might be used for other purposes.

16)package com.xworkz.test1;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Country {
	public static void main(String[] args) {
		Map<String, Integer> map=new TreeMap<String, Integer>();
		map.put("India", 91);
		map.put("UK", 32);
		map.put("USA", 13);
		map.put("UAE", 42);
		map.put("China", 52);
		
		Set<Entry<String, Integer>> entry= map.entrySet();
		entry.forEach(ele->System.out.println(ele));
		
		map.forEach((key,value)->{if(value==52) {System.out.println(key);}});
			
		Iterator<Entry<String, Integer>> itr=entry.iterator();
		while(itr.hasNext()) {
			Entry<String, Integer> ent= itr.next();
			if(ent.getValue()==42) {
				itr.remove();
				for (Entry<String, Integer> entry2 : entry) {
					System.out.println(entry2);
				}
			}
		}
		
		
	}
}		

20)package com.xworkz.test1;

import java.util.LinkedList;

public class LinkList {
	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(12);
		list.add(123);
		list.add(23);
		list.add(2354);

		list.forEach(ele -> System.out.println(ele));
		list.removeFirst();
		System.out.println("removed first");
		list.forEach(ele -> System.out.println(ele));
		list.removeLast();

		System.out.println("removed last");
		list.forEach(ele -> System.out.println(ele));

	}
}