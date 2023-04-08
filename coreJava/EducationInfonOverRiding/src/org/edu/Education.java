package org.edu;

public class Education extends Arts {

	private void ug(String departments) {
		System.out.println("under graduate	" +departments);
	}
		private void pg(int no) {
		System.out.println("post graduate	"+ no);
	}	
	public static void main(String[] args) {
		Education e = new Education();
		e.BA();
		e.BBA();
		e.BEd();
		e.bsc();
		e.ug("it");
		e.pg(40);

	}
}
