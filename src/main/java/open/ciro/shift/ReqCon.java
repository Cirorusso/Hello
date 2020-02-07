package open.ciro.shift;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReqCon {

    @RequestMapping("/")
    public RedirectView init(){
        RedirectView rd = new RedirectView();
        rd.setUrl("index");
        return rd;
    }

    @RequestMapping("/index")
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index.jsp");
        return mv;
    }
}
