package com.kyotoyx.petclinic.bootstrap;

import com.kyotoyx.petclinic.model.Owner;
import com.kyotoyx.petclinic.model.PetType;
import com.kyotoyx.petclinic.model.Vet;
import com.kyotoyx.petclinic.services.OwnerService;
import com.kyotoyx.petclinic.services.PetTypeService;
import com.kyotoyx.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();

        owner1.setFirstName("Yixiu");
        owner1.setLastName("Chen");

        ownerService.save(owner1);

        Owner owner2 = new Owner();

        owner2.setFirstName("Haigui");
        owner2.setLastName("Xiansheng");

        ownerService.save(owner2);

        System.out.println("Owners Loaded...");

        Vet vet1 = new Vet();

        vet1.setFirstName("Hongqi");
        vet1.setLastName("Li");

        vetService.save(vet1);

        Vet vet2 = new Vet();

        vet2.setFirstName("Lei");
        vet2.setLastName("Peng");

        vetService.save(vet2);

        System.out.println("Vets Loaded... ");

    }
}
