package com.project.daggerExample.daggertutorial.dagger.components;


import dagger.Component;
import com.project.daggerExample.daggertutorial.Manager;
import com.project.daggerExample.daggertutorial.Restaurant;
import com.project.daggerExample.daggertutorial.dagger.modules.RestaurantModules;
import com.project.daggerExample.daggertutorial.dagger.scopes.RestaurantScope;

import javax.inject.Singleton;

//@Singleton
@RestaurantScope
@Component(modules = {
        RestaurantModules.class
})
public interface RestaurantComponent {

    Restaurant restaurant();

    Manager manager();

}
