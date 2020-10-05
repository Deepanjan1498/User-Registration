import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {

	public static void main(String[] args) {
		List<String> EmailId = new ArrayList<String>();

		EmailId.add("abc@yahoo.com");
		EmailId.add("abc-100@yahoo.com");
		EmailId.add("abc.100@yahoo.com");
		EmailId.add("abc111@abc.com");
		EmailId.add("abc-100@abc.net");
		EmailId.add("abc.100@abc.com.au");
		EmailId.add("abc@1.com");
		EmailId.add("abc@gmial.com.com");
		EmailId.add("abc+100@gmail.com");
		EmailId.add("abc-");
		EmailId.add(".abc@.com.my");
		EmailId.add("abc123@gmail.a");
		EmailId.add("abc123@.com");
		EmailId.add("abc123@.com.com");
		EmailId.add(".abc@abc.com");
		EmailId.add("abc()*@gmail.com");
		EmailId.add("abc@%*.com");
		EmailId.add("abc..2002@gmail.com");
		EmailId.add("abc.@gmail.com");
		EmailId.add("abc@abc@gmail.com");
		EmailId.add("abc@gmail.com.1a");
		EmailId.add("abc@gmail.com.au.au");

		String regex = "^[A-Za-z0-9]+([-\\+\\.][A-Za-z0-9]+)?@([A-Za-z0-9-]+)\\.([A-Za-z]{2,3})(\\.[A-Za-z]{1,3})?$";

		Pattern pattern = Pattern.compile(regex);

		for (String email : EmailId) {
			Matcher matcher = pattern.matcher(email);
			System.out.println(matcher.matches());
		}
	}
}
