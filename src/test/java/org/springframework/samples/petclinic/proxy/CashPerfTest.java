package org.springframework.samples.petclinic.proxy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashPerfTest {

	@Test
	public void testPay() {
		Payment cashPerf = new CashPerf();
		Store store = new Store(cashPerf);

		store.buySomething(100);
	}

}
