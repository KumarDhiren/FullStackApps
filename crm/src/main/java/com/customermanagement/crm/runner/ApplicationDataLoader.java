package com.customermanagement.crm.runner;

import com.customermanagement.crm.model.Contact;
import com.customermanagement.crm.repository.ContactRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//@Component
public class ApplicationDataLoader implements CommandLineRunner {

    private final ContactRepository contactRepository;

    public ApplicationDataLoader(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        contactRepository.save(new Contact("Dhiren","Kumar","dhiren.patra@outlook.com"));
        contactRepository.save(new Contact("Anushka","Sharma","anushka.sharma@outlook.com"));
        contactRepository.save(new Contact("Tara","Sutaria","tara.sutaria@outlook.com"));
        contactRepository.save(new Contact("Disha","Patani","disha.patani@outlook.com"));
        contactRepository.save(new Contact("Katrina","kaif","katrina.kaif@outlook.com"));
    }

}
