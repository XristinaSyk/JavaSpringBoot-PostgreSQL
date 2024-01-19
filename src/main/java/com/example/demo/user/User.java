package com.example.demo.user;

import jakarta.persistence.*;

@Entity
@Table(name="user_data")
public class User {
    @Id
    //allocationSize=1: for auto_increment id
    @SequenceGenerator(name="user_sequence",sequenceName="user_sequence")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator= "user_sequence") // connection of this class to our table in database
    private Long id;
    private String name;
    private Integer age;
    private String email;

    public User(){}
    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public User(Long id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
