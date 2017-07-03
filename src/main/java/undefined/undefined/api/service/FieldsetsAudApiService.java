package undefined.undefined.api.service;

import undefined.undefined.models.FieldsetsAud;


import io.swagger.springbootserver.exception.NotFoundException;
import java.util.List;

public interface FieldsetsAudApiService {
  
      List<FieldsetsAud> findAllFieldsetsAud()
      throws NotFoundException;
  
      FieldsetsAud updateFieldsetsAud(FieldsetsAud fieldsetsAud)
      throws NotFoundException;
  
      FieldsetsAud addFieldsetsAud(FieldsetsAud fieldsetsAud)
      throws NotFoundException;
  
      FieldsetsAud findByIdFieldsetsAud(Integer id)
      throws NotFoundException;
  
      void deleteFieldsetsAud(Integer id)
      throws NotFoundException;
  
}

