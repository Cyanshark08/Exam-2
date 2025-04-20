import java.util.Scanner;

class Input
{
	//testing all methods
	public static void main(String[] args)
	{
		String s1 = Input.getString("Input a string: ");
		System.out.printf("You have entered: %s\n",s1);

		String s2 = Input.getString("Input an uppercase string: ", true);
		System.out.printf("You have entered: %s\n",s2);

		String s3 = Input.getString("Input an lowercase string: ", false);
		System.out.printf("You have entered: %s\n",s3);

		char c1 = Input.getChar("Input any character: ");
		System.out.printf("You have entered: %s\n",c1);

		char c2 = Input.getChar("Input a character of 'Y' or 'N': ", 'Y', 'N');
		System.out.printf("You have entered: %s\n",c2);

		char c3 = Input.getChar("Input a character in \"ABCDEF\": ", "ABCDEF");
		System.out.printf("You have entered: %s\n",c3);

		int i1 = Input.getInteger("Input any integer: ");
		System.out.printf("You have entered: %d\n",i1);

		int i2 = Input.getInteger("Input a positive integer: ", true);
		System.out.printf("You have entered: %d\n",i2);

		int i3 = Input.getInteger("Input a negative integer: ", false);
		System.out.printf("You have entered: %d\n",i3);

		int i4 = Input.getInteger("Input an integer (10..20): ", 20,10);
		System.out.printf("You have entered: %d\n",i4);

		int i5 = Input.getInteger("Input an integer not equal to 7: ", 7);
		System.out.printf("You have entered: %d\n",i5);

		int i6 = Input.getInteger("Input an integer greater than or equal to 5: ", 5, true);
		System.out.printf("You have entered: %d\n",i6);

		int i7 = Input.getInteger("Input an integer less than or equal to 5: ", 5, false);
		System.out.printf("You have entered: %d\n",i7);

		double d1 = Input.getDouble("Input any double: ");
		System.out.printf("You have entered: %f\n",d1);

		double d2 = Input.getDouble("Input a positive double: ", true);
		System.out.printf("You have entered: %f\n",d2);

		double d3 = Input.getDouble("Input a negative double: ", false);
		System.out.printf("You have entered: %f\n",d3);

		double d4 = Input.getDouble("Input a double (10..20): ", 10.0,20.0);
		System.out.printf("You have entered: %f\n",d4);

		double d5 = Input.getDouble("Input an double not equal to 7.0: ", 7.0);
		System.out.printf("You have entered: %f\n",d5);

	}

	/**
	* This getChar method validates input char type.
	* @param prompt - a message display at console.
    * @return a string
	*/
	public static String getString(String prompt)
	{
		Scanner keyboard = new Scanner(System.in);

		String input = "";
		do
		{
			System.out.print(prompt);
			input = keyboard.nextLine().trim();
			if (input.isEmpty())
			{
				System.out.println("ERROR: Input string cannot be empty. Please re-specify.");
				continue;
			}
			else;
				break;
		}while(true);
		
//		// keyboard.close();
		return input;
	}

	/**
	* This getString method validates input char type.
	* @param prompt - a message display at console.
	* @param uppercase - (true) for upper case string, else (false) for lowercase
    * @return a converted string 9uppercase or lowercase)
	*/
	public static String getString(String prompt, boolean uppercase)
	{
		Scanner keyboard = new Scanner(System.in);

		String input = "";
		
		System.out.print(prompt);

		if (uppercase)
			input = keyboard.nextLine().trim().toUpperCase();
		else
			input = keyboard.nextLine().trim().toLowerCase();
				
		// keyboard.close();
		return input;
	}

	/**
	* This getChar method validates input char type.
	* @param prompt - a message display at console.
    * @return any char value.
	*/
	public static char getChar(String prompt)
	{
		Scanner keyboard = new Scanner(System.in);

		String input = "";
		do
		{
			System.out.print(prompt);
			input = keyboard.nextLine().trim();
			if (input.isEmpty())
			{
				System.out.println("ERROR: Input string cannot be empty. Please re-specify.");
				continue;
			}
			else;
				break;
		}while(true);

		// keyboard.close();

		return input.charAt(0);
	}

	/**
	* This getChar method validates input char type.
	* @param prompt - a message display at console.
	* @param Uppercase - a flag to convert the return character to upper case (true) or lower case (false).
    * @return valid char value.
	*/
	public static char getChar(String prompt, boolean uppercase)
	{
		Scanner keyboard = new Scanner(System.in);

		char input = ' ';
		do
		{
			System.out.print(prompt);
			if (!keyboard.hasNextLine())
			{
			    System.out.println("ERROR: Input value must be a character. Please re-specify.");
			    keyboard.next();
			}
			else
			{
				input = uppercase? keyboard.nextLine().toUpperCase().charAt(0) : keyboard.nextLine().toLowerCase().charAt(0);
				break;
			}
		}while (true);
		
		// keyboard.close();

		return input;
	}

