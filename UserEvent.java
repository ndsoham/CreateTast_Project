package com.example.whiplash;

import javafx.event.Event;
import javafx.event.EventType;
import javafx.scene.Node;
import javafx.scene.control.Button;

public class UserEvent extends Event {
    public static final EventType<UserEvent> ANY = new EventType<>(Event.ANY, "ANY");
    Button button = new Button();

    public static final EventType<UserEvent> LOGIN_SUCCEDED = new EventType<>(ANY, "LOGIN_SUCCEEDED");
    public UserEvent(EventType<? extends Event> eventType){
        super(eventType);
    }


    /*Node node = ...
            node.addEventHandler(UserEvent.LOGIN_SUCCEDED, userEvent -> {
        // handle event in case of login success
    });
    Node node =
            node.addEventHandler(UserEvent.ANY, userEvent -> {
        // handle event in both cases
    });

    UserEvent event = new UserEvent(UserEvent.LOGIN_SUCCEDED);
    Node node = ...
    node.fireEvent(event);

    Button button = ...
    button.setOnMouseEntered(e -> ...);
    button.setOnMouseExited(e -> ...);
    button.setOnMousePressed(e -> ...);
    button.setOnMouseReleased(e -> ...);

    Button button = ...
    button.setOnKeyPressed(e -> ...);
    button.setOnKeyReleased(e -> ...);



    */


}
