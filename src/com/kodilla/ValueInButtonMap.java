package com.kodilla;

import javafx.scene.control.Button;

import java.util.Objects;

public class ValueInButtonMap {

    private Button button;
    private String player;

    public ValueInButtonMap(Button button) {
        this.button = button;
        this.player = "empty";
    }

    public Button getButton() {
        return button;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ValueInButtonMap that = (ValueInButtonMap) o;
        return Objects.equals(button, that.button) &&
                Objects.equals(player, that.player);
    }

    @Override
    public int hashCode() {
        return Objects.hash(button, player);
    }
}
