package ma.ensa.gateway_service.Controller;

import org.springframework.core.io.Resource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController {

    @RequestMapping(value = "/{path:[^\\.]*}")
    public @ResponseBody Resource redirect() {
        // Return the index.html page for all paths
        return new ClassPathResource("static/index.html");
    }
}