	/**
	* This getChar method validates input char type of 'Y' or 'N'
	* @param prompt - a message display at console.
	* @param char y  and char n - two types of specified characters.
    * @return valid uppercase char value.
	*/
	public static char getChar(String prompt, char y, char n)
	{
		Scanner keyboard = new Scanner(System.in);

		char input = ' ';
		do
		{
			System.out.print(prompt);
			if (!keyboard.hasNextLine())
			{
			    System.out.printf("ERROR: Input value must be a char of '%s' or '%s'. Please re-specify.\n", y, n);
			    keyboard.next();
			}
			else
			{
				input = Character.toUpperCase(keyboard.nextLine().charAt(0));
				if (input != Character.toUpperCase(y) && input != Character.toUpperCase(n))
				    System.out.printf("ERROR: Input value must be a char of '%s' or '%s'. Please re-specify.\n", y, n);
				else
					break;
			}
		}while (true);
		
		// keyboard.close();

		return input;
	}

	/**
	* This getChar method validates input char type in specified string
	* @param prompt - a message display at console.
	* @param specVaue - a String cotain a sepcified string of valid characters.
    * @return a valid char value.
	*/
	public static char getChar(String prompt, String specValue)
	{
		Scanner keyboard = new Scanner(System.in);

		String input = "";
		do
		{
			System.out.print(prompt);
			input = keyboard.nextLine().toUpperCase().trim();
			if (input.isEmpty()||input.length() > 1)
			{
			    System.out.printf("ERROR: Input value must be a char in \"%s\". Please re-specify.\n", specValue);
			    continue;
			}
			else
			{
				input = input.substring(0,1);
				if (!specValue.toUpperCase().contains(input))
				{
					System.out.printf("ERROR: Input value must be a char in \"%s\". Please re-specify.\n", specValue);
				    continue;
				}
				else
					break;
			}
		}while (true);
		
		// keyboard.close();

		return input.charAt(0);
	}

	/**
	* This getInteger method validates input integer type.
	* @param prompt - a message display at  console.
    * @return valid integer value.
	*/
	public static int getInteger(String prompt)
	{
		Scanner keyboard = new Scanner(System.in);

		int input = 0;
		do
		{
			System.out.print(prompt);
			if (!keyboard.hasNextInt())
			{
			    System.out.println("ERROR: Input value must be an integer. Please re-specify.");
			    keyboard.next();
			}
			else
			{
				input = keyboard.nextInt();
				break;
			}
		}while (true);
		
		// keyboard.close();

		return input;
	}

	/**
	* This getInteger method validates input integer type (positive or negative).
	* @param prompt - a message display at  console.
	* @param flag - true (positive) or false (negative)
	* @return valid integer value.
	*/
	public static int getInteger(String prompt, boolean flag)
	{
		Scanner keyboard = new Scanner(System.in);
		int input = 0;
		do
		{
			System.out.print(prompt);
			if (!keyboard.hasNextInt())
			{
				if (flag)
			    	System.out.println("ERROR: Input value must be a positive integer. Please re-specify.");
			    else
			    	System.out.println("ERROR: Input value must be a negative integer. Please re-specify.");
			    keyboard.next();
			}
			else
			{
				input = keyboard.nextInt();
				if (input <= 0 && flag == true)
				    System.out.println("ERROR: Input value must be a positive integer. Please re-specify.");
				else if (input >= 0 && flag == false)
				    System.out.println("ERROR: Input value must be a negative integer. Please re-specify.");
				else
					break;
			}
		}while (true);
		
		// keyboard.close();

		return input;
	}

	/**
	* This getInteger method validates input integer type within range.
	* @param prompt - a message display at  console.
	* @param startValue - starting integer
	* @param endValue - ending integer
	* @return valid integer value.
	*/
	public static int getInteger(String prompt, int startValue, int endValue)
	{
		Scanner keyboard = new Scanner(System.in);
		int input = 0;

		int temp = startValue;
		if (startValue > endValue)
		{
			startValue = endValue;
			endValue = temp;
		}

		do
		{
			System.out.print(prompt);
			if (!keyboard.hasNextInt())
			{
				    System.out.printf("ERROR: Input value must be an integer between %d..%d. Please re-specify.\n", startValue, endValue);
			    keyboard.next();
			}
			else
			{
				input = keyboard.nextInt();
				keyboard.nextLine();
				if (input < startValue || input > endValue)
				    System.out.printf("ERROR: Input value must be an integer between %d..%d. Please re-specify.\n", startValue, endValue);
				else
					break;
			}
		}while (true);

		// keyboard.close();

		return input;
	}

	/**
	* This getInteger method validates input integer cannot be the specified value.
	* @param prompt - a message display at  console.
	* @param specValue - Specified integer
	* @return valid integer value.
	*/
	public static int getInteger(String prompt, int specValue)
	{
		Scanner keyboard = new Scanner(System.in);
		int input = 0;
		do
		{
			System.out.print(prompt);
			if (!keyboard.hasNextInt())
			{
			    System.out.printf("ERROR: Input value must be an integer not equal to %. Please re-specify.\n", specValue);
			    keyboard.next();
			}
			else
			{
				input = keyboard.nextInt();
				keyboard.nextLine();
				if (input == specValue)
				    System.out.printf("ERROR: Input value must be an integer not equal to %d. Please re-specify.\n", specValue);
				else
					break;
			}
		}while (true);

		// keyboard.close();

		return input;
	}

