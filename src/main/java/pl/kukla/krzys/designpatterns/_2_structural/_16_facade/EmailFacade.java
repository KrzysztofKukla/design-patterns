package pl.kukla.krzys.designpatterns._2_structural._16_facade;

import pl.kukla.krzys.designpatterns._2_structural._16_facade.email.Email;
import pl.kukla.krzys.designpatterns._2_structural._16_facade.email.Mailer;
import pl.kukla.krzys.designpatterns._2_structural._16_facade.email.Order;
import pl.kukla.krzys.designpatterns._2_structural._16_facade.email.Stationary;
import pl.kukla.krzys.designpatterns._2_structural._16_facade.email.Template;
import pl.kukla.krzys.designpatterns._2_structural._16_facade.email.TemplateType;
import pl.kukla.krzys.designpatterns._2_structural._16_facade.factory.StationaryFactory;
import pl.kukla.krzys.designpatterns._2_structural._16_facade.factory.StationaryFactoryClient;
import pl.kukla.krzys.designpatterns._2_structural._16_facade.factory.TemplateFactory;

/**
 * Facade provides simple methods for client to use
 * Client should interacts only with one facade object/method, not with many coupled objects
 * is a great help especially for legacy system
 * Facade allows to integrate code which interacts with large number of classes, interfaces of subsystem
 * Facade allows to decouple those tightly coupled classes and interfaces
 * It provides very simple interface for our subsystem/legacy system
 * that facade/interface can by easily used by client which does not have to know what is called inside ( in inner classes )
 * Facade provide simple method definition which calls many other services/classes inside
 * Facade determines the overall use cases that the subsystem is used for
 */
public class EmailFacade {

    public boolean sendOrderEmail(Order order, TemplateType templateType, StationaryFactory stationaryFactory) {
        Template template = TemplateFactory.createTemplateFactory(templateType);
        Stationary stationary = StationaryFactoryClient.createStationary(stationaryFactory);
        Email email = Email.builder()
            .template(template)
            .stationary(stationary)
            .object(order)
            .build();
        return Mailer.send(email);
    }

}
