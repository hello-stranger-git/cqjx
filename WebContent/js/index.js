window.onload = function () {
	var introduce=document.getElementById("introduce");
	var news=document.getElementById("news");
	var product=document.getElementById("product");
	var productDiv=document.getElementById("productDiv");
	var newsDiv=document.getElementById("newsDiv");
	var introduceDiv=document.getElementById("introduceDiv");
	
	var newsValue=document.getElementById("newsValue");
	var cplxValue=document.getElementById("cplxValue");
//	introduce.onclick=function(){
//		productDiv.style.display='none';
//		newsDiv.style.display='none';
//		introduceDiv.style.display='block';
//		product.style.borderBottom='none';
//		news.style.borderBottom='none';
//		introduce.style.borderBottom='2px solid #f60b0b';
//	}
//	news.onclick=function(){
//		productDiv.style.display='none';
//		newsDiv.style.display='block';
//		introduceDiv.style.display='none';
//		product.style.borderBottom='none';
//		news.style.borderBottom='2px solid #f60b0b';
//		introduce.style.borderBottom='none';
//	}
//	product.onclick=function(){
//		productDiv.style.display='block';
//		newsDiv.style.display='none';
//		introduceDiv.style.display='none';
//		product.style.borderBottom='2px solid #f60b0b';
//		news.style.borderBottom='none';
//		introduce.style.borderBottom='none';
//	}


	
	introduce.onmouseover=function(){
		
		productDiv.style.display='none';
		newsDiv.style.display='none';
		introduceDiv.style.display='block';
		product.style.borderBottom='none';
		news.style.borderBottom='none';
		introduce.style.borderBottom='2px solid #f60b0b';
	}
	news.onmouseover=function(){
		productDiv.style.display='none';
		newsDiv.style.display='block';
		introduceDiv.style.display='none';
		product.style.borderBottom='none';
		news.style.borderBottom='2px solid #f60b0b';
		introduce.style.borderBottom='none';
	}
	product.onmouseover=function(){
		productDiv.style.display='block';
		newsDiv.style.display='none';
		introduceDiv.style.display='none';
		product.style.borderBottom='2px solid #f60b0b';
		news.style.borderBottom='none';
		introduce.style.borderBottom='none';
	}
}