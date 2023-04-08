package org.edu;

public class Education extends Medical {

	private void ug() {
		System.out.println("under graduate");
	}
		private void pg() {
		System.out.println("post graduate");
	}	
	public static void main(String[] args) {
		Education e = new Education();
		e.BA();
		e.BBA();
		e.BE();
		e.BEd();
		e.bsc();
		e.BtEch();
		e.ug();
		e.pg();
		e.physio();
		e.MBBS();
		e.dental();
	}
}
