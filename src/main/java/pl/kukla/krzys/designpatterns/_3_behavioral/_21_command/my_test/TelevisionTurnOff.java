package pl.kukla.krzys.designpatterns._3_behavioral._21_command.my_test;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class TelevisionTurnOff implements Command {

    private final Television television;

    @Override
    public void execute() {
        television.off();
    }
}
