package dev.lombook;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class DevVO {
    private String name="";
    private double year = 1.5;
    private int payTot = 2500000;
    private double pay_tax=0.0;
}
 