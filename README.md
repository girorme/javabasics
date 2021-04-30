## Java basic tips to study

This is my simple tips to remember primitives/operations and misc java world.
The examples in some cases can be executed or just will be examples without side effects. ;)

### Topics
- primitives();
    - The basic types
- lists();
    - Arrays, lists, etc
- iteration();
    - iteration operations (common way and new methods based on java version)
- io();
    - Io operations, including streams and manipulations
- functional();
    - Functional java. Lamba / transformation and others
- network();
    - Sockets and all related about network
- oo();
    - Object oriented aspects (New classes will born here probably hehe)

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

## Run examples
- Remove comment and run the program:

```
$ cd src/
$ javac App.java
$ java App
```

## current tips
```java
public class App {
    public static void main(String[] args) throws Exception {
        // Remove comment and run the desired method
        //primitives();
        //lists();
        //iteration();
        //io();
        //functional();
        //network();
        //oo();
    }

    public static void primitives() {
        int a, b = 10;
        int big = 100_000_00;
        double c = 10.10;
        short s;
        long l;
        float fl;
        int[] nums = {1, 2, 3, 4, 5};
        byte bt = 100;
        boolean bool;
        char ch;

        // Max values
        
        int i = Integer.MAX_VALUE;
        int j = i + 1;
        // j will roll over to -2_147_483_648

        double d = Double.MAX_VALUE;
        double o = d + 1;
        // o will be Infinity


        // Autoboxing
        // Java can perform this conversion for us automatically.
        // We call this process Autoboxing. Here is an example:
        Character charO = 'c';
        Integer intO = 1;
    }

    public static void lists() {
    }

    public static void iteration() {
        String[] names = {"girorme", "java"};
        
        for (String name : names ) {
            System.out.println(name);
        }
    }

    public static void io() {
        
    }

    public static void functional() {
    }

    public static void network() {

    }

    public static void oo() {

    }
}

```

## Dependency Management

The `JAVA DEPENDENCIES` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-pack/blob/master/release-notes/v0.9.0.md#work-with-jar-files-directly).
