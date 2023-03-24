package cn.cq.chatbot.api.domain.zsxq;

import cn.cq.chatbot.api.domain.zsxq.model.aggregates.UnAnsweredQuestionsAggregates;

import java.io.IOException;

public interface IZsxqApi {
    UnAnsweredQuestionsAggregates queryUnAnsweredQuestionsTopicId(String groudId, String cookie) throws IOException;

    boolean answer(String groupId, String cookie,String topicId, String text, boolean silenced) throws IOException;
}
