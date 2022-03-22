package SkinCareShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SkinCareShop.Dao.ProductsDao;
import SkinCareShop.Dto.ProductsDto;

@Service
public class ProductServiceImpl implements IProductService{

	@Autowired
	ProductsDao productDao = new ProductsDao();
	
	public ProductsDto GetProductByID(long id) {
		List<ProductsDto> listProducts = productDao.GetProductByID(id);
		return  listProducts.get(0);
	}
}
