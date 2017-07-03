package undefined.undefined.api.service;

import undefined.undefined.models.Fieldsets;


import io.swagger.springbootserver.exception.NotFoundException;
import java.util.List;

public interface FieldsetsApiService {
  
      List<Fieldsets> findAllFieldsets()
      throws NotFoundException;
  
      Fieldsets updateFieldsets(Fieldsets fieldsets)
      throws NotFoundException;
  
      Fieldsets addFieldsets(Fieldsets fieldsets)
      throws NotFoundException;
  
      Fieldsets findByIdFieldsets(Integer id)
      throws NotFoundException;
  
      void deleteFieldsets(Integer id)
      throws NotFoundException;
  
}

