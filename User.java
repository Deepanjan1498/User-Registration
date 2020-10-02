import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {

	public static void main(String[] args) {
		List<String> Password = new ArrayList<String>();

		Password.add("456789");
		Password.add("@#$%2345");
		Password.add("AsDfGhJkl");
		Password.add("!@#$%^&*()");
		Password.add("--");
		Password.add("asdfghjkl");
		Password.add("15A123456857978965412");
		Password.add("15 0234568579");
		Password.add("abcderfgth");
		Password.add("SD45685793");
		

		String regex = "^(?=.*\\d)[~!@#$%^&*()+=\\w\\d.]{8,20}$";

		Pattern pattern = Pattern.compile(regex);

		for (String pass : Password) {
			Matcher matcher = pattern.matcher(pass);
			System.out.println(matcher.matches());
		}
	}
}
