package com;

import java.util.Iterator;

import org.json.JSONException;
import org.json.JSONObject;

public class Sample1 {
	public static void main(String[] args) throws JSONException {
		
		JSONObject objJson= new JSONObject();
		
		objJson.put("title", "What is SRP?");
		objJson.put("description","SRP is a programming");
		objJson.put("author","John Doe");
		objJson.put("date","2018-01-08 10:00 UTC");
		objJson.put("tags","Development,Programming,principle" );
		objJson.put("published","true");
		objJson.put("short-content","The single responsibility principle is a computer programming princile that states that every module, class, or function[1] should have responsibility over a single part of the functionality provided by the software, and that respinsibility should be entirely encapsulated by the class. All its services should be narrowly aligned with that resposibility. Robert C. Maetin express the principle as, 'a calss should have only one reason to change,'[1] although, because of confusion around the word 'reason' he more recently stated 'this principle is about people.(Actor)''[2]");
		objJson.put("content","![SRP](/images/blog/2018/what-is-srp/article-header.png) ## History The term was introduce by Robert C. Martin in an article by the same name as part of his Principles of object Oriented Design,[3] made popular by his book Agile Software development, Principles, Patterns, and Practices.[4] Martin described it as being based on the principle of cohesion, as described by Tom DeMarco in his book Structured Analysis and System Specification, [5] and Meilir page-Jones in the Practical Guide to Structured Systems Design.[6] In 2014 Martin wrote a blog post entitled The Single Responsibility Principle with a goal to clarify what was meant by the phrase 'reason for change.## Annotation Types");
		
		System.out.println( objJson);
		
	}

}
