package Inheritance;

//import java.io.Serializable;
//import java.io.*;
//class Employee implements Serializable
//{
//    int empid;
//    String empname;
//    public Employee(int empid, String empname)
//    {
//        this.empid = empid;
//        this.empname = empname;
//    }
//}
//class Main
//{
//    public static void main(String args[])
//    {
//        try
//        {
////Creating the object
//            Employee emp =new Employee(1187345,"Andrew");
////Creating stream and writing the object
//            FileOutputStream fout=new FileOutputStream("file.txt");
//            ObjectOutputStream out=new ObjectOutputStream(fout);
//            out.writeObject(emp);
//            out.flush();
////closing the stream
//            out.close();
//            System.out.println("Data has been read from the file.");
//        }
//        catch(Exception e)
//        {
//            e.printStackTrace();
//        }
//    }
//}

// ------------------------------------------------------------------------------
//default method ,static method and abstract method in java interface

//interface IT2{
//
//    void m1();
//
//    default void m2() {
//
//        System.out.println("default method");
//
//    }
//
//    static void m3(){
//
//        System.out.println("static method");
//
//    }
//
//}
//
//class NestInt implements IT2 {
//
//    public void m1() {
//
//        System.out.println("m1 method");
//
//    }
//
//    public static void main(String[] args) {
//
//        NestInt n=new NestInt();
//
//        n.m1();
//
//        n.m2();
//
//        IT2.m3();
//
//    }
//
//}
// ------------------------------------------------------------------------------

//Set example

import java.util.*;

class Employee{
    int eid;
    String ename;

    Employee(int id, String name){
        this.eid = id;
        this.ename = name;
    }
}


class SetEx{

    public static void main(String[] args) {

        Set<String> s=new HashSet<String>();

        s.add("Sakshi");

        s.add("Aditya");

        s.add("Ansari");

        System.out.println(s);

        System.out.println(s.size());

        s.add("Sakshi");

        System.out.println(s);

        System.out.println(s.size());

        System.out.println(s.add("Adi"));

        System.out.println(s);

        Set<String> s1=new LinkedHashSet<String>();

        s1.add("Devanshu");

        s1.add("Yash");

        s1.add("Ansari");

        s.addAll(s1);

        System.out.println(s);

    }

}

//HashSet example

class SetEx1{

    public static void main(String[] args) {

        HashSet<String> s=new HashSet<String>();

        s.add("Sakshi");

        s.add("Aditya");

        s.add("Ansari");

        System.out.println(s);

        System.out.println(s.size());

        s.add("Sakshi");

        System.out.println(s);

        System.out.println(s.size());

        System.out.println(s.add("Adi"));

        System.out.println(s);

        Set<String> s1=new LinkedHashSet<String>();

        s1.add("Devanshu");

        s1.add("Yash");

        s1.add("Ansari");

        s.addAll(s1);

        System.out.println(s);

    }

}

//LinkedHashSet example


class SetEx3{

    public static void main(String[] args) {

        LinkedHashSet<Employee> s=new LinkedHashSet<Employee>();

        s.add(new Employee(100,"Sakshi"));

        s.add(new Employee(101,"Aditya"));

        s.add(new Employee(102,"Ansari"));

        Iterator<Employee> itr=s.iterator();

        while(itr.hasNext()) {

            Employee e=itr.next();

            System.out.println(e.eid+" "+e.ename);

            if(e.eid==100) {

                itr.remove();

            }

            System.out.println(e.eid+" "+e.ename);

        }

    }

}

//import java.util.Map.Entry;
////
////Map example
//
//public class MapEx {
//
//    public static void main(String[] args) {
//
//        HashMap<Integer,String> m=new HashMap<Integer,String>();
//
//        m.put(1,"Red");
//
//        m.put(100,"Blue");
//
//        m.put(3,"Orange");
//
//        System.out.println(m);
//
//        Set<Integer> s= m.keySet();
//
//        System.out.println(s);
//
//        Collection<String> c = m.values();
//
//        System.out.println(c);
//
//        Entry<Integer,String> s1=m.entrySet();
//
//        for(Entry<Integer,String> e:s1) {
//
//            System.out.println(e.getKey()+" "+e.getValue());
//
//        }}

