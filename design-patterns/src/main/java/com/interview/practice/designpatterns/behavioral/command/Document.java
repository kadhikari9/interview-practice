package com.interview.practice.designpatterns.behavioral.command;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Document {
    public void openDocument() {
        log.info("Opening the document");
    }

    public void saveDocument() {
        log.info("Saving the document");
    }
}
