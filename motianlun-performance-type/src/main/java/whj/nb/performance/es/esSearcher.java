package whj.nb.performance.es;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpHost;
import org.elasticsearch.action.admin.indices.create.CreateIndexRequest;
import org.elasticsearch.action.admin.indices.create.CreateIndexResponse;
import org.elasticsearch.action.admin.indices.delete.DeleteIndexRequest;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.support.master.AcknowledgedResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.elasticsearch.search.fetch.subphase.highlight.HighlightBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;
import whj.nb.performance.entity.Goods;
import whj.nb.performance.service.GoodsService;
import whj.nb.vo.ResultVO;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("es")
public class esSearcher {

    @Resource
    private RestHighLevelClient restHighLevelClient;

    @Resource
    private GoodsService goodsService;

    @Bean
    public RestHighLevelClient restHighLevelClient(){
        RestHighLevelClient client = new RestHighLevelClient(
                RestClient.builder(
                        new HttpHost("localhost", 9200, "http")));
        return client;
    }

    @RequestMapping("est")
    public void esLodes(){
        System.out.println(restHighLevelClient);

    }

    /**
     * 在es中创建索引
     */
    @RequestMapping("creat")
    public void testCreateIndex() throws IOException {
        //创建索引请求
        CreateIndexRequest createIndexRequest = new CreateIndexRequest("index3");
        //客户端执行请求 IndicesClicent,请求后获得响应
        CreateIndexResponse createIndexResponse = restHighLevelClient.indices().create(createIndexRequest, RequestOptions.DEFAULT);
        System.out.println(createIndexResponse);

    }


    /**
     * 删除索引
     */
    @RequestMapping("dele")
    public void testDeleteIndex() throws IOException {
        DeleteIndexRequest deleteIndexRequest = new DeleteIndexRequest("index3");
        AcknowledgedResponse deleteIndexRes = restHighLevelClient.indices().delete(deleteIndexRequest, RequestOptions.DEFAULT);
        System.out.println(deleteIndexRes);
    }

    /**
     * 添加文档：将数据存入es
     */
    @RequestMapping("add")
    public void testCreateDocument() throws IOException {
        String jsonStr = "";
        //数据库数据遍历
        List<Goods> goodss = goodsService.queryAll();
//        Book book = new Book(10005,"平凡的世界","路遥",new Date().getTime());
        ObjectMapper objectMapper = new ObjectMapper();

        for (Goods go : goodss) {
             jsonStr = objectMapper.writeValueAsString(go);
            Integer goodId = go.getGoodId();
//            System.out.println(go);
            IndexRequest request = new IndexRequest("index3");
            //写bookid动态的
            request.id(""+goodId);
            request.source(jsonStr, XContentType.JSON);
            IndexResponse indexResponse = restHighLevelClient.index(request, RequestOptions.DEFAULT);
        }

//        System.out.println(indexResponse);
    }



    @RequestMapping(value = "/search/{msg}",method = RequestMethod.GET)
    public ResultVO search1(@PathVariable("msg") String msg) throws IOException {



        List<Goods> esgd = new ArrayList<>();
        Goods gs;
        ObjectMapper objectMapper = new ObjectMapper();
        SearchRequest searchRequest = new SearchRequest("index3");
        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
        searchSourceBuilder.query(QueryBuilders.queryStringQuery(msg));
//        searchSourceBuilder.size(6);
        searchRequest.source(searchSourceBuilder);
        SearchResponse searchResp = restHighLevelClient.search(searchRequest, RequestOptions.DEFAULT);
        SearchHits hits = searchResp.getHits();
        for (SearchHit hit: hits
        ) {
            System.out.println(hit.getSourceAsString());
            gs = objectMapper.readValue(hit.getSourceAsString(), Goods.class);
            esgd.add(gs);

        }

        ResultVO resultVO =new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("nice");
        resultVO.setT(esgd);


        return resultVO;


    }






    /**
     * 搜索
     */
    public void testSearch() throws IOException {
        SearchRequest searchRequest = new SearchRequest("index3");

        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
        //查询所有
//        searchSourceBuilder.query(QueryBuilders.matchAllQuery());
        //条件查询
        searchSourceBuilder.query(QueryBuilders.matchQuery("bookName","Java"));

        HighlightBuilder highlightBuilder = new HighlightBuilder();
        HighlightBuilder.Field highlightTitle = new HighlightBuilder.Field("bookName");
        highlightTitle.highlighterType("unified");
        highlightBuilder.field(highlightTitle);
        highlightBuilder.preTags("<label style='color:red'>");
        highlightBuilder.postTags("</label>");

        searchSourceBuilder.highlighter(highlightBuilder);
        searchRequest.source(searchSourceBuilder);

        SearchResponse searchResp = restHighLevelClient.search(searchRequest, RequestOptions.DEFAULT);

        SearchHits hits = searchResp.getHits();
        for (SearchHit hit : hits){
            System.out.println(hit);
        }

    }
}

