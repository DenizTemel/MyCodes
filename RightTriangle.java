package Week6;
/*
 * Write a RightTriangle class with two edge lengths stored as variables. 
 * Include a constructor that takes two values as input and sets these variables. 
 * Include the necessary code so that I can do the following from the main method.
 * RightTriangle rightTriangle = new RightTriangle(3,4);
double hyp = rightTriangle.hypotenuse(); // hyp gets value 5.0
double a = rightTriangle.area(); // a gets value 6.0
double p = rightTriangle.perimeter(); // p gets value 12.0
double s = rightTriangle.smallestAngle(2); // s gets value ~ 53.13 which is the 2nd smallest angle for the triangle.
double ss = rightTriangle.smallestAngle(1); // ss gets value ~ 36.87 which is the 1st smallest angle for the triangle.
 */

public class RightTriangle {
	double edge1 = 0;
	double edge2 = 0;
	double hyp;

	public RightTriangle(double edge1, double edge2) {
		this.edge1 = edge1;
		this.edge2 = edge2;
	}

	public double hypotenuse() {
		this.hyp = Math.sqrt(edge1 * edge1 + edge2 * edge2);
		return hyp;
	}

	public double area() {
		double a = edge1 * edge2 / 2;
		return a;
	}

	public double smallestAngle(int i) {
		// Math.acos açý ama pli tutuyor gibi.
		// Bunu dereceye çeviriyoruz.
		double b = Math.toDegrees(Math.acos(edge2 / hyp));
		double c = Math.toDegrees(Math.acos(edge1 / hyp));
		// If i is 1 --> we want the first smallest degree.
		if (i == 1) {
			if (b > c) {
				return c;
			}
			return b;
		}
		// If i is 2 --> we want the second smallest degree.
		if (i == 2) {
			if (b < c) {
				return c;
			}
			return b;
		}
		return c;

	}

	public double getEdge1() {
		return edge1;
	}

	public void setEdge1(double edge1) {
		this.edge1 = edge1;
	}

	public double getEdge2() {
		return edge2;
	}

	public void setEdge2(double edge2) {
		this.edge2 = edge2;
	}
}