package p1;

public class Passenger {
   public  String name,seat;
    public long mobile; 
    public int child,adult;
    public Passenger(String name,String seat,int adult,int child,long mobile){
        this.name=name;
        this.seat=seat;
        this.mobile=mobile;
        this.child=child;
        this.adult=adult;
    }
    
    public String getName() {

		return name;

	}

	public void setName(String name) {

		this.name = name;

	}

	public String getseat() {

		return seat;

	}

	public void setseat(String seat) {

		this.seat = seat;

	}

	
	
	public long getMobile() {

		return mobile;

	}

	public void setMobile(long mobile) {

		this.mobile = mobile;

	}
    @Override
    public String toString(){
        return name+" "+seat+" "+mobile+" ";
    }

    
}
