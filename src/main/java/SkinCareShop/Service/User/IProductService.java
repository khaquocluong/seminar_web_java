package SkinCareShop.Service.User;

import org.springframework.stereotype.Service;

import SkinCareShop.Dto.ProductsDto;

@Service
public interface IProductService {
	public ProductsDto GetProductByID(long id);
}
