package network.webtech.labmvc.models;

import  jakarta.persistence.CollectionTable;
import  jakarta.persistence.Column;
import  jakarta.persistence.ElementCollection;
import  jakarta.persistence.Entity;
import  jakarta.persistence.FetchType;
import  jakarta.persistence.GeneratedValue;
import  jakarta.persistence.GenerationType;
import  jakarta.persistence.Id;
import  jakarta.persistence.OneToMany;
import  jakarta.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@Table(name = "tbl_user")
public class User {

    @Id
    @Column(name = "id", unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", length = 100, nullable = false, unique = true)
    private String username;

    @Column(name = "password", length = 60, nullable = false)
    private String password;


}

