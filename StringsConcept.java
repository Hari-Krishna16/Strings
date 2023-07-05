package de.zeroco.strings;

public class StringsConcept {

	public static void main(String[] args) {
		String names[] = { "Hari", "Sivaji", "Jai Krishna", "Hari Chandana", "Mohan Krishna", "Ravi", "Kiran", "Divya",
				"Lavanya", "Geetha" };
//		System.out.println(stringMethodExamples("hello"));
//		System.out.println(getComparison("HELLO", "hello"));
//		System.out.println(sendingFeedBackToUser("   Hari ", "Krishna", "harikrishnakaaki@yahoo.com"));
		System.out.println(userIdfication(names, "ki"));
//		System.out.println(isValidData(names));
	}

	public static String valuesOfStrings(String word) {
		String getResult = "";
		word = word.trim();
		if (word.isEmpty()) {
			return "Value is Empty";
		}
		for (int i = 0; i < word.length(); i++) {
			getResult += word.charAt(i) + "=" + word.codePointAt(i) + " ";
		}
		return getResult;
	}

	public static String getComparison(String word, String quote) {
		int result = word.compareTo(quote);
		int differences = word.compareToIgnoreCase(quote);
		return result + " " + differences;
	}

	public static String sendingFeedBackToUser(String firstName, String lastName, String emailId) {
		firstName = firstName.trim();
		lastName = lastName.trim();
		emailId = emailId.trim();
		if (firstName.isEmpty() || lastName.isEmpty() || emailId.isEmpty()) {
			return "Enter valid details";
		}
		String fullName = firstName.concat(lastName).toUpperCase();
		String mail = "";
		if (emailId.endsWith("@gmail.com") || emailId.endsWith("@yahoo.com")) {
			mail = "Hi dear xyz Thanks for reaching us sorry for inconvinience xyz we will look at the issue and reach out as soon possible xyz ";
			mail = mail.replaceAll("xyz", fullName);
		} else {
			return "Enter valid mail";
		}
		return mail;
	}

	public static String userIdfication(String names[], String pattern) {
		String result = "";
		String delimiter = " ";
		for (int itr = 0; itr < names.length; itr++) {
			names[itr] = names[itr].toLowerCase();
			if (names[itr].contains(pattern)) {
				result += delimiter;
				result += names[itr];
			}
		}
		return result;
	}

	@SuppressWarnings("unused")
	public static boolean isAvailabe(String names[]) {
		for (int itr = 0; itr < names.length; itr++) {
			if (names[itr].equalsIgnoreCase("HARI")) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}
}
