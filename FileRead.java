package com;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileRead {

public static void main(String a[]) {

HashMap map = new HashMap<String,String>();
BufferedReader br = null;
Pattern patt = Pattern.compile("\"([^\"]*)\"");

Pattern patt2 = Pattern.compile("\"([^\"]*)\"");

String strLine = "";
try {
br = new BufferedReader(new FileReader("E:\\File\\File.txt"));
while ((strLine = br.readLine()) != null) {
// System.out.println(strLine);

Matcher m = patt.matcher(strLine);

while (m.find()) {
System.out.println(m.group(0));
     
map.put("title", m.group(0));
}

}
} catch (FileNotFoundException e) {
System.err.println("Unable to find the file: fileName");
} catch (IOException e) {
System.err.println("Unable to read the file: fileName");
}
// Output
System.out.println(map);

}

}

