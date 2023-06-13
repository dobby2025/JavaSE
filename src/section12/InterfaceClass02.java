package section12;

import section12.access3.CableTv;
import section12.access3.SmartTv;
import section12.access3.Tv;

public class InterfaceClass02 {
	public static void main(String[] args) {
		
		Tv tv1 = new SmartTv();
		tv1.channel();
		System.out.println(System.identityHashCode(tv1));
		
		System.out.println("================================");
		
		CableTv tv2 = (CableTv) tv1;
		tv2.channel();
		tv2.extChannel();
		System.out.println(System.identityHashCode(tv2));
		
		System.out.println("================================");
		
		SmartTv tv3 = (SmartTv) tv2;
		tv3.channel();
		tv3.extChannel();
		tv3.internet();
		System.out.println(System.identityHashCode(tv3));
		
		
		
		
	}
}




