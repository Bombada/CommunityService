package com.boombada.community.board.application.port.in;

public interface UploadPostingUseCase {

    boolean uploadPosting(UploadPostingCommand command);
}
