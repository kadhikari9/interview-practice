package com.interview.practice.designpatterns.behavioral;

import com.interview.practice.designpatterns.behavioral.mediator.ChatMediator;
import com.interview.practice.designpatterns.behavioral.mediator.ChatMediatorImpl;
import com.interview.practice.designpatterns.behavioral.mediator.User;
import com.interview.practice.designpatterns.behavioral.mediator.UserImpl;
import org.junit.jupiter.api.Test;

public class ChatMediatorTest {

    @Test
    public void testMediator() {
        ChatMediator mediator = new ChatMediatorImpl();
        User user1 = new UserImpl(mediator, "Pankaj");
        User user2 = new UserImpl(mediator, "Lisa");
        User user3 = new UserImpl(mediator, "Saurabh");
        User user4 = new UserImpl(mediator, "David");
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send("Hi from Pankaj");
        user4.send("Hi From David");
    }
}
