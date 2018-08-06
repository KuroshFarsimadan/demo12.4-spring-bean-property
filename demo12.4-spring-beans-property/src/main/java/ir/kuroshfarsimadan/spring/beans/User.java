package ir.kuroshfarsimadan.spring.beans;

public class User {

	private int id;

	private String name;

	private String tester = "I am a user";

	/**
	 * Super
	 */
	public User() {
		super();
	}

	/**
	 * @param id
	 * @param name
	 * @param tester
	 */
	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the tester
	 */
	public String getTester() {
		return tester;
	}

	/**
	 * @param tester
	 *            the tester to set
	 */
	public void setTester(String tester) {
		this.tester = tester;
	}

	public void whoIsUser() {
		System.out.println(this.tester);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", tester=" + tester + "]";
	}

}
