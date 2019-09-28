package com.yisui.service;
import com.yisui.service.MessageService;

public class MessageContainer {

    public MessageService getMsgService_() {
        return msgService_;
    }

    public void setMsgService_(MessageService msgService_) {
        this.msgService_ = msgService_;
    }

    private MessageService msgService_;

    public MessageContainer() {
        super();
    }


}

