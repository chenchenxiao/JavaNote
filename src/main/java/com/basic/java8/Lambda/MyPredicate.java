package com.basic.java8.Lambda;

@FunctionalInterface
public interface MyPredicate<T> {

	public boolean test(T t);
	
}
