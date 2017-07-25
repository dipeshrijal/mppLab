package may2017.problem2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Admin {
	//Returns phone numbers (in sorted order) of the Library Members who have ever checked out the specified lending item
	public static List<String> getPhoneNums(LibraryMember[] members, LendingItem item) {
		List<String> phoneNums = new ArrayList<>();
		
		
		for (LibraryMember member : members) {
			for (CheckoutRecordEntry cr : member.getCheckoutRecord().getCheckoutEntryList()) {
				if (cr.getLendingItem().equals(item)) {
					phoneNums.add(member.getPhone());
				}
			}
		}
		
		Collections.sort(phoneNums);
		
		return phoneNums;
	}
}
