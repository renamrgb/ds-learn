package com.devsuperior.dslearnbds.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tb_section")
public class Section {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private Integer position;
    private String imgUri;
    @ManyToOne
    @JoinColumn(name = "resource_id")
    private Resource resource;
    @ManyToOne
    @JoinColumn(name = "prerequisite_id")
    private Section prerequisite;
}