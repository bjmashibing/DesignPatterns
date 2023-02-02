package com.shenyy.dp.abstractfactory.example01.factory;


import com.shenyy.dp.abstractfactory.example01.item.Link;
import com.shenyy.dp.abstractfactory.example01.item.Page;
import com.shenyy.dp.abstractfactory.example01.item.Tray;
import com.shenyy.dp.abstractfactory.example01.list.ListLink;
import com.shenyy.dp.abstractfactory.example01.list.ListPage;
import com.shenyy.dp.abstractfactory.example01.list.ListTray;

// 具体工厂类，如何配置零件
public class ListFactory extends Factory {

    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }

}
