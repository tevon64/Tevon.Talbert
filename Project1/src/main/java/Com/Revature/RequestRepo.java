package Com.Revature;

import antlr.collections.List;

public interface RequestRepo {

	
	
	void save(Request request);
	
	
	Request findById(int Request_id);
	

	Request findByReason(String Reason);
	

	 static java.util.List <Request> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	void update(Request request);
	

	void delete(Request request);
	
}
	
	

