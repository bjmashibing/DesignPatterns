package com.shenyy.dp.abstractfactory.example01;


import com.shenyy.dp.abstractfactory.example01.factory.Factory;
import com.shenyy.dp.abstractfactory.example01.item.Item;
import com.shenyy.dp.abstractfactory.example01.item.Link;
import com.shenyy.dp.abstractfactory.example01.item.Page;
import com.shenyy.dp.abstractfactory.example01.item.Tray;
import com.shenyy.dp.abstractfactory.example01.list.ListTray;

public class ExampleMain {

    // 通过主程序参数控制具体工厂类型
    public static void main(String[] args) {
        String concreteFactory = "ListFactory";

        // 反射机制需要类的全名（带包名）
        Factory factory = Factory.getFactory("com.shenyy.dp.abstractfactory.example01.factory." + concreteFactory);

        Link people = factory.createLink("人民日报", "http://www.people.com.cn/");
        Link gmw = factory.createLink("光明日报", "http://www.gmw.cn/");

        Link us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com/");
        Link jp_yahoo = factory.createLink("Yahoo!Japan", "http://www.yahoo.co.jp/");
        Link google = factory.createLink("Google", "http://www.google.com/");

        Tray traynews = factory.createTray("日报");
        traynews.add(people);
        traynews.add(gmw);

        Tray traysearch = factory.createTray("检索引擎");
        traysearch.add(us_yahoo);
        traysearch.add(jp_yahoo);
        traysearch.add(google);

        Page page = factory.createPage("Example0Main", "Jueee");
        page.add(traynews);
        page.add(traysearch);
        page.output();

        Tray tray = new Tray("tray1") {
            @Override
            public String makeHTML() {
                return null;
            }
        };
        tray.add(new Item("item1") {
            @Override
            public String makeHTML() {
                return null;
            }
        });
        System.out.println(tray);
    }

}
