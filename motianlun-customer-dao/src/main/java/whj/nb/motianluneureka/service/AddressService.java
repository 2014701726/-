package whj.nb.motianluneureka.service;

import whj.nb.motianluneureka.bean.Address;

import java.util.List;

/**
 * (Address)表服务接口
 *
 * @author ChanzZ
 * @since 2020-08-25 11:08:03
 */
public interface AddressService {

    /**
     * 通过ID查询单条数据
     *
     * @param addressId 主键
     * @return 实例对象
     */
    Address queryById(String addressId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Address> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param address 实例对象
     * @return 实例对象
     */
    Address insert(Address address);

    /**
     * 修改数据
     *
     * @param address 实例对象
     * @return 实例对象
     */
    Address update(Address address);

    /**
     * 通过主键删除数据
     *
     * @param addressId 主键
     * @return 是否成功
     */
    boolean deleteById(String addressId);

}