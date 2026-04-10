package model.entities;

import java.util.Calendar;
import java.util.Date;

import model.service.OnlinePaymentService;

public class ContractService {
	
	private OnlinePaymentService ops;
	
	public ContractService(OnlinePaymentService ops) {
		this.ops = ops;
	}
	
	public void processContract(Contract contract, int months) {
		double basicQuota = contract.getTotalValue() / months;
		for (int i = 1; i <= months; i++) {
			double updatedQuota = basicQuota + ops.interest(basicQuota, i);
			double fullQuota = updatedQuota + ops.paymentFee(updatedQuota);
			
			Calendar cal = Calendar.getInstance();
			cal.setTime(contract.getDate());
			cal.add(Calendar.MONTH, i);
			Date dueDate = cal.getTime();
			
			contract.getInstallments().add(new Installment(dueDate,fullQuota));
			
		}
	}
	
}
