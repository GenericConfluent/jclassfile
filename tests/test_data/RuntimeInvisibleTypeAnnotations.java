// build command:
// javac -g -parameters RuntimeInvisibleTypeAnnotations.java

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE_USE)
@interface InvisibleTypeInfo {
}

interface RuntimeInvisibleTypeAnnotations {
    @InvisibleTypeInfo String someMethod();
}
