package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;

@Target(ElementType.FIELD)      //注解的目标
@Retention(RetentionPolicy.RUNTIME)

public @interface Column {
	public String field();
	public boolean primaryKey() default false;
	public String type() default "VARCHAR(80)";
	public boolean defaultNull() default true; //是否允许为空
}
