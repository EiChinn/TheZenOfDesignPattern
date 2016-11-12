package com.eichinn.memento_pattern;

/**
 * Created by ei_chinn on 2016/11/5.
 */
public class Client {
    public static void main(String[] args) {
        Originator ori = new Originator();
        Caretaker caretaker = new Caretaker();
        //初始化
        ori.setState1("aaa");
        ori.setState2("bbb");
        ori.setState3("ccc");
        System.out.println("===== 初始化状态 =====");
        System.out.println(ori);
        //创建一个备忘录
        caretaker.setMemento("tag0", ori.createMemento());
        //修改状态1
        ori.setState1("zzz");
        ori.setState2("yyy");
        ori.setState3("xxx");
        System.out.println("===== 修改后状态1 =====");
        System.out.println(ori);
        //再创建一个备忘录
        caretaker.setMemento("tag1", ori.createMemento());
        //修改状态2
        ori.setState1("ooo");
        ori.setState2("ppp");
        ori.setState3("qqq");
        System.out.println("===== 修改后状态2 =====");
        System.out.println(ori);
        //恢复到tag1
        ori.restoreMemento(caretaker.getMemento("tag1"));
        System.out.println("===== 恢复后状态 =====");
        System.out.println(ori);
        //恢复到tag0
        ori.restoreMemento(caretaker.getMemento("tag0"));
        System.out.println("===== 恢复后状态 =====");
        System.out.println(ori);
    }
}
