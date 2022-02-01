package Com.Revature;

	import java.util.Collections;
	import java.util.List;



	/*
	 * A "service" layer is a standard addition to many applications. A service layer should
	 * contain business logic. Tasks such as data transformation for presentation purposes,
	 * for instance, might be considered business logic. Comparator
	 */
	public class RequestService<RequestRepo> {
		
		/*
		 * This is a dependency as the IngredientService cannot function properly without
		 * the IngredientRepository.
		 */
		private RequestAction requestrepo = new RequestAction();
		
		/*
		 * Note that you can use this constructor if you prefer to use constructor injection
		 * with Mockito.
		 */
//		public IngredientService(IngredientRepository ingredientRepository) {
//			this.ingredientRepository = ingredientRepository;
//		}

		public List<Request> findAllbyReason(){
			
			List<Request> retrievedRequest = RequestRepo.findAll();
			
			Collections.sort(retrievedRequest, 
					(i1, i2) -> ( (Object) i1.getName()).compareTo(i2.getName()));
			
			return retrievedRequest;
		}
		
		public List <Request> findAll(){
			return RequestRepo.findall();
		}
		
		public void save(Request request) {
			((RequestAction) this.requestrepo).save(request);
		}
		
		public Request findById(int id) {
			return ((RequestAction) this.requestrepo).findById(id);
		}
	}

