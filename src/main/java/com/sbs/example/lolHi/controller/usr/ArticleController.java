package com.sbs.example.lolHi.controller.usr;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sbs.example.lolHi.dto.Article;

@Controller
public class ArticleController {
	@RequestMapping("/usr/article/list")
	@ResponseBody
	String showList(){
		Article article1 = new Article(1, "2020-12-12-12 12:12:12", "2020-12-12-12 12:12:13", "제목1", "내용1");
		Article article2 = new Article(2, "2020-12-12-12 12:12:14", "2020-12-12-12 12:12:15", "제목2", "내용2");
		List<Article> articles = new ArrayList<>();
		articles.add(article1);
		articles.add(article2);
		return "usr/article/list";
	}
}
