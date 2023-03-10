package com.api.book.bootrestbook.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Author {
    
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private int authorId;

    @Column(name="first_name")
    private String firstName;
    private String lastName;
    private String langauge;
    public Author(int authorId, String firstName, String lastName, String langauge) {
        this.authorId = authorId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.langauge = langauge;
    }
    public Author() {
    }
    public int getAuthorId() {
        return authorId;
    }
    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLangauge() {
        return langauge;
    }
    public void setLangauge(String langauge) {
        this.langauge = langauge;
    }
    @Override
    public String toString() {
        return "Author [authorId=" + authorId + ", firstName=" + firstName + ", langauge=" + langauge + ", lastName="
                + lastName + "]";
    }
}
