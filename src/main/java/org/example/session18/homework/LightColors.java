package org.example.session18.homework;

public enum LightColors {
    /*Create an enum called LightColor that represents the three colors of a traffic light:
    red, yellow, and green. Each color should have a string representation and a duration (in seconds)
    associated with it (e.g., red = "Stop", 30 seconds; yellow = "Caution", 5 seconds; green = "Go", 45 seconds).*/
    RED("Stop", 30),
    YELLOW("Caution", 5),
    GREEN("Go", 45);
    private final String action;
    private final int duration;
    LightColors(String action, int duration) {
        this.action = action;
        this.duration = duration;
    }
    public String getAction() {
        return action;
    }
    public int getDuration() {
        return duration;
    }
    @Override
    public String toString() {
        return "LightColors{" +
                "action='" + action + '\'' +
                ", duration=" + duration +
                '}';
    }
    public static void main(String[] args) {
        for (LightColors color : LightColors.values()) {
            System.out.println(color + " - Action: " + color.getAction() + ", Duration: " + color.getDuration() + " seconds");
        }
    }

}
