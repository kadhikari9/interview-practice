package com.interview.practice.designpatterns.behavioral.command;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class OpenDocumentActionCommand implements DocumentActionCommand {
    private Document document;

    @Override
    public void execute() {
        document.openDocument();
    }
}
