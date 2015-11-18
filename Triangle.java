public class Triangle {

	public final int a;
	public final int b;
	public final int c;

	public Triangle(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public boolean isIsosceles() {
		return a == b || a == c;
	}

	public boolean isEquilateral() {
		return a == b && a == c;
	}

	public boolean isScalene() {
		return !isIsosceles() && !isEquilateral();
	}
	
	public boolean isTriangle(){
    return (a + b <= c && a + c <= b && b + c <= a); 
  }

}
