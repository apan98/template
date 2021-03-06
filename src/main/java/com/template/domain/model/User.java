package com.template.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull private String username;
    @NotNull private Double printingSpeed;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @NotNull private String password;

    @ManyToOne
    @JoinColumn(name = "role_id")
    @NotNull private Role role;

}


