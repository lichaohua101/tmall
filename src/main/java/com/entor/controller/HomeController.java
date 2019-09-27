package com.entor.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entor.entity.Category;
import com.entor.entity.Product;
import com.entor.entity.User;
import com.entor.service.CategoryService;
import com.entor.service.ProductService;
import com.entor.service.UserService;

@Controller
public class HomeController {
	
	@Resource
	private CategoryService categoryService;
	@Resource
	private UserService userService;
	@Resource
	private ProductService productService;
	
	
	@RequestMapping("/test")
	public String test() {
		return "include/fore/footer";
	}
	
	@RequestMapping("/1")
	public String home(Map<String , Object> map) {
		List<Product> listp=null;
		List<Category> listc = categoryService.quertAll(Category.class);
		for (Category category : listc) {
			listp = productService.queryByCidPage(category.getId(), 1, productService.getTotals(Product.class));
		}
		System.out.println(listc);
		System.out.println(listp);
		//map.put("cs", 44);
		return "fore/home";
	}
	//登录
	@RequestMapping("/loginPage")
	public String loginPage() {
		return "fore/login";
	}
	//校验 帐号密码是否正确
	@RequestMapping("/forelogin")
	public String forelogin(User user,HttpSession session) {
		User user2 =  userService.checkUser(user);
		System.out.println("登录的用户"+user);
		System.out.println("存在的用户"+user2);
		String string = null;
		if (user.getName().equals(user2.getName()) && user.getPassword().equals(user2.getPassword())) {
			session.setAttribute("user", user);
			string =  "fore/home";
		}else {
			string = "fore/login";
		}
		return string;
	}
	//退出
	@RequestMapping("/forelogout")
	public String forelogout(HttpSession session) {
		/* Session.Clear()就是把Session对象中的所有项目都删除了，Session对象里面啥都没有。但是Session对象还保留 。
		    Session.Abandon()就是把当前Session对象删除了，下一次就是新的Session了。*/
		session.removeAttribute("user");
		return "fore/home";
	}
	//免费注册
	@RequestMapping("/registerPage")
	public String registerPage() {
		return "fore/register";
	}
	//订单
	@RequestMapping("/forebought")
	public String forebought() {
		return "fore/registerSuccess";
	}
	//购购物
	@RequestMapping("/forecart")
	public String forecart() {
		return "fore/registerSuccess";
	}

}
