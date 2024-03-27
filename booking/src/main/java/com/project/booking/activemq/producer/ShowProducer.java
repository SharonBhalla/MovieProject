package com.project.booking.activemq.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import com.project.booking.dto.BookingDTO;

@Component
public class ShowProducer {
	
	@Autowired
	private JmsTemplate jmsTemplate;
	
	@Value("${springjms.showqueue}")
	private String queue;
	
	public void sendShowData(BookingDTO bookingDTO ) {
		System.out.println("ShowProducer.sendShowData() send it to queue"+bookingDTO.getShowId());
		jmsTemplate.convertAndSend(queue, bookingDTO);
	}

}
