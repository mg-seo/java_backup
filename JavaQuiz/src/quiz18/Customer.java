package quiz18;

public class Customer implements Comparable<Customer>{
	private String name;
	private int ticket;
	
	public Customer(String name, int ticket) {
		this.name = name;
		this.ticket = ticket;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTicket() {
		return ticket;
	}

	public void setTicket(int ticket) {
		this.ticket = ticket;
	}


	@Override
	public int compareTo(Customer o) {
		return this.ticket - o.getTicket();
	}
	public String toString() {
		return "[name=" + name + ", ticket=" + ticket + "]";
	}
	
	
}
