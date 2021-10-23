class CWin{
	int width;
	int height;
	String name;
	
	void setW(int w){
		width=w;
	}
	void setH(int h) {
		height=h;
	}
	void setname(String s) {
		name=s;
	}
	void setWindow(int w,int h, String n) {
		width=w;
		height=h;
		name=n;
	}
	public void show() {
		System.out.println("name="+name);
		System.out.println("W="+width+", h="+height);	
	}
	
}
public class HW82 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CWin cw = new CWin();
		cw.setname("My Windows");
		cw.setW(5);
		cw.setH(3);
		cw.show();
	}

}
