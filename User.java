import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {

	public static void main(String[] args) {
		List<String> firstName = new ArrayList<String>();

		firstName.add("Deepanjan");
		firstName.add("De");
		firstName.add("e");
		String regex = "^[A-Z]{1}[a-z]{2,}$";

		Pattern pattern = Pattern.compile(regex);

		for (String first : firstName) {
			Matcher matcher = pattern.matcher(first);
			System.out.println(matcher.matches());
		}
	}
}
