package com.example.webproject.models;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "films", schema = "web_pr")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Films {
    @Id
    @GenericGenerator(name = "UUIDGenerator", strategy = "uuid2")
    @GeneratedValue(generator = "UUIDGenerator")
    @Column(name = "film_id")
    private UUID uuid;

    @Column(name = "film_name")
    private String filmName;
    @Column(name = "film_description")
    private String filmDescription;
    @Column(name = "film_image")
    private byte[] filmImage;
}
