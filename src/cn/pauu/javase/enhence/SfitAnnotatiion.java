package cn.pauu.javase.enhence;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import cn.pauu.javase.enhence.EnumTest.TrafficLamp;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface SfitAnnotatiion {
	String color() default "blue";
	String value();
	int[] attrArr();
	EnumTest.TrafficLamp lamp() default TrafficLamp.RED;
	MetaAnnotation annotation() default @MetaAnnotation("lhm");
}
