package com.boombada.community.board.application.port.in;

import com.boombada.community.board.domain.Board;
import com.boombada.community.common.SelfValidating;
import lombok.EqualsAndHashCode;
import lombok.Value;

import javax.validation.constraints.NotNull;

@Value
@EqualsAndHashCode(callSuper = false)
public
class UploadPostingCommand extends SelfValidating<UploadPostingCommand> {
    @NotNull
    private final Board.BoardId postingId;


}
