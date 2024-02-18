package ca.sheridancollege.kalalv.assignment2.utilities;

import ca.sheridancollege.kalalv.assignment2.beans.Password;
import ca.sheridancollege.kalalv.assignment2.database.DatabaseAccess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class AddRecord {
        @Autowired
        private DatabaseAccess databaseAccess;

        public void SavePasswordrecord(Long id,String title,String username,String password,String url,String email,String notes){
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
        private List<Long> listContents = new ArrayList<>();


        public void addInDatabase(long ID) {
            listContents.add(ID);
        }
}
