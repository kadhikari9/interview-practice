package com.interview.practice.designpatterns.behavioral.command;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Menubar {

    private DocumentActionCommand openDocCommand;
    private DocumentActionCommand saveDocCommand;

    public void clickOpen() {
        openDocCommand.execute();
    }

    public void clickSave() {
        saveDocCommand.execute();
    }
}
