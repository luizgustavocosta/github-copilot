package com.costa.luiz.copilot;

import lombok.Builder;
import lombok.ToString;

import java.util.Set;

@Builder
@ToString
public class Classes {

    private Teacher teacher;
    private Set<Student> students;
}
