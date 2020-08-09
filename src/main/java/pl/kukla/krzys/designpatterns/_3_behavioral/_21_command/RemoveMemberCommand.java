package pl.kukla.krzys.designpatterns._3_behavioral._21_command;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Krzysztof Kukla
 */
@RequiredArgsConstructor
@Slf4j
public class RemoveMemberCommand implements Command {

    private final String mailAddress;
    private final String groupName;
    private final EWSService ewsService;

    @Override
    public void execute() {
        ewsService.removeMember(mailAddress, groupName);
    }

}
