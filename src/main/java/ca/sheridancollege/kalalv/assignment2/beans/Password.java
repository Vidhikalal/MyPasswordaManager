package ca.sheridancollege.kalalv.assignment2.beans;
import ca.sheridancollege.kalalv.assignment2.utilities.RandomNumberGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import lombok.NonNull;
import org.springframework.data.annotation.Id;
   @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public class Password {
        @NonNull
        private Long id;
        private String title;
        private String username;
        private String password;
        private String url;
        private String email;
        private String notes;



    public void setId(Long id) {
        this.id = RandomNumberGenerator.generateRandomId();
    }



}
