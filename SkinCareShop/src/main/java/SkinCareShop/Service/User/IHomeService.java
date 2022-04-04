package SkinCareShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SkinCareShop.Dto.ProductsDto;
import SkinCareShop.Entity.Categorys;
import SkinCareShop.Entity.Slides;
@Service
public interface IHomeService {
	@Autowired
	public List<Slides> GetDataSlide();
	public List<Categorys> GetDataCategorys();
	public List<ProductsDto> GetDataProducts();
}