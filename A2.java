import java.util.Scanner;
class Base{ 
	int height;
	int width;
	public Base(){
        this.height = 0;
        this.width = 0;
    }
	void display() {
		System.out.println( +width);
		System.out.println( +height);
		}
	
}
public class A2 extends Base {
	Scanner Ans;
    public A2() {
        Ans = new Scanner(System.in);

}
    public void read_input(){
        
        System.out.println("Enter the height of rectangle" +height);
        height = Ans.nextInt();
        System.out.println("Enter the width of rectangle" +width);
        width = Ans.nextInt();
}
    public void display(){
        System.out.println(height*width);
    }
        public static void main(String[] args) {
            A2 rectangle = new A2();
            rectangle.read_input();
            System.out.println(rectangle.width + " "+ rectangle.height);
            rectangle.display();
        }
    }