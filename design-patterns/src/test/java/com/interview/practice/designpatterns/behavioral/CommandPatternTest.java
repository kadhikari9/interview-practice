package com.interview.practice.designpatterns.behavioral;

import com.interview.practice.designpatterns.behavioral.command.Document;
import com.interview.practice.designpatterns.behavioral.command.Menubar;
import com.interview.practice.designpatterns.behavioral.command.OpenDocumentActionCommand;
import com.interview.practice.designpatterns.behavioral.command.SaveDocumentActionCommand;
import org.junit.jupiter.api.Test;

public class CommandPatternTest {

    @Test
    public void testCommandPattern() {
        Document document = new Document();
        Menubar menubar = new Menubar(new OpenDocumentActionCommand(document),
                new SaveDocumentActionCommand(document));

        menubar.clickOpen();
        menubar.clickSave();
    }
}
