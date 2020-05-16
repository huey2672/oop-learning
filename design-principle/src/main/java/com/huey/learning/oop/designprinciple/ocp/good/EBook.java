package com.huey.learning.oop.designprinciple.ocp.good;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class EBook extends Book {

    private String format;

}
