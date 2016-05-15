package bean;


public class Article {

	private int article_id;
	private String article_title;
	private String regist_date;
	private String article_url;
	private String article_category;
	private int regist_user_id;

	public Article() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public Article(int article_id,String article_title,String article_url,String article_category,int regist_user_id,String regist_date) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.article_id=article_id;
		this.article_title=article_title;
		this.article_url=article_url;
		this.article_category=article_category;
		this.regist_user_id=regist_user_id;
		this.regist_date =regist_date;
	}
	
	
	
	public void setArticle_category(String article_category) {
		this.article_category = article_category;
	}
	public String getArticle_category() {
		return article_category;
	}

	
	
	
	public void setArticle_id(int article_id) {
		this.article_id = article_id;
	}
	public int getArticle_id() {
		return article_id;
	}

	
	
	
	public void setArticle_title(String article_title) {
		this.article_title = article_title;
	}
	public String getArticle_title() {
		return article_title;
	}

	
	
	
	public void setArticle_url(String article_url) {
		this.article_url = article_url;
	}
	public String getArticle_url() {
		return article_url;
	}

	
	
	
	public void setRegist_date(String regist_date) {
		this.regist_date = regist_date;
	}
	public String getRegist_date() {
		return regist_date;
	}

	
	
	
	public void setRegist_user_id(int regist_user_id) {
		this.regist_user_id = regist_user_id;
	}
	public int getRegist_user_id() {
		return regist_user_id;
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T autoCast(Object obj) {
	    T castObj = (T) obj;
	    return castObj;
	}

}
