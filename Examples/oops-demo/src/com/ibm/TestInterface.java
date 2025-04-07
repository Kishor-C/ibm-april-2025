package com.ibm;

// D1 will create an interface
interface UserDB {
	void store(); // public abstract void store()
	void delete(); // public abstract void delete()
}
// D2 will create another interface
interface UserQuery {
	void find();
}
// D3 will implements both the interface
class UserDBOneImpl implements UserDB, UserQuery {
	@Override
	public void find() {
		System.out.println("find() method");
	}
	@Override
	public void store() {
		System.out.println("store() method");
	}
	@Override
	public void delete() {
		System.out.println("delete() method");
	}
}
public class TestInterface {
	// D4 should call only find method
	public static void uid4(UserQuery query) { // UserQuery is a reference not an object
		query.find();
	}
	// D5 should call store & delete
	public static void uid5(UserDB db) { // UserDB is a reference
		db.store();
		db.delete();
	}
	// D6 might create object and pass them to the uid4 & uid5
	public static void main(String[] args) {
		UserDBOneImpl impl = new UserDBOneImpl();
		uid4(impl);
		System.out.println("_______________________________________");
		uid5(impl);
	}
} // interfaces are like contracts between the programs
