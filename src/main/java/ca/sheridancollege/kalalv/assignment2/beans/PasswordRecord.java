package ca.sheridancollege.kalalv.assignment2.beans;
import ca.sheridancollege.kalalv.assignment2.utilities.RandomNumberGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.annotation.Id;


@Data
@NoArgsConstructor
@Entity(name= "PASSWORD")
public class PasswordRecord{

    @Id
    private Long id;

    @Column(name="TITLE")
    private String title;

    @Column(name="USERNAME")
    private String username;

    @Column(name="PASSWORD")
    private String password;

    @Column(name="URL")
    private String url;

    @Column(name="E-MAIL")
    private String email;

    @Column(name="NOTES")
    private String notes;


    public void setId(Long id) {
        this.id = RandomNumberGenerator.generateRandomId();
    }



}
