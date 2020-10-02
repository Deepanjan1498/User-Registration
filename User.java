import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {

	public static void main(String[] args) {
		List<String> lastName = new ArrayList<String>();

		lastName.add("Sharma");
		lastName.add("sharMa");
		lastName.add("2sm");
		String regex = "^[A-Z]{1}+[a-zA-Z]{3,}$";

		Pattern pattern = Pattern.compile(regex);

		for (String last : lastName) {
			Matcher matcher = pattern.matcher(last);
			System.out.println(matcher.matches());
		}
	}
}
