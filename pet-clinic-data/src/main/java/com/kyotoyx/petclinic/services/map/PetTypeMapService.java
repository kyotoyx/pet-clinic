package com.kyotoyx.petclinic.services.map;

import com.kyotoyx.petclinic.model.PetType;
import com.kyotoyx.petclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetTypeMapService extends AbstractMapService<PetType, Long>  implements PetTypeService {


}
