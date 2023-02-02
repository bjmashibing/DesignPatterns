package com.shenyy.dp.abstractfactory.example01.list;


import com.shenyy.dp.abstractfactory.example01.item.Link;

public class ListLink extends Link {
    
    // 零件的具体类，继承抽象，实现其中的抽象方法
    public ListLink(String caption, String url) {
        super(caption, url);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String makeHTML() {
        // TODO Auto-generated method stub
        return "<li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }

}
