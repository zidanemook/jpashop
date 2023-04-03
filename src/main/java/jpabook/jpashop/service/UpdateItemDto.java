package jpabook.jpashop.service;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class UpdateItemDto
{
    private final String name;
    private final int price;
    private final int stockQuantity;
}
