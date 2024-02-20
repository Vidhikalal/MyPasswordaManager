package ca.sheridancollege.kalalv.assignment2.beans;
import ca.sheridancollege.kalalv.assignment2.utilities.RandomNumberGenerator;

import jakarta.persistence.*;

import lombok.*;
;
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Entity(name="PASSWORD_RECORD")
    public class Password {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "ID")
        private Long id=RandomNumberGenerator.generateRandomId();
        @Column(name = "TITLE")
        private String title;
        @Column(name = "USERNAME")
        private String username;
        @Column(name = "PASSWORD")
        private String password;
        @Column(name = "URL")
        private String url;
        @Column(name = "EMAIL")
        private String email;
        @Column(name = "NOTES")
        private String notes;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getNotes() {
            return notes;
        }

        public void setNotes(String notes) {
            this.notes = notes;
        }

        @Override
        public String toString() {
            return "Password{" +
                    "id=" + id +
                    ", title='" + title + '\'' +
                    ", username='" + username + '\'' +
                    ", password='" + password + '\'' +
                    ", url='" + url + '\'' +
                    ", email='" + email + '\'' +
                    ", notes='" + notes + '\'' +
                    '}';
        }
    }

