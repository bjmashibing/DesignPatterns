package com.shenyy.dp.abstractfactory.example01.item;

import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;

// 零件的抽象类，初始化
public abstract class Page {
    protected String title;
    protected String author;
    protected ArrayList<Item> content = new ArrayList<Item>();

    public Page(String title, String author) {
        // TODO Auto-generated constructor stub
        this.title = title;
        this.author = author;
    }

    public void add(Item item) {
        content.add(item);
    }

    public void output() {
        try {
            String filename = title + ".html";
            Writer writer = new FileWriter(filename);
            writer.write(this.makeHTML());
            writer.close();
            System.out.println(filename + "文件编写完成");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public abstract String makeHTML();

}
