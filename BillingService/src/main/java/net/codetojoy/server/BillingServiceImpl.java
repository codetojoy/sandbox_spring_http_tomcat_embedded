
package net.codetojoy.server; 

import net.codetojoy.common.Payment;
import net.codetojoy.common.BillingService;

import net.codetojoy.common.util.Utils;

public class BillingServiceImpl implements BillingService {
    // not thread-safe
    private static int count = 0;

    @Override
    public long ping() {
        return System.currentTimeMillis();
    } 

    @Override
    public Payment getPayment(String name) {
        System.out.println("TRACER request name: " + name + " total #" + count++);

        Utils utils = new Utils();
        String accountId = "acc-" + utils.getRandomId(2000,3000);
        int amount = utils.getRandomId(30,90);

        Payment payment = new Payment(name, accountId, amount);
        return payment;
    }
}
