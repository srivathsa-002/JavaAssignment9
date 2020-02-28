package Assignment9;

import java.util.regex.Pattern;

public class PatternMatcher {
	public void matchesOrNot(String text,String regex) {
		Pattern p = Pattern.compile(regex);
		if(p.matches(regex,text))
			System.out.println("Text starts with a capital Letter and ends with a period :)");
		else
			System.out.println("Text doesn't resemble as intended :(");
	}
}