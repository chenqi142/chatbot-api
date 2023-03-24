package cn.cq.chatbot.api.domain.zsxq.model.aggregates;

import cn.cq.chatbot.api.domain.zsxq.model.res.RespData;

public class UnAnsweredQuestionsAggregates {
    private boolean successed;
    private RespData resp_data;

    public boolean isSuccessed() {
        return successed;
    }

    public void setSuccessed(boolean successed) {
        this.successed = successed;
    }

    public RespData getResp_data() {
        return resp_data;
    }

    public void setResp_data(RespData resp_data) {
        this.resp_data = resp_data;
    }
}
