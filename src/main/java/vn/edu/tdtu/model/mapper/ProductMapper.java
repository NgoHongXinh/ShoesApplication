package vn.edu.tdtu.model.mapper;

import com.github.slugify.Slugify;
import vn.edu.tdtu.entity.Brand;
import vn.edu.tdtu.entity.Category;
import vn.edu.tdtu.entity.Product;
import vn.edu.tdtu.model.dto.ProductDTO;
import vn.edu.tdtu.model.request.CreateProductRequest;

import java.util.ArrayList;

public class ProductMapper {
    public static ProductDTO toProductDTO(Product product) {
        ProductDTO productDTO = new ProductDTO();
        productDTO.setId(product.getId());
        productDTO.setName(product.getName());
        productDTO.setPrice(product.getPrice());
        productDTO.setSalePrice(product.getSalePrice());
        productDTO.setDescription(product.getDescription());
        productDTO.setImages(product.getImages());
        productDTO.setFeedBackImages(product.getImageFeedBack());
        productDTO.setTotalSold(product.getTotalSold());
        productDTO.setStatus(product.getStatus());

        return productDTO;
    }

    public static Product toProduct(CreateProductRequest createProductRequest) {
        Product product = new Product();
        product.setName(createProductRequest.getName());
        product.setDescription(createProductRequest.getDescription());
        product.setPrice(createProductRequest.getPrice());
        product.setSalePrice(createProductRequest.getSalePrice());
        product.setImages(createProductRequest.getImages());
        product.setImageFeedBack(createProductRequest.getFeedBackImages());
        product.setStatus(createProductRequest.getStatus());
        //Gen slug
        Slugify slug = new Slugify();
        product.setSlug(slug.slugify(createProductRequest.getName()));
        //Brand
        Brand brand = new Brand();
        brand.setId(createProductRequest.getBrandId());
        product.setBrand(brand);
        //Category
        ArrayList<Category> categories = new ArrayList<>();
        for (Integer id : createProductRequest.getCategoryIds()) {
            Category category = new Category();
            category.setId(id);
            categories.add(category);
        }
        product.setCategories(categories);

        return product;
    }
}
