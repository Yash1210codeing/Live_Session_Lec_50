package Live_Session_Lec_50;
public class Cars {//implements Comparable<Cars>{
int speed;
int price;
String color;
public Cars (int price,int speed,String color) {
	this.price=price;
	this.color=color;
	this.speed=speed;
}
@Override
public String toString() {
	//return "P "+this.price+" s "+this.speed+" q "+this.color;
	return "P "+this.price+" s "+this.speed+" C "+this.color;
}
//@Override
//public int compareTo(Cars o) {
//	//return 0;
//	//return o.price-this.price;
//	//return this.speed-o.speed;
//	return this.color.compareTo(o.color);
//}
}