/*Write a program to implement hashCode() and equals() methods.
If two objects are equal according to the equals(Object) method, 
then calling the hashCode method on each of the two objects must produce the same integer result. */
package com.sheetal;

public class StringHashEquals {
	private Integer id;
	private String name;

	public StringHashEquals(int i, String string) {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean equals(Object o) {
		if (o instanceof StringHashEquals) {
			StringHashEquals e2 = (StringHashEquals) o;
			if (this.id == e2.id && this.name == e2.name) {
				return true;
			}
		}
		return false;

	}

	public static void main(String[] args) {
		StringHashEquals s1 = new StringHashEquals(10, "sheetal");
		StringHashEquals s2 = new StringHashEquals(10, "sheetal");
		boolean result = s1.equals(s2);
		System.out.println("HashCode of s1: " + s1.hashCode());
		System.out.println("HashCode of s2: " + s2.hashCode());
		System.out.println("Equals Result: " + result);

	}
}
