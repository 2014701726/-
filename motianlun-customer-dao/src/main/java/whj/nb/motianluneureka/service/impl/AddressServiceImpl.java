package whj.nb.motianluneureka.service.impl;

import org.springframework.stereotype.Service;
import whj.nb.motianluneureka.dao.AddressDao;
import whj.nb.motianluneureka.bean.Address;
import whj.nb.motianluneureka.service.AddressService;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Address)表服务实现类
 *
 * @author ChanzZ
 * @since 2020-08-25 11:08:03
 */
@Service("addressService")
public class AddressServiceImpl implements AddressService {
    @Resource
    private AddressDao addressDao;



    @Override
    public List<Address> queryAll(String customerId) {
        return this.addressDao.queryAll(customerId);
    }

    /**
     * 新增数据
     *
     * @param address 实例对象
     * @return 实例对象
     */
    @Override
    public boolean insert(Address address) {
        address.setAddressId(System.currentTimeMillis()+"");
        return this.addressDao.insert(address)>0;
    }

    /**
     * 修改数据
     *
     * @param address 实例对象
     * @return 实例对象
     */
    @Override
    public void update(Address address) {
        this.addressDao.update(address);
    }

    /**
     * 通过主键删除数据
     *
     * @param addressId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String addressId) {
        return this.addressDao.deleteById(addressId) > 0;
    }
}