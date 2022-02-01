package Com.Revature;

import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.HibernateException;
import org.hibernate.Session;


public class RequestAction implements RequestRepo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void save(Request request) {
		/*
		 * We always need a session. And I also need a transaction.
		 */
		Session session = null;
		Transaction transaction = null;
		
		try {
			session = HibernateSessionFactory.getSession();
			transaction = session.beginTransaction();
			session.save(request);
			transaction.commit();
		}catch(HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		}
	}
		
	

	@Override
	public Request findById(int Request_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Request findByReason(String Reason) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Request request) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Request request) {
		// TODO Auto-generated method stub
		
	}

	public List<Request> findAll() {
		// TODO Auto-generated method stub
		List<Request> request = null;
		
		
		Session session = null;
		
		org.hibernate.Transaction transaction = null;
		
		try {
			session = HibernateSessionFactory.getSession();
			transaction = session.beginTransaction();
			
			request = session.createQuery("FROM Request", Request.class).getResultList();

			transaction.commit();
		}catch(HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		}
		
		return request;
		
		
	}

}
