package com.api.plan.api.entity;

import com.api.plan.api.entity.base.BaseEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Member extends BaseEntity {
    @Id
    @GeneratedValue
    private Long idx;

    @Column(unique = true)
    private String memberId;

    private String password;

    private String memberName;

    private String email;

    private String phone;

    private String gender;

    private String age;

    private String jobName;

    private String role; // USER, ADMIN

    /*
      create table member_category (
        member_idx int8 not null,
        category_idx int8 not null,
        primary key (member_idx, category_idx)
    )
     */
    @ManyToMany
    private Set<Category> category = new HashSet<>();
}