////iterating key and values
//
//import java.util.*;


//    class MapEx {
//
//        public static void main(String[] args) {
//
//            HashMap<Integer,String> m=new HashMap<Integer,String>();
//
//            m.put(1,"Red");
//
//            m.put(100,"Blue");
//
//            m.put(3,"Orange");
//
//            System.out.println(m);
//
//            Iterator <Integer> itr=m.keySet().iterator();
//
//            while(itr.hasNext()) {
//
//                Object i=itr.next();
//
//                System.out.println(i);
//
//            }
//
//            Iterator <String> itr1=m.values().iterator();
//
//            while(itr1.hasNext()) {
//
//                Object i=itr1.next();
//
//                System.out.println(i);
//
//            }
//
//        }}

///////////////////////////////////////////////////////////////////////////////////////////
//
//class MyThread extends Thread{
//    final Integer id;
//    MyThread(int id){
//        this.id = id;
//    }
//
//    public void run() {
//        synchronized (this.id){
//        for(int i=0;i<3;i++)
//            System.out.println("User defined thread id : "+this.id);
//        }
//    }
//
//}
//
//class Ex1 {
//
//    public static void main(String[] args) {//main thread
//
//        MyThread t1 = new MyThread(1);
//
//        t1.start();//thread
//
//        MyThread t2 = new MyThread(4);
//
//        t2.start();//thread
//
//        MyThread t3 = new MyThread(7);
//
//        t3.start();//thread
//
////System.out.println("Main thread");
//
//    }
//
//}

///////////////////////////////////////////////////////////////////////////////////////////
//class MyThread1 extends Thread{
//
//    public void run() {
//
//        for(int i=0;i<3;i++)
//
//            System.out.println("User defind thread 1");
//
//    }
//
//}
//
//class MyThread2 extends Thread{
//
//    public void run() {
//
//        for(int i=0;i<3;i++)
//
//            System.out.println("User defind thread 2");
//
//    }
//
//}
//
//class MyThread3 extends Thread{
//
//    public void run() {
//
//        for(int i=0;i<3;i++)
//
//            System.out.println("User defind thread 3");
//
//    }
//
//}
//
//class Ex1 {
//
//    public static void main(String[] args) {//main thread
//
//        MyThread1 t1 = new MyThread1();
//
//        t1.start();//thread
//
//        MyThread2 t2 = new MyThread2();
//
//        t2.start();//thread
//
//        MyThread3 t3 = new MyThread3();
//
//        t3.start();//thread
//
////System.out.println("Main thread");
//
//    }
//
//}

//thread Priority

//class MyThreadEx extends Thread{
//
//    public void run() {
//
//        System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
//
//    }
//
//}
//
//class Ex3 {
//
//    public static void main(String[] args) {
//
//        MyThreadEx t1 = new MyThreadEx();
//
//        t1.setPriority(Thread.NORM_PRIORITY);
//
//        MyThreadEx t2 = new MyThreadEx();
//
//        t1.start();
//
//        t2.start();
//
//    }
//
//}

//class MyThreadEx extends Thread{
//
//    public void run() {
//
//    }
//
//}
//
//class Ex3 {
//
//    public static void main(String[] args) {
//        MyThreadEx t1 = new MyThreadEx();
//        t1.start();
//        MyThreadEx t2 = new MyThreadEx();
//        t2.start();
//        System.out.println(t1.getName());
//        System.out.println(t2.getName());
//        t1.setName("Harshal");
//        System.out.println(t1.getName());
//        System.out.println(Thread.currentThread().getName());
//        Thread.currentThread().setName("Ämey");
//        System.out.println(Thread.currentThread().getName());
//        System.out.println(t1.getId());
//        System.out.println(t2.getId());
//        System.out.println(t1.isAlive());
//
//        System.out.println(t2.isAlive());
//
//        System.out.println(Thread.activeCount());
//
//    }
//
//}

