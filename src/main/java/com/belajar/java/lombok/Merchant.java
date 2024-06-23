package com.belajar.java.lombok;

import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
public class Merchant {

    private final String id;
    private String name;
}
