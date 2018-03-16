
package net.codetojoy.server; 

import net.codetojoy.common.*;

public class CompoundServiceImpl implements CompoundService {
    private static int count = 0;

    private UserService userService;
    private BillingService billingService;

    public UserService getUserService() { return userService; }
    public BillingService getBillingService() { return billingService; }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void setBillingService(BillingService billingService) {
        this.billingService = billingService;
    }

    @Override
    public long ping() {
        return System.currentTimeMillis();
    } 

    @Override
    public CompoundInfo getCompoundInfo(String name) {
        System.out.println("TRACER name: " + name + " request #" + count++);

        User user = userService.getUser(name);
        Payment payment = billingService.getPayment(name);

        CompoundInfo result = new CompoundInfo(payment, user);
        return result;
    }
}
