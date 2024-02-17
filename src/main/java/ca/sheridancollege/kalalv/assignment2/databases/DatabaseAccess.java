package ca.sheridancollege.kalalv.assignment2.databases;

import ca.sheridancollege.kalalv.assignment2.beans.Password;
import org.springframework.data.repository.CrudRepository;

public interface DatabaseAccess extends CrudRepository<Password, Long> {

}
