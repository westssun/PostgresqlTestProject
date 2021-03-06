package com.api.plan.api.entity;

import com.api.plan.api.entity.base.BaseEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Category extends BaseEntity {
    @Id
    @GeneratedValue
    private Long idx;

    @Column(unique = true, nullable = false)
    private String categoryName;
}
