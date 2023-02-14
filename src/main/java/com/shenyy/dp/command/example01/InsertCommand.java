package com.shenyy.dp.command.example01;

public class InsertCommand extends Command {
    Content c;
    String strToInsert = "http://www.mashibing.com";
    public InsertCommand(Content c) {
        this.c = c;
    }

    @Override
    public void doit() {
        c.msg = c.msg + strToInsert;
    }

    @Override
    public void undo() {
        c.msg = c.msg.substring(0, c.msg.length()-strToInsert.length());
    }
}
