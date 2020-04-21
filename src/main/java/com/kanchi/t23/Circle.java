package com.kanchi.t23;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Component
public class Circle implements Shape, ApplicationEventPublisherAware {
    private Point centre;
    @Autowired
    private MessageSource messageSource;
    private ApplicationEventPublisher publisher;

    public MessageSource getMessageSource() {
        return messageSource;
    }

    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public Point getCentre() {
        return centre;
    }

    @Resource(name = "pointA")
    public void setCentre(Point centre) {
        this.centre = centre;
    }

    @Override
    public void draw() {
        System.out.println(this.messageSource.getMessage("drawing.circle",null,"Default message",null));
        System.out.println(this.messageSource.getMessage("drawing.point",new Object[]{centre.getX(),centre.getY()},"Default message",null));
        System.out.println(this.messageSource.getMessage("greeting",null,"Default message",null)+" circle");
        DrawEvent drawEvent = new DrawEvent(this);
        publisher.publishEvent(drawEvent);
    }

    @PostConstruct
    public void initialize(){
        System.out.println("start ");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("end");
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
        this.publisher=publisher;

    }
}
