package pl.kukla.krzys.designpatterns.structural.facade;

import pl.kukla.krzys.designpatterns.structural.facade.email.Email;
import pl.kukla.krzys.designpatterns.structural.facade.email.Mailer;
import pl.kukla.krzys.designpatterns.structural.facade.email.Order;
import pl.kukla.krzys.designpatterns.structural.facade.email.Stationary;
import pl.kukla.krzys.designpatterns.structural.facade.email.Template;
import pl.kukla.krzys.designpatterns.structural.facade.email.TemplateType;
import pl.kukla.krzys.designpatterns.structural.facade.factory.StationaryFactory;
import pl.kukla.krzys.designpatterns.structural.facade.factory.StationaryFactoryClient;
import pl.kukla.krzys.designpatterns.structural.facade.factory.TemplateFactory;

/**
 * Facade provides simple methods for client to use
 * is a great help especially for legacy system
 * Facade allows to integrate code which interacts with large number of classes, interfaces of subsystem
 * Facade allows to decouple those tightly coupled classes and interfaces
 * It provides very simple interface for our subsystem/legacy system
 * that facade/interface can by easily used by client which does not have to know what is called inside ( in inner classes )
 * Facade provide simple method definition which calls many other services/classes inside
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
