package com.project.daggerExample.daggertutorial;


public class Restaurant {
    private CompanyPolicies companyPolicies;
    private Menu menu;

    // Restaurant Staff
    private Host host;
    private Waiter waiter;
    private Manager manager;

    public Restaurant(
            CompanyPolicies companyPolicies,
            Menu menu,
            Host host,
            Waiter waiter,
            Manager manager) {
        System.out.println("Constructor for Restaurant called");
        this.companyPolicies = companyPolicies;
        this.menu = menu;
        this.host = host;
        this.waiter = waiter;
        this.manager = manager;
    }
}
