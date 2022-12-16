package com.udacity.vehicles.domain.manufacturer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Declares class to hold car manufacturer information.
 */
@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Manufacturer {

    @Id
    private Integer code;
    private String name;
}
