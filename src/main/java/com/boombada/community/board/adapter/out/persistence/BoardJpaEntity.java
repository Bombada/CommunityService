package com.boombada.community.board.adapter.out.persistence;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.LastModifiedBy;

import javax.persistence.*;

@Entity
@Table(name = "board")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BoardJpaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
