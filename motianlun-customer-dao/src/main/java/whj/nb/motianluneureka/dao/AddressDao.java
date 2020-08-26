package whj.nb.motianluneureka.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import whj.nb.motianluneureka.bean.Address;

import java.util.List;

/**
 * (Address)表数据库访问层
 *
 * @author ChanzZ
 * @since 2020-08-25 11:08:02
 */
@Mapper
public interface AddressDao {


    /**
     * 通过实体作为筛选条件查询
     *
     * @param customerId 实例对象
     * @return 对象列表
     */
    List<Address> queryAll(String customerId);

    /**
     * 新增数据
     *
     * @param address 实例对象
     * @return 影响行数
     */
    int insert(Address address);

    /**
     * 修改数据
     *
     * @param address 实例对象
     * @return 影响行数
     */
    void update(Address address);

    /**
     * 通过主键删除数据
     *
     * @param addressId 主键
     * @return 影响行数
     */
    int deleteById(String addressId);

}