package org.springframework.social.wechat.api;

import java.util.Map;

public class TextMessage extends Message
{
    // CHECKSTYLE:OFF

    private long MsgId;
    private String Content;

    // CHECKSTYLE:ON

    public long getMsgId()
    {
        return MsgId;
    }

    public String getContent()
    {
        return Content;
    }

    public void setContent(String content)
    {
        this.Content = content;
    }

    public TextMessage(Map<String, String> params) throws Exception
    {
        super(params);

        MsgId = Long.parseLong(params.get("MsgId"), 10);
        Content = params.get("Content");
    }

    public TextMessage()
    {
        super(MessageType.text);
        MsgId = 0;
    }
}
