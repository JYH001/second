package project;
 import org.openqa.selenium.*;   //导入selenium包中的内容
 import org.openqa.selenium.WebDriver.*;  //导入selenium包中的内容
 import org.openqa.selenium.chrome.*;  //导入selenium包中的内容
public class ProjectClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe"); //启动谷歌浏览器
		WebDriver driver=new ChromeDriver();
		Navigation navigation=driver.navigate();
		Window window = driver.manage().window();
        //window.maximize(); //窗口最大化
        Thread.sleep(3000);
		window.setSize(new Dimension(1024,768));//将浏览器的大小自定义为1024*768
		driver.get("https://www.baidu.com");  //访问百度首页
		//navigation.refresh(); //页面刷新
		WebElement baiduTextBox = driver.findElement(By.xpath("//input[@id='kw']")); //指定搜索框
		//WebElement baiduTextBox1 = driver.findElement(By.cssSelector("input#kw"));
		navigation.to("http://www.hao123.com");//访问好123
		try {
			Thread.sleep(3000);  //等待3秒
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		navigation.back();//后退百度首页
        try {
        	Thread.sleep(3000);//等待3秒
        } catch(InterruptedException e) {
        	e.printStackTrace();//前进到好123
        }
        navigation.forward();
        
	}
}
