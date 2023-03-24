package cn.cq.chatbot.api;


import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import java.io.IOException;

/**
 * @author cq
 * @deprecated 单元测试
 * @github https://github.com/chenqi142
 */
public class ApiTest {
    @Test
    public void query_unanswered_questions() throws IOException {
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();

        HttpGet get = new HttpGet("https://api.zsxq.com/v2/groups/28885828811841/topics?scope=all&count=2");

        get.addHeader("cookie","zsxqsessionid=58b1d5eb4ebf0a3d5ef18b49faf34e73; abtest_env=product; UM_distinctid=1870f59900d7dc-0accb792072de-26031851-100200-1870f59900ec09; sensorsdata2015jssdkcross=%7B%22distinct_id%22%3A%22585215545255544%22%2C%22first_id%22%3A%221870cb5bed9134-04c9c7ac4833214-26031851-1049088-1870cb5beda322%22%2C%22props%22%3A%7B%22%24latest_traffic_source_type%22%3A%22%E7%A4%BE%E4%BA%A4%E7%BD%91%E7%AB%99%E6%B5%81%E9%87%8F%22%2C%22%24latest_search_keyword%22%3A%22%E6%9C%AA%E5%8F%96%E5%88%B0%E5%80%BC%22%2C%22%24latest_referrer%22%3A%22https%3A%2F%2Fopen.weixin.qq.com%2F%22%7D%2C%22identities%22%3A%22eyIkaWRlbnRpdHlfY29va2llX2lkIjoiMTg3MGNiNWJlZDkxMzQtMDRjOWM3YWM0ODMzMjE0LTI2MDMxODUxLTEwNDkwODgtMTg3MGNiNWJlZGEzMjIiLCIkaWRlbnRpdHlfbG9naW5faWQiOiI1ODUyMTU1NDUyNTU1NDQifQ%3D%3D%22%2C%22history_login_id%22%3A%7B%22name%22%3A%22%24identity_login_id%22%2C%22value%22%3A%22585215545255544%22%7D%2C%22%24device_id%22%3A%221870cb5bed9134-04c9c7ac4833214-26031851-1049088-1870cb5beda322%22%7D; zsxq_access_token=17EF9F2E-DD8B-B5B3-CCAA-0D4C86C4317E_0C952AD7D9FB2620");
        get.addHeader("Content-Type","application/json;charset=utf8");

        CloseableHttpResponse response = httpClient.execute(get);
        if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
            String res = EntityUtils.toString(response.getEntity());
            System.out.println(res);
        } else {
            System.out.println(response.getStatusLine().getStatusCode());
        }
    }

    @Test
    public void answer() throws IOException{
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();

        HttpPost post = new HttpPost("");
        post.addHeader("","");
        post.addHeader("","");

        String paramJson = "";

        StringEntity stringEntity = new StringEntity(paramJson, ContentType.create("text/json", "utf-8"));
        post.setEntity(stringEntity);
        CloseableHttpResponse response = httpClient.execute(post);
        if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
            String res = EntityUtils.toString(response.getEntity());
            System.out.println(res);
        } else {
            System.out.println(response.getStatusLine().getStatusCode());
        }
    }
}
