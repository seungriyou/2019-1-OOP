package javaproj;
import java.util.*;

public class Token {
	private String str;
	private StringTokenizer linetoken;
	
	Token () {
		ReadFileData r = new ReadFileData();
		StringBuffer buffer = r.toReadFileData();
		str = buffer.toString();
		linetoken = new StringTokenizer(str, "\n");
	}
	
	ArrayList<String> Tokenizer () {
		String line;
		ArrayList<String> list = new ArrayList<String>();
		if (linetoken.hasMoreTokens()) {
			line = linetoken.nextToken();
		}
		else {
			return null;
		}
		StringTokenizer ntoken = new StringTokenizer(line, " ");
		while (ntoken.hasMoreTokens()) {
			String token = ntoken.nextToken();
			if (token.matches(".*//.*")) return list;
			list.add(token);
		}
		return list;
	}
}