	/**
	* This getInteger method validates input integer cannot be the specified value.
	* @param prompt - a message display at  console.
	* @param specValue - Specified integer
	* @param greater - flag the value can be equal to or greater than
	* @return valid integer value.
	*/
	public static int getInteger(String prompt, int specValue, boolean flag)
	{
		Scanner keyboard = new Scanner(System.in);
		int input = 0;
		do
		{
			System.out.print(prompt);
			if (!keyboard.hasNextInt())
			{
			    System.out.println("ERROR: Input value must be an integer. Please re-specify.\n");
			    keyboard.next();
			}
			else
			{
				input = keyboard.nextInt();
				keyboard.nextLine();
				if (flag && input < specValue)
				    System.out.printf("ERROR: Input value must be an integer greater than or equal to %d. Please re-specify.\n", specValue);
				else if (!flag && input > specValue)
				    System.out.printf("ERROR: Input value must be an integer lesser than or equal to %d. Please re-specify.\n", specValue);
				else
					break;
			}
		}while (true);

		// keyboard.close();

		return input;
	}


	/**
	* This getDouble method validates input double type.
	* @param prompt - a message display at  console.
    * @return valid double value.
	*/
	public static double getDouble(String prompt)
	{
		Scanner keyboard = new Scanner(System.in);

		double input = 0.0;
		do
		{
			System.out.print(prompt);
			if (!keyboard.hasNextDouble())
			{
			    System.out.println("ERROR: Input value must be a double. Please re-specify.");
			    keyboard.next();
			}
			else
			{
				input = keyboard.nextDouble();
				break;
			}
		}while (true);

		// keyboard.close();

		return input;
	}

	/**
	* This getDouble method validates input double type (positive or negative).
	* @param prompt - a message display at  console.
	* @param flag - true (positive) or false (negative)
	* @return valid double value.
	*/
	public static double getDouble(String prompt, boolean flag)
	{
		Scanner keyboard = new Scanner(System.in);
		double input = 0.0;
		do
		{
			System.out.print(prompt);
			if (!keyboard.hasNextDouble())
			{
				if (flag)
			    	System.out.println("ERROR: Input value must be a positive double. Please re-specify.");
			    else
			    	System.out.println("ERROR: Input value must be a negative double. Please re-specify.");
			    keyboard.next();
			}
			else
			{
				input = keyboard.nextDouble();
				if (input < 0.0 && flag == true)
				    System.out.println("ERROR: Input value must be a positive double. Please re-specify.");
				else if (input > 0.0 && flag == false)
				    System.out.println("ERROR: Input value must be a negative double. Please re-specify.");
				else
					break;
			}
		}while (true);

		// keyboard.close();

		return input;
	}

	/**
	* This getDouble method validates input double type within range.
	* @param prompt - a message display at  console.
	* @param startValue - starting double
	* @param endValue - ending double
	* @return valid double value.
	*/
	public static double getDouble(String prompt, double startValue, double endValue)
	{
		Scanner keyboard = new Scanner(System.in);
		double input = 0;

		double temp = startValue;
		if (startValue > endValue)
		{
			startValue = endValue;
			endValue = temp;
		}

		do
		{
			System.out.print(prompt);
			if (!keyboard.hasNextDouble())
			{
				    System.out.printf("ERROR: Input value must be an double between %.2f..%.2f. Please re-specify.\n", startValue, endValue);
			    keyboard.next();
			}
			else
			{
				input = keyboard.nextDouble();
				keyboard.nextLine();
				if (input < startValue || input > endValue)
				    System.out.printf("ERROR: Input value must be an integer between %.2f..%.2f. Please re-specify.\n", startValue, endValue);
				else
					break;
			}
		}while (true);

		// keyboard.close();

		return input;
	}

	/**
	* This getDouble method validates input double cannot be the specified value.
	* @param prompt - a message display at console.
	* @param specValue - Specified double
	* @return valid double value.
	*/
	public static double getDouble(String prompt, double specValue)
	{
		Scanner keyboard = new Scanner(System.in);
		double input = 0.0;
		do
		{
			System.out.print(prompt);
			if (!keyboard.hasNextDouble())
			{
			    System.out.printf("ERROR: Input value must be a double not equal to %.2f. Please re-specify.\n", specValue);
			    keyboard.next();
			}
			else
			{
				input = keyboard.nextDouble();
				keyboard.nextLine();
				if (input == specValue)
				    System.out.printf("ERROR: Input value must be a double not equal to %.2f. Please re-specify.\n", specValue);
				else
					break;
			}
		}while (true);

		// keyboard.close();

		return input;
	}
}
