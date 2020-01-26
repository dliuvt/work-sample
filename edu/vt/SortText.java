package edu.vt;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * remove non-letter from the string
 * sort the string
 * @author Dan Liu
 *
 */
public class SortText {

	/**
	 *  filter no-letter characters
	 * @param string
	 * @return List
	 */
	public List<String> filterString(String string) {
		List<String> list = string.chars().mapToObj(c -> (char) c).filter(c -> Character.isLetter(c))
				.map(c -> c.toString()).collect(Collectors.toList());

		return list;
	}
	
	/**
	 * sort the text case insensitive
	 * @param list
	 * @return String
	 */
	public String sortStringCaseInsensitive(String text) {
		
		//filter the text
		List<String>list=filterString(text);
		
		String sortedString="";
		
		if (list.size() == 0) {
			System.out.println("This is a empty string");		
		}else {
		
		// sort the List
		Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
		sortedString = String.join("", list);
		}
		System.out.println("Sorted string: \n"+sortedString);
		return sortedString;
	}


	public String readScreen() {
		System.out.println("Please enter your text :\n");
		Scanner scanner = new Scanner(System.in);
		String text="";
		if (scanner.hasNextLine()) {
			String[] words = scanner.nextLine().split("\\s");
			text=Arrays.toString(words);
		}
		scanner.close();
		return text;
		
	}
	
	public static void main(String[] args) {

		SortText sorter= new SortText();
		String text=sorter.readScreen();
		sorter.sortStringCaseInsensitive(text);
		System.exit(0);
	}
}
