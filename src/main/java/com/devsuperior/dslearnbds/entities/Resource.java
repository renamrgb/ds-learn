package com.devsuperior.dslearnbds.entities;

import com.devsuperior.dslearnbds.entities.enuns.ResourceType;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "tb_resource")
public class Resource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private Integer position;
    private String imgUri;
    private ResourceType type;
    @ManyToOne
    @JoinColumn(name = "offer_id")
    private Offer offer;
    @OneToMany(mappedBy = "resource")
    private List<Section> sections = new ArrayList<>();
}