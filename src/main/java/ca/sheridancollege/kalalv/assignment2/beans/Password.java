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
        @Column(name = "id")
        private Long id;
        @Column(name = "title")
        private String title;
        @Column(name = "username")
        private String username;
        @Column(name = "password")
        private String password;
        @Column(name = "url")
        private String url;
        @Column(name = "email")
        private String email;
        @Column(name = "notes")
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

