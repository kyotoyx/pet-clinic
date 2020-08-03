package com.kyotoyx.petclinic.services.map;

import com.kyotoyx.petclinic.model.Specialty;
import com.kyotoyx.petclinic.services.SpecialtyService;
import org.springframework.stereotype.Service;

@Service
public class SpecialtyServiceMap extends AbstractMapService<Specialty, Long> implements SpecialtyService {

}
