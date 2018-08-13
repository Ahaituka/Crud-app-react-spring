package com.djamware.react.repositories;
import com.djamware.react.models.Contact;
import com.djamware.react.models.Student;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

// interface is the blueprint of the class
// the methods declared in interface are by default abstract (only method signature, no body)


public interface StudentRepository extends CrudRepository<Student, String> {
      //Overriding is a feature that allows a subclass or
        // child class to provide a specific implementation of a method that is already
        // provided by one of its super-classes or parent classes
    Contact c = new Contact();
//    List<Contact>  list = new Contact<>() ;
//    list.add(c)

   @ Override
    void delete(Student deleted);
}


