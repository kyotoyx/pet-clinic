package com.kyotoyx.petclinic.bootstrap;

import com.kyotoyx.petclinic.model.Owner;
import com.kyotoyx.petclinic.model.Vet;
import com.kyotoyx.petclinic.services.OwnerService;
import com.kyotoyx.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
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

        System.out.println("Owners Loaded...");

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

        System.out.println("Vets Loaded... ");

    }
}
