package uma.mS.Moviecatalogservice;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uma.mS.Model.CatalogItem;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

	@RequestMapping("/{id}")
	public List<CatalogItem> getList(@PathVariable ("id")String MoiveId){
		
		return Collections.singletonList(new CatalogItem("Uma",2));
				
	}
	
}
