package com.boombada.community.board.application;

import com.boombada.community.board.application.port.in.UploadPostingCommand;
import com.boombada.community.board.application.port.in.UploadPostingUseCase;
import com.boombada.community.board.application.port.out.LoadBoardPort;
import com.boombada.community.board.application.port.out.UpdateBoardStatePort;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional
public class BoardService implements UploadPostingUseCase{
    private final LoadBoardPort loadBoardPort;
    private final UpdateBoardStatePort updateBoardStatePort;


    @Override
    public boolean uploadPosting(UploadPostingCommand command) {
        return false;
    }
}
