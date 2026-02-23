package course_object_oriented;

import java.util.Date;

import Entities_enums.OrderStatus;
import entities.Order_enum;

public class ProgramEnum {

	public static void main(String[] args) {
		
		Order_enum order = new Order_enum(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
		
	}

}
