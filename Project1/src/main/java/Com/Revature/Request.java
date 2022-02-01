package Com.Revature;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.hibernate.annotations.Table;



@Table(appliesTo = "hibernate_Request")
public class Request {

	@Column
	private int Request_id;
	@Column
	private int Cashamount;
	@Column
	private String Reason;
	public static List<Request> Request;
	
	
	public Request() {
		super();
	}
	
	public Request(int Request_ID,int Cashamount, String Reason) {
		
		super();
	this.Request_id = Request_id;
	this.Cashamount = Cashamount;
	this.Reason = Reason;
	
	}
	
	public int getRequest_id() {
		return Request_id;
	}

	public void setRequest_id(int request_id) {
		Request_id = request_id;
	}

	public int getCashamount() {
		return Cashamount;
	}

	public void setCashamount(int cashamount) {
		Cashamount = cashamount;
	}

	public String getReason() {
		return Reason;
	}

	public void setReason(String reason) {
		Reason = reason;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Cashamount;
		result = prime * result + ((Reason == null) ? 0 : Reason.hashCode());
		result = prime * result + Request_id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Request other = (Request) obj;
		if (Cashamount != other.Cashamount)
			return false;
		if (Reason == null) {
			if (other.Reason != null)
				return false;
		} else if (!Reason.equals(other.Reason))
			return false;
		if (Request_id != other.Request_id)
			return false;
		return true;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		return "Request [Request_id=" + Request_id + ", Cashamount=" + Cashamount + ", Reason=" + Reason + "]";
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}





	public Object getName() {
		// TODO Auto-generated method stub
		return null;
	}

}




