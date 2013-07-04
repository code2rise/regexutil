package com.rc.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUtil 
{
	public boolean isValidEmail(String email)
	{	
		boolean isValid = false;
		
		String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
		
		isValid = matchPattern(expression, email);
		
		return isValid;
	}
	
	public boolean isValidMobilePhone(String phone)
	{	
		boolean isValid = false;		
		String expression = "^[1-9]{3}[-, ][0-9]{3}[-, ][0-9]{4}$";
		
		if(phone.length() > 9)
		{
			if(Character.isDigit(phone.charAt(3)) && Character.isDigit(phone.charAt(7)))
			{
				phone = phone.substring(0, 3) + "-" + phone.substring(3,6) + "-" + phone.substring(6);
				
				System.out.println("Phone : " + phone);
			}
			
			isValid = matchPattern(expression, phone);
		}
		
		return isValid;
	}
	
	public boolean isValidFirstName(String name)
	{
		boolean isValid = false;
		String expression = "[a-zA-Z]+(')*[a-zA-Z]+";
		
		isValid = matchPattern(expression, name);
		
		return isValid;
	}
	
	public boolean isValidLastName(String name)
	{
		boolean isValid = false;
		String expression = "[a-zA-Z]+(')*[a-zA-Z]+";
		
		isValid = matchPattern(expression, name);
		
		return isValid;
	}
	
	public boolean isValidURI(String uri)
	{
		boolean isValid = false;
		String expression = "^(http|https|ftp)\\:\\/\\/(((25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9])\\.){3}(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9])|([a-zA-Z0-9_\\-\\.])+\\.(com|net|org|edu|int|mil|gov|arpa|biz|aero|name|coop|info|pro|museum|uk|me))((:[a-zA-Z0-9]*)?/?([a-zA-Z0-9\\-\\._\\?\\,\\'/\\\\\\+&amp;%\\$#\\=~])*)$";
		
		isValid = matchPattern(expression, uri);
		
		return isValid;
	}
	
	public boolean isValidAmountInDollar(String amount)
	{
		boolean isValid = false;
		String expression = "^(\\$)?(([1-9]\\d{0,2}(\\,\\d{3})*)|([1-9]\\d*)|(0))(\\.\\d{2})?$";
		
		isValid = matchPattern(expression, amount);
		
		return isValid;
	}
	
	public boolean isValidFileName(String fileName)
	{
		boolean isValid = false;
		String expression = "([a-zA-Z0-9]*\\.)[a-z]{1,4}$";
		
		isValid = matchPattern(expression, fileName);
		
		return isValid;
	}
	
	public boolean isValidFileName(String fileName, String fileExtension)
	{
		boolean isValid = false;
		String expression = "([a-zA-Z0-9]*\\.)" + fileExtension + "$";
		
		isValid = matchPattern(expression, fileName);
		
		return isValid;
	}
	
	public boolean isValidAlphaNumericWord(String s)
	{
		boolean isValid = false;
		String expression = "[A-Za-z0-9]+";
		
		isValid = matchPattern(expression, s);
		
		return isValid;
	}
	
	public boolean isValidAlphaNumericCharacter(Character c)
	{
		boolean isValid = false;
		String expression = "[A-Za-z0-9]";
		
		isValid = matchPattern(expression, c.toString());
		
		return isValid;
	}
	
	public boolean isAlphabeticWords(String s)
	{
		boolean isValid = false;
		String expression = "[a-zA-Z]+";
		
		isValid = matchPattern(expression, s);
		
		return isValid;
	}
	
	public boolean isAlphabeticCharacter(Character c)
	{
		boolean isValid = false;
		String expression = "[a-zA-Z]";
		
		isValid = matchPattern(expression, c.toString());
		
		return isValid;
	}
	
	public boolean isValidHexadecimalNumber(int number)
	{
		boolean isValid = false;
		String expression = "[A-Fa-f0-9]+";
		
		isValid = matchPattern(expression, String.valueOf(number));
		
		return isValid;
	}
	
	public boolean isValidOctalNumber(int number)
	{
		boolean isValid = false;
		String expression = "[0-7]+";
		
		isValid = matchPattern(expression, String.valueOf(number));
		
		return isValid;
	}
	
	public boolean isValidInteger(String number)
	{
		boolean isValid = false;
		String expression = "^([0-9]+)([0-9,]*)";
		
		isValid = matchPattern(expression, number);
		
		return isValid;
	}
	
	public boolean isValidFloat(String number)
	{
		boolean isValid = false;
		String expression = "^([0-9]+)([\\d,]*).([0-9]+)";
		
		isValid = matchPattern(expression, number);
		
		return isValid;
	}
	
	public boolean isValidString(String s)
	{
		boolean isValid = false;
		String expression = "^[^<>`~!/@\\#}$%:;)(_^{&*=|'+]+$";
		
		isValid = matchPattern(expression, s);
		
		return isValid;
	}
	
	public boolean isValidDateFormat(String s)
	{
		boolean isValid = false;
		String expression = "^([\\d]{4})([-:/])((0?[1-9])|((1)([0-2])))([-:/])((0?[1-9])|((1)[0-9])|((2)[0-9])|((3)[0-1]))$";
		
		isValid = matchPattern(expression, s);
		
		return isValid;
	}
	
	private boolean matchPattern(String expression, String stringPattern)
	{
		boolean isValid = false;
		
		Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(stringPattern);
		
		if(matcher.matches())
		{
			isValid = true;
		}
		
		return isValid;
	}
	
	/**
	 * @param args
	 */
//	public static void main(String[] args)
//	{
//		RegexUtil instance = new RegexUtil();
		
//		String email = "cr.rupesh007@g.com";
//		
//		System.out.println("Email valid : " + instance.isValidEmail(email));
//		
//		String mobilePhone = "976-690-8150";
//		System.out.println("Mobile Valid : " + instance.isValidMobilePhone(mobilePhone));
//		
//		String name = "Rupesh";
//		System.out.println("Valid Name : " + instance.isValidFirstName(name));
//		
//		String lastName = "Chavan";
//		System.out.println("Valid Last Name : " + instance.isValidLastName(lastName));
//		
//		String uri = "http://255.255.255.255";
//		System.out.println("URI : " + instance.isValidURI(uri));
		
//		String fileName = "file.jpeg";
//		System.out.println("FileName : " + instance.isValidFileName(fileName));
//		
//		fileName = "file.jpeg";
//		System.out.println("FileName : " + instance.isValidFileName(fileName, "png"));
		
//		String string = "Hello";
//		System.out.println("Alphanumeric String : " + instance.isValidAlphaNumericWord(string));
		
//		Character c = 'R';
//		System.out.println("Alphanumeric Character : " + instance.isValidAlphaNumericCharacter(c));
		
//		String s = "sdfdsfsdssd";
//		System.out.println("alphabetic characters : " + instance.isAlphabeticWords(s));
		
//		Character c = 's';
//		System.out.println("Alphabetic character : " + instance.isAlphabeticCharacter(c));
		
//		int hexNumber = 0xAA;
//		System.out.println("Hex number : " + instance.isValidHexadecimalNumber(hexNumber));
		
//		int octalNUmber = 07;
//		System.out.println("Octal number : " + instance.isValidOctalNumber(octalNUmber));
		
//		Integer number = 102;
//		System.out.println("Integer number : " + instance.isValidInteger(number.toString()));
		
//		Float number = .01f;
//		System.out.println("Float number : " + instance.isValidFloat("02,34,432.01"));
		
//		String s = "This is just a test.";
//		System.out.println("String : " + instance.isValidString(s));
		
//		String date = "2013-2-31";
//		System.out.println("Date : " + instance.isValidDateFormat(date));
//	}
}
