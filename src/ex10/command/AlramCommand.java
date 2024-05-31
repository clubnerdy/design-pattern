package ex10.command;

import ex10.alarm.Alarm;

public class AlramCommand implements Command{

    private Alarm alram;

    public AlramCommand(Alarm alram) {
        this.alram = alram;
    }

    @Override
    public void execute() {
        alram.alramOn();
    }
}
