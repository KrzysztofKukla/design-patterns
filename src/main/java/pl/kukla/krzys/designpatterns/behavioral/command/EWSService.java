package pl.kukla.krzys.designpatterns.behavioral.command;

import lombok.extern.slf4j.Slf4j;

/**
 * This class is receiver
 * in Command object we need receiver object on which Command will call operations
 */
@Slf4j
public class EWSService {

    //add new member to mailing group
    public void addMember(String contact, String contactGroup) {
        log.info("{} member has been added to {} group", contact, contactGroup);
    }

    public void removeMember(String contact, String contactGroup) {
        log.info("{} member has been removed from {} group", contact, contactGroup);
    }

}
