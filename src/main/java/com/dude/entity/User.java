package com.dude.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Created by can.yegane on 17/11/16.
 */
@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    protected User() {
    }
}
