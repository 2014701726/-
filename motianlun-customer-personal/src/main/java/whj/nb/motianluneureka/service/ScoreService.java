package whj.nb.motianluneureka.service;

import whj.nb.motianluneureka.entity.Score;

import java.util.List;

/**
 * (Score)表服务接口
 *
 * @author ChanzZ
 * @since 2020-08-25 11:08:21
 */
public interface ScoreService {

    /**
     * 通过用户ID查询摩力值使用列表
     *
     * @param customerId 主键
     * @return 实例对象
     */
    List<Score> queryAll(String customerId);

}