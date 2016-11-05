package com.eichinn.memento_pattern;

/**
 * Created by chenrong on 2016/11/5.
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
        caretaker.setMemento(ori.createMemento());
        //修改状态
        ori.setState1("zzz");
        ori.setState2("yyy");
        ori.setState3("xxx");
        System.out.println("===== 修改后状态 =====");
        System.out.println(ori);
        //恢复一个备忘录
        ori.restoreMemento(caretaker.getMemento());
        System.out.println("===== 恢复后状态 =====");
        System.out.println(ori);
    }
}
