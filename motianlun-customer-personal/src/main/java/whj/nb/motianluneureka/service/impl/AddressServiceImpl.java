package whj.nb.motianluneureka.service.impl;

import org.springframework.stereotype.Service;
import whj.nb.motianluneureka.dao.AddressDao;
import whj.nb.motianluneureka.entity.Address;
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
        if("1".equals(address.getIsmrAddr())){
            //新增地址设置为默认地址时，先将所有的地址设置不为默认地址，再将特定的地址设置为默认地址
            this.addressDao.updateDefaultAddress();
            return this.addressDao.insert(address)>0;
        }else {
            return this.addressDao.insert(address)>0;
        }

    }

    /**
     * 修改数据
     *
     * @param address 实例对象
     * @return 实例对象
     */
    @Override
    public void update(Address address) {
        if("1".equals(address.getIsmrAddr())){
            //需要修改默认地址时，先将所有的地址设置不为默认地址，再将特定的地址设置为默认地址
            this.addressDao.updateDefaultAddress();
            this.addressDao.update(address);
        }else {
            this.addressDao.update(address);
        }

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