class Balance{
	public int bal=1500;
	public int getBal() {
		return this.bal;
	}
}

interface Transactio{
	void process(int amt);
	Balance b =new Balance(); 
}
class Withdraw implements Transactio{
	public void process(int amt) {
		if(amt<Transactio.b.getBal()) {
			Transactio.b.bal-=amt;
		}
		else
			System.out.println("Insufficient Funds");
	}
}
class Deposit implements Transactio{ 
	public void process(int amt) {
		if(amt<Transactio.b.getBal()) {
			Transactio.b.bal+=amt;
		}
	}
}
public class Transaction {
	public static void main(String[] args) {
		
		new Withdraw().process(200);
		System.out.println(Transactio.b.getBal());
		new Deposit().process(100);
		System.out.println(Transactio.b.getBal());
	}
}