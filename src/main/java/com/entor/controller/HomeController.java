package com.entor.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.aspectj.weaver.ast.And;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entor.entity.Category;
import com.entor.entity.OrderItem;
import com.entor.entity.Product;
import com.entor.entity.ProductImage;
import com.entor.entity.Property;
import com.entor.entity.PropertyValueVO;
import com.entor.entity.Review;
import com.entor.entity.User;
import com.entor.service.CategoryService;
import com.entor.service.OrederItemService;
import com.entor.service.ProductImageService;
import com.entor.service.ProductService;
import com.entor.service.PropertyService;
import com.entor.service.PropertyValueService;
import com.entor.service.ReviewService;
import com.entor.service.UserService;

@Controller
public class HomeController {
	
	@Resource
	private CategoryService categoryService;
	@Resource
	private UserService userService;
	@Resource
	private ProductService productService;
	@Resource
	private ProductImageService productImageService;
	@Resource
	private ReviewService reviewService;
	@Resource
	private OrederItemService orederItemService;
	@Resource 
	private PropertyValueService propertyValueService;
	
	
	//主页
	@RequestMapping("/1")
	public String home(Map<String , Object> map) {
		List<Category> cs = new ArrayList<>();
		List<Category> clist = categoryService.quertAll(Category.class);
		for (Category category : clist) {
			List<Product> plist = productService.queryByCidPage(category.getId(), 1, productService.getTotals(Product.class));
			category.setProducts(plist);
			List<Product> plists = new ArrayList<>();
			for (Product p : plist) {
				ProductImage pimg = productImageService.queryMaxByPid(p.getId());
				p.setFirstProductImage(pimg);
				plists.add(p);
			}
			category.setProducts(plists);
			cs.add(category);
		}
		map.put("cs", cs);
		for (Category category : cs) {
			System.out.println(category);
		}
		return "fore/home";
		
	}
	//商品
	@RequestMapping("/foreproduct/{pid}")
	public String foreproduct(@PathVariable String pid,Map<String, Object> map) {
		//获取商品
		Product product = productService.queryById(Product.class, Integer.parseInt(pid));
		//获取类别集合
		List<Category> list = categoryService.quertAll(Category.class);
		//商品的属性值
		List<PropertyValueVO> listVo  = propertyValueService.queryAllByPid(Integer.parseInt(pid));
		product.setProperty(listVo);
		//大图片
		product.setFirstProductImage(productImageService.queryMaxByPid(product.getId()));
		//五张小图
		product.setProductSingleImages(productImageService.fiveImages(product.getId()));
		//已经销售完是数量
		int sa=0;
		String sale = orederItemService.getSaleByPid(Integer.parseInt(pid));
		if (sale==null) {
			sa=0;
		}else {
			sa=Integer.parseInt(sale);
		}
		//评论数量
		product.setReviewCount(reviewService.getTotalsByPid(Integer.parseInt(pid)));
		//销售完是数量
		product.setSaleCount(sa);
		//获取商品的全部评论
		List<Review> list2 = reviewService.getReviewsByPid(Integer.parseInt(pid));
		//获取细节图
		List<ProductImage> productImages = productImageService.queryAllByDetails(Integer.parseInt(pid));
		map.put("p", product);
		map.put("cs", list);
		map.put("reviews", list2);
		map.put("productDetailImages", productImages);
		
		System.out.println(list2);
		System.out.println(product);
		return "fore/product";
	}
	//同一类别下的所有商品
	@RequestMapping("/forecategory/{cid}")
	public String forecategory(@PathVariable String cid,Map<String,Object > map ) {
		Category category = categoryService.queryById(Category.class, Integer.parseInt(cid));
		List<Product> list = productService.queryByCidPage(Integer.parseInt(cid), 1, productService.getTotals(Product.class));
		for (Product p : list) {
			ProductImage pimg = productImageService.queryMaxByPid(p.getId());
			p.setFirstProductImage(pimg);
		}
		category.setProducts(list); 
		map.put("c", category);
		for (Product product : list) {
			System.out.println(product);
		}
		return "include/fore/category/productsByCategory";
	}
	//登录
	@RequestMapping("/loginPage")
	public String loginPage() {
		return "fore/login";
	}
	//校验 帐号密码是否正确
	@RequestMapping("/forelogin")
	public String forelogin(User user,HttpSession session,Map<String, Object> map) {
		User user2 =  userService.checkUser(user);
		System.out.println("登录的用户"+user);
		System.out.println("存在的用户"+user2);
		String string = null;
		/*if (user.getName()==user2.getName() && user.getPassword()==user2.getPassword()) {
			System.err.println("yes");
			session.setAttribute("user", user);
			string =  "fore/home";
		}else {
			String msg  = "帐号或者密码错误！";
			map.put("msg", msg);
			string = "/fore/login";
		}*/
		if (user2.getName().equals(user.getName()) && user2.getPassword().equals(user.getPassword())) {
			session.setAttribute("user", user);
			string =  "redirect:1";
		}else {
			String msg  = "帐号或者密码错误！";
			map.put("msg", msg);
			string = "/fore/login";
		}
		return string;
	}
	//校验下订单时 是否登录
	@RequestMapping("/forecheckLogin")
	@ResponseBody
	public String forecheckLogin(HttpSession session,Object user) {
		user = session.getAttribute("user");
		String s;
		if (user==null) {
			s=null;
		}else {
			s="success";
			}
		return "s";
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
	public String forecart(HttpSession session, Map<String, Object>map) {
		/*List<Category> list = categoryService.quertAll(Category.class);
		User user = (User) session.getAttribute("user");
		
		//同一个用户的所有订单
		List<OrderItem> oi = orederItemService.queryAllByUid(user.getId());
		System.err.println(oi);
		
		int pid = oi.get(0).getPid();
		ProductImage productImage = productImageService.queryAllByPids(pid);
		int pic = productImage.getId();
		
		
		map.put("pic", pic);
		map.put("ois", oi);
		map.put("cs", list);*/
		return "fore/cart";
	}

}
