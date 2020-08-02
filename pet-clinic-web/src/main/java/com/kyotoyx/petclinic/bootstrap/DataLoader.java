package com.kyotoyx.petclinic.bootstrap;

import com.kyotoyx.petclinic.model.Owner;
import com.kyotoyx.petclinic.model.Pet;
import com.kyotoyx.petclinic.model.Vet;
import com.kyotoyx.petclinic.services.OwnerService;
import com.kyotoyx.petclinic.services.VetService;
import com.kyotoyx.petclinic.services.map.OwnerServiceMap;
import com.kyotoyx.petclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;

public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Yixiu");
        owner1.setLastName("Chen");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Haigui");
        owner2.setLastName("Xiansheng");

        ownerService.save(owner2);

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Hongqi");
        vet1.setLastName("Li");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Lei");
        vet2.setLastName("Peng");

        vetService.save(vet2);
    }
}
