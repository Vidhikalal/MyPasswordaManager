package ca.sheridancollege.kalalv.assignment2.utilities;

import ca.sheridancollege.kalalv.assignment2.beans.Password;

import ca.sheridancollege.kalalv.assignment2.databases.DatabaseAccess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class AddRecord {
    private final DatabaseAccess databaseAccess;

    @Autowired
    public AddRecord(DatabaseAccess databaseAccess) {
        this.databaseAccess = databaseAccess;
    }

        public void SavePasswordRecord(Long id,String title,String username,String password,String url,String email,String notes){
            Password p=new Password();
              p.setId(RandomNumberGenerator.generateRandomId());
              p.setTitle(title);
              p.setEmail(email);
              p.setUsername(username);
              p.setPassword(password);
              p.setUrl(url);
              p.setNotes(notes);
              databaseAccess.save(p);
        }
        public List<Password> getAllPasswordRecords() {
            return (List<Password>) databaseAccess.findAll();
        }
        public List<Password> findByTitle(String title){
        return (List<Password>) databaseAccess.findByTitle(title) ;
        }


}
