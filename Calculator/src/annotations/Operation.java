package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Operation {
}

class Test{

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class clazz = String.class;
        Method method = clazz.getMethod("compareTo", String.class);
        Object obj = clazz.newInstance();
        System.out.println(method.invoke(obj, new String("abc")));
    }
}
