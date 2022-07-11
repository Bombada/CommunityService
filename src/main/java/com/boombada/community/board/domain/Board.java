package com.boombada.community.board.domain;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Value;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Board {

    @Getter private final BoardId id;


    @Value
    public static class BoardId{
        private Long value;
    }



}
