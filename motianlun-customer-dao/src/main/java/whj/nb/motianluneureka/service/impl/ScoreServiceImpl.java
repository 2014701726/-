package whj.nb.motianluneureka.service.impl;

import org.springframework.stereotype.Service;
import whj.nb.motianluneureka.dao.ScoreDao;
import whj.nb.motianluneureka.bean.Score;
import whj.nb.motianluneureka.service.ScoreService;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Score)表服务实现类
 *
 * @author ChanzZ
 * @since 2020-08-25 11:08:22
 */
@Service("scoreService")
public class ScoreServiceImpl implements ScoreService {
    @Resource
    private ScoreDao scoreDao;


    @Override
    public List<Score> queryAll(String customerId) {
        List<Score> scoreList = scoreDao.queryAll(customerId);
        return scoreList;
    }
}