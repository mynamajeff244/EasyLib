
/*
   _______   ______  __    __   _______ 
  / __/ _ | / __/\ \/ /   / /  /  _/ _ )
 / _// __ |_\ \   \  /   / /___/ // _  |
/___/_/ |_/___/   /_/   /____/___/____/ 
_____________________________________________________________________________
  ___              _          _   _                                           
 / __|_ _ ___ __ _| |_ ___ __| | | |__ _  _   _ _ ___ _ __  _ __ ___ _ _ _  _ 
| (__| '_/ -_/ _` |  _/ -_/ _` | | '_ | || | | '_/ _ | '  \| '_ / _ | ' | || |
 \___|_| \___\__,_|\__\___\__,_| |_.__/\_, | |_| \___|_|_|_| .__\___|_||_\_,_|
                                        |__/                |_|                
                                                                                                                                               
 Information: This is an easy library for people who are new to java to learn about how to print and do math with simple and easy code!
 Contact: PM me on UnknownCheats!
 Credits: Created by romponu! :D
 Note: Thank you guys for being such an amazing group of people! <3 TO ALL UNKC MEMBERS!
 How to use: After your class file name i.e. class <CLASSNAME> append "extends EasyLib" you should have: class <CLASSNAME> extends EasyLib
 
 */

public class EasyLib {
	
	/* * * * * * * *  
	 * EASY PRINTING *
	  * * * * * * * * */
	
	//Prints a string
	public static String print(String str){ //How to use: print("Hello");
		System.out.println(str);
		return str;
	}
	//Prints an int
	public static int print(int num){ //How to use: print(10);
		System.out.println(num);
		return num;
	}	
	//Prints a double
	public static double print(double dub){ //How to use: print(10.00);
		System.out.println(dub);
		return dub;
	}
	
	/* * * * * *  
	 * EASY MATH *
	  * * * * * * */
	
	//Adds two int numbers
	public static int add(int int1, int int2){ //How to use: add(1, 2); 
		return int1 + int2;
	}
	//Adds two double numbers
	public static double add(double double1, double double2){ //How to use: add(1.0, 2.0);
		return double1 + double2;
	}
	//Multiplies an int
	public static int multiply(int int1, int int2){ //How to use: multiply(1, 2);
		return int1 * int2;
	}
	//Multiplies a double
	public static double multiply(double double1, double double2){ //How to use: multiply(1.0, 2.0);
		return double1 * double2;
	}
	//Divide an int
	public static int divide(int int1, int int2){ //How to use: divide(1, 2);
		return int1 / int2;
	}
	//Divide a double
	public static double divide(double double1, double double2){ //How to use: divide(1.0, 2.0);
		return double1 / double2;
	}
	
	/* * * * * * * 
	 * EASY ARRAYS *
	  * * * * * * * */
	
	//Returns the length of an int array
	public static int getArrayLength(int[] array){ //How to use: getArrayLength(<ARRAYNAME>);
		return array.length - 1; //Subtracting one gives you the length of all non zero, non negative numbers, remove the subtract one to get total
	}
	//Returns the length of an double array
	public static double getArrayLength(double[] array){ //How to use: getArrayLength(<ARRAYNAME>);
		return array.length - 1; //Subtracting one gives you the length of all non zero, non negative numbers, remove the subtract one to get total
	}	
}
