package ca.sheridancollege.kalalv.assignment2.database;

import ca.sheridancollege.kalalv.assignment2.beans.Password;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DatabaseAccess extends CrudRepository<Password,Long> {


}


