package com.example.blog.model

import javax.persistence.*

@Entity
@Table(name = "t_users")
class User (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    var id: Long,

    @Column(name = "first_name")
    var firstName: String,

    @Column(name = "last_name")
    var lastName: String,

    @Column(name = "patronymic")
    var patronymic: String?
)

