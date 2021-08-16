package com.company;

import java.lang.reflect.*;
import java.util.*;

import static java.lang.Class.forName;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, ClassNotFoundException {
//        Person person = new Person();
//
//        Class personClass = Person.class;
//        Class personClass2 = person.getClass();
//        Class personClass3 = Class.forName("Person");
//
//        Method[] methods = personClass.getMethods();
//        for (Method method : methods) {
//            System.out.println(method.getName() + ", " + method.getReturnType() +
//                    ", " + Arrays.toString(method.getParameterTypes()));
//        }
//
//        Field[] fields = personClass.getFields();
//        for (Field field : fields) {
//            System.out.println(field.getName() + ", " + field.getType());
//        }
//
//        Field[] fields = personClass.getDeclaredFields();
//        for (Field field : fields) {
//            System.out.println(field.getName() + ", " + field.getType());
//        }
//
//        Annotation[] annotations = personClass.getAnnotations();
//        for (Annotation annotation : annotations) {
//            if (annotation instanceof Author) {
//                System.out.println("Yes");
//            }
//        }

        Scanner scanner = new Scanner(System.in);
        // Название_класса1 Название_класса2 Название_метода
        Class classObject1 = Class.forName(scanner.next());
        Class classObject2 = Class.forName(scanner.next());
        String methodName = scanner.next();

        Method m = classObject1.getMethod(methodName, classObject2);
        Object o1 = classObject1.newInstance();
        Object o2 = classObject2.getConstructor(String.class).newInstance("String value");

        m.invoke(o1, o2);

//        com.company.Person java.lang.String setName
//        java.lang.Thread java.lang.String setName
        System.out.println(o1);
    }
}
