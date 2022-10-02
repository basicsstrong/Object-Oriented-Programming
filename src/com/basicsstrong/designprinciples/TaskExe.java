package com.basicsstrong.designprinciples;

class Compute {

	public String compute() {
		return "computing data based on user input";
	}

}

class Save {
	public String save() {
		return "save the object to database";
	}

}

class Notification {
	public String sendNotification() {
		return "send the notification to the user";
	}
}

class SchedulingApplication {

	Compute c;
	Save s;
	Notification n;

	public SchedulingApplication(Compute c, Save s, Notification n) {
		this.c = c;
		this.s = s;
		this.n = n;
	}

	public void schedule() {
		System.out.println(c.compute());
		System.out.println(s.save());
		System.out.println(n.sendNotification());

	}

}

public class TaskExe {

	public void main(String[] args) {
		SchedulingApplication sa = new SchedulingApplication(new Compute(), new Save(), new Notification());
		sa.schedule();

	}

}
