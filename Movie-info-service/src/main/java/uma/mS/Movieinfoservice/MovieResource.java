package uma.mS.Movieinfoservice;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uma.mS.Model.Movie;

@RestController
@RequestMapping("/MR")
public class MovieResource {

@RequestMapping("/{name}")
	public List<Movie> getdetails(String mname){
		
		return Collections.singletonList(new Movie("lucy","action"));
		
	}
	
}
