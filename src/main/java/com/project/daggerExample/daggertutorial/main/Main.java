package com.project.daggerExample.daggertutorial.main;

import com.project.daggerExample.daggertutorial.Host;
import com.project.daggerExample.daggertutorial.Manager;
import com.project.daggerExample.daggertutorial.Restaurant;
import com.project.daggerExample.daggertutorial.dagger.components.DaggerRestaurantComponent;
import com.project.daggerExample.daggertutorial.dagger.components.RestaurantComponent;

/**
 * This is our main() method!
 *
 * We'll use this class as the entry point to our code for testing.
 *@RestaurantScope
 * This class will interact with the Dagger Components we build.
 */
public abstract class Main {

    public static void main(String[] args) {

        RestaurantComponent component =
                DaggerRestaurantComponent
                        .builder()
                        .build();

        Restaurant restaurant = component.restaurant();
        Restaurant restaurant2 = component.restaurant();
        System.out.println(restaurant2== restaurant);

        Manager host = component.manager();




    }
}
