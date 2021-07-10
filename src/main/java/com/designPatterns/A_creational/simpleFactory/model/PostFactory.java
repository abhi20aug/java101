package com.designPatterns.A_creational.simpleFactory.model;

/**
 * This class acts as a simple factory for creation of 
 * different posts on web site.
 *
 */
public class PostFactory {

    public static Post createPost(String type){
        switch (type){
            case "Blog":
                return new BlogPost();
            case "news":
                return new NewsPost();
            case "Product":
                return  new ProductPost();
            default:
                throw new IllegalArgumentException("invalid type");
        }

    }



}
