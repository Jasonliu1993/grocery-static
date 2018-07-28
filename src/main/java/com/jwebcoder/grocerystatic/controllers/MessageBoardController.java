package com.jwebcoder.grocerystatic.controllers;


import com.jwebcoder.grocerystatic.domain.MessageBoardSubreply;
import com.jwebcoder.grocerystatic.dto.Message;
import com.jwebcoder.grocerystatic.utilities.PackingInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Jason on 15/10/2017.
 */

@Controller
@RequestMapping("/messageBoard")
public class MessageBoardController {

    /*@Autowired
    private MessageBoardService messageBoardService;

    @Autowired
    private CustomProperty customProperty;*/

    @PostMapping("/leaveMessage")
    public void sendMessage(HttpSession session, String replyMessage, HttpServletResponse response) throws IOException {
//        messageBoardService.sendMessage(session, replyMessage);

        response.sendRedirect("/messageBoard/1");
    }

    @PostMapping("/loadReplyDetail")
    @ResponseBody
    public Message loadReplyDetail(String messageBoardId, String messageBoardUserId, HttpSession session) {
//        return PackingInfo.changeData2Message(messageBoardService.firstLoadDetailReply(messageBoardId, messageBoardUserId, session));
        return null;
    }

    @PostMapping("/sendReplyOrSubReply")
    @ResponseBody
    public Message sendReplyOrSubReply(String messageBoardId4Reply, String replyTo, String messageText, HttpSession session) {
//        return PackingInfo.changeData2Message(messageBoardService.saveMessageBoardSubreply(messageBoardId4Reply, replyTo, messageText, session));
        return null;
    }

    @PostMapping("/getNextSubReply")
    @ResponseBody
    public Message getNextSubReply(String messageBoardId4Reply, String pageIndex) {
        Map data = new HashMap<String, List<MessageBoardSubreply>>();
//        data.put("Subreply", messageBoardService.getMessageBoardSubreplyByPaging(Integer.valueOf(pageIndex), Integer.valueOf(customProperty.getSubReply()), messageBoardId4Reply));

        return PackingInfo.changeData2Message(data);
    }

    @PostMapping("/getSubReply")
    @ResponseBody
    public Message getSubReply(String messageBoardId4Reply, String pageIndex) {
//        return PackingInfo.changeData2Message(messageBoardService.getSubReply(Integer.valueOf(customProperty.getSubReply()), messageBoardId4Reply));
        return null;
    }

    @PostMapping("/getMessageBoardTitleMessages")
    @ResponseBody
    public Message getMessageBoardTitleMessages() {
//        return PackingInfo.changeData2Message(messageBoardService.getAllMessageBoardTitleMessageByOrder());
        return null;
    }

    @PostMapping("/deleteMessageBoardTitleMessages")
    @ResponseBody
    public Message deleteMessageBoardTitleMessages(Integer id) {
//        messageBoardService.deleteMessageBoardTitleMessageByOrder(id);
        return PackingInfo.changeData2Message("Y");
    }
    @PostMapping("/updateMessageBoardTitleMessage")
    @ResponseBody
    public Message updateMessageBoardTitleMessage(Integer id,String content,Integer orderNum) {
//        return PackingInfo.changeData2Message(messageBoardService.updateMessageBoardTitleMessage(id,content,orderNum));
        return null;
    }
    @PostMapping("/insertMessageBoardTitleMessage")
    @ResponseBody
    public Message insertMessageBoardTitleMessage(String content,Integer orderNum) {
//        return PackingInfo.changeData2Message(messageBoardService.insertMessageBoardTitleMessage(content,orderNum));
        return null;
    }

}
