class CTest{
	void test(int a) {
		if (a%2==1)
		System.out.println("此數為奇數");
		else if (a==0)
		System.out.println("此數為0");
		else
		System.out.print("此數為偶數");
	}
}
public class Java8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CTest b = new CTest();
		b.test(0);
		b.test(3);
		b.test(8);
	}

}
