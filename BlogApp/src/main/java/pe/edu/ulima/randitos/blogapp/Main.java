package pe.edu.ulima.randitos.blogapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import spark.ModelAndView;
import static spark.Spark.get;
import static spark.Spark.stop;

public class Main {

    public static void main(String[] args) {
      get("/parar",(req, resp)-> {
          stop();
          return"";
      });
      get("/listar_posts",(req, resp)-> {
          //... más código
          List<Post> listaPosts = new ArrayList<>();
          listaPosts.add(new Post("post1","01/01/2017"));
          listaPosts.add(new Post("post2","01/01/2018"));
          HashMap<String,Object> map = new HashMap<String,Object>();
          map.put("posts",listaPosts);
          return new ModelAndView(map, "main.html");
      }, new Jinja2TemplateEngine());
    }

}
