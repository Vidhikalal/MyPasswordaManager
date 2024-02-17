package ca.sheridancollege.kalalv.assignment2.beans;
import ca.sheridancollege.kalalv.assignment2.utilities.RandomNumberGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Table;
import lombok.*;

import org.springframework.data.annotation.Id;
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @Table(name="PASSWORD_RECORD")
    public class Password {
        @Id
        @Column(name="id")
        private Long id;
        @Column(name="title")
        private String title;
        @Column(name="username")
        private String username;
        @Column(name="password")
        private String password;
        @Column(name="url")
        private String url;
        @Column(name="email")
        private String email;
        @Column(name="notes")
        private String notes;



    public void setId(Long id) {
        this.id = RandomNumberGenerator.generateRandomId();
    }



}
