package pl.kukla.krzys.designpatterns.behavioral.command;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * a concrete implementation of Command
 */
@RequiredArgsConstructor
@Slf4j
public class AddMemberCommand implements Command {

    private final String contact;
    private final String contactGroup;
    private final EWSService ewsService;

    @Override
    public void execute() {
        ewsService.addMember(contact, contactGroup);
    }

}