//Without synchronization

//class Create {
//
//    void printTable(int n) // Here, method is not synchronized.
//
//    {
//        synchronized (this) {
//            for (int i = 1; i <= 5; i++) {
//
//                System.out.println(n * i);
//
//                try {
//
//                    Thread.sleep(1000);
//
//                } catch (InterruptedException ie) {
//
//                    System.out.println(ie);
//
//                }
//
//            }
//        }
//    }
//
//}
//
//class Thread1 extends Thread
//
//{
//
//    Create t; // Declaration of variable t of class type Table.
//
//// Declare one parameterized constructor and pass variable t as a parameter.
//
//    Thread1(Create t)
//
//    {
//
//        this.t = t;
//
//    }
//
//    public void run()
//
//    {
//
//        t.printTable(2);
//
//    }
//
//}
//
//class Thread2 extends Thread
//
//{
//
//    Create t;
//
//    Thread2(Create t)
//
//    {
//
//        this.t = t;
//
//    }
//
//    public void run()
//
//    {
//
//        t.printTable(5);
//
//    }
//
//}
//
//class Ex1
//
//{
//
//    public static void main(String[] args)
//
//    {
//
//// Create an object of class Table.
//
//        Create obj = new Create ();
//
//        Thread1 t1 = new Thread1(obj);
//
//        Thread2 t2 = new Thread2(obj);
//
//        t1.start();
//
//        t2.start();
//
//    }
//
//}

///////////////////////////////////////////////////////////////////////////////////////////////////
//deadlock

class X

{

    void display1(X obj2)

    {

        System.out.println("Thread1 waiting for thread2 to release lock");

        synchronized(obj2){

            System.out.println("work done");

        }

    }

    void display2(X obj1)

    {

        System.out.println("Thread2 waiting for thread1 to release lock");

        synchronized(obj1){

            System.out.println("work done");

        }

    }

}

class Thread51 extends Thread

{

    X obj1, obj2;

    Thread51(X obj1, X obj2)

    {

        this.obj1 = obj1;

        this.obj2 = obj2;

    }

    public void run()

    {

        synchronized(obj1){

            try {

                Thread.sleep(2000);

            }

            catch(InterruptedException ie) {

                System.out.println(ie);

            }

            obj2.display2(obj2);

        }

    }

}

class Thread52 extends Thread

{

    X obj1, obj2;

    Thread52(X obj1, X obj2)

    {

        this.obj1 = obj1;

        this.obj2 = obj2;

    }

    public void run()

    {

        synchronized(obj2){

            try {

                Thread.sleep(2000);

            }

            catch(InterruptedException ie) {

                System.out.println(ie);

            }

            obj1.display1(obj1);

        }

    }

}

//interface A{
//    public void trial();
//}

class DeadlockEx {

    public static void main(String[] args)

    {

        List<Integer> l = new LinkedList<Integer>() ;
        l.add(12);
        l.add(12);
//        l.remove();
        System.out.println(l);

//        X obj1 = new X();
//
//        X obj2 = new X();
//
//        Thread51 t1 = new Thread51(obj1, obj2);
//
//        Thread52 t2 = new Thread52(obj1, obj2);
//
//        t1.start();
//
//        t2.start();

    }

}


abstract class A{
        public void disp() {
        System.out.println("Concrete method of parest class");
        }
abstract public void disp2();
        }

class B extends A{
    public void disp2() {
        System.out.println("Over");
    }

    public static void main(String[] args) {
        B o =  new B();
        o.disp();
    }
}