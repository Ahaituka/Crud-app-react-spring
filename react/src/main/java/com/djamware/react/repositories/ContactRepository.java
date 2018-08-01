package com.djamware.react.repositories;
import com.djamware.react.models.Contact;
import org.springframework.data.repository.CrudRepository;


// interface is the blueprint of the class
// the methods declared in interface are by default abstract (only method signature, no body)


public interface ContactRepository extends CrudRepository<Contact, String> {
    @Override  //Overriding is a feature that allows a subclass or
        // child class to provide a specific implementation of a method that is already
        // provided by one of its super-classes or parent classes
    void delete(Contact deleted);
}


