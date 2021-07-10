package com.designPatterns.A_creational.simpleFactory;

import com.designPatterns.A_creational.simpleFactory.model.Post;
import com.designPatterns.A_creational.simpleFactory.model.PostFactory;

public class Client {

	public static void main(String[] args) {
		
		Post post = PostFactory.createPost("news");
		System.out.println(post);
	}

}
