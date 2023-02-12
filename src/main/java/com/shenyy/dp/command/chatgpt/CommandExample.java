package com.shenyy.dp.command.chatgpt;

public class CommandExample {
    public static void main(String[] args) {
        Light light = new Light();
        Command command = new TurnOnLightCommand(light);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(command);
        remoteControl.pressButton();
    }
}
