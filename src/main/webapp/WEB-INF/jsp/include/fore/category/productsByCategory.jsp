<!-- 模仿天猫整站ssm 教程 为how2j.cn 版权所有-->
<!-- 本教程仅用于学习使用，切勿用于非法用途，由此引起一切后果与本站无关-->
<!-- 供购买者学习，请勿私自传播，否则自行承担相关法律责任-->

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix='fmt' uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>	

<c:if test="${empty param.categorycount}">
	<c:set var="categorycount" scope="page" value="100"/>
</c:if>

<c:if test="${!empty param.categorycount}">
	<c:set var="categorycount" scope="page" value="${param.categorycount}"/>
</c:if>
	
<div class="categoryProducts">
	<c:forEach items="${c.products}" var="p" varStatus="stc">
		<%-- <c:if test="${stc.count<=categorycount}"> --%>
		<div class="productUnit" price="${p.promotePrice}">
			<div class="productUnitFrame">
				<a href="${pageContext.request.contextPath }/foreproduct/${p.id}">
					<img class="productImage" src="${pageContext.request.contextPath }/img/productSingle_middle/${p.firstProductImage.id}.jpg">
				</a>
				<span class="productPrice">¥<fmt:formatNumber type="number" value="${p.promotePrice}" minFractionDigits="2"/></span>
				<a class="productLink" href="${pageContext.request.contextPath }/foreproduct/${p.id}">
				 ${fn:substring(p.name, 0, 50)}
				</a>
				
				<a  class="tmallLink" href="${pageContext.request.contextPath }/foreproduct${p.id}">天猫专卖</a>
	
				<div class="show1 productInfo">
					<span class="monthDeal ">月成交 <span class="productDealNumber"><%-- ${p.saleCount} --%>12笔</span></span>
					<span class="productReview">评价<span class="productReviewNumber"><%-- ${p.reviewCount} --%>1</span></span>
					<span class="wangwang">
					<a class="wangwanglink" href="#nowhere">
						<img src="${pageContext.request.contextPath }/img/site/wangwang.png">
					</a>
					
					</span>
				</div>
			</div>
		</div>
		<%-- </c:if> --%>
	</c:forEach>
		<div style="clear:both"></div>
</div>