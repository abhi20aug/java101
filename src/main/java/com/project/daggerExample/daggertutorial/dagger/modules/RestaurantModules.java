package com.project.daggerExample.daggertutorial.dagger.modules;

import dagger.Module;
import dagger.Provides;
import com.project.daggerExample.daggertutorial.*;
import com.project.daggerExample.daggertutorial.dagger.scopes.RestaurantScope;

@Module
public abstract class RestaurantModules {
    @RestaurantScope
    @Provides
    static Restaurant provideRestaurant(CompanyPolicies companyPolicies,
                                 Menu menu,
                                 Host host,
                                 Waiter waiter,
                                 Manager manager){




        return new Restaurant(companyPolicies, menu, host, waiter, manager);
    }

    @RestaurantScope
    @Provides
    static CompanyPolicies providePolicies(){
        return new CompanyPolicies();
    }

    @RestaurantScope
    @Provides
    static Menu provideMenu(){
        return new Menu();
    }

    @RestaurantScope
    @Provides
    static Host provideHost(){
        return new Host();
    }

    @RestaurantScope
    @Provides
    static Cook provideCook(){
        return new Cook();
    }
    @RestaurantScope
    @Provides
    static Waiter provideWaiter(Cook cook){
        return new Waiter(cook);
    }

    @RestaurantScope
    @Provides
    static Manager provideManager(Host host, Waiter waiter, Cook cook){
        return new Manager(host, waiter, cook);
    }

}
