package com.devsuperior.dslearnbds.entities;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "tb_content")
public class Content extends Lesson {

    private String textContent;
    private String videoUri;
}