package undefined.undefined.api.service.impl;

import undefined.undefined.api.service.*;
import undefined.undefined.models.*;
import org.springframework.stereotype.Service;
import undefined.undefined.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import undefined.undefined.models.Revinfo;


import java.util.List;
import io.swagger.springbootserver.exception.NotFoundException;


@Service
@Transactional
public class RevinfoApiServiceImpl implements RevinfoApiService {
		  	  
	  @Autowired
	
  	  private RevinfoRepository  revinfoRepository ;
	   
  
  
				
			
      @Override
      public List<Revinfo> findAllRevinfo()
      throws NotFoundException {
      
        
  		
  		
  			return revinfoRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Revinfo updateRevinfo(Revinfo revinfo)
      throws NotFoundException {
      
         
        	return revinfoRepository.save(revinfo);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Revinfo addRevinfo(Revinfo revinfo)
      throws NotFoundException {
      
         
        	return revinfoRepository.save(revinfo);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Revinfo findByIdRevinfo(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return revinfoRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deleteRevinfo(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

