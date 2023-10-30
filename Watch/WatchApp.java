public class WatchApp{
	
	Watch[] newWatch = new Watch[5];
	
	boolean saveWatch(Watch watch){
		
		 boolean validateWatch = validateWatchDetails(watch);
		 if(validateWatch){
			 for(int i=0;i<newWatch.length;i++){
				 if(newWatch[i]==null){
					 newWatch[i]=watch;
					 System.out.println("Successfully saved details");
					 return true;
				    }
				 else{
					 System.out.println("Index is not empty, so it is not saved");
			 }
		 }
		 System.out.println("Index has no space");
		 return false;	 
	 }
	 return false;
	 }
	  boolean validateWatchDetails(Watch watch){
		 if(watch!=null){
			 System.out.println("Watch is Not null");
			 if(watch.getBrandName()!=null && watch.getBrandName().length()>3){
				  if(watch.getStyleType()!=null && watch.getStyleType().length()>3){
					  if(watch.getPrice()>0){
						  if(watch.getModel()!=null && watch.getModel().length()>3){
						  return true;
					  }
					  else{
						  System.out.println("Model is not valid");
						  return false;
					  }
				  }
				
				  else{
					  System.out.println("Watch price is not valid");
					  return false;
				  }
			 }
			 else{
				  System.out.println("Watch type is not valid");
				 return false;
			 }
			
		 }
		 else{
			  System.out.println("Watch brand name is not valid");
			 return false;
		 }
		 }
		 
		 else{
			  System.out.println("Watch is null");
			 return false;
		 }
	 }
	 
	 Watch[] fetchWatchList(){
		
		 return this.newWatch;
	 }
	 
	 boolean checkWatchExist(Watch watch){
		 if(watch!=null){
			 
			 for(int i = 0 ; i <newWatch.length; i++){
			 
			 if(newWatch[i].getBrandName().equals(watch.getBrandName())){
				 return true;
				 
			 }
			 else{
				 return false;
				 
			 }
			 
			}
			 
		 }
		 return false;
	 }
	 
	 
}