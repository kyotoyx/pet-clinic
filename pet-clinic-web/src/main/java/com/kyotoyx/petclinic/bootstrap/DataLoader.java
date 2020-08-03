package com.kyotoyx.petclinic.bootstrap;

import com.kyotoyx.petclinic.model.Owner;
import com.kyotoyx.petclinic.model.Pet;
import com.kyotoyx.petclinic.model.PetType;
import com.kyotoyx.petclinic.model.Vet;
import com.kyotoyx.petclinic.services.OwnerService;
import com.kyotoyx.petclinic.services.PetTypeService;
import com.kyotoyx.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

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

        System.out.println("PetType Loaded...");
        Owner owner1 = new Owner();

        owner1.setFirstName("Yixiu");
        owner1.setLastName("Chen");
        owner1.setAddress("100 Willoughby St");
        owner1.setCity("Brooklyn");
        owner1.setTelphone("+8618140213570");

        Pet yxpet = new Pet();
        yxpet.setName("Tractor");
        yxpet.setPetType(savedCatPetType);
        yxpet.setBirthDate(LocalDate.now());
        yxpet.setOwner(owner1);
        owner1.getPets().add(yxpet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();

        owner2.setFirstName("Haigui");
        owner2.setLastName("Xiansheng");
        owner2.setAddress("1 Harborside Pl");
        owner2.setCity("Jersey City");
        owner2.setTelphone("+19178566230");

        Pet hgpet = new Pet();
        hgpet.setName("Laiwu");
        hgpet.setBirthDate(LocalDate.now());
        hgpet.setPetType(savedDogPetType);
        hgpet.setOwner(owner2);
        owner2.getPets().add(hgpet);

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

        System.out.println(petTypeService.findAll());
        System.out.println(ownerService.findAll());
    }
}
