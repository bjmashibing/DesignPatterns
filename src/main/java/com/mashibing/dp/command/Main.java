package com.mashibing.dp.command;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Content c = new Content();

        Command insertCommand = new InsertCommand(c);
        insertCommand.doit();
        insertCommand.undo();

        Command copyCommand = new CopyCommand(c);
        insertCommand.doit();
        insertCommand.undo();

        Command deleteCommand = new DeleteCommand(c);
        deleteCommand.doit();
        deleteCommand.undo();

        List<Command> commands = new ArrayList<>();
        commands.add(new InsertCommand(c));
        commands.add(new CopyCommand(c));
        commands.add(new DeleteCommand(c));

        for(Command comm : commands) {
            comm.doit();
        }


        System.out.println(c.msg);

        for(int i= commands.size()-1; i>=0; i--) {
            commands.get(i).undo();
        }


        System.out.println(c.msg);
    }
}


