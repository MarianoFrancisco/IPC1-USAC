package com.mariano.memorymanagement.model;

import lombok.*;


@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
/**
 * @author Mariano Camposeco
 */
public class CustomObject {
    private Integer value;

    @Override
    public boolean equals(Object object) {
        CustomObject customObject = (CustomObject) object;
        return this.value.equals(customObject.value);
    }
}
