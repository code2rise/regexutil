# Introduction #

  * This [class](http://code.google.com/p/regexutil/source/browse/trunk/RegexUtil/src/com/rc/regex/RegexUtil.java) provides a set of functions which can be used for input validations.
  * All the validation functions are implemented by using regular expressions.
  * This is java based class which can be imported in any java project & simply call methods provided by it listed as below.
  * You can find dummy examples of it's method usage in the commented main function section.


# Details #

### Here is the list of functions provided by this class : ###
|  | **Method Name** | **Description** |
|:-|:----------------|:----------------|
| 1 | boolean isValidEmail ( String email ) | To check if valid Email |
| 2 | boolean isValidMobilePhone ( String phone ) | To check if valid Mobile number (excluding country code) |
| 3 | boolean isValidFirstName ( String name ) | To check if valid first name of person |
| 4 | boolean isValidLastName ( String name ) | To check if valid last name of person |
| 5 | boolean isValidURI ( String uri ) | To validate if URI/URL correct |
| 6 | boolean isValidAmountInDollar ( String amount ) | To verify amount in dollar is correct |
| 7 | boolean isValidFileName ( String fileName ) | To check if it's a valid file name |
| 8 | boolean isValidFileName ( String fileName, String fileExtension ) | To check if it's valid filename. This function also accepts file extension as a argument to validate in a user input filename |
| 9 | boolean isValidAlphaNumericWord ( String s ) | To check if it's valid alpha numeric word |
| 10 | boolean isValidAlphaNumericCharacter ( Character c ) | To check if it's valid alpha numeric character |
| 11 | boolean isAlphabeticWords ( String s ) | To check if it's valid alphabetic word |
| 12 | boolean isAlphabeticCharacter ( Character c ) | To check if it's valid alphabetic character |
| 13 | boolean isValidHexadecimalNumber ( int number ) | To check if it's valid hexadecimal number |
| 14 | boolean isValidOctalNumber ( int number ) | To check if it's valid octal number |
| 15 | boolean isValidInteger ( String number ) | To check if it's valid integer number |
| 16 | boolean isValidFloat ( String number ) | To check if it's valid float number |
| 17 | boolean isValidString ( String s ) | To check if it's valid string literal |
| 18 | boolean isValidDate ( String date ) | To check if it's valid date format. It accepts dates only in yyyy/mm/dd or yyyy-mm-dd or yyyy:mm:dd or yyyy/m/d or yyyy-m-d or yyyy:m:d format. It doesn't check for 29th Feb or greater dates as of now. |