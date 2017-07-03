package undefined.undefined.api.service.impl;

import undefined.undefined.api.service.*;
import undefined.undefined.models.*;
import org.springframework.stereotype.Service;
import undefined.undefined.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import undefined.undefined.models.FieldsetsAud;


import java.util.List;
import io.swagger.springbootserver.exception.NotFoundException;


@Service
@Transactional
public class FieldsetsAudApiServiceImpl implements FieldsetsAudApiService {
		  	  
	  @Autowired
	
  	  private FieldsetsAudRepository  fieldsetsAudRepository ;
	   
  
  
				
			
      @Override
      public List<FieldsetsAud> findAllFieldsetsAud()
      throws NotFoundException {
      
        
  		
  		
  			return fieldsetsAudRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public FieldsetsAud updateFieldsetsAud(FieldsetsAud fieldsetsAud)
      throws NotFoundException {
      
         
        	return fieldsetsAudRepository.save(fieldsetsAud);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public FieldsetsAud addFieldsetsAud(FieldsetsAud fieldsetsAud)
      throws NotFoundException {
      
         
        	return fieldsetsAudRepository.save(fieldsetsAud);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public FieldsetsAud findByIdFieldsetsAud(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return fieldsetsAudRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deleteFieldsetsAud(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

