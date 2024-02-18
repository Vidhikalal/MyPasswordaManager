package ca.sheridancollege.kalalv.assignment2.database;
import ca.sheridancollege.kalalv.assignment2.controllers.HomeControllers;
import ca.sheridancollege.kalalv.assignment2.beans.Password;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DatabaseAccess extends CrudRepository<Password,Long> {

    List<Password> findByTitle(String title);

}


