package Live_Session_Lec_50;
import java.util.Comparator;
public class CarCompareterPrice implements Comparator<Cars>{
	@Override 
	public int compare(Cars o1,Cars o2) {
		return 01.color.compareTo(o2.color);
	}
//public class CarCompareterPrice implements Comparator<Cars>{
//	@Override
//	public int compare(Cars o1,Cars o2) {
//		return 0;
//	}
//public class CarCompareterSpeed implements Comparator<Cars> {
//@Override
//public int compare(Cars o1,Cars o2) {
//	//return 0;
//	return o1.speed-o2.speed;
//}
}