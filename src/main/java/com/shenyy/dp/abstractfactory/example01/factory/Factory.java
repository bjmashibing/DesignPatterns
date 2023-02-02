package com.shenyy.dp.abstractfactory.example01.factory;


import com.shenyy.dp.abstractfactory.example01.item.Link;
import com.shenyy.dp.abstractfactory.example01.item.Page;
import com.shenyy.dp.abstractfactory.example01.item.Tray;

// 抽象工厂类，其中通过反射机制利用参数传进来的包全名实例化类获得具体工厂类实例
public abstract class Factory {

    public static Factory getFactory(String classname) {
        Factory factory = null;
        try {
            factory = (Factory) Class.forName(classname).newInstance();
            System.out.println(factory);
        } catch (ClassNotFoundException e) {
            System.err.println("没有找到" + classname + "类");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return factory;
    }

    // 声明抽象工厂类中的抽象方法
    public abstract Link createLink(String caption, String url);

    public abstract Tray createTray(String caption);

    public abstract Page createPage(String title, String author);
}
