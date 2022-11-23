import java.util.Scanner;

public abstract class RunAnimal extends Animal {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose an animal. Press B for Bird, C for Cat or D dor Dog");
		 String input = sc.nextLine();
		 
		 if (input.equalsIgnoreCase("B")){
		 	Bird B = new Bird();
		 	B.eat();
		 B.sleep();	
		 		B.makesound();
		 }
		 else if (input.equalsIgnoreCase("C")){
		 	Cat C = new Cat();
		 	C.eat();
		 C.sleep();	
		 	C.makesound();
		 	
		 }
		  else if (input.equalsIgnoreCase("D")){
		 	Dog D = new Dog();
		 	D.eat();
		 D.sleep();	
		 	D.makesound();
	}
	else{
		System.out.println("Invalid Input");
	}
	}

	
	}