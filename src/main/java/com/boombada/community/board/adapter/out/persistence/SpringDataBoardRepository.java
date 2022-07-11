package com.boombada.community.board.adapter.out.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

interface SpringDataBoardRepository extends JpaRepository<BoardJpaEntity, Long> {
}