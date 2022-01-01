package data22.exer1;

/**
 * 注解的使用 使用@interface
 * 可以使用 default 设置value 为默认值
 * 可也有不写
 */
public @interface MyAnnotation {
     String value() default "hello";
}
