package com.sourceit.java.basic.lesovaya.ht14;

import com.sourceit.java.basic.lesovaya.ht14.exceptions.ArrayLengthException;
import com.sourceit.java.basic.lesovaya.ht14.exceptions.ValidationException;

public class TestException {
/**
 * Returns a string that is a substring of this string. The substring begins at the specified beginIndex and extends to the character at index endIndex. Thus the length of the substring is endIndex-beginIndex.
 * In the case initial array has only one specified index and string - substring begins with the character at the specified index and extends to the end of this string.
 * <pre>Example: 
    		subString({"initialString", "7", "12"}) returns "String"
 		subString({"initialString", "10") returns "ring"</pre>
 * @param initiaArray - contains 2 or 3 elements: string and one or two indexes
 * @return the specified substring.
 * @throws ValidationException if the firstIndex is negative, or lastIndex is larger than the length of this String object, or firstIndex is larger than lastIndex.
 */
	public StringBuilder subString(String[] initiaArray) throws ValidationException,ArrayLengthException {
		StringBuilder result = new StringBuilder("");
		String text = "";
		int firstIndex = 0;
		int lastIndex = 0;

		if (initiaArray.length <= 1 || initiaArray.length > 3) {
			throw new ArrayLengthException("Array must have 2 or 3 elements");
		} else {			
			text = initiaArray[0];
			
			try {
				firstIndex = Integer.parseInt(initiaArray[1]);
			} catch (NumberFormatException numEx) {
				throw new ValidationException("NumberFormatException occured with element: index 1 ");
			}
			
			if(initiaArray.length == 2) {				
				lastIndex = text.length() - 1;
			} 
			if(initiaArray.length == 3) {
				try {
					lastIndex = Integer.parseInt(initiaArray[2]);
				} catch (NumberFormatException numEx) {
					throw new ValidationException("NumberFormatException occured with element: index 2 ");
				}				
			}
			if(lastIndex < firstIndex) {
				throw new ValidationException("First index should be equals or smaller than last index");
			}
			if(firstIndex < 0 || lastIndex < 0) {
				throw new ValidationException("The index is negative: firstIndex = " + firstIndex + "; lastIndex = " + lastIndex); 
			}
			if(lastIndex > text.length() - 1) {
				throw new ValidationException("The lastIndex is bigger than length of initial string");
			}
			if(firstIndex > text.length() - 1) {
				throw new ValidationException("The firstIndex is bigger than length of initial string");
			}
			
			char[] arrayOfChars = initiaArray[0].toCharArray();
			for (int i = firstIndex; i <= lastIndex; i++) {
				result.append(arrayOfChars[i]);
			}
			return result;
		}
	}

}
