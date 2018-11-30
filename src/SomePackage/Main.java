package SomePackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.HashMap;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {

//        Stack stack = new Stack();
//        System.out.println(stack.getClass().getName());
//        Class aclass = stack.getClass().getSuperclass();
//        System.out.println(aclass.getName());
//
//        while (!aclass.getName().equals(Object.class.getName())) {
//            aclass = aclass.getSuperclass();
//            System.out.println(aclass.getName());
//        }


//        Stack stack = new Stack();
//        Class stacClass = stack.getClass();
//        Class stacClass = stack.getClass().getSuperclass();
//        Class[] interfaces = stacClass.getInterfaces();
//
//        for (Class i : interfaces) {
//            System.out.println(i.getName());
//        }
//
//        SomeClass someClass = new SomeClass("Hello World", 12, 25.6);
//        Field[] fields2 =SomeClass.class.getFields();
//        Field[] fields =someClass.getClass().getDeclaredFields();
//
//        for (Field field : fields) {
//            Class fieldType = field.getType();
//            System.out.println("Name Of field: " + field.getName());
//            System.out.println("Type Of field: " + fieldType.getName());
//        }

//        Class fieldA=SomeClass.class;
//        Field field=fieldA.getField("string");


//        Constructor[] constructors = SomeClass.class.getConstructors();
//        for (Constructor constructor : constructors) {
//            Class[] paramTypes = constructor.getParameterTypes();
//            for (Class paramType : paramTypes) {
//                System.out.print(paramType.getName() + " ");
//            }
//            System.out.println();
//        }
//        Method[] methods = SomeClass.class.getMethods();
//
//        for (Method method : methods) {
//            System.out.println("Name of method: " + method.getName());
//            System.out.println("Return type: " + method.getReturnType().getName());
//            System.out.println();
//            Class[] parameterType = method.getParameterTypes();
//            for (Class pType:parameterType) {
//                System.out.println("Parameter type: "+pType.getName());
//            }
//
//
//        }
//        Class[] paramTypes = new Class[] {int.class};
//        Method m = SomeClass.class.getMethod("methodA", paramTypes);
//
//
//
//        Field field = someClass.getClass().getDeclaredField("a");
//        field.setAccessible(true);
//        field.setInt(someClass, 4);
//        System.out.println(someClass.getA());

        SomeClass class1 = new AnotherClass("Jostea", 18, 9.5);
        SomeClass class2 = new AnotherSomeClass2("Jostea", 18, 9.5);

        if(class1.string.equals(class2.string)){
            System.out.println("They are equals!");
        }else System.out.println("They are not equals!");


    }
}
