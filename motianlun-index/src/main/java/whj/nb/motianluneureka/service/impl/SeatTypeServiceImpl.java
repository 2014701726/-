package whj.nb.motianluneureka.service.impl;

import org.springframework.stereotype.Service;
import whj.nb.motianluneureka.dao.SeatTypeDao;
import whj.nb.motianluneureka.entity.SeatType;
import whj.nb.motianluneureka.service.SeatTypeService;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SeatType)表服务实现类
 *
 * @author makejava
 * @since 2020-08-27 10:23:06
 */
@Service("seatTypeService")
public class SeatTypeServiceImpl implements SeatTypeService {
    @Resource
    private SeatTypeDao seatTypeDao;

    @Override
    public List<SeatType> queryAll() {
        return seatTypeDao.queryAll();
    }
}