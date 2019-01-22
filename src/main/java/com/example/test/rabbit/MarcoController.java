package com.example.test.rabbit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;

@Controller
public class MarcoController {
	private static final Logger logger = LoggerFactory.getLogger(MarcoController.class);

	@MessageMapping("/marco")
	public void handleShout(Shout incoming) {
		logger.info("Received message: " + incoming.getMessage());
	}
}
