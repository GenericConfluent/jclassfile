// build command:
// javac -g -parameters RuntimeInvisibleParameterAnnotations.java

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS)
@interface InvisibleParamAnnotation {
    String value() default "invisible";
}

public class RuntimeInvisibleParameterAnnotations {
    public void someMethod(@InvisibleParamAnnotation final String msg, @InvisibleParamAnnotation("custom") int count) {
    }
}
