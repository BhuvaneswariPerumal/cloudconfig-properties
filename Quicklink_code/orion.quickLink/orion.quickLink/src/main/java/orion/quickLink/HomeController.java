package orion.quickLink;



import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@PropertySource("classpath:/orion.properties")
public class HomeController {
	
	@Value("${comcast.app.u1}")
	private String comcast_app_u1;
	
	@Value("${comcast.app.g1}")
	private String comcast_app_g1;
	
	@Value("${comcast.app.g1}")
	private String comcast_app_g2;
	
	@Value("${comcast.app.g4}")
	private String comcast_app_g4;
	
	@RequestMapping("/")
	public String hello(Map<String, Object> model)
	{
		
		model.put("comcast_app_u1", this.comcast_app_u1);
		model.put("comcast_app_g1", this.comcast_app_g1);
		model.put("comcast_app_g2", this.comcast_app_g2);
		model.put("comcast_app_g4", this.comcast_app_g4);
		
		
		return "orion2";
	}
}
