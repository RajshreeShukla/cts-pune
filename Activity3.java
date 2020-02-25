package cognizant.com;

/*consider the string str="Global Warming"
    Write statements in Java to implement the following
    a) To display the last four characters.
    b) To display the substring starting from index 4 and ending at index 8.
    c) To check whether string has alphanumeric characters or not.
    d) To trim the last four characters from the string.
    e) To trim the first four characters from the string.
    f) To display the starting index for the substring "Wa".
    g) To change the case of the given string.
    h) To check if the string is in title case.
    i) To replace all the occurrences of letter "a" in the string with "*"
package cognizant.com;*/

public class Activity3 {
	public static boolean isTitleCase(String s) {
		boolean result = false;

		String word[] = s.split("\\s+");
		for (int i = 0; i < s.length(); i++) {
			char ch = word[i].charAt(0);

			if (ch >= 65 && ch <= 90) {
				result = true;
			} else {
				result = false;
				break;
			}
		}
		return result;
	}

	public static void main(String... args) {
		String str = "i have this value";
		String str2 = "of y and x";
		System.out.println(str.substring(13));
		System.out.println(str.substring(4, 8));
		System.out.println(str.indexOf("have"));
		System.out.println(str.toLowerCase());
		System.out.println(str.replace('a', '#'));
		System.out.println(str.matches("^[a-zA-Z0-9]*$"));
		System.out.println(str.substring(0, str.length() - 4));
		System.out.println(str.substring(4));
		System.out.println(isTitleCase(str));
	}

}
