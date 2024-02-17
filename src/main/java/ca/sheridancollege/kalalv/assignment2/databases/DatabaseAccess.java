package ca.sheridancollege.kalalv.assignment2.databases;

import ca.sheridancollege.kalalv.assignment2.beans.PasswordRecord;
import org.springframework.data.repository.CrudRepository;

public interface DatabaseAccess extends CrudRepository<PasswordRecord, Long> {

}
