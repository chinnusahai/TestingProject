package conditionalStatements;

public class LadderIf {
	public static void main(String[] args) {

	int a =10, b=20,c=30;

	if(a>b && a>c) {
		System.out.println("a is greater");
	}else if(b>c&&b>a)
	{
		System.out.println("b is greater");
	}
	else if(c>b&&c>a)
	{
		System.out.println("c is greater");
	}
	else
		System.out.println("all condition is false");
	}
}
