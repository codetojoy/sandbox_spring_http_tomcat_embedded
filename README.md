
### sandbox_spring_http_tomcat_embedded

* Example of remoting with Spring HTTP, using a `ServiceRunner` which uses embedded Tomcat.

### To Run

* in terminal 1: `./run_user_service.sh`
    * starts UserService on 5151
* in terminal 2: `./run_billing_service.sh`
    * starts BillingService on 5152
* in terminal 3: `./run_compound_service.sh`
    * starts CompoundService on 5153
* in terminal 4: `./client/staging/bin/client`

### Commands

* `u` to use UserService
* `b` to use BillingService
* `c` to use CompoundService
* `q` to quit

