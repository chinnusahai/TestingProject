package org.lang;

public class langDetails extends stateDetail {
	
	private void tamil() {
		System.out.println("dravidian");
	}
	private void hindi() {
		System.out.println("north");
	}
	private void english() {
		System.out.println("british");
	}
	public static void main(String[] args) {
		//ClassName object = new Classname
		stateDetail s = new stateDetail();
		s.southIndia();
		s.northIndia();
		
		langDetails l = new langDetails();
		
		l.southIndia();
		l.northIndia();
		l.tamil();
		l.hindi();
		l.english();
	}

}
