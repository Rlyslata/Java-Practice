package com.ecust.xgp.thread.tickets;

import org.junit.jupiter.api.Test;

public class MainClass {
	@Test
	public static void main(String args[]) {
		new TicketWindows().start();
		new TicketWindows().start();
		new TicketWindows().start();
		new TicketWindows().start();
	}
}
