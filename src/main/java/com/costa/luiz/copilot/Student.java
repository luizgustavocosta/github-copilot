package com.costa.luiz.copilot;

import lombok.*;

@Builder
@AllArgsConstructor
@ToString
@Getter
public class Student {

    String id;
    String name;
    String email;
    String phone;
    String address;
}
